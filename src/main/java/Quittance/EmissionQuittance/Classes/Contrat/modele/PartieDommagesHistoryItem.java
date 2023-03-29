package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Collection;
  
import ma.co.omnidata.framework.services.historique.HistoryItem;

import com.rmawatanya.convergence.application.prd.metier.modele.Formule;
import com.rmawatanya.convergence.application.prd.metier.modele.Option;
import com.rmawatanya.convergence.utile.referentiel.Activite;
import com.rmawatanya.convergence.utile.referentiel.ActiviteBmce;
import com.rmawatanya.convergence.utile.referentiel.QualiteOccupantHabitation;
import com.rmawatanya.convergence.utile.referentiel.SecteurActivite;
import com.rmawatanya.convergence.utile.referentiel.TypeFractionnementPrime;
import com.rmawatanya.convergence.utile.referentiel.Ville;

/**
 * @author Ayouch
 *
 */
public class PartieDommagesHistoryItem extends HistoryItem implements Serializable {

	private static final long serialVersionUID = 1L;
	private Boolean delegation;
	private String situationRisque;
	private Integer codePostalSituationRisque;
	private Integer nombreEmployes;

	/**
	 * RME, Standard, Personnel BMCE
	 */
	private String typeClient;
	private Double prime;
	private Double surprime;
	private Double primeTotale;
	private Calendar dateVersementPermierePrime;

	/**
	 * Date effet du contrat (ou de l'option) Dommages.
	 */
	private Calendar dateEffet;

	/**
	 * Date terme du contrat (ou de l'option) Dommages.
	 */
	private Calendar dateTerme;

	private Calendar dateEcheance;

	private String activiteComplement;
	private String etat;
	private Double capitalAssureMin;
	private Double capitalAssureMax;
	private Double capitalMobilier;
	private Double capitalImmobilier;
	private Double capitalImmobilierPropose;	   
	private Double superficieBatiment;
	
	private Double capitalMateriel;
	private Double capitalMarchandises;
    private Double capitalMarchandisesEnFroid;
    private Double capitalMaterielInformatique;
	/**
	 * 0 : R�sidance principale, 1 : R�sidance secondaire
	 */
	private String usageHabitation;

	/**
	 * 0 : Maison individuelle, 1 : Appartement, 2 : Villa
	 */
	private String typeHabitation;
	private ContratHistoryItem refContratHistoryItem;
	public Collection refDeclarationSinistre;
	private TypeFractionnementPrime refTypeFractionnementPrime;
	private QualiteOccupantHabitation refQualiteOccupantHabitation;
	private Ville refVilleSituationRisque;
	private SecteurActivite refSecteurActivite;
	private Activite refActivite;
	private ActiviteBmce refActiviteBmce;
	private Collection refCoassurancesHistoryItem;
	private Option refOption;
	private Double primeTotaleEcheance;

	private Collection refCartesHistoryItem;

	private int numHistorique;
	
	
	private Integer  assuranceVoyage;
	private Integer  nbPersonnes;
	   private Formule refFormule;
 /**
	 * taux de la taxe parafiscale
	 */
	private Double tauxTaxeParafiscale;
	
	/**
	 * montant taxe parafiscale
	 */
	private Double montantTaxeParafiscale;
	   private Double primeGarantieEVECATTTC;   
	   private Collection refGarantiesChoisiesHistoryItem;
	   private Collection refAssuresRCProfHistoryItem;
	
	public PartieDommagesHistoryItem() {

	}

	/**
	 * Access method for the delegation property.
	 * 
	 * @return the current value of the delegation property
	 */
	public Boolean getDelegation() {
		return delegation;
	}

	/**
	 * Sets the value of the delegation property.
	 * 
	 * @param aDelegation
	 *            the new value of the delegation property
	 */
	public void setDelegation(Boolean aDelegation) {
		delegation = aDelegation;
	}

	/**
	 * Access method for the situationRisque property.
	 * 
	 * @return the current value of the situationRisque property
	 */
	public String getSituationRisque() {
		return situationRisque;
	}

	/**
	 * Sets the value of the situationRisque property.
	 * 
	 * @param aSituationRisque
	 *            the new value of the situationRisque property
	 */
	public void setSituationRisque(String aSituationRisque) {
		situationRisque = aSituationRisque;
	}

