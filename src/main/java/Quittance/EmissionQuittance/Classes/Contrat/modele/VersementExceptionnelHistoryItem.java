package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.historique.HistoryItem;

public class VersementExceptionnelHistoryItem extends HistoryItem
{
   private String numero;
   private Calendar date;
   private Double montant;
   private PartieEpargneHistoryItem refPartieEpargneHistoryItem;
   
   public VersementExceptionnelHistoryItem() 
   {
    
   }
   
   /**
    * Access method for the numero property.
    * 
    * @return   the current value of the numero property
    */
   public String getNumero() 
   {
      return numero;
   }
   
   /**
    * Sets the value of the numero property.
    * 
    * @param aNumero the new value of the numero property
    */
   public void setNumero(String aNumero) 
   {
      numero = aNumero;
   }
   
   /**
    * Access method for the date property.
    * 
    * @return   the current value of the date property
    */
   public Calendar getDate() 
   {
      return date;
   }
   
   /**
    * Sets the value of the date property.
    * 
    * @param aDate the new value of the date property
    */
   public void setDate(Calendar aDate) 
   {
      date = aDate;
   }
   
   /**
    * Access method for the montant property.
    * 
    * @return   the current value of the montant property
    */
   public Double getMontant() 
   {
      return montant;
   }
   
   /**
    * Sets the value of the montant property.
    * 
    * @param aMontant the new value of the montant property
    */
   public void setMontant(Double aMontant) 
   {
      montant = aMontant;
   }

	public PartieEpargneHistoryItem getRefPartieEpargneHistoryItem() {
		return refPartieEpargneHistoryItem;
	}
	
	public void setRefPartieEpargneHistoryItem(
			PartieEpargneHistoryItem refPartieEpargneHistoryItem) {
		this.refPartieEpargneHistoryItem = refPartieEpargneHistoryItem;
	}     
}
