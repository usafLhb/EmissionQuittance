package Quittance.EmissionQuittance.Classes.Prestation.modele;

import java.util.Collection;
import java.util.Vector;



public class BeanDemandeRachatAvance {
	
	private String id;
	
	private String specimen;
	private String nomProduit;
	private String nomAgence;
	private String numeroDeclaration;
	private String numeroContrat;
	private String nomPrenom;
	private String dateNaissance;

	private String numeroCompte;
	private String adresse;
	private String ville;
	private String telephoneDomicile;
	private String gsm;
	private String numeroAdhesion;
	private String numeroCin;
	private String codePostal;
	private String telephoneBureau;
	private String montant;
	private String lieuEtDateEdition;
	private String titre;
	private String declaration;
	private String attestationPerte;
	private String pieces;
	
	private String logoRma;	
	private String logoBmce;
	
	//Pi�ces justificatives
	private Collection attestationsPresentees = new Vector();
	
	
	
	public String getNumeroContrat() {
		return numeroContrat;
	}

	public void setNumeroContrat(String numeroContrat){
		this.numeroContrat = numeroContrat;
	}
	
	public String getNomPrenom() {
		return nomPrenom;
	}

	public void setNomPrenom(String nomPrenom){
		this.nomPrenom = nomPrenom;
	}
	
	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance){
		this.dateNaissance = dateNaissance;
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
	
	public String getNumeroDeclaration() {
		return numeroDeclaration;
	}

	public void setNumeroDeclaration(String numeroDeclaration) {
		this.numeroDeclaration = numeroDeclaration;
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
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

	public String getNumeroCin() {
		return numeroCin;
	}

	public void setNumeroCin(String numeroCin) {
		this.numeroCin = numeroCin;
	}
	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getTelephoneBureau() {
		return telephoneBureau;
	}

	public void setTelephoneBureau(String telephoneBureau) {
		this.telephoneBureau = telephoneBureau;
	}
	public String getMontant() {
		return montant;
	}

	public void setMontant(String montant) {
		this.montant = montant;
	}
	public String getLieuEtDateEdition() {
		return lieuEtDateEdition;
	}

	public void setLieuEtDateEdition(String lieuEtDateEdition) {
		this.lieuEtDateEdition = lieuEtDateEdition;
	}
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDeclaration() {
		return declaration;
	}

	public void setDeclaration(String declaration) {
		this.declaration = declaration;
	}
	public String getAttestationPerte() {
		return attestationPerte;
	}

	public void setAttestationPerte(String attestationPerte) {
		this.attestationPerte = attestationPerte;
	}

	public String getSpecimen() {
		return specimen;
	}

	public void setSpecimen(String specimen) {
		this.specimen = specimen;
	}

	public String getPieces() {
		return pieces;
	}

	public void setPieces(String pieces) {
		this.pieces = pieces;
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

	public Collection getAttestationsPresentees() {
		return attestationsPresentees;
	}

	public void setAttestationsPresentees(Collection attestationsPresentees) {
		this.attestationsPresentees = attestationsPresentees;
	}
}