	/**
	 * Access method for the codePostalSituationRisque property.
	 * 
	 * @return the current value of the codePostalSituationRisque property
	 */
	public Integer getCodePostalSituationRisque() {
		return codePostalSituationRisque;
	}

	/**
	 * Sets the value of the codePostalSituationRisque property.
	 * 
	 * @param aCodePostalSituationRisque
	 *            the new value of the codePostalSituationRisque property
	 */
	public void setCodePostalSituationRisque(Integer aCodePostalSituationRisque) {
		codePostalSituationRisque = aCodePostalSituationRisque;
	}

	/**
	 * Access method for the nombreEmployes property.
	 * 
	 * @return the current value of the nombreEmployes property
	 */
	public Integer getNombreEmployes() {
		return nombreEmployes;
	}

	/**
	 * Sets the value of the nombreEmployes property.
	 * 
	 * @param aNombreEmployes
	 *            the new value of the nombreEmployes property
	 */
	public void setNombreEmployes(Integer aNombreEmployes) {
		nombreEmployes = aNombreEmployes;
	}

	/**
	 * Access method for the typeClient property.
	 * 
	 * @return the current value of the typeClient property
	 */
	public String getTypeClient() {
		return typeClient;
	}

	/**
	 * Sets the value of the typeClient property.
	 * 
	 * @param aTypeClient
	 *            the new value of the typeClient property
	 */
	public void setTypeClient(String aTypeClient) {
		typeClient = aTypeClient;
	}

	/**
	 * Access method for the prime property.
	 * 
	 * @return the current value of the prime property
	 */
	public Double getPrime() {
		return prime;
	}

	/**
	 * Sets the value of the prime property.
	 * 
	 * @param aPrime
	 *            the new value of the prime property
	 */
	public void setPrime(Double aPrime) {
		prime = aPrime;
	}

	/**
	 * Access method for the surprime property.
	 * 
	 * @return the current value of the surprime property
	 */
	public Double getSurprime() {
		return surprime;
	}

	/**
	 * Sets the value of the surprime property.
	 * 
	 * @param aSurprime
	 *            the new value of the surprime property
	 */
	public void setSurprime(Double aSurprime) {
		surprime = aSurprime;
	}

	/**
	 * Access method for the primeTotale property.
	 * 
	 * @return the current value of the primeTotale property
	 */
	public Double getPrimeTotale() {
		return primeTotale;
	}

	/**
	 * Sets the value of the primeTotale property.
	 * 
	 * @param aPrimeTotale
	 *            the new value of the primeTotale property
	 */
	public void setPrimeTotale(Double aPrimeTotale) {
		primeTotale = aPrimeTotale;
	}

	/**
	 * Access method for the dateVersementPermierePrime property.
	 * 
	 * @return the current value of the dateVersementPermierePrime property
	 */
	public Calendar getDateVersementPermierePrime() {
		return dateVersementPermierePrime;
	}

	/**
	 * Sets the value of the dateVersementPermierePrime property.
	 * 
	 * @param aDateVersementPermierePrime
	 *            the new value of the dateVersementPermierePrime property
	 */
	public void setDateVersementPermierePrime(Calendar aDateVersementPermierePrime) {
		dateVersementPermierePrime = aDateVersementPermierePrime;
	}

	/**
	 * Access method for the dateEffet property.
	 * 
	 * @return the current value of the dateEffet property
	 */
	public Calendar getDateEffet() {
		return dateEffet;
	}

	/**
	 * Sets the value of the dateEffet property.
	 * 
	 * @param aDateEffet
	 *            the new value of the dateEffet property
	 */
	public void setDateEffet(Calendar aDateEffet) {
		dateEffet = aDateEffet;
	}

	/**
	 * Access method for the dateTerme property.
	 * 
	 * @return the current value of the dateTerme property
	 */
	public Calendar getDateTerme() {
		return dateTerme;
	}

	/**
	 * Sets the value of the dateTerme property.
	 * 
	 * @param aDateTerme
	 *            the new value of the dateTerme property
	 */
	public void setDateTerme(Calendar aDateTerme) {
		dateTerme = aDateTerme;
	}

