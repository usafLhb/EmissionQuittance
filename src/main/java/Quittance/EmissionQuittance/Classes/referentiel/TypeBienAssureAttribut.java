/**
 * 
 */
package Quittance.EmissionQuittance.Classes.referentiel;


/**
 * @author b.slayki
 *
 */
public class TypeBienAssureAttribut {
	
	private String nom;
	
	private String type;
	
	public static String TYPE_STRING_CODE = "String";
	public static String TYPE_STRING_DESCRIPTION = "Cha�ne de caract�res";
	public static String TYPE_INTEGER_CODE = "Integer";
	public static String TYPE_INTEGER_DESCRIPTION = "Entier";
	public static String TYPE_DOUBLE_CODE = "Double";
	public static String TYPE_DOUBLE_DESCRIPTION ="R�el";
	public static String TYPE_BOOLEAN_CODE = "Boolean";
	public static String TYPE_BOOLEAN_DESCRIPTION = "Bool�en";
	public static String TYPE_DATE_CODE = "Calendar";
	public static String TYPE_DATE_DESCRIPTION = "Date";

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
