
package Quittance.EmissionQuittance.Classes.Produit.modele;

import java.util.Calendar;
import java.util.Collection;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.utile.referentiel.TypeRenouvellement;

public class ParametresDommages extends ParametrageBO implements IEntite {

	private static final long serialVersionUID = 1L;
	private long id;
	private String avecDelegation; //0 : Non, 1 : Oui
	private String avecHabitation; //0 : Non, 1 : Oui
	private String avecActivite;   //0 : Non, 1 : Oui
	private Integer jourDiffere;
	private Double surPrimeDiffere;
	private Calendar dateDebut;
	private Calendar dateFin;
   
	/*** 0 : imm�diat, 1 : prochaine �ch�ance */
	private String effetModification;
   
   /**
    * La garantie Dommages peut �tre avec coassurance. 0 : Non, 1 : Oui
    */
   private Boolean avecCoassurance;
   
   /**
    * 0: Non, 1 : Oui
    */
   private Boolean avecNombreEmployes;
   
   /**
    * 0: Non, 1 : Oui
    */
   private Boolean avecTypeClient;
   
   /**
    * 0: Non, 1 : Oui
    */
   private Boolean avecCapitalAssureMinEtMax;
   
   /** 0: Non, 1 : Oui    */
   private Boolean avecCapitalMobilierEtImmobilier;
   
   private Boolean avecCarte;
   
   private String libelle;
   
   private Collection refBaremes;  
   private TypeRenouvellement refTypeRenouvellement;
   private Collection refFractionnementsPrimePossibles; 
   
	private Collection refCommissions;
	private Collection refTaxeAssurances;
	private Double capitalMaxAssure;
	private Integer nombreEmployesMax;  
	private Collection refFormules;
	
	private Double smigAnnuel;
	
	public boolean equals(Object obj) {
		if(this.getId()==((ParametresDommages)obj).getId()){
			return true;
		}
		return false;
	}

   public ParametresDommages() {
    
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
    * Access method for the avecHabitation property.
    * 
    * @return   the current value of the avecHabitation property
    */
   public String getAvecHabitation() 
   {
      return avecHabitation;
   }
   
   /**
    * Sets the value of the avecHabitation property.
    * 
    * @param aAvecHabitation the new value of the avecHabitation property
    */
   public void setAvecHabitation(String aAvecHabitation) 
   {
      avecHabitation = aAvecHabitation;
   }
   
   /**
    * Access method for the avecActivite property.
    * 
    * @return   the current value of the avecActivite property
    */
   public String getAvecActivite() 
   {
      return avecActivite;
   }
   
   /**
    * Sets the value of the avecActivite property.
    * 
    * @param aAvecActivite the new value of the avecActivite property
    */
   public void setAvecActivite(String aAvecActivite) 
   {
      avecActivite = aAvecActivite;
   }
   
   public Integer getJourDiffere() {
	return jourDiffere;
}

public void setJourDiffere(Integer jourDiffere) {
	this.jourDiffere = jourDiffere;
}

public Double getSurPrimeDiffere() {
	return surPrimeDiffere;
}

public void setSurPrimeDiffere(Double surPrimeDifer) {
	this.surPrimeDiffere = surPrimeDifer;
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
    * Access method for the avecNombreEmployes property.
    * 
    * @return   the current value of the avecNombreEmployes property
    */
   public Boolean getAvecNombreEmployes() 
   {
      return avecNombreEmployes;
   }
   
   /**
    * Sets the value of the avecNombreEmployes property.
    * 
    * @param aAvecNombreEmployes the new value of the avecNombreEmployes property
    */
   public void setAvecNombreEmployes(Boolean aAvecNombreEmployes) 
   {
      avecNombreEmployes = aAvecNombreEmployes;
   }
   
   /**
    * Access method for the avecTypeClient property.
    * 
    * @return   the current value of the avecTypeClient property
    */
   public Boolean getAvecTypeClient() 
   {
      return avecTypeClient;
   }
   
   /**
    * Sets the value of the avecTypeClient property.
    * 
    * @param aAvecTypeClient the new value of the avecTypeClient property
    */
   public void setAvecTypeClient(Boolean aAvecTypeClient) 
   {
      avecTypeClient = aAvecTypeClient;
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
    * Access method for the avecCapitalMobilierEtImmobilier property.
    * 
    * @return   the current value of the avecCapitalMobilierEtImmobilier property
    */
   public Boolean getAvecCapitalMobilierEtImmobilier() 
   {
      return avecCapitalMobilierEtImmobilier;
   }
   
   /**
    * Sets the value of the avecCapitalMobilierEtImmobilier property.
    * 
    * @param aAvecCapitalMobilierEtImmobilier the new value of the avecCapitalMobilierEtImmobilier property
    */
   public void setAvecCapitalMobilierEtImmobilier(Boolean aAvecCapitalMobilierEtImmobilier) 
   {
      avecCapitalMobilierEtImmobilier = aAvecCapitalMobilierEtImmobilier;
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

	public Boolean getAvecCarte() {
		return avecCarte;
	}

	public void setAvecCarte(Boolean avecCarte) {
		this.avecCarte = avecCarte;
	}

//	public Integer getNbrMaxGarantiesDommages() {
//		return nbrMaxGarantiesDommages;
//	}
//
//	public void setNbrMaxGarantiesDommages(Integer nbrMaxGarantiesDommages) {
//		this.nbrMaxGarantiesDommages = nbrMaxGarantiesDommages;
//	}
//
//	public Integer getNbrMinGarantiesDommages() {
//		return nbrMinGarantiesDommages;
//	}
//
//	public void setNbrMinGarantiesDommages(Integer nbrMinGarantiesDommages) {
//		this.nbrMinGarantiesDommages = nbrMinGarantiesDommages;
//	}

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

	public Double getCapitalMaxAssure() {
		return capitalMaxAssure;
	}

	public void setCapitalMaxAssure(Double capitalMaxAssure) {
		this.capitalMaxAssure = capitalMaxAssure;
	}

	public Integer getNombreEmployesMax() {
		return nombreEmployesMax;
	}

	public void setNombreEmployesMax(Integer nombreEmployesMax) {
		this.nombreEmployesMax = nombreEmployesMax;
	}

	public Collection getRefFormules() {
		return refFormules;
	}

	public void setRefFormules(Collection refFormules) {
		this.refFormules = refFormules;
	}
	
	public Double getSmigAnnuel() {
		return smigAnnuel;
	}

	public void setSmigAnnuel(Double smigAnnuel) {
		this.smigAnnuel = smigAnnuel;
	}
	
	
}
