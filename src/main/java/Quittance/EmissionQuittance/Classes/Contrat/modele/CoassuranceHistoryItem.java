package Quittance.EmissionQuittance.Classes.Contrat.modele;

import ma.co.omnidata.framework.services.historique.HistoryItem;


public class CoassuranceHistoryItem extends HistoryItem
{
   private String autreCompagnie;
   private Integer pourcentage;
   private ContratHistoryItem refContratHistoryItem;
   private PartiePrevoyanceHistoryItem refPartiePrevoyanceHistoryItem;
   private PartieDommagesHistoryItem refPartieDommagesHistoryItem;
   
   private PartiePrevoyanceHistoryItem refRisquePrevoyanceHistoryItem;
   
   public CoassuranceHistoryItem() 
   {
    
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

	public ContratHistoryItem getRefContratHistoryItem() {
		return refContratHistoryItem;
	}
	
	public void setRefContratHistoryItem(ContratHistoryItem refContratHistoryItem) {
		this.refContratHistoryItem = refContratHistoryItem;
	}
	
	public PartieDommagesHistoryItem getRefPartieDommagesHistoryItem() {
		return refPartieDommagesHistoryItem;
	}
	
	public void setRefPartieDommagesHistoryItem(
			PartieDommagesHistoryItem refPartieDommagesHistoryItem) {
		this.refPartieDommagesHistoryItem = refPartieDommagesHistoryItem;
	}
	
	public PartiePrevoyanceHistoryItem getRefPartiePrevoyanceHistoryItem() {
		return refPartiePrevoyanceHistoryItem;
	}
	
	public void setRefPartiePrevoyanceHistoryItem(
			PartiePrevoyanceHistoryItem refPartiePrevoyanceHistoryItem) {
		this.refPartiePrevoyanceHistoryItem = refPartiePrevoyanceHistoryItem;
	}

	public PartiePrevoyanceHistoryItem getRefRisquePrevoyanceHistoryItem() {
		return refRisquePrevoyanceHistoryItem;
	}

	public void setRefRisquePrevoyanceHistoryItem(
			PartiePrevoyanceHistoryItem refRisquePrevoyanceHistoryItem) {
		this.refRisquePrevoyanceHistoryItem = refRisquePrevoyanceHistoryItem;
	}         
}
