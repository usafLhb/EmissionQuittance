//Source file: E:\\_Abdel\\Rmawatanya\\CONVERGENCE\\MOD\\ClassesJava\\com\\rmawatanya\\convergence\\application\\oct\\metier\\modele\\PartieDommages.java

package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;
 
import com.rmawatanya.convergence.application.prd.metier.modele.Formule;
import com.rmawatanya.convergence.application.prd.metier.modele.Option;
import com.rmawatanya.convergence.application.prl.metier.modele.Prorata;
import com.rmawatanya.convergence.utile.referentiel.Activite;
import com.rmawatanya.convergence.utile.referentiel.ActiviteBmce;
import com.rmawatanya.convergence.utile.referentiel.QualiteOccupantHabitation;
import com.rmawatanya.convergence.utile.referentiel.SecteurActivite;
import com.rmawatanya.convergence.utile.referentiel.TypeFractionnementPrime;
import com.rmawatanya.convergence.utile.referentiel.Ville;

public class PartieDommages implements IEntite
{
   private long id;
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
	 * Date effet de la modification de la garantie Dommages 
	 * (si l'option a �t� chang�e).
	 */
	private Calendar dateEffetModification;
	private Calendar dateEcheanceModification;
   
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
   
//   private Double capitalRisqueLocatif;
   private Double capitalMateriel;
   private Double capitalMarchandises;
   private Double capitalMarchandisesEnFroid;
   private Double   capitalMaterielInformatique;
   	
   /**
    * 0 : R�sidance principale, 1 : R�sidance secondaire
    */
   private String usageHabitation;
   
   /**
    * 0 : Maison individuelle, 1 : Appartement, 2 : Villa
    */
   private String typeHabitation;
   // a supprimer
   //private Contrat refContrat;
   public Collection refDeclarationSinistre;
   private TypeFractionnementPrime refTypeFractionnementPrime;
   private QualiteOccupantHabitation refQualiteOccupantHabitation;
   private Ville refVilleSituationRisque;
   private SecteurActivite refSecteurActivite;
   private Activite refActivite;
   private ActiviteBmce refActiviteBmce;
   private Collection refCoassurances;
   private Option refOption;
   private Double primeTotaleEcheance;
   private String organismeDelegatoire;
   private Double montantDelegataire;
   private Collection refCartes = new ArrayList();
   
   private PartieDommages refPartieDommagesPrincipale;
   
   private Integer  assuranceVoyage;
   private Integer  nbPersonnes;
   private Formule refFormule;
   private List<Prorata> refProrata = new ArrayList<Prorata>();
   private List<GarantieDommage> refGarantiesChoisies = new ArrayList<GarantieDommage>();
   private List<AssureRCProf> refAssuresRCProf = new ArrayList<AssureRCProf>();
   
   
   private Double primeGarantieEVECATTTC;
   
   /**
	 * taux de la taxe parafiscale
	 */
	private Double tauxTaxeParafiscale;
	
	/**
	 * montant taxe parafiscale
	 */
	private Double montantTaxeParafiscale;
   
   public PartieDommages() 
   {
    
   }
   
   /**
    * Access method for the id property.
    * 
    * @return   the current value of the id property
    */
   public long getId() 
   {
      return id;
   }
   
   /**
    * Sets the value of the id property.
    * 
    * @param aId the new value of the id property
    */
   public void setId(long aId) 
   {
      id = aId;
   }
   
   /**
    * Access method for the delegation property.
    * 
    * @return   the current value of the delegation property
    */
   public Boolean getDelegation() 
   {
      return delegation;
   }
   
   /**
    * Sets the value of the delegation property.
    * 
    * @param aDelegation the new value of the delegation property
    */
   public void setDelegation(Boolean aDelegation) 
   {
      delegation = aDelegation;
   }
   
   /**
    * Access method for the situationRisque property.
    * 
    * @return   the current value of the situationRisque property
    */
   public String getSituationRisque() 
   {
      return situationRisque;
   }
   
   /**
    * Sets the value of the situationRisque property.
    * 
    * @param aSituationRisque the new value of the situationRisque property
    */
   public void setSituationRisque(String aSituationRisque) 
   {
      situationRisque = aSituationRisque;
   }
   
   /**
    * Access method for the codePostalSituationRisque property.
    * 
    * @return   the current value of the codePostalSituationRisque property
    */
   public Integer getCodePostalSituationRisque() 
   {
      return codePostalSituationRisque;
   }
   
   /**
    * Sets the value of the codePostalSituationRisque property.
    * 
    * @param aCodePostalSituationRisque the new value of the codePostalSituationRisque property
    */
   public void setCodePostalSituationRisque(Integer aCodePostalSituationRisque) 
   {
      codePostalSituationRisque = aCodePostalSituationRisque;
   }
   
   /**
    * Access method for the nombreEmployes property.
    * 
    * @return   the current value of the nombreEmployes property
    */
   public Integer getNombreEmployes() 
   {
      return nombreEmployes;
   }
   
   /**
    * Sets the value of the nombreEmployes property.
    * 
    * @param aNombreEmployes the new value of the nombreEmployes property
    */
   public void setNombreEmployes(Integer aNombreEmployes) 
   {
      nombreEmployes = aNombreEmployes;
   }
   
   /**
    * Access method for the typeClient property.
    * 
    * @return   the current value of the typeClient property
    */
   public String getTypeClient() 
   {
      return typeClient;
   }
   
   /**
    * Sets the value of the typeClient property.
    * 
    * @param aTypeClient the new value of the typeClient property
    */
   public void setTypeClient(String aTypeClient) 
   {
      typeClient = aTypeClient;
   }
   
   /**
    * Access method for the prime property.
    * 
    * @return   the current value of the prime property
    */
   public Double getPrime() 
   {
      return prime;
   }
   
   /**
    * Sets the value of the prime property.
    * 
    * @param aPrime the new value of the prime property
    */
   public void setPrime(Double aPrime) 
   {
      prime = aPrime;
   }
   
   /**
    * Access method for the surprime property.
    * 
    * @return   the current value of the surprime property
    */
   public Double getSurprime() 
   {
      return surprime;
   }
   
   /**
    * Sets the value of the surprime property.
    * 
    * @param aSurprime the new value of the surprime property
    */
   public void setSurprime(Double aSurprime) 
   {
      surprime = aSurprime;
   }
   
   /**
    * Access method for the primeTotale property.
    * 
    * @return   the current value of the primeTotale property
    */
   public Double getPrimeTotale() 
   {
      return primeTotale;
   }
   
   /**
    * Sets the value of the primeTotale property.
    * 
    * @param aPrimeTotale the new value of the primeTotale property
    */
   public void setPrimeTotale(Double aPrimeTotale) 
   {
      primeTotale = aPrimeTotale;
   }
   
   /**
    * Access method for the dateVersementPermierePrime property.
    * 
    * @return   the current value of the dateVersementPermierePrime property
    */
   public Calendar getDateVersementPermierePrime() 
   {
      return dateVersementPermierePrime;
   }
   
   /**
    * Sets the value of the dateVersementPermierePrime property.
    * 
    * @param aDateVersementPermierePrime the new value of the dateVersementPermierePrime property
    */
   public void setDateVersementPermierePrime(Calendar aDateVersementPermierePrime) 
   {
      dateVersementPermierePrime = aDateVersementPermierePrime;
   }
   
   /**
    * Access method for the dateEffet property.
    * 
    * @return   the current value of the dateEffet property
    */
   public Calendar getDateEffet() 
   {
      return dateEffet;
   }
   
   /**
    * Sets the value of the dateEffet property.
    * 
    * @param aDateEffet the new value of the dateEffet property
    */
   public void setDateEffet(Calendar aDateEffet) 
   {
      dateEffet = aDateEffet;
   }
   
   /**
    * Access method for the dateTerme property.
    * 
    * @return   the current value of the dateTerme property
    */
   public Calendar getDateTerme() 
   {
      return dateTerme;
   }
   
   /**
    * Sets the value of the dateTerme property.
    * 
    * @param aDateTerme the new value of the dateTerme property
    */
   public void setDateTerme(Calendar aDateTerme) 
   {
      dateTerme = aDateTerme;
   }
   
   /**
    * Access method for the activiteComplement property.
    * 
    * @return   the current value of the activiteComplement property
    */
   public String getActiviteComplement() 
   {
      return activiteComplement;
   }
   
   /**
    * Sets the value of the activiteComplement property.
    * 
    * @param aActiviteComplement the new value of the activiteComplement property
    */
   public void setActiviteComplement(String aActiviteComplement) 
   {
      activiteComplement = aActiviteComplement;
   }
   
   /**
    * Access method for the etat property.
    * 
    * @return   the current value of the etat property
    */
   public String getEtat() 
   {
      return etat;
   }
   
   /**
    * Sets the value of the etat property.
    * 
    * @param aEtat the new value of the etat property
    */
   public void setEtat(String aEtat) 
   {
      etat = aEtat;
   }
   
   /**
    * Access method for the capitalAssureMin property.
    * 
    * @return   the current value of the capitalAssureMin property
    */
   public Double getCapitalAssureMin() 
   {
      return capitalAssureMin;
   }
   
   /**
    * Sets the value of the capitalAssureMin property.
    * 
    * @param aCapitalAssureMin the new value of the capitalAssureMin property
    */
   public void setCapitalAssureMin(Double aCapitalAssureMin) 
   {
      capitalAssureMin = aCapitalAssureMin;
   }
   
   /**
    * Access method for the capitalAssureMax property.
    * 
    * @return   the current value of the capitalAssureMax property
    */
   public Double getCapitalAssureMax() 
   {
      return capitalAssureMax;
   }
   
   /**
    * Sets the value of the capitalAssureMax property.
    * 
    * @param aCapitalAssureMax the new value of the capitalAssureMax property
    */
   public void setCapitalAssureMax(Double aCapitalAssureMax) 
   {
      capitalAssureMax = aCapitalAssureMax;
   }
   
   /**
    * Access method for the capitalMobilier property.
    * 
    * @return   the current value of the capitalMobilier property
    */
   public Double getCapitalMobilier() 
   {
      return capitalMobilier;
   }
   
   /**
    * Sets the value of the capitalMobilier property.
    * 
    * @param aCapitalMobilier the new value of the capitalMobilier property
    */
   public void setCapitalMobilier(Double aCapitalMobilier) 
   {
      capitalMobilier = aCapitalMobilier;
   }
   
   /**
    * Access method for the capitalImmobilier property.
    * 
    * @return   the current value of the capitalImmobilier property
    */
   public Double getCapitalImmobilier() 
   {
      return capitalImmobilier;
   }
   
   /**
    * Sets the value of the capitalImmobilier property.
    * 
    * @param aCapitalImmobilier the new value of the capitalImmobilier property
    */
   public void setCapitalImmobilier(Double aCapitalImmobilier) 
   {
      capitalImmobilier = aCapitalImmobilier;
   }
   
   /**
    * Access method for the usageHabitation property.
    * 
    * @return   the current value of the usageHabitation property
    */
   public String getUsageHabitation() 
   {
      return usageHabitation;
   }
   
   /**
    * Sets the value of the usageHabitation property.
    * 
    * @param aUsageHabitation the new value of the usageHabitation property
    */
   public void setUsageHabitation(String aUsageHabitation) 
   {
      usageHabitation = aUsageHabitation;
   }
   
   /**
    * Access method for the typeHabitation property.
    * 
    * @return   the current value of the typeHabitation property
    */
   public String getTypeHabitation() 
   {
      return typeHabitation;
   }
   
   /**
    * Sets the value of the typeHabitation property.
    * 
    * @param aTypeHabitation the new value of the typeHabitation property
    */
   public void setTypeHabitation(String aTypeHabitation) 
   {
      typeHabitation = aTypeHabitation;
   }
   
   /**
    * Access method for the refContrat property.
    * 
    * @return   the current value of the refContrat property
    */
  /* public Contrat getRefContrat() 
   {
      return refContrat;
   }*/
   
   /**
    * Sets the value of the refContrat property.
    * 
    * @param aRefContrat the new value of the refContrat property
    */
  /* public void setRefContrat(Contrat aRefContrat) 
   {
      refContrat = aRefContrat;
   } */  
   
	/**
	 * @return Returns the refDeclarationSinistre.
	 */
	public Collection getRefDeclarationSinistre() {
		return refDeclarationSinistre;
	}
	
	/**
	 * @param refDeclarationSinistre The refDeclarationSinistre to set.
	 */
	public void setRefDeclarationSinistre(Collection refDeclarationSinistre) {
		this.refDeclarationSinistre = refDeclarationSinistre;
	}
	
   /**
    * Access method for the refTypeFractionnementPrime property.
    * 
    * @return   the current value of the refTypeFractionnementPrime property
    */
   public TypeFractionnementPrime getRefTypeFractionnementPrime() 
   {
      return refTypeFractionnementPrime;
   }
   
   /**
    * Sets the value of the refTypeFractionnementPrime property.
    * 
    * @param aRefTypeFractionnementPrime the new value of the refTypeFractionnementPrime property
    */
   public void setRefTypeFractionnementPrime(TypeFractionnementPrime aRefTypeFractionnementPrime) 
   {
      refTypeFractionnementPrime = aRefTypeFractionnementPrime;
   }
   
   /**
    * Access method for the refQualiteOccupantHabitation property.
    * 
    * @return   the current value of the refQualiteOccupantHabitation property
    */
   public QualiteOccupantHabitation getRefQualiteOccupantHabitation() 
   {
      return refQualiteOccupantHabitation;
   }
   
   /**
    * Sets the value of the refQualiteOccupantHabitation property.
    * 
    * @param aRefQualiteOccupantHabitation the new value of the refQualiteOccupantHabitation property
    */
   public void setRefQualiteOccupantHabitation(QualiteOccupantHabitation aRefQualiteOccupantHabitation) 
   {
      refQualiteOccupantHabitation = aRefQualiteOccupantHabitation;
   }
   
   /**
    * Access method for the refVilleSituationRisque property.
    * 
    * @return   the current value of the refVilleSituationRisque property
    */
   public Ville getRefVilleSituationRisque() 
   {
      return refVilleSituationRisque;
   }
   
   /**
    * Sets the value of the refVilleSituationRisque property.
    * 
    * @param aRefVilleSituationRisque the new value of the refVilleSituationRisque property
    */
   public void setRefVilleSituationRisque(Ville aRefVilleSituationRisque) 
   {
      refVilleSituationRisque = aRefVilleSituationRisque;
   }
   
   /**
    * Access method for the refActivite property.
    * 
    * @return   the current value of the refActivite property
    */
   public Activite getRefActivite() 
   {
      return refActivite;
   }
   
   /**
    * Sets the value of the refActivite property.
    * 
    * @param aRefActivite the new value of the refActivite property
    */
   public void setRefActivite(Activite aRefActivite) 
   {
      refActivite = aRefActivite;
   }

	/**
	 * @return Returns the refCoassurances.
	 */
	public Collection getRefCoassurances() {
		return refCoassurances;
	}
	
	/**
	 * @param refCoassurances The refCoassurances to set.
	 */
	public void setRefCoassurances(Collection refCoassurances) {
		this.refCoassurances = refCoassurances;
	}
	
   /**
    * Access method for the refOption property.
    * 
    * @return   the current value of the refOption property
    */
   public Option getRefOption() 
   {
      return refOption;
   }
   
   /**
    * Sets the value of the refOption property.
    * 
    * @param aRefOption the new value of the refOption property
    */
   public void setRefOption(Option aRefOption) 
   {
      refOption = aRefOption;
   }
   
	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
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

	public Calendar getDateEffetModification() {
		return dateEffetModification;
	}

	public void setDateEffetModification(Calendar dateEffetModification) {
		this.dateEffetModification = dateEffetModification;
	}

	public Collection getRefCartes() {
		return refCartes;
	}

	public void setRefCartes(Collection refCartes) {
		this.refCartes = refCartes;
	}

	public PartieDommages getRefPartieDommagesPrincipale() {
		return refPartieDommagesPrincipale;
	}

	public void setRefPartieDommagesPrincipale(PartieDommages refPartieDommagesPrincipale) {
		this.refPartieDommagesPrincipale = refPartieDommagesPrincipale;
	}

	public Calendar getDateEcheanceModification() {
		return dateEcheanceModification;
	}

	public void setDateEcheanceModification(Calendar dateEcheanceModification) {
		this.dateEcheanceModification = dateEcheanceModification;
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

	public Double getCapitalImmobilierPropose() {
		return capitalImmobilierPropose;
	}

	public void setCapitalImmobilierPropose(Double capitalImmobilierPropose) {
		this.capitalImmobilierPropose = capitalImmobilierPropose;
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

	public List<GarantieDommage> getRefGarantiesChoisies() {
		return refGarantiesChoisies;
	}

	public void setRefGarantiesChoisies(List<GarantieDommage> refGarantiesChoisies) {
		this.refGarantiesChoisies = refGarantiesChoisies;
	}

	public List<AssureRCProf> getRefAssuresRCProf() {
		return refAssuresRCProf;
	}

	public void setRefAssuresRCProf(List<AssureRCProf> refAssuresRCProf) {
		this.refAssuresRCProf = refAssuresRCProf;
	}

	public String getOrganismeDelegatoire() {
		return organismeDelegatoire;
	}

	public void setOrganismeDelegatoire(String organismeDelegatoire) {
		this.organismeDelegatoire = organismeDelegatoire;
	}

	public Double getMontantDelegataire() {
		return montantDelegataire;
	}

	public void setMontantDelegataire(Double montantDelegataire) {
		this.montantDelegataire = montantDelegataire;
	}

	public List<Prorata> getRefProrata() {
		return refProrata;
	}

	public void setRefProrata(List<Prorata> refProrata) {
		this.refProrata = refProrata;
	}

//	public Double getCapitalRisqueLocatif() {
//		return capitalRisqueLocatif;
//	}
//
//	public void setCapitalRisqueLocatif(Double capitalRisqueLocatif) {
//		this.capitalRisqueLocatif = capitalRisqueLocatif;
//	}

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
