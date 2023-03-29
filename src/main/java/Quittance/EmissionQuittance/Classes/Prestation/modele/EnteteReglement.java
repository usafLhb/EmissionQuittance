package Quittance.EmissionQuittance.Classes.Prestation.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;


public class EnteteReglement implements IEntite
{
   private long id;
   private String libelle;
   private String etat;
   private Integer nombreLigne;
   private Integer nombreRejet;
   private Calendar dateSort;
   private Calendar dateGeneration; 
   
   public EnteteReglement() 
   {
    
   }
   
     
	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

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


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public String getEtat() {
		return etat;
	}


	public void setEtat(String etat) {
		this.etat = etat;
	}


	public Integer getNombreLigne() {
		return nombreLigne;
	}


	public void setNombreLigne(Integer nombreLigne) {
		this.nombreLigne = nombreLigne;
	}


	public Integer getNombreRejet() {
		return nombreRejet;
	}


	public void setNombreRejet(Integer nombreRejet) {
		this.nombreRejet = nombreRejet;
	}


	public Calendar getDateGeneration() {
		return dateGeneration;
	}


	public void setDateGeneration(Calendar dateGeneration) {
		this.dateGeneration = dateGeneration;
	}


	public Calendar getDateSort() {
		return dateSort;
	}


	public void setDateSort(Calendar dateSort) {
		this.dateSort = dateSort;
	}


	  
}
