//Source file: E:\\_Abdel\\Rmawatanya\\CONVERGENCE\\MOD\\ClassesJava\\com\\rmawatanya\\convergence\\application\\oct\\metier\\modele\\DemandeRegularisation.java

package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;


public class DemandeRegularisation implements IEntite
{
   private long id;
   private String numero;
   private String numeroAdhesion;
   private Double montant;
   private Calendar date;
   private String motif;
   private String etat;
   private Contrat refContrat;
   
   public DemandeRegularisation() 
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
   
	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNumeroAdhesion() {
		return numeroAdhesion;
	}

	public void setNumeroAdhesion(String numeroAdhesion) {
		this.numeroAdhesion = numeroAdhesion;
	}   
}
