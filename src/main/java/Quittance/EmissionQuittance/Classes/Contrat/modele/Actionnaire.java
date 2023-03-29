package Quittance.EmissionQuittance.Classes.Contrat.modele;

import Quittance.EmissionQuittance.Classes.referentiel.*;

import java.util.Calendar;



public class Actionnaire implements IEntite {

	private long id;
	private TypeActionnaire refTypeActionnaire;
	//champs actionnaire HORS PM
	private String nom;
	private String prenom;
	private Calendar dateNaissance;
	private Pays refPaysNaissance;
	private Pays refPaysNationalite;
	private Pays refPaysDeuxiemeNationalite;
	private Integer detentionCapital;
	private Profession refProfession;
	private String typePieceIdentite;
	private String numeroPieceIdentite;
	private Pays refPaysDelivrancePiece;
	private Calendar dateDebutValiditePiece;
	private Calendar dateFinValiditePiece;
	private Boolean ppe1;
	private String ppe1Fonction;
	private Pays refPaysPpe1;
	//champs actionnaire PM
	private String denominationSociale;
	private String numeroICE;
	private String numeroRC;
	private Pays refPaysImmatriculationFiscale;
	private Calendar dateCreation;
	private FormeJuridique refFormeJuridique;
	private SecteurActivite refSecteurActivite;
	private String adresseSiegeSocial;
	private Ville refVille;
	private Pays refPays;
	private Indicatif refIndicatifTelephone;
	private String telephone;
	// ce param�tre est calcul� au moement de la sauvegarde de l'actionnaire
	private Boolean signeUS;
	private Boolean entiteUS;
	private String tin;
	private String adresse;
	private Client refClientMoral;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Calendar getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Calendar dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public Pays getRefPaysNaissance() {
		return refPaysNaissance;
	}
	public void setRefPaysNaissance(Pays refPaysNaissance) {
		this.refPaysNaissance = refPaysNaissance;
	}
	public Pays getRefPaysNationalite() {
		return refPaysNationalite;
	}
	public void setRefPaysNationalite(Pays refPaysNationalite) {
		this.refPaysNationalite = refPaysNationalite;
	}
	public Pays getRefPaysDeuxiemeNationalite() {
		return refPaysDeuxiemeNationalite;
	}
	public void setRefPaysDeuxiemeNationalite(Pays refPaysDeuxiemeNationalite) {
		this.refPaysDeuxiemeNationalite = refPaysDeuxiemeNationalite;
	}
	public Integer getDetentionCapital() {
		return detentionCapital;
	}
	public void setDetentionCapital(Integer detentionCapital) {
		this.detentionCapital = detentionCapital;
	}
	public Profession getRefProfession() {
		return refProfession;
	}
	public void setRefProfession(Profession refProfession) {
		this.refProfession = refProfession;
	}
	public String getTypePieceIdentite() {
		return typePieceIdentite;
	}
	public void setTypePieceIdentite(String typePieceIdentite) {
		this.typePieceIdentite = typePieceIdentite;
	}
	public String getNumeroPieceIdentite() {
		return numeroPieceIdentite;
	}
	public void setNumeroPieceIdentite(String numeroPieceIdentite) {
		this.numeroPieceIdentite = numeroPieceIdentite;
	}
	public Pays getRefPaysDelivrancePiece() {
		return refPaysDelivrancePiece;
	}
	public void setRefPaysDelivrancePiece(Pays refPaysDelivrancePiece) {
		this.refPaysDelivrancePiece = refPaysDelivrancePiece;
	}
	public Calendar getDateDebutValiditePiece() {
		return dateDebutValiditePiece;
	}
	public void setDateDebutValiditePiece(Calendar dateDebutValiditePiece) {
		this.dateDebutValiditePiece = dateDebutValiditePiece;
	}
	public Calendar getDateFinValiditePiece() {
		return dateFinValiditePiece;
	}
	public void setDateFinValiditePiece(Calendar dateFinValiditePiece) {
		this.dateFinValiditePiece = dateFinValiditePiece;
	}
	
