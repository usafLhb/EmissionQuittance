
package Quittance.EmissionQuittance.Classes.Produit.modele;

import java.util.Calendar;
import java.util.Collection;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.utile.referentiel.TypeRenouvellement;

public class ParametresPrevoyance extends ParametrageBO implements IEntite {
	
	private static final long serialVersionUID = 1L;
	private long id;
   private String avecDelegation;
   private Boolean avecCapitalAssureMinEtMax;
   private Boolean avecCapitalDegressif;
   private Double capitalDegressifMin;
   private Double capitalDegressifMax;
   private Integer dureePretMin;
   private Integer dureePretMax;
   private Calendar dateDebut;
   private Calendar dateFin;
   private Boolean avecSuspensionReprise;
   private Collection refTypePeriodicitesCotisationPossibles;	

   /**
    * Continuite: Le champs duree de service est demande. 0 : Non, 1 : Oui
    */   
   private String avecDureeService;
   
   /**
    * 0 : immediat, 1 : prochaine echeance
    */
   private String effetModification;
   
   /**
    * La garantie Prevoyance peut etre avec coassurance. 0 : Non, 1 : Oui
    */
   private Boolean avecCoassurance;
   
   /**
    * 0: sans revenu annuel, 1: le revenu annuel de l'assure est demande, 2: les 
    * revenus annuels de l'assure et du conjoint sont demandes.
    */
   private String avecRevenuAnnuel;
   
   private Boolean avecSoldeMoyen;
   
   private String libelle;
   
   private Collection refFractionnementsPrimePossibles;
   private TypeRenouvellement refTypeRenouvellement;

   private Collection refBaremes;
   private Collection refCommissions;
   private Collection refTaxeAssurances;
      
   public boolean equals(Object obj) {
		if(this.getId()==((ParametresPrevoyance)obj).getId()){
			return true;
		}
		return false;
   }

   public ParametresPrevoyance(){
    
   }
   
