
package Quittance.EmissionQuittance.Classes.Produit.modele;

import java.util.Calendar;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;


public class CapitalAssure extends ParametrageBO implements IEntite {

	private static final long serialVersionUID = 1L;
	private long id;
   private Integer ageAssureMin;
   private Integer ageAssureMax;
   private Double capitalAssureMin;
   private Double capitalAssureMax;
   private Calendar dateDebut;
	private Calendar dateFin;
   
   private VisiteMedicale refVisiteMedicale;
   
   public boolean equals(Object obj) {
		if(this.getId()==((CapitalAssure)obj).getId()){
			return true;
		}
		return false;
	}
   public CapitalAssure() 
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
    * Access method for the ageAssureMin property.
    * 
    * @return   the current value of the ageAssureMin property
    */
   public Integer getAgeAssureMin() 
   {
      return ageAssureMin;
   }
   
   /**
    * Sets the value of the ageAssureMin property.
    * 
    * @param aAgeAssureMin the new value of the ageAssureMin property
    */
   public void setAgeAssureMin(Integer aAgeAssureMin) 
   {
      ageAssureMin = aAgeAssureMin;
   }
   
   /**
    * Access method for the ageAssureMax property.
    * 
    * @return   the current value of the ageAssureMax property
    */
   public Integer getAgeAssureMax() 
   {
      return ageAssureMax;
   }
   
   /**
    * Sets the value of the ageAssureMax property.
    * 
    * @param aAgeAssureMax the new value of the ageAssureMax property
    */
   public void setAgeAssureMax(Integer aAgeAssureMax) 
   {
      ageAssureMax = aAgeAssureMax;
   }
   
   /**
    * Access method for the capitalAssureMin property.
    * 
    * @return   the current value of the capitalAssureMin property
    */
   public Double getCapitalAssureMin() 
   {
      return capitalAssureMin;
   }
   
   /**
    * Sets the value of the capitalAssureMin property.
    * 
    * @param aCapitalAssureMin the new value of the capitalAssureMin property
    */
   public void setCapitalAssureMin(Double aCapitalAssureMin) 
   {
      capitalAssureMin = aCapitalAssureMin;
   }
   
   /**
    * Access method for the capitalAssureMax property.
    * 
    * @return   the current value of the capitalAssureMax property
    */
   public Double getCapitalAssureMax() 
   {
      return capitalAssureMax;
   }
   
   /**
    * Sets the value of the capitalAssureMax property.
    * 
    * @param aCapitalAssureMax the new value of the capitalAssureMax property
    */
   public void setCapitalAssureMax(Double aCapitalAssureMax) 
   {
      capitalAssureMax = aCapitalAssureMax;
   }
   
   /**
    * Access method for the refVisiteMedicale property.
    * 
    * @return   the current value of the refVisiteMedicale property
    */
   public VisiteMedicale getRefVisiteMedicale() 
   {
      return refVisiteMedicale;
   }
	public String getDescription() {
		return refVisiteMedicale.getDescription();
	}

   /**
    * Sets the value of the refVisiteMedicale property.
    * 
    * @param aRefVisiteMedicale the new value of the refVisiteMedicale property
    */
   public void setRefVisiteMedicale(VisiteMedicale aRefVisiteMedicale) 
   {
      refVisiteMedicale = aRefVisiteMedicale;
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