	/**
	 * Access method for the activiteComplement property.
	 * 
	 * @return the current value of the activiteComplement property
	 */
	public String getActiviteComplement() {
		return activiteComplement;
	}

	/**
	 * Sets the value of the activiteComplement property.
	 * 
	 * @param aActiviteComplement
	 *            the new value of the activiteComplement property
	 */
	public void setActiviteComplement(String aActiviteComplement) {
		activiteComplement = aActiviteComplement;
	}

	/**
	 * Access method for the etat property.
	 * 
	 * @return the current value of the etat property
	 */
	public String getEtat() {
		return etat;
	}

	/**
	 * Sets the value of the etat property.
	 * 
	 * @param aEtat
	 *            the new value of the etat property
	 */
	public void setEtat(String aEtat) {
		etat = aEtat;
	}

	/**
	 * Access method for the capitalAssureMin property.
	 * 
	 * @return the current value of the capitalAssureMin property
	 */
	public Double getCapitalAssureMin() {
		return capitalAssureMin;
	}

	/**
	 * Sets the value of the capitalAssureMin property.
	 * 
	 * @param aCapitalAssureMin
	 *            the new value of the capitalAssureMin property
	 */
	public void setCapitalAssureMin(Double aCapitalAssureMin) {
		capitalAssureMin = aCapitalAssureMin;
	}

	/**
	 * Access method for the capitalAssureMax property.
	 * 
	 * @return the current value of the capitalAssureMax property
	 */
	public Double getCapitalAssureMax() {
		return capitalAssureMax;
	}

	/**
	 * Sets the value of the capitalAssureMax property.
	 * 
	 * @param aCapitalAssureMax
	 *            the new value of the capitalAssureMax property
	 */
	public void setCapitalAssureMax(Double aCapitalAssureMax) {
		capitalAssureMax = aCapitalAssureMax;
	}

	/**
	 * Access method for the capitalMobilier property.
	 * 
	 * @return the current value of the capitalMobilier property
	 */
	public Double getCapitalMobilier() {
		return capitalMobilier;
	}

	/**
	 * Sets the value of the capitalMobilier property.
	 * 
	 * @param aCapitalMobilier
	 *            the new value of the capitalMobilier property
	 */
	public void setCapitalMobilier(Double aCapitalMobilier) {
		capitalMobilier = aCapitalMobilier;
	}

	/**
	 * Access method for the capitalImmobilier property.
	 * 
	 * @return the current value of the capitalImmobilier property
	 */
	public Double getCapitalImmobilier() {
		return capitalImmobilier;
	}

	/**
	 * Sets the value of the capitalImmobilier property.
	 * 
	 * @param aCapitalImmobilier
	 *            the new value of the capitalImmobilier property
	 */
	public void setCapitalImmobilier(Double aCapitalImmobilier) {
		capitalImmobilier = aCapitalImmobilier;
	}

	/**
	 * Access method for the usageHabitation property.
	 * 
	 * @return the current value of the usageHabitation property
	 */
	public String getUsageHabitation() {
		return usageHabitation;
	}

	/**
	 * Sets the value of the usageHabitation property.
	 * 
	 * @param aUsageHabitation
	 *            the new value of the usageHabitation property
	 */
	public void setUsageHabitation(String aUsageHabitation) {
		usageHabitation = aUsageHabitation;
	}

	/**
	 * Access method for the typeHabitation property.
	 * 
	 * @return the current value of the typeHabitation property
	 */
	public String getTypeHabitation() {
		return typeHabitation;
	}

	/**
	 * Sets the value of the typeHabitation property.
	 * 
	 * @param aTypeHabitation
	 *            the new value of the typeHabitation property
	 */
	public void setTypeHabitation(String aTypeHabitation) {
		typeHabitation = aTypeHabitation;
	}

	/**
	 * @return Returns the refDeclarationSinistre.
	 */
	public Collection getRefDeclarationSinistre() {
		return refDeclarationSinistre;
	}

	/**
	 * @param refDeclarationSinistre
	 *            The refDeclarationSinistre to set.
	 */
	public void setRefDeclarationSinistre(Collection refDeclarationSinistre) {
		this.refDeclarationSinistre = refDeclarationSinistre;
	}