   public String getDescription(){
	   return id+" "+libelle;
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
    * Access method for the avecDelegation property.
    * 
    * @return   the current value of the avecDelegation property
    */
   public String getAvecDelegation() 
   {
      return avecDelegation;
   }
   
   /**
    * Sets the value of the avecDelegation property.
    * 
    * @param aAvecDelegation the new value of the avecDelegation property
    */
   public void setAvecDelegation(String aAvecDelegation) 
   {
      avecDelegation = aAvecDelegation;
   }
   
   /**
    * Access method for the avecCapitalAssureMinEtMax property.
    * 
    * @return   the current value of the avecCapitalAssureMinEtMax property
    */
   public Boolean getAvecCapitalAssureMinEtMax() 
   {
      return avecCapitalAssureMinEtMax;
   }
   
   /**
    * Sets the value of the avecCapitalAssureMinEtMax property.
    * 
    * @param aAvecCapitalAssureMinEtMax the new value of the avecCapitalAssureMinEtMax property
    */
   public void setAvecCapitalAssureMinEtMax(Boolean aAvecCapitalAssureMinEtMax) 
   {
      avecCapitalAssureMinEtMax = aAvecCapitalAssureMinEtMax;
   }
   
   /**
    * Access method for the avecCapitalDegressif property.
    * 
    * @return   the current value of the avecCapitalDegressif property
    */
   public Boolean getAvecCapitalDegressif() 
   {
      return avecCapitalDegressif;
   }
   
   /**
    * Sets the value of the avecCapitalDegressif property.
    * 
    * @param aAvecCapitalDegressif the new value of the avecCapitalDegressif property
    */
   public void setAvecCapitalDegressif(Boolean aAvecCapitalDegressif) 
   {
      avecCapitalDegressif = aAvecCapitalDegressif;
   }
   
   /**
    * Access method for the capitalDegressifMin property.
    * 
    * @return   the current value of the capitalDegressifMin property
    */
   public Double getCapitalDegressifMin() 
   {
      return capitalDegressifMin;
   }
   
   /**
    * Sets the value of the capitalDegressifMin property.
    * 
    * @param aCapitalDegressifMin the new value of the capitalDegressifMin property
    */
   public void setCapitalDegressifMin(Double aCapitalDegressifMin) 
   {
      capitalDegressifMin = aCapitalDegressifMin;
   }
   
   /**
    * Access method for the capitalDegressifMax property.
    * 
    * @return   the current value of the capitalDegressifMax property
    */
   public Double getCapitalDegressifMax() 
   {
      return capitalDegressifMax;
   }
   
   /**
    * Sets the value of the capitalDegressifMax property.
    * 
    * @param aCapitalDegressifMax the new value of the capitalDegressifMax property
    */
   public void setCapitalDegressifMax(Double aCapitalDegressifMax) 
   {
      capitalDegressifMax = aCapitalDegressifMax;
   }
   
   /**
    * Access method for the dureePretMin property.
    * 
    * @return   the current value of the dureePretMin property
    */
   public Integer getDureePretMin() 
   {
      return dureePretMin;
   }
   
   /**
    * Sets the value of the dureePretMin property.
    * 
    * @param aDureePretMin the new value of the dureePretMin property
    */
   public void setDureePretMin(Integer aDureePretMin) 
   {
      dureePretMin = aDureePretMin;
   }
   
   /**
    * Access method for the dureePretMax property.
    * 
    * @return   the current value of the dureePretMax property
    */
   public Integer getDureePretMax() 
   {
      return dureePretMax;
   }
   
   /**
    * Sets the value of the dureePretMax property.
    * 
    * @param aDureePretMax the new value of the dureePretMax property
    */
   public void setDureePretMax(Integer aDureePretMax) 
   {
      dureePretMax = aDureePretMax;
   }
   
   /**
    * Access method for the avecDureeService property.
    * 
    * @return   the current value of the avecDureeService property
    */
   public String getAvecDureeService() 
   {
      return avecDureeService;
   }
   
   /**
    * Sets the value of the avecDureeService property.
    * 
    * @param aAvecDureeService the new value of the avecDureeService property
    */
   public void setAvecDureeService(String aAvecDureeService) 
   {
      avecDureeService = aAvecDureeService;
   }
   
   /**
    * Access method for the effetModification property.
    * 
    * @return   the current value of the effetModification property
    */
   public String getEffetModification() 
   {
      return effetModification;
   }
   
   /**
    * Sets the value of the effetModification property.
    * 
    * @param aEffetModification the new value of the effetModification property
    */
   public void setEffetModification(String aEffetModification) 
   {
      effetModification = aEffetModification;
   }
   
   /**
    * Access method for the avecCoassurance property.
    * 
    * @return   the current value of the avecCoassurance property
    */
   public Boolean getAvecCoassurance() 
   {
      return avecCoassurance;
   }
   
   /**
    * Sets the value of the avecCoassurance property.
    * 
    * @param aAvecCoassurance the new value of the avecCoassurance property
    */
   public void setAvecCoassurance(Boolean aAvecCoassurance) 
   {
      avecCoassurance = aAvecCoassurance;
   }
   
   /**
    * Access method for the avecRevenuAnnuel property.
    * 
    * @return   the current value of the avecRevenuAnnuel property
    */
   public String getAvecRevenuAnnuel() 
   {
      return avecRevenuAnnuel;
   }
   
   /**
    * Sets the value of the avecRevenuAnnuel property.
    * 
    * @param aAvecRevenuAnnuel the new value of the avecRevenuAnnuel property
    */
   public void setAvecRevenuAnnuel(String aAvecRevenuAnnuel) 
   {
      avecRevenuAnnuel = aAvecRevenuAnnuel;
   }   
   
	public Boolean getAvecSoldeMoyen() {
		return avecSoldeMoyen;
	}
	
	public void setAvecSoldeMoyen(Boolean avecSoldeMoyen) {
		this.avecSoldeMoyen = avecSoldeMoyen;
	}
	
	/**
	 * @return Returns the refFractionnementsPrimePossibles.
	 */
	public Collection getRefFractionnementsPrimePossibles() {
		return refFractionnementsPrimePossibles;
	}
	
	/**
	 * @param refFractionnementsPrimePossibles The refFractionnementsPrimePossibles to set.
	 */
	public void setRefFractionnementsPrimePossibles(
			Collection refFractionnementsPrimePossibles) {
		this.refFractionnementsPrimePossibles = refFractionnementsPrimePossibles;
	}
  
	/**
	 * @return Returns the refBaremes.
	 */
	public Collection getRefBaremes() {
		return refBaremes;
	}
	
	/**
	 * @param refBaremes The refBaremes to set.
	 */
	public void setRefBaremes(Collection refBaremes) {
		this.refBaremes = refBaremes;
	}

   /**
    * Access method for the refTypeRenouvellement property.
    * 
    * @return   the current value of the refTypeRenouvellement property
    */
   public TypeRenouvellement getRefTypeRenouvellement() 
   {
      return refTypeRenouvellement;
   }
   
   /**
    * Sets the value of the refTypeRenouvellement property.
    * 
    * @param aRefTypeRenouvellement the new value of the refTypeRenouvellement property
    */
   public void setRefTypeRenouvellement(TypeRenouvellement aRefTypeRenouvellement) 
   {
      refTypeRenouvellement = aRefTypeRenouvellement;
   }

	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}	
	
	/*public Produit getRefProduit() {
		return refProduit;
	}
	
	public void setRefProduit(Produit refProduit) {
		this.refProduit = refProduit;
	}*/

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
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

	public Boolean getAvecSuspensionReprise() {
		return avecSuspensionReprise;
	}

	public void setAvecSuspensionReprise(Boolean avecSuspensionReprise) {
		this.avecSuspensionReprise = avecSuspensionReprise;
	}

	public Collection getRefTypePeriodicitesCotisationPossibles() {
		return refTypePeriodicitesCotisationPossibles;
	}

	public void setRefTypePeriodicitesCotisationPossibles(
			Collection refTypePeriodicitesCotisationPossibles) {
		this.refTypePeriodicitesCotisationPossibles = refTypePeriodicitesCotisationPossibles;
	}
	
}
