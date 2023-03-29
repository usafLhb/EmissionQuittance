package Quittance.EmissionQuittance.Classes.Prelevements.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;
import ma.co.omnidata.framework.utile.DateUtile;

import com.rmawatanya.convergence.application.oct.metier.modele.PartieDommages;
import com.rmawatanya.convergence.application.oct.metier.modele.PartiePrevoyance;


public class Prorata implements IEntite
{
   private long id;
   private Calendar dateCreation;
   private Double prorata;
   private Double montantNetRMAWATANYA;
   private Calendar dateEcheance;
   private String etat;
   private Double montantAccessoires;
   private Double montantCommissionApport;
   private Double montantCommissionGestion;
   private Double montantCommissionProductivite;
   private Double montantCommissionCatNat;
   private Double montantTaxeParafiscale;
   private Double tauxTVA;
   private PartieDommages refPartieDommages;
   private PartiePrevoyance refPartiePrevoyance;
   
   private Double tauxTaxeAssurance;
   private Double tauxCommissionApport;
   private Double tauxCommissionGestion;
   private Double tauxCommissionProductivite;
   
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
    * Access method for the dateCreation property.
    * 
    * @return   the current value of the dateCreation property
    */
   public Calendar getDateCreation() 
   {
      return dateCreation;
   }
   
   /**
    * Sets the value of the dateCreation property.
    * 
    * @param aDateCreation the new value of the dateCreation property
    */
   public void setDateCreation(Calendar aDateCreation) 
   {
      dateCreation = aDateCreation;
   }
   
 
   
   /**
    * Access method for the montantNetRMAWATANYA property.
    * 
    * @return   the current value of the montantNetRMAWATANYA property
    */
   public Double getMontantNetRMAWATANYA() 
   {
      return montantNetRMAWATANYA;
   }
   
   /**
    * Sets the value of the montantNetRMAWATANYA property.
    * 
    * @param aMontantNetRMAWATANYA the new value of the montantNetRMAWATANYA property
    */
   public void setMontantNetRMAWATANYA(Double aMontantNetRMAWATANYA) 
   {
      montantNetRMAWATANYA = aMontantNetRMAWATANYA;
   }
   
   /**
    * Access method for the dateEcheance property.
    * 
    * @return   the current value of the dateEcheance property
    */
   public Calendar getDateEcheance() 
   {
      return dateEcheance;
   }
   
   
	public String getLibelleDateEcheance() {
		if(this.dateEcheance == null) { 
			return null;
		}
		else {
			try {
			return DateUtile.calendarToString(dateEcheance);
			}catch(Exception e) {
				return null;
			}
		}
	}
   
   /**
    * Sets the value of the dateEcheance property.
    * 
    * @param aDateEcheance the new value of the dateEcheance property
    */
   public void setDateEcheance(Calendar aDateEcheance) 
   {
      dateEcheance = aDateEcheance;
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
    * Access method for the montantAccessoires property.
    * 
    * @return   the current value of the montantAccessoires property
    */
   public Double getMontantAccessoires() 
   {
      return montantAccessoires;
   }
   
   /**
    * Sets the value of the montantAccessoires property.
    * 
    * @param aMontantAccessoires the new value of the montantAccessoires property
    */
   public void setMontantAccessoires(Double aMontantAccessoires) 
   {
      montantAccessoires = aMontantAccessoires;
   }
   
   /**
    * Access method for the montantCommissionApport property.
    * 
    * @return   the current value of the montantCommissionApport property
    */
   public Double getMontantCommissionApport() 
   {
      return montantCommissionApport;
   }
   
   /**
    * Sets the value of the montantCommissionApport property.
    * 
    * @param aMontantCommissionApport the new value of the montantCommissionApport property
    */
   public void setMontantCommissionApport(Double aMontantCommissionApport) 
   {
      montantCommissionApport = aMontantCommissionApport;
   }
   
   /**
    * Access method for the montantCommissionGestion property.
    * 
    * @return   the current value of the montantCommissionGestion property
    */
   public Double getMontantCommissionGestion() 
   {
      return montantCommissionGestion;
   }
   
   /**
    * Sets the value of the montantCommissionGestion property.
    * 
    * @param aMontantCommissionGestion the new value of the montantCommissionGestion property
    */
   public void setMontantCommissionGestion(Double aMontantCommissionGestion) 
   {
      montantCommissionGestion = aMontantCommissionGestion;
   }
   
   /**
    * Access method for the montantCommissionProductivite property.
    * 
    * @return   the current value of the montantCommissionProductivite property
    */
   public Double getMontantCommissionProductivite() 
   {
      return montantCommissionProductivite;
   }
   
   /**
    * Sets the value of the montantCommissionProductivite property.
    * 
    * @param aMontantCommissionProductivite the new value of the montantCommissionProductivite property
    */
   public void setMontantCommissionProductivite(Double aMontantCommissionProductivite) 
   {
      montantCommissionProductivite = aMontantCommissionProductivite;
   }
   
   /**
    * Access method for the tauxTVA property.
    * 
    * @return   the current value of the tauxTVA property
    */
   public Double getTauxTVA() 
   {
      return tauxTVA;
   }
   
   /**
    * Sets the value of the tauxTVA property.
    * 
    * @param aTauxTVA the new value of the tauxTVA property
    */
   public void setTauxTVA(Double aTauxTVA) 
   {
      tauxTVA = aTauxTVA;
   }
   

	public Double getTauxTaxeAssurance() {
		return tauxTaxeAssurance;
	}

	public void setTauxTaxeAssurance(Double tauxTaxeAssurance) {
		this.tauxTaxeAssurance = tauxTaxeAssurance;
	}

	public Double getTauxCommissionApport() {
		return tauxCommissionApport;
	}

	public void setTauxCommissionApport(Double tauxCommissionApport) {
		this.tauxCommissionApport = tauxCommissionApport;
	}

	public Double getTauxCommissionGestion() {
		return tauxCommissionGestion;
	}

	public void setTauxCommissionGestion(Double tauxCommissionGestion) {
		this.tauxCommissionGestion = tauxCommissionGestion;
	}

	public Double getTauxCommissionProductivite() {
		return tauxCommissionProductivite;
	}

	public void setTauxCommissionProductivite(Double tauxCommissionProductivite) {
		this.tauxCommissionProductivite = tauxCommissionProductivite;
	}

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public Double getProrata() {
		return prorata;
	}

	public void setProrata(Double prorata) {
		this.prorata = prorata;
	}

	public PartieDommages getRefPartieDommages() {
		return refPartieDommages;
	}

	public void setRefPartieDommages(PartieDommages refPartieDommages) {
		this.refPartieDommages = refPartieDommages;
	}

	public PartiePrevoyance getRefPartiePrevoyance() {
		return refPartiePrevoyance;
	}

	public void setRefPartiePrevoyance(PartiePrevoyance refPartiePrevoyance) {
		this.refPartiePrevoyance = refPartiePrevoyance;
	}

	public Double getMontantCommissionCatNat() {
		return montantCommissionCatNat;
	}

	public void setMontantCommissionCatNat(Double montantCommissionCatNat) {
		this.montantCommissionCatNat = montantCommissionCatNat;
	}

	public Double getMontantTaxeParafiscale() {
		return montantTaxeParafiscale;
	}

	public void setMontantTaxeParafiscale(Double montantTaxeParafiscale) {
		this.montantTaxeParafiscale = montantTaxeParafiscale;
	}

	

}