	public String getDenominationSociale() {
		return denominationSociale;
	}
	public void setDenominationSociale(String denominationSociale) {
		this.denominationSociale = denominationSociale;
	}
	public String getNumeroICE() {
		return numeroICE;
	}
	public void setNumeroICE(String numeroICE) {
		this.numeroICE = numeroICE;
	}
	public Pays getRefPaysImmatriculationFiscale() {
		return refPaysImmatriculationFiscale;
	}
	public void setRefPaysImmatriculationFiscale(Pays refPaysImmatriculationFiscale) {
		this.refPaysImmatriculationFiscale = refPaysImmatriculationFiscale;
	}
	public Calendar getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Calendar dateCreation) {
		this.dateCreation = dateCreation;
	}
	public FormeJuridique getRefFormeJuridique() {
		return refFormeJuridique;
	}
	public void setRefFormeJuridique(FormeJuridique refFormeJuridique) {
		this.refFormeJuridique = refFormeJuridique;
	}
	
	public SecteurActivite getRefSecteurActivite() {
		return refSecteurActivite;
	}
	public void setRefSecteurActivite(SecteurActivite refSecteurActivite) {
		this.refSecteurActivite = refSecteurActivite;
	}
	public String getAdresseSiegeSocial() {
		return adresseSiegeSocial;
	}
	public void setAdresseSiegeSocial(String adresseSiegeSocial) {
		this.adresseSiegeSocial = adresseSiegeSocial;
	}
	public Ville getRefVille() {
		return refVille;
	}
	public void setRefVille(Ville refVille) {
		this.refVille = refVille;
	}
	public Pays getRefPays() {
		return refPays;
	}
	public void setRefPays(Pays refPays) {
		this.refPays = refPays;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public Indicatif getRefIndicatifTelephone() {
		return refIndicatifTelephone;
	}
	public void setRefIndicatifTelephone(Indicatif refIndicatifTelephone) {
		this.refIndicatifTelephone = refIndicatifTelephone;
	}
	
	public Client getRefClientMoral() {
		return refClientMoral;
	}
	public void setRefClientMoral(Client refClientMoral) {
		this.refClientMoral = refClientMoral;
	}
	public TypeActionnaire getRefTypeActionnaire() {
		return refTypeActionnaire;
	}
	public void setRefTypeActionnaire(TypeActionnaire refTypeActionnaire) {
		this.refTypeActionnaire = refTypeActionnaire;
	}
	
	public Boolean getPpe1() {
		return ppe1;
	}
	public void setPpe1(Boolean ppe1) {
		this.ppe1 = ppe1;
	}
	public String getPpe1Fonction() {
		return ppe1Fonction;
	}
	public void setPpe1Fonction(String ppe1Fonction) {
		this.ppe1Fonction = ppe1Fonction;
	}
	
	
	public Pays getRefPaysPpe1() {
		return refPaysPpe1;
	}
	public void setRefPaysPpe1(Pays refPaysPpe1) {
		this.refPaysPpe1 = refPaysPpe1;
	}
	public Boolean getSigneUS() {
		return signeUS;
	}
	public void setSigneUS(Boolean signeUS) {
		this.signeUS = signeUS;
	}
	
	public Boolean getEntiteUS() {
		return entiteUS;
	}
	public void setEntiteUS(Boolean entiteUS) {
		this.entiteUS = entiteUS;
	}
	
	public String getTin() {
		return tin;
	}
	public void setTin(String tin) {
		this.tin = tin;
	}
	
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
	public String getNumeroRC() {
		return numeroRC;
	}
	public void setNumeroRC(String numeroRC) {
		this.numeroRC = numeroRC;
	}
	@Override
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}

		Actionnaire c = (Actionnaire) o;
		if (c.getId() != this.id) {
			return false;
		}

		return true;
	}

	
	

}
