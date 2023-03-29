package Quittance.EmissionQuittance.Classes.Prestation.modele;

import java.util.Collection;
import java.util.Vector;

public class BeanLiquidation {
	private Boolean duplicata = false;
	private Boolean specimen = false;	
	private String nomProduit;	
	private String titre;
	private String nomAgence;
	private String numeroDeclaration;
	private String numeroContrat;
	private String numeroAdhesion;
	
	// Assur�
	private String nomPrenomAssure;
	private String numeroPieceIdentiteAssure;
	private String dateNaissanceAssure;
	private String numeroCompteAssure;
	private String adresseAssure;
	private String villeAssure;
	private String codePostalAssure;
	private String telDomicileAssure;
	private String gsmAssure;
	private String telBureauAssure;
	
	// D�claration
	private String texteDeclarationMontantLiquidation;
	
	// B�n�ficiaire
	private String nomPrenomBeneficiaire;
	private String numeroPieceIdentiteBeneficiaire;
	private String dateNaissanceBeneficiaire;
	
	//Pi�ces justificatives
	private Collection pieceJustificatives = new Vector();

	private String lieuEtDateEdition;
	
	private String logoRma;
	private String logoPartenaire;
	public Boolean isDuplicata() {
		return duplicata;
	}
	public void setDuplicata(Boolean duplicata) {
		this.duplicata = duplicata;
	}
	public Boolean isSpecimen() {
		return specimen;
	}
	public void setSpecimen(Boolean specimen) {
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
	public String getNomPrenomAssure() {
		return nomPrenomAssure;
	}
	public void setNomPrenomAssure(String nomPrenomAssure) {
		this.nomPrenomAssure = nomPrenomAssure;
	}
	public String getNumeroPieceIdentiteAssure() {
		return numeroPieceIdentiteAssure;
	}
	public void setNumeroPieceIdentiteAssure(String numeroPieceIdentiteAssure) {
		this.numeroPieceIdentiteAssure = numeroPieceIdentiteAssure;
	}
	public String getDateNaissanceAssure() {
		return dateNaissanceAssure;
	}
	public void setDateNaissanceAssure(String dateNaissanceAssure) {
		this.dateNaissanceAssure = dateNaissanceAssure;
	}
	public String getNumeroCompteAssure() {
		return numeroCompteAssure;
	}
	public void setNumeroCompteAssure(String numeroCompteAssure) {
		this.numeroCompteAssure = numeroCompteAssure;
	}
	public String getAdresseAssure() {
		return adresseAssure;
	}
	public void setAdresseAssure(String adresseAssure) {
		this.adresseAssure = adresseAssure;
	}
	public String getVilleAssure() {
		return villeAssure;
	}
	public void setVilleAssure(String villeAssure) {
		this.villeAssure = villeAssure;
	}
	public String getCodePostalAssure() {
		return codePostalAssure;
	}
	public void setCodePostalAssure(String codePostalAssure) {
		this.codePostalAssure = codePostalAssure;
	}
	public String getTelDomicileAssure() {
		return telDomicileAssure;
	}
	public void setTelDomicileAssure(String telDomicileAssure) {
		this.telDomicileAssure = telDomicileAssure;
	}
	public String getGsmAssure() {
		return gsmAssure;
	}
	public void setGsmAssure(String gsmAssure) {
		this.gsmAssure = gsmAssure;
	}
	public String getTelBureauAssure() {
		return telBureauAssure;
	}
	public void setTelBureauAssure(String telBureauAssure) {
		this.telBureauAssure = telBureauAssure;
	}
	public String getTexteDeclarationMontantLiquidation() {
		return texteDeclarationMontantLiquidation;
	}
	public void setTexteDeclarationMontantLiquidation(
			String texteDeclarationMontantLiquidation) {
		this.texteDeclarationMontantLiquidation = texteDeclarationMontantLiquidation;
	}
	public String getNomPrenomBeneficiaire() {
		return nomPrenomBeneficiaire;
	}
	public void setNomPrenomBeneficiaire(String nomPrenomBeneficiaire) {
		this.nomPrenomBeneficiaire = nomPrenomBeneficiaire;
	}
	public String getNumeroPieceIdentiteBeneficiaire() {
		return numeroPieceIdentiteBeneficiaire;
	}
	public void setNumeroPieceIdentiteBeneficiaire(
			String numeroPieceIdentiteBeneficiaire) {
		this.numeroPieceIdentiteBeneficiaire = numeroPieceIdentiteBeneficiaire;
	}
	public String getDateNaissanceBeneficiaire() {
		return dateNaissanceBeneficiaire;
	}
	public void setDateNaissanceBeneficiaire(String dateNaissanceBeneficiaire) {
		this.dateNaissanceBeneficiaire = dateNaissanceBeneficiaire;
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
	public String getLogoPartenaire() {
		return logoPartenaire;
	}
	public void setLogoPartenaire(String logoPartenaire) {
		this.logoPartenaire = logoPartenaire;
	}

}
