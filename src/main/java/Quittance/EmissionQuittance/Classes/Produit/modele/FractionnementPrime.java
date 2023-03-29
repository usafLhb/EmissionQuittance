
package Quittance.EmissionQuittance.Classes.Produit.modele;

import java.util.Calendar; 

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.utile.referentiel.TypeFractionnementPrime;

public class FractionnementPrime extends ParametrageBO implements IEntite {

   private static final long serialVersionUID = 1L;
   private long id;
   private Double montantMin;
   private Double montantMax;
   private Calendar dateDebut;
   private Calendar dateFin;
   
   private Produit refProduit;
   private ParametresPrevoyance refParametresPrevoyance;
   private ParametresDommages refParametresDommages;
   private TypeFractionnementPrime refTypeFractionnementPrime;   
   
   public boolean equals(Object obj) {
		if(this.getId()==((FractionnementPrime)obj).getId()){
			return true;
		}
		return false;
	}

   public FractionnementPrime()  {
    
   }
   
   public String getDescription() {
		return refTypeFractionnementPrime.getDescription(); 
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
    * Access method for the montantMin property.
    * 
    * @return   the current value of the montantMin property
    */
   public Double getMontantMin() 
   {
      return montantMin;
   }
   
   /**
    * Sets the value of the montantMin property.
    * 
    * @param aMontantMin the new value of the montantMin property
    */
   public void setMontantMin(Double aMontantMin) 
   {
      montantMin = aMontantMin;
   }
   
   /**
    * Access method for the montantMax property.
    * 
    * @return   the current value of the montantMax property
    */
   public Double getMontantMax() 
   {
      return montantMax;
   }
   
   /**
    * Sets the value of the montantMax property.
    * 
    * @param aMontantMax the new value of the montantMax property
    */
   public void setMontantMax(Double aMontantMax) 
   {
      montantMax = aMontantMax;
   }
   
   /**
    * Access method for the refParametresPrevoyance property.
    * 
    * @return   the current value of the refParametresPrevoyance property
    */
   public ParametresPrevoyance getRefParametresPrevoyance() 
   {
      return refParametresPrevoyance;
   }
   
   /**
    * Sets the value of the refParametresPrevoyance property.
    * 
    * @param aRefParametresPrevoyance the new value of the refParametresPrevoyance property
    */
   public void setRefParametresPrevoyance(ParametresPrevoyance aRefParametresPrevoyance) 
   {
      refParametresPrevoyance = aRefParametresPrevoyance;
   }
   
   /**
    * Access method for the refParametresDommages property.
    * 
    * @return   the current value of the refParametresDommages property
    */
   public ParametresDommages getRefParametresDommages() 
   {
      return refParametresDommages;
   }
   
   /**
    * Sets the value of the refParametresDommages property.
    * 
    * @param aRefParametresDommages the new value of the refParametresDommages property
    */
   public void setRefParametresDommages(ParametresDommages aRefParametresDommages) 
   {
      refParametresDommages = aRefParametresDommages;
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
    * Access method for the refProduit property.
    * 
    * @return   the current value of the refProduit property
    */
   public Produit getRefProduit() 
   {
      return refProduit;
   }
   
   /**
    * Sets the value of the refProduit property.
    * 
    * @param aRefProduit the new value of the refProduit property
    */
   public void setRefProduit(Produit aRefProduit) 
   {
      refProduit = aRefProduit;
   }
   
	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
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
}
