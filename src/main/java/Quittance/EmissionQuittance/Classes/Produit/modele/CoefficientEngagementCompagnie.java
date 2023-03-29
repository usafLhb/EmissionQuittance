//Source file: E:\\_Abdel\\Rmawatanya\\CONVERGENCE\\MOD\\ClassesJava\\com\\rmawatanya\\convergence\\application\\prd\\metier\\modele\\CoefficientEngagementCompagnie.java

package Quittance.EmissionQuittance.Classes.Produit.modele;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;


public class CoefficientEngagementCompagnie implements IEntite
{
   private long id;
   private Integer dureeEngagement;
   private Integer dureeService;
   private Double coefficient;
   
   public CoefficientEngagementCompagnie() 
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
    * Access method for the dureeEngagement property.
    * 
    * @return   the current value of the dureeEngagement property
    */
   public Integer getDureeEngagement() 
   {
      return dureeEngagement;
   }
   
   /**
    * Sets the value of the dureeEngagement property.
    * 
    * @param aDureeEngagement the new value of the dureeEngagement property
    */
   public void setDureeEngagement(Integer aDureeEngagement) 
   {
      dureeEngagement = aDureeEngagement;
   }
   
   /**
    * Access method for the dureeService property.
    * 
    * @return   the current value of the dureeService property
    */
   public Integer getDureeService() 
   {
      return dureeService;
   }
   
   /**
    * Sets the value of the dureeService property.
    * 
    * @param aDureeService the new value of the dureeService property
    */
   public void setDureeService(Integer aDureeService) 
   {
      dureeService = aDureeService;
   }
   
   /**
    * Access method for the coefficient property.
    * 
    * @return   the current value of the coefficient property
    */
   public Double getCoefficient() 
   {
      return coefficient;
   }
   
   /**
    * Sets the value of the coefficient property.
    * 
    * @param aCoefficient the new value of the coefficient property
    */
   public void setCoefficient(Double aCoefficient) 
   {
      coefficient = aCoefficient;
   }
   
	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}   
}
