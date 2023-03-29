/**
 * 
 */
package Quittance.EmissionQuittance.Classes.referentiel;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Vector;

import ma.co.deltasoft.summerframework.bll.BusinessRule;
import ma.co.deltasoft.summerframework.bll.exception.BusinessRuleNotSatisfiedException;
import ma.co.deltasoft.summerframework.dal.IBusinessObjectManager;
import ma.co.deltasoft.summerframework.dal.dao.BusinessObject;
import ma.co.omnidata.framework.services.mail.MessageObjet;
import ma.co.omnidata.framework.services.mail.impl.smtp.SmtpMailService;

import org.apache.commons.digester.Digester;
import org.apache.xerces.parsers.SAXParser;
import org.xml.sax.SAXException;

/**
 * @author b.slayki
 * 
 */
public class TypeBienAssureBR extends BusinessRule {

	private static String directoryPath;
	private static String user;
	private static String admin;

	static {
		try {
			Properties props = new Properties();
			props.load(TypeBienAssureBR.class.getClassLoader()
					.getResourceAsStream("config.properties"));
			directoryPath = (String) props
					.get("parametrage.bienassure.directory");

			props = new Properties();
			props.load(TypeBienAssureBR.class.getClassLoader()
					.getResourceAsStream("framework.properties"));
			user = (String) props.get("user");
			admin = (String) props.get("user.admin");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

	public void validate(BusinessObject bo, IBusinessObjectManager bom,
			String operation, Object request) throws BusinessRuleNotSatisfiedException {
		try {
			if (operation.equalsIgnoreCase(BusinessRule.INSERT_OPERATION)) {
				TypeBienAssure tba = (TypeBienAssure) bo;
				String fluxStructureXML = tba.getFluxStructureXML();

				// Parser flux de structure XML du nouveau Bien Assur�
				TypeBienAssureBien bien = parseStructure(fluxStructureXML);

				// G�n�rer les fichiers de param�trage du nouveau Bien Assur�
				if(bien != null){
					new File(directoryPath).mkdirs();
					List configFiles = new ArrayList();
					configFiles.add(generateJavaClass(bien).getAbsolutePath());
					configFiles.add(generateMappingFile(bien).getAbsolutePath());
					configFiles.add(generateSqlScript(bien).getAbsolutePath());
					/*
					 * configFiles.add(generateJSP(bien).getAbsolutePath());
					 * configFiles.add(generatePartFormConverterVO(bien).getAbsolutePath());
					 */
	
					// Envoyer un mail � l'administrateur joingnant les fichiers de
					// config g�n�r�s
					mailAdministrator(bien.getNom(), configFiles);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new BusinessRuleNotSatisfiedException(e.getMessage(), e);
		}
	}

	private TypeBienAssureBien parseStructure(String fluxStructureXML)
			throws IOException, SAXException {
		if((fluxStructureXML == null)||(fluxStructureXML.equalsIgnoreCase("")))
				return null;
		InputStream in = new ByteArrayInputStream(fluxStructureXML.getBytes());
		Digester digester = new Digester(new SAXParser());
		digester.setValidating(false);

		digester.addObjectCreate("bien", TypeBienAssureBien.class);
		digester.addSetProperties("bien");

		digester.addObjectCreate("bien/attribut", TypeBienAssureAttribut.class);
		digester.addSetProperties("bien/attribut");
		digester.addSetNext("bien/attribut", "addAttribute");

		return (TypeBienAssureBien) digester.parse(in);
	}

	private File generateJavaClass(TypeBienAssureBien bien) {
		try {
			StringBuffer fileBody = new StringBuffer();

			String packageName = "com.rmawatanya.convergence.application.oct.metier.modele";
			String className = bien.getNom();

			fileBody.append("package " + packageName + ";\n\n");

			fileBody.append("import java.util.Calendar;\n\n");

			fileBody.append("public class ").append(className).append(
					" extends BienAssure {\n\n");

			fileBody.append("\tprivate long id;\n");
			fileBody.append("\tpublic long getId(){\n").append(
					"\t\treturn id;\n").append("\t}\n");
			fileBody.append("\tpublic void setId(long id){\n").append(
					"\t\tthis.id = id;\n").append("\t}\n\n");

			Iterator iter = bien.getRefAttributs().iterator();
			while (iter.hasNext()) {
				TypeBienAssureAttribut attr = (TypeBienAssureAttribut) iter
						.next();
				String attrType = attr.getType();

				String fisrtLetter = attr.getNom().substring(0, 1)
						.toUpperCase();
				String method = fisrtLetter
						+ attr.getNom().substring(1, attr.getNom().length());

				fileBody.append("\tprivate ").append(attrType).append(
						" " + attr.getNom()).append(";\n");
				fileBody.append("\tpublic ").append(attrType).append(" get")
						.append(method).append("(){\n").append("\t\treturn ")
						.append(attr.getNom()).append(";\n").append("\t}\n");
				fileBody.append("\tpublic void set").append(method).append("(")
						.append(attrType).append(" " + attr.getNom() + "){\n")
						.append("\t\tthis.").append(attr.getNom())
						.append(" = ").append(attr.getNom() + ";\n").append(
								"\t}\n\n");
			}

			fileBody.append("}\n");

			File file = new File(directoryPath + "\\" + bien.getNom() + ".java");
			boolean newFile = file.createNewFile();
			// if (newFile) {
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter out = new BufferedWriter(fileWriter);
			out.write(fileBody.toString());
			out.close();
			// }
			return file;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private File generateMappingFile(TypeBienAssureBien bien) {
		try {
			StringBuffer fileBody = new StringBuffer();
			// Header
			fileBody.append("<?xml version=\"1.0\"?>\n");
			fileBody.append("<!DOCTYPE hibernate-mapping PUBLIC\n");
			fileBody.append("\"-//Hibernate/Hibernate Mapping DTD 3.0//EN\"\n");
			fileBody
					.append("\"http://hibernate.sourceforge.net/hibernate-mapping-3.0.dtd\">\n");
			fileBody.append("<hibernate-mapping>\n\n");

			// Core
			fileBody
					.append("\t<!-- ==============================================================\n");
			fileBody.append("\t\tTABLE PRD_" + bien.getNom().toUpperCase()
					+ "\n");
			fileBody
					.append("\t=============================================================== -->\n");
			fileBody.append("\t<class name=\"").append(
					bien.getNom().substring(0, 1).toUpperCase()
							+ bien.getNom()
									.substring(1, bien.getNom().length()))
					.append("\" table=\"PRD_").append(
							bien.getNom().toUpperCase()).append("\">\n");
			fileBody
					.append("\t\t<id name=\"id\" type=\"long\" column=\"ID\"><generator class=\"increment\"/></id>\n");
			Iterator iter = bien.getRefAttributs().iterator();
			while (iter.hasNext()) {
				TypeBienAssureAttribut attr = (TypeBienAssureAttribut) iter
						.next();
				fileBody.append("\t\t<property  name=\"").append(attr.getNom())
						.append("\" column=\"").append(
								attr.getNom().toUpperCase()).append(
								"\" type=\"").append(
								getHibernateType(attr.getType())).append(
								"\"/>\n");
			}
			fileBody.append("\t</class>\n\n");
			// Footer
			fileBody.append("</hibernate-mapping>");

			File file = new File(directoryPath + "\\" + bien.getNom()
					+ ".hbm.xml");
			boolean newFile = file.createNewFile();
			if (newFile) {
				FileWriter fileWriter = new FileWriter(file);
				BufferedWriter out = new BufferedWriter(fileWriter);
				out.write(fileBody.toString());
				out.close();
			}
			return file;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private String getHibernateType(String declaredType) {
		if (declaredType
				.equalsIgnoreCase(TypeBienAssureAttribut.TYPE_BOOLEAN_CODE))
			return "boolean";
		else if (declaredType
				.equalsIgnoreCase(TypeBienAssureAttribut.TYPE_DATE_CODE))
			return "date";
		else if (declaredType
				.equalsIgnoreCase(TypeBienAssureAttribut.TYPE_DOUBLE_CODE))
			return "double";
		else if (declaredType
				.equalsIgnoreCase(TypeBienAssureAttribut.TYPE_INTEGER_CODE))
			return "integer";
		else if (declaredType
				.equalsIgnoreCase(TypeBienAssureAttribut.TYPE_STRING_CODE))
			return "string";
		else
			return null;
	}

	private String getSqlType(String declaredType) {
		if (declaredType
				.equalsIgnoreCase(TypeBienAssureAttribut.TYPE_BOOLEAN_CODE))
			return "SMALLINT";
		else if (declaredType
				.equalsIgnoreCase(TypeBienAssureAttribut.TYPE_DATE_CODE))
			return "DATE";
		else if (declaredType
				.equalsIgnoreCase(TypeBienAssureAttribut.TYPE_DOUBLE_CODE))
			return "DOUBLE";
		else if (declaredType
				.equalsIgnoreCase(TypeBienAssureAttribut.TYPE_INTEGER_CODE))
			return "INTEGER";
		else if (declaredType
				.equalsIgnoreCase(TypeBienAssureAttribut.TYPE_STRING_CODE))
			return "VARCHAR";
		else
			return null;
	}

	private File generateSqlScript(TypeBienAssureBien bien) {
		try {
			StringBuffer fileBody = new StringBuffer();

			fileBody
					.append("<!-- =====================================\n");
			fileBody.append("\tTABLE PRD_" + bien.getNom().toUpperCase()
					+ "\n");
			fileBody
					.append("====================================== -->\n");

			fileBody.append("CREATE TABLE PRD_" + bien.getNom().toUpperCase()
					+ " (\n");
			fileBody.append("\tID BIGINT PRIMARY KEY,\n");

			Iterator iter = bien.getRefAttributs().iterator();
			while (iter.hasNext()) {
				TypeBienAssureAttribut attr = (TypeBienAssureAttribut) iter
						.next();
				fileBody.append("\t").append(attr.getNom().toUpperCase())
						.append(" ").append(getSqlType(attr.getType()));
				if (iter.hasNext())
					fileBody.append(",");
				fileBody.append("\n");
			}

			fileBody.append(");\n");

			File file = new File(directoryPath + "\\" + bien.getNom() + ".sql");
			boolean newFile = file.createNewFile();
			if (newFile) {
				FileWriter fileWriter = new FileWriter(file);
				BufferedWriter out = new BufferedWriter(fileWriter);
				out.write(fileBody.toString());
				out.close();
			}
			return file;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private File generateJSP(TypeBienAssureBien bien) {
		try {
			StringBuffer fileBody = new StringBuffer();

			File file = new File(directoryPath + "\\" + bien.getNom() + ".jsp");
			boolean newFile = file.createNewFile();
			if (newFile) {
				FileWriter fileWriter = new FileWriter(file);
				BufferedWriter out = new BufferedWriter(fileWriter);
				out.write(fileBody.toString());
				out.close();
			}
			return file;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private File generatePartFormConverterVO(TypeBienAssureBien bien) {
		try {
			StringBuffer fileBody = new StringBuffer();

			File file = new File(directoryPath + "\\" + bien.getNom() + ".java");
			boolean newFile = file.createNewFile();
			if (newFile) {
				FileWriter fileWriter = new FileWriter(file);
				BufferedWriter out = new BufferedWriter(fileWriter);
				out.write(fileBody.toString());
				out.close();
			}
			return file;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private void mailAdministrator(String typeBienName, List configFiles) {
		try {
			MessageObjet msg = new MessageObjet();
			Collection dest = new Vector();

			dest.add(admin);
			msg.setEmetteur(user);
			msg.setDestinataires((Vector) dest);
			msg.setObjet("Nouveau type de bien cr��: " + typeBienName);
			StringBuffer messageBody = new StringBuffer();
			messageBody.append("Bonjour,\n\n");
			messageBody.append("Un nouveau type de bien a �t� cr�e: '").append(
					typeBienName).append("'.\n\n");
			messageBody.append("Cordialement,");
			msg.setBody(messageBody.toString());
			msg.setAttachements(configFiles);

			SmtpMailService smtpMail = new SmtpMailService();

			smtpMail.envoyer(msg);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args)
			throws BusinessRuleNotSatisfiedException {
		TypeBienAssureBR tbabr = new TypeBienAssureBR();
		TypeBienAssure tba = new TypeBienAssure();
		tba.setId(1);
		tba.setCode("B1");
		tba.setLibelle("Vehicule");
		tba
				.setFluxStructureXML("<bien nom=\"Vehicule\">\n<attribut nom=\"code\" type=\"String\"/>\n<attribut nom=\"libelle\" type=\"String\"/>\n<attribut nom=\"dateDebut\" type=\"Calendar\"/>\n<attribut nom=\"dateFin\" type=\"Calendar\"/>\n</bien>");
		tbabr.validate(tba, null, BusinessRule.INSERT_OPERATION, null);
	}

}
