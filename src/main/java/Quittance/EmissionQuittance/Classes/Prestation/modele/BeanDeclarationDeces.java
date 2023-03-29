package Quittance.EmissionQuittance.Classes.Prestation.modele;

import java.util.Collection;
import java.util.Vector;

public class BeanDeclarationDeces {
	
	private Boolean duplicata = false;
	private String specimen;	
	private String nomProduit;	
	private String titre;
	private String nomAgence;
	private String numeroDeclaration;
	
	private String listRIBS1;
	private String listRIBS2;
	private String listContrats1;
	private String listContrats2;
	
	//Assur�
	private String nomPrenom;
	private String dateNaissance;
	private String numeroCin;
	private String adresse;
	private String codePostal;
	private String ville;
	private String gsm;
	private String telephoneDomicile;
	private String telephoneBureau;
	
	//Sinistre
	private String typeSinistre;
	private String dateSurvenance;
	private String lieuSurvenance;
	
   //D�clarant
	private String nomPrenomDeclarant;
	private String numeroCinDeclarant;
	private String adresseDeclarant;
	private String codePostalDeclarant;
	private String villeDeclarant;
	private String gsmDeclarant;
	private String telephoneDomicileDeclarant;
	private String telephoneBureauDeclarant;
	
	//Pi�ces justificatives
	private Collection pieceJustificatives = new Vector();

	private String lieuEtDateEdition;
	
	private String logoRma;
	private String logoBmce;
	private String logoCdm;
	private String codeSociete;
	
	public String getLogoCdm() {
		return logoCdm;
	}
	public void setLogoCdm(String logoCdm) {
		this.logoCdm = logoCdm;
	}
	public String getSpecimen() {
		return specimen;
	}
	public void setSpecimen(String specimen) {
		this.specimen = specimen;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getNomAgence() {
		return nomAgence;
	}
	public void setNomAgence(String nomAgence) {
		this.nomAgence = nomAgence;
	}
	public String getNumeroDeclaration() {
		return numeroDeclaration;
	}
	public void setNumeroDeclaration(String numeroDeclaration) {
		this.numeroDeclaration = numeroDeclaration;
	}
	public String getListRIBS1() {
		return listRIBS1;
	}
	public void setListRIBS1(String listRIBS1) {
		this.listRIBS1 = listRIBS1;
	}
	public String getListRIBS2() {
		return listRIBS2;
	}
	public void setListRIBS2(String listRIBS2) {
		this.listRIBS2 = listRIBS2;
	}
	public String getListContrats1() {
		return listContrats1;
	}
	public void setListContrats1(String listContrats1) {
		this.listContrats1 = listContrats1;
	}
	public String getListContrats2() {
		return listContrats2;
	}
	public void setListContrats2(String listContrats2) {
		this.listContrats2 = listContrats2;
	}
	public String getNomPrenom() {
		return nomPrenom;
	}
	public void setNomPrenom(String nomPrenom) {
		this.nomPrenom = nomPrenom;
	}
	public String getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getNumeroCin() {
		return numeroCin;
	}
	public void setNumeroCin(String numeroCin) {
		this.numeroCin = numeroCin;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getGsm() {
		return gsm;
	}
	public void setGsm(String gsm) {
		this.gsm = gsm;
	}
	public String getTelephoneDomicile() {
		return telephoneDomicile;
	}
	public void setTelephoneDomicile(String telephoneDomicile) {
		this.telephoneDomicile = telephoneDomicile;
	}
	public String getTelephoneBureau() {
		return telephoneBureau;
	}
	public void setTelephoneBureau(String telephoneBureau) {
		this.telephoneBureau = telephoneBureau;
	}
	public String getTypeSinistre() {
		return typeSinistre;
	}
	public void setTypeSinistre(String typeSinistre) {
		this.typeSinistre = typeSinistre;
	}
	public String getDateSurvenance() {
		return dateSurvenance;
	}
	public void setDateSurvenance(String dateSurvenance) {
		this.dateSurvenance = dateSurvenance;
	}
	public String getLieuSurvenance() {
		return lieuSurvenance;
	}
	public void setLieuSurvenance(String lieuSurvenance) {
		this.lieuSurvenance = lieuSurvenance;
	}
	public String getNomPrenomDeclarant() {
		return nomPrenomDeclarant;
	}
	public void setNomPrenomDeclarant(String nomPrenomDeclarant) {
		this.nomPrenomDeclarant = nomPrenomDeclarant;
	}
	public String getNumeroCinDeclarant() {
		return numeroCinDeclarant;
	}
	public void setNumeroCinDeclarant(String numeroCinDeclarant) {
		this.numeroCinDeclarant = numeroCinDeclarant;
	}
	public String getAdresseDeclarant() {
		return adresseDeclarant;
	}
	public void setAdresseDeclarant(String adresseDeclarant) {
		this.adresseDeclarant = adresseDeclarant;
	}
	public String getCodePostalDeclarant() {
		return codePostalDeclarant;
	}
	public void setCodePostalDeclarant(String codePostalDeclarant) {
		this.codePostalDeclarant = codePostalDeclarant;
	}
	public String getVilleDeclarant() {
		return villeDeclarant;
	}
	public void setVilleDeclarant(String villeDeclarant) {
		this.villeDeclarant = villeDeclarant;
	}
	public String getGsmDeclarant() {
		return gsmDeclarant;
	}
	public void setGsmDeclarant(String gsmDeclarant) {
		this.gsmDeclarant = gsmDeclarant;
	}
	public String getTelephoneDomicileDeclarant() {
		return telephoneDomicileDeclarant;
	}
	public void setTelephoneDomicileDeclarant(String telephoneDomicileDeclarant) {
		this.telephoneDomicileDeclarant = telephoneDomicileDeclarant;
	}
	public String getTelephoneBureauDeclarant() {
		return telephoneBureauDeclarant;
	}
	public void setTelephoneBureauDeclarant(String telephoneBureauDeclarant) {
		this.telephoneBureauDeclarant = telephoneBureauDeclarant;
	}
	public Collection getPieceJustificatives() {
		return pieceJustificatives;
	}
	public void setPieceJustificatives(Collection pieceJustificatives) {
		this.pieceJustificatives = pieceJustificatives;
	}
	public String getLieuEtDateEdition() {
		return lieuEtDateEdition;
	}
	public void setLieuEtDateEdition(String lieuEtDateEdition) {
		this.lieuEtDateEdition = lieuEtDateEdition;
	}
	public String getLogoRma() {
		return logoRma;
	}
	public void setLogoRma(String logoRma) {
		this.logoRma = logoRma;
	}
	public String getLogoBmce() {
		return logoBmce;
	}
	public void setLogoBmce(String logoBmce) {
		this.logoBmce = logoBmce;
	}
	public Boolean getDuplicata() {
		return duplicata;
	}
	public void setDuplicata(Boolean duplicata) {
		this.duplicata = duplicata;
	}
	public String getCodeSociete() {
		return codeSociete;
	}
	public void setCodeSociete(String codeSociete) {
		this.codeSociete = codeSociete;
	}

	
}
