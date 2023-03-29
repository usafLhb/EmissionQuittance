package Quittance.EmissionQuittance.Classes.Prestation.modele;

import java.util.Collection;
import java.util.Vector;

/**
 * @author FADILI
 */
public class BeanDeclarationSinistre {
	
	private String id;
	
	private String specimen;	
	private String libelleProduit;	
	private String titre;
	private String nomAgence;
	private String numeroContrat;
	private String numeroDeclaration;
	private String labelAssure;
	
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
	//Sinistre
	private String typeSinistre;
	private String dateSurvenance;
	private String lieuSurvenance;
	private String optionBareme;
	private String montantEvaluation;
	private String adresseSituationRisque;
	private String libelleAdresseRisque;
	private String causesEtCirconstances;
	private String labelCoordonneesMedecin;
	private String coordonneesMedecin;
	private String commentaires;
	private String autreOrganismeAssurance;
	private String montantRemboursement;
	
   //D�clarant
	private String declarant;
	private String identiteDeclarant;
	private String lienAvecAssure;
	
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
	private String dommage;
	

	public String getLibelleProduit() {
		return libelleProduit;
	}
	public void setLibelleProduit(String libelleProduit) {
		this.libelleProduit = libelleProduit;
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
	public String getTypeSinistre() {
		return typeSinistre;
	}
	public void setTypeSinistre(String typeSinistre) {
		this.typeSinistre = typeSinistre;
	}
	public String getLabelAssure() {
		return labelAssure;
	}
	public void setLabelAssure(String labelAssure) {
		this.labelAssure = labelAssure;
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
	public String getLieuSurvenance() {
		return lieuSurvenance;
	}
	public void setLieuSurvenance(String lieuSurvenance) {
		this.lieuSurvenance = lieuSurvenance;
	}
	public String getOptionBareme() {
		return optionBareme;
	}
	public void setOptionBareme(String optionBareme) {
		this.optionBareme = optionBareme;
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
	public String getAdresseSituationRisque() {
		return adresseSituationRisque;
	}
	public void setAdresseSituationRisque(String adresseSituationRisque) {
		this.adresseSituationRisque = adresseSituationRisque;
	}
	public String getLibelleAdresseRisque() {
		return libelleAdresseRisque;
	}
	public void setLibelleAdresseRisque(String libelleAdresseRisque) {
		this.libelleAdresseRisque = libelleAdresseRisque;
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
	public String getLabelCoordonneesMedecin() {
		return labelCoordonneesMedecin;
	}
	public void setLabelCoordonneesMedecin(String labelCoordonneesMedecin) {
		this.labelCoordonneesMedecin = labelCoordonneesMedecin;
	}
	public String getCommentaires() {
		return commentaires;
	}
	public void setCommentaires(String commentaires) {
		this.commentaires = commentaires;
	}
	public String getAutreOrganismeAssurance() {
		return autreOrganismeAssurance;
	}
	public void setAutreOrganismeAssurance(String autreOrganismeAssurance) {
		this.autreOrganismeAssurance = autreOrganismeAssurance;
	}
	public String getMontantRemboursement() {
		return montantRemboursement;
	}
	public void setMontantRemboursement(String montantRemboursement) {
		this.montantRemboursement = montantRemboursement;
	}
	public String getIdentiteDeclarant() {
		return identiteDeclarant;
	}
	public void setIdentiteDeclarant(String identiteDeclarant) {
		this.identiteDeclarant = identiteDeclarant;
	}
	public String getLienAvecAssure() {
		return lienAvecAssure;
	}
	public void setLienAvecAssure(String lienAvecAssure) {
		this.lienAvecAssure = lienAvecAssure;
	}
	public String getLieuEtDateEdition() {
		return lieuEtDateEdition;
	}
	public void setLieuEtDateEdition(String lieuEtDateEdition) {
		this.lieuEtDateEdition = lieuEtDateEdition;
	}
	public String getDeclarant() {
		return declarant;
	}
	public void setDeclarant(String declarant) {
		this.declarant = declarant;
	}
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
	public String getDommage() {
		return dommage;
	}
	public void setDommage(String dommage) {
		this.dommage = dommage;
	}
	public String getSpecimen() {
		return specimen;
	}
	public void setSpecimen(String specimen) {
		this.specimen = specimen;
	}
	public String getCodeSociete() {
		return codeSociete;
	}
	public void setCodeSociete(String codeSociete) {
		this.codeSociete = codeSociete;
	}
	
}
