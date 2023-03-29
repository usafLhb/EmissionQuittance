package Quittance.EmissionQuittance.Classes.referentiel;

import java.util.Calendar;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;


public class Service extends ParametrageBO implements IEntite {
   private long id;
   private Integer code;
   private String libelle;
   private Calendar dateDebut;
   private Calendar dateFin;
   private Calendar dateModification;
   private TypeService refTypeService;   
   
   public Service() 
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
    * Access method for the code property.
    * 
    * @return   the current value of the code property
    */
   public Integer getCode() 
   {
      return code;
   }
   
   /**
    * Sets the value of the code property.
    * 
    * @param aCode the new value of the code property
    */
   public void setCode(Integer aCode) 
   {
      code = aCode;
   }
   
   /**
    * Access method for the libelle property.
    * 
    * @return   the current value of the libelle property
    */
   public String getLibelle() 
   {
      return libelle;
   }
	public String getDescription() {
		return code + " - " + libelle;
	}   
   /**
    * Sets the value of the libelle property.
    * 
    * @param aLibelle the new value of the libelle property
    */
   public void setLibelle(String aLibelle) 
   {
      libelle = aLibelle;
   }
   
   /**
    * Access method for the dateDebut property.
    * 
    * @return   the current value of the dateDebut property
    */
   public Calendar getDateDebut() 
   {
      return dateDebut;
   }
   
   /**
    * Sets the value of the dateDebut property.
    * 
    * @param aReservee the new value of the dateDebut property
    */
   public void setDateDebut (Calendar aDateDebut) 
   {
      dateDebut = aDateDebut;
   }
   /**
    * Access method for the dateFin property.
    * 
    * @return   the current value of the dateFin property
    */
   public Calendar getDateFin() 
   {
      return dateFin;
   }
   
   /**
    * Sets the value of the dateFin property.
    * 
    * @param aReservee the new value of the dateFin property
    */
   public void setDateFin(Calendar aDateFin) 
   {
      dateFin = aDateFin;
   }
   /**
    * Access method for the dateFin property.
    * 
    * @return   the current value of the dateFin property
    */
   public Calendar getDateModification() 
   {
      return dateModification;
   }
   
   /**
    * Sets the value of the dateModification property.
    * 
    * @param aReservee the new value of the dateModification property
    */
   public void setDateModification(Calendar aDateModification) 
   {
      dateModification = aDateModification;
   }
   
   /**
    * Access method for the refTypeService property.
    * 
    * @return   the current value of the refTypeService property
    */
   public TypeService getRefTypeService() 
   {
      return refTypeService;
   }
   
   /**
    * Sets the value of the refTypeService property.
    * 
    * @param aTypeService the new value of the refSecteurActivite property
    */
   public void setRefTypeService(TypeService aRefTypeService) 
   {
      refTypeService = aRefTypeService;
   }
   
	
	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}	
}
