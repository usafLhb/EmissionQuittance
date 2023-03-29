package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.historique.HistoryItem;


public class DemandeRegularisationHistoryItem extends HistoryItem
{
   private String numero;
   private Double montant;
   private Calendar date;
   private String motif;
   private String etat;
   private ContratHistoryItem refContratHistoryItem;
   
   public DemandeRegularisationHistoryItem() 
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
    * Access method for the motif property.
    * 
    * @return   the current value of the motif property
    */
   public String getMotif() 
   {
      return motif;
   }
   
   /**
    * Sets the value of the motif property.
    * 
    * @param aMotif the new value of the motif property
    */
   public void setMotif(String aMotif) 
   {
      motif = aMotif;
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

	public ContratHistoryItem getRefContratHistoryItem() {
		return refContratHistoryItem;
	}
	
	public void setRefContratHistoryItem(ContratHistoryItem refContratHistoryItem) {
		this.refContratHistoryItem = refContratHistoryItem;
	}   
 
}