	/**
	 * Access method for the refTypeFractionnementPrime property.
	 * 
	 * @return the current value of the refTypeFractionnementPrime property
	 */
	public TypeFractionnementPrime getRefTypeFractionnementPrime() {
		return refTypeFractionnementPrime;
	}

	/**
	 * Sets the value of the refTypeFractionnementPrime property.
	 * 
	 * @param aRefTypeFractionnementPrime
	 *            the new value of the refTypeFractionnementPrime property
	 */
	public void setRefTypeFractionnementPrime(TypeFractionnementPrime aRefTypeFractionnementPrime) {
		refTypeFractionnementPrime = aRefTypeFractionnementPrime;
	}

	/**
	 * Access method for the refQualiteOccupantHabitation property.
	 * 
	 * @return the current value of the refQualiteOccupantHabitation property
	 */
	public QualiteOccupantHabitation getRefQualiteOccupantHabitation() {
		return refQualiteOccupantHabitation;
	}

	/**
	 * Sets the value of the refQualiteOccupantHabitation property.
	 * 
	 * @param aRefQualiteOccupantHabitation
	 *            the new value of the refQualiteOccupantHabitation property
	 */
	public void setRefQualiteOccupantHabitation(QualiteOccupantHabitation aRefQualiteOccupantHabitation) {
		refQualiteOccupantHabitation = aRefQualiteOccupantHabitation;
	}

	/**
	 * Access method for the refVilleSituationRisque property.
	 * 
	 * @return the current value of the refVilleSituationRisque property
	 */
	public Ville getRefVilleSituationRisque() {
		return refVilleSituationRisque;
	}

	/**
	 * Sets the value of the refVilleSituationRisque property.
	 * 
	 * @param aRefVilleSituationRisque
	 *            the new value of the refVilleSituationRisque property
	 */
	public void setRefVilleSituationRisque(Ville aRefVilleSituationRisque) {
		refVilleSituationRisque = aRefVilleSituationRisque;
	}

	/**
	 * Access method for the refActivite property.
	 * 
	 * @return the current value of the refActivite property
	 */
	public Activite getRefActivite() {
		return refActivite;
	}

	/**
	 * Sets the value of the refActivite property.
	 * 
	 * @param aRefActivite
	 *            the new value of the refActivite property
	 */
	public void setRefActivite(Activite aRefActivite) {
		refActivite = aRefActivite;
	}

	/**
	 * Access method for the refOption property.
	 * 
	 * @return the current value of the refOption property
	 */
	public Option getRefOption() {
		return refOption;
	}

	/**
	 * Sets the value of the refOption property.
	 * 
	 * @param aRefOption
	 *            the new value of the refOption property
	 */
	public void setRefOption(Option aRefOption) {
		refOption = aRefOption;
	}

	public Calendar getDateEcheance() {
		return dateEcheance;
	}

	public void setDateEcheance(Calendar dateEcheance) {
		this.dateEcheance = dateEcheance;
	}

	public SecteurActivite getRefSecteurActivite() {
		return refSecteurActivite;
	}

	public void setRefSecteurActivite(SecteurActivite refSecteurActivite) {
		this.refSecteurActivite = refSecteurActivite;
	}

	public Double getPrimeTotaleEcheance() {
		return primeTotaleEcheance;
	}

	public void setPrimeTotaleEcheance(Double primeTotaleEcheance) {
		this.primeTotaleEcheance = primeTotaleEcheance;
	}

	public Collection getRefCoassurancesHistoryItem() {
		return refCoassurancesHistoryItem;
	}

	public void setRefCoassurancesHistoryItem(Collection refCoassurancesHistoryItem) {
		this.refCoassurancesHistoryItem = refCoassurancesHistoryItem;
	}

	public ContratHistoryItem getRefContratHistoryItem() {
		return refContratHistoryItem;
	}

	public void setRefContratHistoryItem(ContratHistoryItem refContratHistoryItem) {
		this.refContratHistoryItem = refContratHistoryItem;
	}

	public Collection getRefCartesHistoryItem() {
		return refCartesHistoryItem;
	}

	public void setRefCartesHistoryItem(Collection refCartesHistoryItem) {
		this.refCartesHistoryItem = refCartesHistoryItem;
	}

