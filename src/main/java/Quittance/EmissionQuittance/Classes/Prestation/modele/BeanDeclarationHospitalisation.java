package Quittance.EmissionQuittance.Classes.Prestation.modele;

import java.util.Collection;
import java.util.Vector;

/**
 * @author FADILI
 */
public class BeanDeclarationHospitalisation {
	
	private String id;
	
	private String specimen;
	private String nomProduit;
	private String nomAgence;
	private String numeroContrat;
	private String numeroDeclaration;
		
	//Assur�
	private String nomPrenom;
	private String dateNaissance;
	private String numeroCompte;
	private String numeroCin;
	private String adresse;
	private String codePostal;
	private String ville;
	private String gsm;
	private String numeroAdhesion;
	private String telephoneDomicile;
	private String telephoneBureau;
	private String lienParente;
	
	//Motif de l'hospitalisation
	private String prestataireSante;
	private String dateSurvenance;
	private String montantEvaluation;
	private String natureMaladie;
	private String natureActeChirurgical;
	private String causesEtCirconstances;
	
	//H�pital - Clinique - Polyclinique
	private String raisonSocialEtAdresse;
	private String coordonneesMedecin;
	private String dateEntree;
	private String duree;
	private String dateSortie;
	
	//R�gime d�assurance maladie

	private String regimeAssuranceMaladie;
	private String autreOrganismeAssureur;
	private String montantRemboursement;
	
	//Pi�ces justificatives
	private Collection pieceJustificatives = new Vector();

	private String lieuEtDateEdition;
	private String logoRma;
	private String logoBmce;
	
	public String getLogoBmce() {
		return logoBmce;
	}
	public void setLogoBmce(String logoBmce) {
		this.logoBmce = logoBmce;
	}
	public String getLogoRma() {
		return logoRma;
	}
	public void setLogoRma(String logoRma) {
		this.logoRma = logoRma;
	}
	public String getLienParente() {
		return lienParente;
	}
	public void setLienParente(String lienParente) {
		this.lienParente = lienParente;
	}
	public String getNatureMaladie() {
		return natureMaladie;
	}
	public void setNatureMaladie(String natureMaladie) {
		this.natureMaladie = natureMaladie;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public String getNomAgence() {
		return nomAgence;
	}
	public void setNomAgence(String nomAgence) {
		this.nomAgence = nomAgence;
	}
	public String getNumeroContrat() {
		return numeroContrat;
	}
	public void setNumeroContrat(String numeroContrat) {
		this.numeroContrat = numeroContrat;
	}
	public String getNumeroAdhesion() {
		return numeroAdhesion;
	}
	public void setNumeroAdhesion(String numeroAdhesion) {
		this.numeroAdhesion = numeroAdhesion;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getNatureActeChirurgical() {
		return natureActeChirurgical;
	}
	public void setNatureActeChirurgical(String natureActeChirurgical) {
		this.natureActeChirurgical = natureActeChirurgical;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getDateSurvenance() {
		return dateSurvenance;
	}
	public void setDateSurvenance(String dateSurvenance) {
		this.dateSurvenance = dateSurvenance;
	}
	public String getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getGsm() {
		return gsm;
	}
	public void setGsm(String gsm) {
		this.gsm = gsm;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNomPrenom() {
		return nomPrenom;
	}
	public void setNomPrenom(String nomPrenom) {
		this.nomPrenom = nomPrenom;
	}
	public String getNumeroCompte() {
		return numeroCompte;
	}
	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	public String getNumeroCin() {
		return numeroCin;
	}
	public void setNumeroCin(String numeroCin) {
		this.numeroCin = numeroCin;
	}
	public String getNumeroDeclaration() {
		return numeroDeclaration;
	}
	public void setNumeroDeclaration(String numeroDeclaration) {
		this.numeroDeclaration = numeroDeclaration;
	}
	public String getRaisonSocialEtAdresse() {
		return raisonSocialEtAdresse;
	}
	public void setRaisonSocialEtAdresse(String raisonSocialEtAdresse) {
		this.raisonSocialEtAdresse = raisonSocialEtAdresse;
	}
	public String getDateEntree() {
		return dateEntree;
	}
	public void setDateEntree(String dateEntree) {
		this.dateEntree = dateEntree;
	}
	public String getTelephoneBureau() {
		return telephoneBureau;
	}
	public void setTelephoneBureau(String telephoneBureau) {
		this.telephoneBureau = telephoneBureau;
	}
	public String getTelephoneDomicile() {
		return telephoneDomicile;
	}
	public void setTelephoneDomicile(String telephoneDomicile) {
		this.telephoneDomicile = telephoneDomicile;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public Collection getPieceJustificatives() {
		return pieceJustificatives;
	}
	public void setPieceJustificatives(Collection pieceJustificatives) {
		this.pieceJustificatives = pieceJustificatives;
	}
	public String getMontantEvaluation() {
		return montantEvaluation;
	}
	public void setMontantEvaluation(String montantEvaluation) {
		this.montantEvaluation = montantEvaluation;
	}
	public String getDuree() {
		return duree;
	}
	public void setDuree(String duree) {
		this.duree = duree;
	}
	public String getCausesEtCirconstances() {
		return causesEtCirconstances;
	}
	public void setCausesEtCirconstances(String causesEtCirconstances) {
		this.causesEtCirconstances = causesEtCirconstances;
	}
	public String getCoordonneesMedecin() {
		return coordonneesMedecin;
	}
	public void setCoordonneesMedecin(String coordonneesMedecin) {
		this.coordonneesMedecin = coordonneesMedecin;
	}
	public String getDateSortie() {
		return dateSortie;
	}
	public void setDateSortie(String dateSortie) {
		this.dateSortie = dateSortie;
	}
	public String getRegimeAssuranceMaladie() {
		return regimeAssuranceMaladie;
	}
	public void setRegimeAssuranceMaladie(String regimeAssuranceMaladie) {
		this.regimeAssuranceMaladie = regimeAssuranceMaladie;
	}
	public String getMontantRemboursement() {
		return montantRemboursement;
	}
	public void setMontantRemboursement(String montantRemboursement) {
		this.montantRemboursement = montantRemboursement;
	}
	public String getAutreOrganismeAssureur() {
		return autreOrganismeAssureur;
	}
	public void setAutreOrganismeAssureur(String autreOrganismeAssureur) {
		this.autreOrganismeAssureur = autreOrganismeAssureur;
	}
	public String getLieuEtDateEdition() {
		return lieuEtDateEdition;
	}
	public void setLieuEtDateEdition(String lieuEtDateEdition) {
		this.lieuEtDateEdition = lieuEtDateEdition;
	}
	public String getPrestataireSante() {
		return prestataireSante;
	}
	public void setPrestataireSante(String prestataireSante) {
		this.prestataireSante = prestataireSante;
	}
	public String getSpecimen() {
		return specimen;
	}
	public void setSpecimen(String specimen) {
		this.specimen = specimen;
	}
}
