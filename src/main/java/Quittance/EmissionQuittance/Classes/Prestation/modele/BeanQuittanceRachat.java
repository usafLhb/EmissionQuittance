package Quittance.EmissionQuittance.Classes.Prestation.modele;


public class BeanQuittanceRachat {
	
	private String id;
	private String specimen;
	private String nomProduit;
	private String refPolice;
	private String refContrat;
	private String numeroAdhesion;
	private String refQuittance;

	private String beneficiaire;
	private String montantReglementEnChiffre;
	private String montantReglementEnLettre;
	private String dateEtLieuEdition;
	private String texte;
	private String typeRachat;
	private String montantDemande;
	private String montantPenalite;
	private String montantIR;
	private String montantRemboursementAvance;

	
	public String getDateEtLieuEdition() {
		return dateEtLieuEdition;
	}

	public void setDateEtLieuEdition(String dateEtLieuEdition){
		this.dateEtLieuEdition = dateEtLieuEdition;
	}
	
	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte){
		this.texte = texte;
	}
	
	public String getTypeRachat() {
		return typeRachat;
	}

	public void setTypeRachat(String typeRachat){
		this.typeRachat = typeRachat;
	}
	
	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	
	public String getRefPolice() {
		return refPolice;
	}

	public void setRefPolice(String refPolice) {
		this.refPolice = refPolice;
	}

	public String getRefContrat() {
		return refContrat;
	}

	public void setRefContrat(String refContrat) {
		this.refContrat = refContrat;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNumeroAdhesion() {
		return numeroAdhesion;
	}

	public void setNumeroAdhesion(String numeroAdhesion) {
		this.numeroAdhesion = numeroAdhesion;
	}

	public String getRefQuittance() {
		return refQuittance;
	}

	public void setRefQuittance(String refQuittance) {
		this.refQuittance = refQuittance;
	}

	public String getBeneficiaire() {
		return beneficiaire;
	}

	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}

	public String getMontantReglementEnChiffre() {
		return montantReglementEnChiffre;
	}

	public void setMontantReglementEnChiffre(String montantReglementEnChiffre) {
		this.montantReglementEnChiffre = montantReglementEnChiffre;
	}

	public String getMontantReglementEnLettre() {
		return montantReglementEnLettre;
	}

	public void setMontantReglementEnLettre(String montantReglementEnLettre) {
		this.montantReglementEnLettre = montantReglementEnLettre;
	}

	public String getSpecimen() {
		return specimen;
	}

	public void setSpecimen(String specimen) {
		this.specimen = specimen;
	}

	public String getMontantDemande() {
		return montantDemande;
	}

	public void setMontantDemande(String montantDemande) {
		this.montantDemande = montantDemande;
	}

	public String getMontantPenalite() {
		return montantPenalite;
	}

	public void setMontantPenalite(String montantPenalite) {
		this.montantPenalite = montantPenalite;
	}

	public String getMontantIR() {
		return montantIR;
	}

	public void setMontantIR(String montantIR) {
		this.montantIR = montantIR;
	}

	public String getMontantRemboursementAvance() {
		return montantRemboursementAvance;
	}

	public void setMontantRemboursementAvance(String montantRemboursementAvance) {
		this.montantRemboursementAvance = montantRemboursementAvance;
	}

}