	public int getNumHistorique() {
		return numHistorique;
	}

	public void setNumHistorique(int numHistorique) {
		this.numHistorique = numHistorique;
	}

	public Integer getAssuranceVoyage() {
		return assuranceVoyage;
	}

	public void setAssuranceVoyage(Integer assuranceVoyage) {
		this.assuranceVoyage = assuranceVoyage;
	}

	public Integer getNbPersonnes() {
		return nbPersonnes;
	}

	public void setNbPersonnes(Integer nbPersonnes) {
		this.nbPersonnes = nbPersonnes;
	}

	public Double getSuperficieBatiment() {
		return superficieBatiment;
	}

	public void setSuperficieBatiment(Double superficieBatiment) {
		this.superficieBatiment = superficieBatiment;
	}

	public Formule getRefFormule() {
		return refFormule;
	}

	public void setRefFormule(Formule refFormule) {
		this.refFormule = refFormule;
	}

	public Collection getRefGarantiesChoisiesHistoryItem() {
		return refGarantiesChoisiesHistoryItem;
	}

	public void setRefGarantiesChoisiesHistoryItem(
			Collection refGarantiesChoisiesHistoryItem) {
		this.refGarantiesChoisiesHistoryItem = refGarantiesChoisiesHistoryItem;
	}

	public Collection getRefAssuresRCProfHistoryItem() {
		return refAssuresRCProfHistoryItem;
	}

	public void setRefAssuresRCProfHistoryItem(
			Collection refAssuresRCProfHistoryItem) {
		this.refAssuresRCProfHistoryItem = refAssuresRCProfHistoryItem;
	}

	public Double getCapitalImmobilierPropose() {
		return capitalImmobilierPropose;
	}

	public void setCapitalImmobilierPropose(Double capitalImmobilierPropose) {
		this.capitalImmobilierPropose = capitalImmobilierPropose;
	}

	public Double getCapitalMateriel() {
		return capitalMateriel;
	}

	public void setCapitalMateriel(Double capitalMateriel) {
		this.capitalMateriel = capitalMateriel;
	}

	public Double getCapitalMarchandises() {
		return capitalMarchandises;
	}

	public void setCapitalMarchandises(Double capitalMarchandises) {
		this.capitalMarchandises = capitalMarchandises;
	}

	public Double getCapitalMarchandisesEnFroid() {
		return capitalMarchandisesEnFroid;
	}

	public void setCapitalMarchandisesEnFroid(Double capitalMarchandisesEnFroid) {
		this.capitalMarchandisesEnFroid = capitalMarchandisesEnFroid;
	}

	public Double getCapitalMaterielInformatique() {
		return capitalMaterielInformatique;
	}

	public void setCapitalMaterielInformatique(Double capitalMaterielInformatique) {
		this.capitalMaterielInformatique = capitalMaterielInformatique;
	}

	public ActiviteBmce getRefActiviteBmce() {
		return refActiviteBmce;
	}

	public void setRefActiviteBmce(ActiviteBmce refActiviteBmce) {
		this.refActiviteBmce = refActiviteBmce;
	}

	/**
	 * @return the tauxTaxeParafiscale
	 */
	public Double getTauxTaxeParafiscale() {
		return tauxTaxeParafiscale;
	}

	/**
	 * @param tauxTaxeParafiscale the tauxTaxeParafiscale to set
	 */
	public void setTauxTaxeParafiscale(Double tauxTaxeParafiscale) {
		this.tauxTaxeParafiscale = tauxTaxeParafiscale;
	}

	/**
	 * @return the montantTaxeParafiscale
	 */
	public Double getMontantTaxeParafiscale() {
		return montantTaxeParafiscale;
	}

	/**
	 * @param montantTaxeParafiscale the montantTaxeParafiscale to set
	 */
	public void setMontantTaxeParafiscale(Double montantTaxeParafiscale) {
		this.montantTaxeParafiscale = montantTaxeParafiscale;
	}

	public Double getPrimeGarantieEVECATTTC() {
		return primeGarantieEVECATTTC;
	}

	public void setPrimeGarantieEVECATTTC(Double primeGarantieEVECATTTC) {
		this.primeGarantieEVECATTTC = primeGarantieEVECATTTC;
	}

}
