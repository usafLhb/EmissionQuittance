package Quittance.EmissionQuittance.Classes.Prestation.modele;


public class BeanQuittanceRemboursement {
	
	private String id;
	
	private String nomProduit;
	private String refPolice;
	private String refContrat;
	private String numeroAdhesion;
	private String nomPrenom;
	private String dateDemandeavance;
	private String montantRemboursementEnChiffre;
	private String montantRemboursementEnLettre;
	private String dateEtLieuEdition;
	private String texte;

	
	public String getDateEtLieuEdition() {
		return dateEtLieuEdition;
	}

	public void setDateEtLieuEdition(String dateEtLieuEdition){
		this.dateEtLieuEdition = dateEtLieuEdition;
	}
	public String getNomPrenom() {
		return nomPrenom;
	}

	public void setNomPrenom(String nomPrenom){
		this.nomPrenom = nomPrenom;
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

	
	public String getMontantRemboursementEnChiffre() {
		return montantRemboursementEnChiffre;
	}

	public void setMontantRemboursementEnChiffre(String montantRemboursementEnChiffre) {
		this.montantRemboursementEnChiffre = montantRemboursementEnChiffre;
	}

	public String getMontantRemboursementEnLettre() {
		return montantRemboursementEnLettre;
	}

	public void setMontantRemboursementEnLettre(String montantRemboursementEnLettre) {
		this.montantRemboursementEnLettre = montantRemboursementEnLettre;
	}
	
	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}
	
	
	public String getDateDemandeavance() {
		return dateDemandeavance;
	}

	public void setDateDemandeavance(String dateDemandeavance) {
		this.dateDemandeavance = dateDemandeavance;
	}

}
