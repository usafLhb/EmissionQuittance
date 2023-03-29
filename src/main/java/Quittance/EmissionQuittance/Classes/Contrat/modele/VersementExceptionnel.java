//Source file: E:\\_Abdel\\Rmawatanya\\CONVERGENCE\\MOD\\ClassesJava\\com\\rmawatanya\\convergence\\application\\oct\\metier\\modele\\VersementExceptionnel.java

package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;
import java.util.Collection;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class VersementExceptionnel implements IEntite
{
   private long id;
   private String numero;
   private Calendar date;
   private Double montant;
   private PartieEpargne refPartieEpargne;
   private Collection refRepartitionSupports;
   
   public VersementExceptionnel() 
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
   
   /**
    * Access method for the refPartieEpargne property.
    * 
    * @return   the current value of the refPartieEpargne property
    */
   public PartieEpargne getRefPartieEpargne() 
   {
      return refPartieEpargne;
   }
   
   /**
    * Sets the value of the refPartieEpargne property.
    * 
    * @param aRefPartieEpargne the new value of the refPartieEpargne property
    */
   public void setRefPartieEpargne(PartieEpargne aRefPartieEpargne) 
   {
      refPartieEpargne = aRefPartieEpargne;
   }
   
	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection getRefRepartitionSupports() {
		return refRepartitionSupports;
	}

	public void setRefRepartitionSupports(Collection refRepartitionSupports) {
		this.refRepartitionSupports = refRepartitionSupports;
	}   
}
