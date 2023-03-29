
package Quittance.EmissionQuittance.Classes.Produit.modele;

import java.util.Calendar;
import java.util.Collection;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class ParametresEpargne extends ParametrageBO implements IEntite {

	private static final long serialVersionUID = 1L;
	private long id;

	/*** 0: Non, 1 : Oui mais facultatif, 2 : Oui et obligatoire. */
	private String avecVersementInitial;
	private Double versementInitialMin;

	/**
	 * 0: Non, 1 : Oui mais facultatif, 2 : Oui et obligatoire.
	 */
	private String avecCotisation;
	private Double cotisationMin;

	/**
	 * L'�pargne peut �tre avec nantissement. 0 : Non, 1 : Oui
	 */
	private String avecNantissement;

	/**
	 * L'�pargne peut �tre avec d�ductibilit�. 0 : Non, 1 : Oui, 2 : forc�ment avec d�ductibilit�
	 */
	private String avecDeductibilite;

	/**
	 * L'�pargne peut �tre avec cr�dit infine. 0 : Non, 1 : Oui
	 */
	private Boolean avecCreditInfine;

	/**
	 * 0: Non, 1 : Oui.
	 */
	private Boolean avecVersementExceptionnel;
	private Double versementExceptionnelMin;
	private Boolean avecRachat;
	private Boolean avecRachatPartiel;
	private Double pourcentageMinRachatPartiel;
	private Double pourcentageMaxRachatPartiel;
	private Integer nombreMaxRachatsPartiels;
	private Boolean avecAvance;
	private Double pourcentageMinAvance;
	private Double pourcentageMaxAvance;
	private Calendar dateDebut;
	private Calendar dateFin;
	
	

	/**
	 * 0: Non, 1 : Oui.
	 */
	private Boolean avecDuree;
	private Integer dureeMin;

	/**
	 * 0 - Sans IGR 1 - Retraite 2 - Epargne
	 */
	private String modeCalculIGR;
	
	/**
	 * 0: Non, 1 : Oui.
	 */
	private Boolean avecSuspensionRepriseCotisations;
	
	private String libelle;
	
	private Collection refTypePeriodicitesCotisationPossibles;	
	
	private Collection refCommissions;
	private Collection refTaxeAssurances;
	
	// UC
	private Boolean avecSupports;
	private Integer nombreMaxSuspensionCotisationsParAnnee;
	private Integer dureeMaxSuspensionCotisationsParAnnee;
	private String avecGarantiePlancher;
	private Double  montantEpargneResuduel;
	private Double  pourcentageChuteBrutaleHebdo;
	private Double  pourcentageChuteBrutalePeriodeGlissante;
	
	/*  said param UC**/
	private Double montantMinRachat;
	private Integer nombreArbitragesGratuit;
	private Double montantMinFraisArbitrage;
	private Integer nombreMaxArbitrages;
	private Integer periodeLimitationArbitrages;
	private Double pourcentageMaxAvanceFondDh;
	private Double pourcentageAlertAvance;
	private Double pourcentageTransfAvanceRachat;
	

	
	
	//Distribution
	
    private Boolean avecDistribution;
	   


	public boolean equals(Object obj) {
		if(this.getId()==((ParametresEpargne)obj).getId()){
			return true;
		}
		return false;
	}

	public ParametresEpargne() {

	}
	
	public String getDescription(){		
		return id+" "+libelle;
	}

	/**
	 * Access method for the id property.
	 * 
	 * @return the current value of the id property
	 */
	public long getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param aId
	 *            the new value of the id property
	 */
	public void setId(long aId) {
		id = aId;
	}

	/**
	 * Access method for the avecVersementInitial property.
	 * 
	 * @return the current value of the avecVersementInitial property
	 */
	public String getAvecVersementInitial() {
		return avecVersementInitial;
	}

	/**
	 * Sets the value of the avecVersementInitial property.
	 * 
	 * @param aAvecVersementInitial
	 *            the new value of the avecVersementInitial property
	 */
	public void setAvecVersementInitial(String aAvecVersementInitial) {
		avecVersementInitial = aAvecVersementInitial;
	}

	/**
	 * Access method for the versementInitialMin property.
	 * 
	 * @return the current value of the versementInitialMin property
	 */
	public Double getVersementInitialMin() {
		return versementInitialMin;
	}

	/**
	 * Sets the value of the versementInitialMin property.
	 * 
	 * @param aVersementInitialMin
	 *            the new value of the versementInitialMin property
	 */
	public void setVersementInitialMin(Double aVersementInitialMin) {
		versementInitialMin = aVersementInitialMin;
	}

	/**
	 * Access method for the avecCotisation property.
	 * 
	 * @return the current value of the avecCotisation property
	 */
	public String getAvecCotisation() {
		return avecCotisation;
	}

	/**
	 * Sets the value of the avecCotisation property.
	 * 
	 * @param aAvecCotisation
	 *            the new value of the avecCotisation property
	 */
	public void setAvecCotisation(String aAvecCotisation) {
		avecCotisation = aAvecCotisation;
	}

	/**
	 * Access method for the cotisationMin property.
	 * 
	 * @return the current value of the cotisationMin property
	 */
	public Double getCotisationMin() {
		return cotisationMin;
	}

	/**
	 * Sets the value of the cotisationMin property.
	 * 
	 * @param aCotisationMin
	 *            the new value of the cotisationMin property
	 */
	public void setCotisationMin(Double aCotisationMin) {
		cotisationMin = aCotisationMin;
	}

	public String getAvecNantissement() {
		return avecNantissement;
	}

	public void setAvecNantissement(String avecNantissement) {
		this.avecNantissement = avecNantissement;
	}

	/**
	 * Access method for the avecDeductibilite property.
	 * 
	 * @return the current value of the avecDeductibilite property
	 */
	public String getAvecDeductibilite() {
		return avecDeductibilite;
	}

	/**
	 * Sets the value of the avecDeductibilite property.
	 * 
	 * @param aAvecDeductibilite
	 *            the new value of the avecDeductibilite property
	 */
	public void setAvecDeductibilite(String aAvecDeductibilite) {
		avecDeductibilite = aAvecDeductibilite;
	}

	/**
	 * Access method for the avecCreditInfine property.
	 * 
	 * @return the current value of the avecCreditInfine property
	 */
	public Boolean getAvecCreditInfine() {
		return avecCreditInfine;
	}

	/**
	 * Sets the value of the avecCreditInfine property.
	 * 
	 * @param aAvecCreditInfine
	 *            the new value of the avecCreditInfine property
	 */
	public void setAvecCreditInfine(Boolean aAvecCreditInfine) {
		avecCreditInfine = aAvecCreditInfine;
	}

	/**
	 * Access method for the avecVersementExceptionnel property.
	 * 
	 * @return the current value of the avecVersementExceptionnel property
	 */
	public Boolean getAvecVersementExceptionnel() {
		return avecVersementExceptionnel;
	}

	/**
	 * Sets the value of the avecVersementExceptionnel property.
	 * 
	 * @param aAvecVersementExceptionnel
	 *            the new value of the avecVersementExceptionnel property
	 */
	public void setAvecVersementExceptionnel(Boolean aAvecVersementExceptionnel) {
		avecVersementExceptionnel = aAvecVersementExceptionnel;
	}

	/**
	 * Access method for the versementExceptionnelMin property.
	 * 
	 * @return the current value of the versementExceptionnelMin property
	 */
	public Double getVersementExceptionnelMin() {
		return versementExceptionnelMin;
	}

	/**
	 * Sets the value of the versementExceptionnelMin property.
	 * 
	 * @param aVersementExceptionnelMin
	 *            the new value of the versementExceptionnelMin property
	 */
	public void setVersementExceptionnelMin(Double aVersementExceptionnelMin) {
		versementExceptionnelMin = aVersementExceptionnelMin;
	}

	/**
	 * Access method for the avecRachat property.
	 * 
	 * @return the current value of the avecRachat property
	 */
	public Boolean getAvecRachat() {
		return avecRachat;
	}

	/**
	 * Sets the value of the avecRachat property.
	 * 
	 * @param aAvecRachat
	 *            the new value of the avecRachat property
	 */
	public void setAvecRachat(Boolean aAvecRachat) {
		avecRachat = aAvecRachat;
	}

	/**
	 * Access method for the avecRachatPartiel property.
	 * 
	 * @return the current value of the avecRachatPartiel property
	 */
	public Boolean getAvecRachatPartiel() {
		return avecRachatPartiel;
	}

	/**
	 * Sets the value of the avecRachatPartiel property.
	 * 
	 * @param aAvecRachatPartiel
	 *            the new value of the avecRachatPartiel property
	 */
	public void setAvecRachatPartiel(Boolean aAvecRachatPartiel) {
		avecRachatPartiel = aAvecRachatPartiel;
	}

	/**
	 * Access method for the pourcentageMinRachatPartiel property.
	 * 
	 * @return the current value of the pourcentageMinRachatPartiel property
	 */
	public Double getPourcentageMinRachatPartiel() {
		return pourcentageMinRachatPartiel;
	}

	/**
	 * Sets the value of the pourcentageMinRachatPartiel property.
	 * 
	 * @param aPourcentageMinRachatPartiel
	 *            the new value of the pourcentageMinRachatPartiel property
	 */
	public void setPourcentageMinRachatPartiel(Double aPourcentageMinRachatPartiel) {
		pourcentageMinRachatPartiel = aPourcentageMinRachatPartiel;
	}

	/**
	 * Access method for the pourcentageMaxRachatPartiel property.
	 * 
	 * @return the current value of the pourcentageMaxRachatPartiel property
	 */
	public Double getPourcentageMaxRachatPartiel() {
		return pourcentageMaxRachatPartiel;
	}

	/**
	 * Sets the value of the pourcentageMaxRachatPartiel property.
	 * 
	 * @param aPourcentageMaxRachatPartiel
	 *            the new value of the pourcentageMaxRachatPartiel property
	 */
	public void setPourcentageMaxRachatPartiel(Double aPourcentageMaxRachatPartiel) {
		pourcentageMaxRachatPartiel = aPourcentageMaxRachatPartiel;
	}

	/**
	 * Access method for the nombreMaxRachatsPartiels property.
	 * 
	 * @return the current value of the nombreMaxRachatsPartiels property
	 */
	public Integer getNombreMaxRachatsPartiels() {
		return nombreMaxRachatsPartiels;
	}

	/**
	 * Sets the value of the nombreMaxRachatsPartiels property.
	 * 
	 * @param aNombreMaxRachatsPartiels
	 *            the new value of the nombreMaxRachatsPartiels property
	 */
	public void setNombreMaxRachatsPartiels(Integer aNombreMaxRachatsPartiels) {
		nombreMaxRachatsPartiels = aNombreMaxRachatsPartiels;
	}

	/**
	 * Access method for the avecAvance property.
	 * 
	 * @return the current value of the avecAvance property
	 */
	public Boolean getAvecAvance() {
		return avecAvance;
	}

	/**
	 * Sets the value of the avecAvance property.
	 * 
	 * @param aAvecAvance
	 *            the new value of the avecAvance property
	 */
	public void setAvecAvance(Boolean aAvecAvance) {
		avecAvance = aAvecAvance;
	}

	/**
	 * Access method for the pourcentageMinAvance property.
	 * 
	 * @return the current value of the pourcentageMinAvance property
	 */
	public Double getPourcentageMinAvance() {
		return pourcentageMinAvance;
	}

	/**
	 * Sets the value of the pourcentageMinAvance property.
	 * 
	 * @param aPourcentageMinAvance
	 *            the new value of the pourcentageMinAvance property
	 */
	public void setPourcentageMinAvance(Double aPourcentageMinAvance) {
		pourcentageMinAvance = aPourcentageMinAvance;
	}

	/**
	 * Access method for the pourcentageMaxAvance property.
	 * 
	 * @return the current value of the pourcentageMaxAvance property
	 */
	public Double getPourcentageMaxAvance() {
		return pourcentageMaxAvance;
	}

	/**
	 * Sets the value of the pourcentageMaxAvance property.
	 * 
	 * @param aPourcentageMaxAvance
	 *            the new value of the pourcentageMaxAvance property
	 */
	public void setPourcentageMaxAvance(Double aPourcentageMaxAvance) {
		pourcentageMaxAvance = aPourcentageMaxAvance;
	}

	/**
	 * Access method for the avecDuree property.
	 * 
	 * @return the current value of the avecDuree property
	 */
	public Boolean getAvecDuree() {
		return avecDuree;
	}

	/**
	 * Sets the value of the avecDuree property.
	 * 
	 * @param aAvecDuree
	 *            the new value of the avecDuree property
	 */
	public void setAvecDuree(Boolean aAvecDuree) {
		avecDuree = aAvecDuree;
	}

	/**
	 * Access method for the dureeMin property.
	 * 
	 * @return the current value of the dureeMin property
	 */
	public Integer getDureeMin() {
		return dureeMin;
	}

	/**
	 * Sets the value of the dureeMin property.
	 * 
	 * @param aDureeMin
	 *            the new value of the dureeMin property
	 */
	public void setDureeMin(Integer aDureeMin) {
		dureeMin = aDureeMin;
	}

	/**
	 * Access method for the modeCalculIGR property.
	 * 
	 * @return the current value of the modeCalculIGR property
	 */
	public String getModeCalculIGR() {
		return modeCalculIGR;
	}

	/**
	 * Sets the value of the modeCalculIGR property.
	 * 
	 * @param aModeCalculIGR
	 *            the new value of the modeCalculIGR property
	 */
	public void setModeCalculIGR(String aModeCalculIGR) {
		modeCalculIGR = aModeCalculIGR;
	}

	/**
	 * Access method for the avecSuspensionRepriseCotisations property.
	 * 
	 * @return the current value of the avecSuspensionRepriseCotisations property
	 */
	public Boolean getAvecSuspensionRepriseCotisations() {
		return avecSuspensionRepriseCotisations;
	}

	/**
	 * Sets the value of the avecSuspensionRepriseCotisations property.
	 * 
	 * @param aAvecSuspensionRepriseCotisations
	 *            the new value of the avecSuspensionRepriseCotisations property
	 */
	public void setAvecSuspensionRepriseCotisations(Boolean aAvecSuspensionRepriseCotisations) {
		avecSuspensionRepriseCotisations = aAvecSuspensionRepriseCotisations;
	}

	/**
	 * Access method for the refProduit property.
	 * 
	 * @return the current value of the refProduit property
	 */
	/*public Produit getRefProduit() {
		return refProduit;
	}*/

	/**
	 * Sets the value of the refProduit property.
	 * 
	 * @param aRefProduit
	 *            the new value of the refProduit property
	 */
	/*public void setRefProduit(Produit aRefProduit) {
		refProduit = aRefProduit;
	}*/

	/**
	 * @return Returns the refTypePeriodicitesCotisationPossibles.
	 */
	public Collection getRefTypePeriodicitesCotisationPossibles() {
		return refTypePeriodicitesCotisationPossibles;
	}

	/**
	 * @param refTypePeriodicitesCotisationPossibles
	 *            The refTypePeriodicitesCotisationPossibles to set.
	 */
	public void setRefTypePeriodicitesCotisationPossibles(Collection refTypePeriodicitesCotisationPossibles) {
		this.refTypePeriodicitesCotisationPossibles = refTypePeriodicitesCotisationPossibles;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Boolean getAvecSupports() {
		return avecSupports;
	}

	public void setAvecSupports(Boolean avecSupports) {
		this.avecSupports = avecSupports;
	}

	public Integer getNombreMaxSuspensionCotisationsParAnnee() {
		return nombreMaxSuspensionCotisationsParAnnee;
	}

	public void setNombreMaxSuspensionCotisationsParAnnee(
			Integer nombreMaxSuspensionCotisationsParAnnee) {
		this.nombreMaxSuspensionCotisationsParAnnee = nombreMaxSuspensionCotisationsParAnnee;
	}

	public Integer getDureeMaxSuspensionCotisationsParAnnee() {
		return dureeMaxSuspensionCotisationsParAnnee;
	}

	public void setDureeMaxSuspensionCotisationsParAnnee(
			Integer dureeMaxSuspensionCotisationsParAnnee) {
		this.dureeMaxSuspensionCotisationsParAnnee = dureeMaxSuspensionCotisationsParAnnee;
	}

	public String getAvecGarantiePlancher() {
		return avecGarantiePlancher;
	}

	public void setAvecGarantiePlancher(String avecGarantiePlancher) {
		this.avecGarantiePlancher = avecGarantiePlancher;
	}

	public Double getMontantEpargneResuduel() {
		return montantEpargneResuduel;
	}

	public void setMontantEpargneResuduel(Double montantEpargneResuduel) {
		this.montantEpargneResuduel = montantEpargneResuduel;
	}
	public Collection getRefCommissions() {
		return refCommissions;
	}

	public void setRefCommissions(Collection refCommissions) {
		this.refCommissions = refCommissions;
	}

	public Collection getRefTaxeAssurances() {
		return refTaxeAssurances;
	}

	public void setRefTaxeAssurances(Collection refTaxeAssurances) {
		this.refTaxeAssurances = refTaxeAssurances;
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
	
	//Distribution
	
	public Boolean getAvecDistribution() {
		return avecDistribution;
	}

	public void setAvecDistribution(Boolean avecDistribution) {
		this.avecDistribution = avecDistribution;
	}

	/**
	 * @return the pourcentageChuteBrutaleHebdo
	 */
	public Double getPourcentageChuteBrutaleHebdo() {
		return pourcentageChuteBrutaleHebdo;
	}

	/**
	 * @param pourcentageChuteBrutaleHebdo the pourcentageChuteBrutaleHebdo to set
	 */
	public void setPourcentageChuteBrutaleHebdo(Double pourcentageChuteBrutaleHebdo) {
		this.pourcentageChuteBrutaleHebdo = pourcentageChuteBrutaleHebdo;
	}

	/**
	 * @return the pourcentageChuteBrutalePeriodeGlissante
	 */
	public Double getPourcentageChuteBrutalePeriodeGlissante() {
		return pourcentageChuteBrutalePeriodeGlissante;
	}

	/**
	 * @param pourcentageChuteBrutalePeriodeGlissante the pourcentageChuteBrutalePeriodeGlissante to set
	 */
	public void setPourcentageChuteBrutalePeriodeGlissante(Double pourcentageChuteBrutalePeriodeGlissante) {
		this.pourcentageChuteBrutalePeriodeGlissante = pourcentageChuteBrutalePeriodeGlissante;
	}

	public Double getMontantMinRachat() {
		return montantMinRachat;
	}

	public void setMontantMinRachat(Double montantMinRachat) {
		this.montantMinRachat = montantMinRachat;
	}

	public Integer getNombreMaxArbitrages() {
		return nombreMaxArbitrages;
	}

	public void setNombreMaxArbitrages(Integer nombreMaxArbitrages) {
		this.nombreMaxArbitrages = nombreMaxArbitrages;
	}

	public Double getPourcentageMaxAvanceFondDh() {
		return pourcentageMaxAvanceFondDh;
	}

	public void setPourcentageMaxAvanceFondDh(Double pourcentageMaxAvanceFondDh) {
		this.pourcentageMaxAvanceFondDh = pourcentageMaxAvanceFondDh;
	}

	public Double getPourcentageAlertAvance() {
		return pourcentageAlertAvance;
	}

	public void setPourcentageAlertAvance(Double pourcentageAlertAvance) {
		this.pourcentageAlertAvance = pourcentageAlertAvance;
	}

	public Double getPourcentageTransfAvanceRachat() {
		return pourcentageTransfAvanceRachat;
	}

	public void setPourcentageTransfAvanceRachat(
			Double pourcentageTransfAvanceRachat) {
		this.pourcentageTransfAvanceRachat = pourcentageTransfAvanceRachat;
	}

	public Integer getPeriodeLimitationArbitrages() {
		return periodeLimitationArbitrages;
	}

	public void setPeriodeLimitationArbitrages(Integer periodeLimitationArbitrages) {
		this.periodeLimitationArbitrages = periodeLimitationArbitrages;
	}


	public Integer getNombreArbitragesGratuit() {
		return nombreArbitragesGratuit;
	}

	public void setNombreArbitragesGratuit(Integer nombreArbitragesGratuit) {
		this.nombreArbitragesGratuit = nombreArbitragesGratuit;
	}

	public Double getMontantMinFraisArbitrage() {
		return montantMinFraisArbitrage;
	}

	public void setMontantMinFraisArbitrage(Double montantMinFraisArbitrage) {
		this.montantMinFraisArbitrage = montantMinFraisArbitrage;
	}
	
	
	
}
