package Quittance.EmissionQuittance.Classes.Prelevements.modele;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.application.oct.metier.modele.Contrat;
import com.rmawatanya.convergence.utile.referentiel.TypePrelevement;

public class DeclarationCotisation implements IEntite {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5804264020913167088L;
	
	private long id;
	private Contrat refContratAdhesion;
	private String numAdhesion;
	private String nomAdherent;
	private String prenomAdherent;
	private String matricule;
	private String numPieceIdentite;
	private Double montant;
	private Double montantAPrelever;
//	private Double montantFraisAcquisition;
	private TypePrelevement refTypeCotisation;
	private String etat;
	private String motifRejet;
	private OperationIntegrationCotisation refOperationIntegrationCotisation;
	
	private Double montantCommissionApport;
	private Double montantCommissionGest;
	private Double montantCommissionProd;
	private Double montantGestionSurPrime;
	private Double tauxTVA;
	private Boolean modePrelevement;
	private String etatPrelevement;
	private String observation;
	private EcheancierPrelevement refEcheancierPrelevement;

	private String role;
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	
	

	/**
	 * @return the refContratAffilie
	 */
	public Contrat getRefContratAdhesion() {
		return refContratAdhesion;
	}


	/**
	 * @param refContratAffilie the refContratAffilie to set
	 */
	public void setRefContratAdhesion(Contrat refContratAffilie) {
		this.refContratAdhesion = refContratAffilie;
	}


	/**
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}


	/**
	 * @param matricule the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}


	/**
	 * @return the numPieceIdentite
	 */
	public String getNumPieceIdentite() {
		return numPieceIdentite;
	}


	/**
	 * @param numPieceIdentite the numPieceIdentite to set
	 */
	public void setNumPieceIdentite(String numPieceIdentite) {
		this.numPieceIdentite = numPieceIdentite;
	}


	/**
	 * @return the montant
	 */
	public Double getMontant() {
		return montant;
	}


	/**
	 * @param montant the montant to set
	 */
	public void setMontant(Double montant) {
		this.montant = montant;
	}


	/**
	 * @return the typeCotisation
	 */
	public TypePrelevement getRefTypeCotisation() {
		return refTypeCotisation;
	}


	/**
	 * @param typeCotisation the typeCotisation to set
	 */
	public void setRefTypeCotisation(TypePrelevement typeCotisation) {
		this.refTypeCotisation = typeCotisation;
	}

	
	
	/**
	 * @return the etat
	 */
	public String getEtat() {
		return etat;
	}


	/**
	 * @param etat the etat to set
	 */
	public void setEtat(String etat) {
		this.etat = etat;
	}


	/**
	 * @return the motifRejet
	 */
	public String getMotifRejet() {
		return motifRejet;
	}


	/**
	 * @param motifRejet the motifRejet to set
	 */
	public void setMotifRejet(String motifRejet) {
		this.motifRejet = motifRejet;
	}

	

	/**
	 * @return the numAdhesion
	 */
	public String getNumAdhesion() {
		return numAdhesion;
	}


	/**
	 * @param numAdhesion the numAdhesion to set
	 */
	public void setNumAdhesion(String numAdhesion) {
		this.numAdhesion = numAdhesion;
	}


	/**
	 * @return the refOperationIntegrationCotisation
	 */
	public OperationIntegrationCotisation getRefOperationIntegrationCotisation() {
		return refOperationIntegrationCotisation;
	}


	/**
	 * @param refOperationIntegrationCotisation the refOperationIntegrationCotisation to set
	 */
	public void setRefOperationIntegrationCotisation(
			OperationIntegrationCotisation refOperationIntegrationCotisation) {
		this.refOperationIntegrationCotisation = refOperationIntegrationCotisation;
	}
	
//	/**
//	 * @return the montantCommission
//	 */
//	public Double getMontantCommission() {
//		return montantCommission;
//	}
//
//
//	/**
//	 * @param montantCommission the montantCommission to set
//	 */
//	public void setMontantCommission(Double montantCommission) {
//		this.montantCommission = montantCommission;
//	}
//
//
//	/**
//	 * @return the montantFraisAcquisition
//	 */
//	public Double getMontantFraisAcquisition() {
//		return montantFraisAcquisition;
//	}
//
//
//	/**
//	 * @param montantFraisAcquisition the montantFraisAcquisition to set
//	 */
//	public void setMontantFraisAcquisition(Double montantFraisAcquisition) {
//		this.montantFraisAcquisition = montantFraisAcquisition;
//	}
//	
	


