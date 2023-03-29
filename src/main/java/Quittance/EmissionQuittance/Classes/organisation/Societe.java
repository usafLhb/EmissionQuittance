package Quittance.EmissionQuittance.Classes.organisation;

import java.util.Calendar;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;
import ma.co.omnidata.framework.services.organisation.OrganisationFactory;

public class Societe extends ParametrageBO implements IEntite {

	private static final long serialVersionUID = 1L;
	private long id;
	private Integer code;
	private String libelle;
	private String libelleAr;
	private String lettreDebutLogin;
	private String cheminLogoRMA;
	private String cheminLogoConfrere;
	private String cheminEdition;
	private String cheminGuide;
	private String cheminProcedures;
	private String cheminAideOnline;
	private String cheminContact;
	private String cheminGuideInteractif;
	private String cheminReport;
	private String cheminCondGen;
	private String capitalsocial;
	private Calendar dateCreation;
	private Calendar dateDebut;
	private Calendar dateFin;
	private String adresse ;
	private String ville;
	private String codeClient;


	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public boolean equals(Object obj) {
		if(this.getId()==((Societe)obj).getId()){
			return true;
		}
		return false;
	}

	public Societe() {

	}

	public long getId() {
		return id;
	}

	public void setId(long aId) {
		id = aId;
	}

	public String getDescription() {
		return code + " - " + libelle;
	}

	/**
	 * Access method for the code property.
	 * 
	 * @return the current value of the code property
	 */
	public Integer getCode() {
		return code;
	}

	/**
	 * Sets the value of the code property.
	 * 
	 * @param aCode
	 *            the new value of the code property
	 */
	public void setCode(Integer aCode) {
		code = aCode;
	}

	/**
	 * Access method for the libelle property.
	 * 
	 * @return the current value of the libelle property
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Sets the value of the libelle property.
	 * 
	 * @param aLibelle
	 *            the new value of the libelle property
	 */
	public void setLibelle(String aLibelle) {
		libelle = aLibelle;
	}

	/**
	 * Access method for the lettreDebutLogin property.
	 * 
	 * @return the current value of the lettreDebutLogin property
	 */
	public String getLettreDebutLogin() {
		return lettreDebutLogin;
	}

	/**
	 * Sets the value of the lettreDebutLogin property.
	 * 
	 * @param aLettreDebutLogin
	 *            the new value of the lettreDebutLogin property
	 */
	public void setLettreDebutLogin(String aLettreDebutLogin) {
		lettreDebutLogin = aLettreDebutLogin;
	}


	public String getCheminLogoRMA() {
		return cheminLogoRMA;
	}

	public void setCheminLogoRMA(String cheminLogoRMA) {
		this.cheminLogoRMA = cheminLogoRMA;
	}

	public String getCheminLogoConfrere() {
		return cheminLogoConfrere;
	}

	public void setCheminLogoConfrere(String cheminLogoConfrere) {
		this.cheminLogoConfrere = cheminLogoConfrere;
	}

	public String getCheminEdition() {
		return cheminEdition;
	}

	public void setCheminEdition(String cheminEdition) {
		this.cheminEdition = cheminEdition;
	}

	public String getCheminGuide() {
		return cheminGuide;
	}

	public void setCheminGuide(String cheminGuide) {
		this.cheminGuide = cheminGuide;
	}

	public String getCheminProcedures() {
		return cheminProcedures;
	}

	public void setCheminProcedures(String cheminProcedures) {
		this.cheminProcedures = cheminProcedures;
	}

	public String getCheminAideOnline() {
		return cheminAideOnline;
	}

	public void setCheminAideOnline(String cheminAideOnline) {
		this.cheminAideOnline = cheminAideOnline;
	}

	public String getCheminContact() {
		return cheminContact;
	}

	public void setCheminContact(String cheminContact) {
		this.cheminContact = cheminContact;
	}

	public String getCheminGuideInteractif() {
		return cheminGuideInteractif;
	}

	public void setCheminGuideInteractif(String cheminGuideInteractif) {
		this.cheminGuideInteractif = cheminGuideInteractif;
	}

	public String getCheminReport() {
		return cheminReport;
	}

	public void setCheminReport(String cheminReport) {
		this.cheminReport = cheminReport;
	}

	public EntiteFactory getFactory() {
		return new OrganisationFactory();
	}

	public String getCapitalsocial() {
		return capitalsocial;
	}

	public void setCapitalsocial(String capitalsocial) {
		this.capitalsocial = capitalsocial;
	}

	public Calendar getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Calendar dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Calendar getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Calendar dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Calendar getDateFin() {
		return dateFin;
	}

	public void setDateFin(Calendar dateFin) {
		this.dateFin = dateFin;
	}

	public String getCheminCondGen() {
		return cheminCondGen;
	}

	public void setCheminCondGen(String cheminCondGen) {
		this.cheminCondGen = cheminCondGen;
	}

	public String getCodeClient() {
		return codeClient;
	}

	public void setCodeClient(String codeClient) {
		this.codeClient = codeClient;
	}

	public String getLibelleAr() {
		return libelleAr;
	}

	public void setLibelleAr(String libelleAr) {
		this.libelleAr = libelleAr;
	}
}
