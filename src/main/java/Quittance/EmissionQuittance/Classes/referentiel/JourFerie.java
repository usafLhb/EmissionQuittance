//Source file: E:\\_Abdel\\Rmawatanya\\CONVERGENCE\\MOD\\ClassesJava\\com\\rmawatanya\\convergence\\utile\\referentiel\\JourFerie.java

package Quittance.EmissionQuittance.Classes.referentiel;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.referentiel.RepositoryUnit;
/**
 * Les jours f�ri�s
 */
public class JourFerie extends RepositoryUnit
{
   private String date;
   
   public JourFerie() 
   {
    
   }
   
   /**
    * Access method for the date property.
    * 
    * @return   the current value of the date property
    */
   public String getDate() 
   {
      return date;
   }
   
   /**
    * Sets the value of the date property.
    * 
    * @param aDate the new value of the date property
    */
   public void setDate(String aDate) 
   {
      date = aDate;
   }
   
	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}   
}