	/**
	 * @return the nomAdherent
	 */
	public String getNomAdherent() {
		return nomAdherent;
	}


	/**
	 * @param nomAdherent the nomAdherent to set
	 */
	public void setNomAdherent(String nomAdherent) {
		this.nomAdherent = nomAdherent;
	}


	/**
	 * @return the prenomAdherent
	 */
	public String getPrenomAdherent() {
		return prenomAdherent;
	}


	/**
	 * @param prenomAdherent the prenomAdherent to set
	 */
	public void setPrenomAdherent(String prenomAdherent) {
		this.prenomAdherent = prenomAdherent;
	}

	

	/**
	 * @return the montantCommissionApport
	 */
	public Double getMontantCommissionApport() {
		return montantCommissionApport;
	}


	/**
	 * @param montantCommissionApport the montantCommissionApport to set
	 */
	public void setMontantCommissionApport(Double montantCommissionApport) {
		this.montantCommissionApport = montantCommissionApport;
	}


	/**
	 * @return the montantCommissionGest
	 */
	public Double getMontantCommissionGest() {
		return montantCommissionGest;
	}


	/**
	 * @param montantCommissionGest the montantCommissionGest to set
	 */
	public void setMontantCommissionGest(Double montantCommissionGest) {
		this.montantCommissionGest = montantCommissionGest;
	}


	/**
	 * @return the montantCommissionProd
	 */
	public Double getMontantCommissionProd() {
		return montantCommissionProd;
	}


	/**
	 * @param montantCommissionProd the montantCommissionProd to set
	 */
	public void setMontantCommissionProd(Double montantCommissionProd) {
		this.montantCommissionProd = montantCommissionProd;
	}


	/**
	 * @return the montantGestionSurPrime
	 */
	public Double getMontantGestionSurPrime() {
		return montantGestionSurPrime;
	}


	/**
	 * @param montantGestionSurPrime the montantGestionSurPrime to set
	 */
	public void setMontantGestionSurPrime(Double montantGestionSurPrime) {
		this.montantGestionSurPrime = montantGestionSurPrime;
	}


	/**
	 * @return the tauxTVA
	 */
	public Double getTauxTVA() {
		return tauxTVA;
	}


	/**
	 * @param tauxTVA the tauxTVA to set
	 */
	public void setTauxTVA(Double tauxTVA) {
		this.tauxTVA = tauxTVA;
	}
	
	


	/**
	 * @return the modePrelevement
	 */
	public Boolean getModePrelevement() {
		return modePrelevement;
	}


	/**
	 * @param modePrelevement the modePrelevement to set
	 */
	public void setModePrelevement(Boolean modePrelevement) {
		this.modePrelevement = modePrelevement;
	}

	

	/**
	 * @return the montantAPrelever
	 */
	public Double getMontantAPrelever() {
		return montantAPrelever;
	}


	/**
	 * @param montantAPrelever the montantAPrelever to set
	 */
	public void setMontantAPrelever(Double montantAPrelever) {
		this.montantAPrelever = montantAPrelever;
	}


	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getEtatPrelevement() {
		return etatPrelevement;
	}


	public void setEtatPrelevement(String etatPrelevement) {
		this.etatPrelevement = etatPrelevement;
	}


	public String getObservation() {
		return observation;
	}


	public void setObservation(String observation) {
		this.observation = observation;
	}


	public EcheancierPrelevement getRefEcheancierPrelevement() {
		return refEcheancierPrelevement;
	}


	public void setRefEcheancierPrelevement(
			EcheancierPrelevement refEcheancierPrelevement) {
		this.refEcheancierPrelevement = refEcheancierPrelevement;
	}


	public void setRole(String role) {
		this.role = role;
		
	}

	public String getRole() {
		return role;
	}
	

}
