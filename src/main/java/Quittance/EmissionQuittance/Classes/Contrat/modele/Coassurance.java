
package Quittance.EmissionQuittance.Classes.Contrat.modele;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;


public class Coassurance implements IEntite
{
   private long id;
   private String autreCompagnie;
   private Integer pourcentage;
   private Contrat refContrat;
   private PartiePrevoyance refPartiePrevoyance;
   private PartieDommages refPartieDommages;   
   
   private RisquePrevoyance refRisquePrevoyance;

public Coassurance() 
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
    * Access method for the autreCompagnie property.
    * 
    * @return   the current value of the autreCompagnie property
    */
   public String getAutreCompagnie() 
   {
      return autreCompagnie;
   }
   
   /**
    * Sets the value of the autreCompagnie property.
    * 
    * @param aAutreCompagnie the new value of the autreCompagnie property
    */
   public void setAutreCompagnie(String aAutreCompagnie) 
   {
      autreCompagnie = aAutreCompagnie;
   }
   
   /**
    * Access method for the pourcentage property.
    * 
    * @return   the current value of the pourcentage property
    */
   public Integer getPourcentage() 
   {
      return pourcentage;
   }
   
   /**
    * Sets the value of the pourcentage property.
    * 
    * @param aPourcentage the new value of the pourcentage property
    */
   public void setPourcentage(Integer aPourcentage) 
   {
      pourcentage = aPourcentage;
   }
   
   /**
    * Access method for the refContrat property.
    * 
    * @return   the current value of the refContrat property
    */
   public Contrat getRefContrat() 
   {
      return refContrat;
   }
   
   /**
    * Sets the value of the refContrat property.
    * 
    * @param aRefContrat the new value of the refContrat property
    */
   public void setRefContrat(Contrat aRefContrat) 
   {
      refContrat = aRefContrat;
   }
   
   /**
    * Access method for the refPartiePrevoyance property.
    * 
    * @return   the current value of the refPartiePrevoyance property
    */
   public PartiePrevoyance getRefPartiePrevoyance() 
   {
      return refPartiePrevoyance;
   }
   
   /**
    * Sets the value of the refPartiePrevoyance property.
    * 
    * @param aRefPartiePrevoyance the new value of the refPartiePrevoyance property
    */
   public void setRefPartiePrevoyance(PartiePrevoyance aRefPartiePrevoyance) 
   {
      refPartiePrevoyance = aRefPartiePrevoyance;
   }
   
   /**
    * Access method for the refPartieDommages property.
    * 
    * @return   the current value of the refPartieDommages property
    */
   public PartieDommages getRefPartieDommages() 
   {
      return refPartieDommages;
   }
   
   /**
    * Sets the value of the refPartieDommages property.
    * 
    * @param aRefPartieDommages the new value of the refPartieDommages property
    */
   public void setRefPartieDommages(PartieDommages aRefPartieDommages) 
   {
      refPartieDommages = aRefPartieDommages;
   }
   
	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public RisquePrevoyance getRefRisquePrevoyance() {
		return refRisquePrevoyance;
	}

	public void setRefRisquePrevoyance(RisquePrevoyance refRisquePrevoyance) {
		this.refRisquePrevoyance = refRisquePrevoyance;
	}   
}
