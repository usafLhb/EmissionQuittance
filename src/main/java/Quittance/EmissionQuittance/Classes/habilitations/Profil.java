package Quittance.EmissionQuittance.Classes.habilitations;

import java.util.Calendar;
import java.util.List;

import ma.co.omnidata.framework.services.securite.impl.OMNIRole;

public class Profil extends OMNIRole
{
   private Integer code;
   private Boolean profilStandard;
   private Calendar dateEffet;
   private Calendar dateFin;
   private String etat;
   private List refPorteFeuilleVersionCommercialeProduit;
   
   public Profil() 
   {
    
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
    * Access method for the profilStandard property.
    * 
    * @return   the current value of the profilStandard property
    */
   public Boolean getProfilStandard() 
   {
      return profilStandard;
   }
   
   /**
    * Sets the value of the profilStandard property.
    * 
    * @param aProfilStandard the new value of the profilStandard property
    */
   public void setProfilStandard(Boolean aProfilStandard) 
   {
      profilStandard = aProfilStandard;
   }
   
   /**
    * Access method for the dateEffet property.
    * 
    * @return   the current value of the dateEffet property
    */
   public Calendar getDateEffet() 
   {
      return dateEffet;
   }
   
   /**
    * Sets the value of the dateEffet property.
    * 
    * @param aDateEffet the new value of the dateEffet property
    */
   public void setDateEffet(Calendar aDateEffet) 
   {
      dateEffet = aDateEffet;
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
    * @param aDateFin the new value of the dateFin property
    */
   public void setDateFin(Calendar aDateFin) 
   {
      dateFin = aDateFin;
   }
  
	/**
    * Access method for the refType property.
    * 
    * @return   the current value of the refType property
    */

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public List getRefPorteFeuilleVersionCommercialeProduit() {
		return refPorteFeuilleVersionCommercialeProduit;
	}

	public void setRefPorteFeuilleVersionCommercialeProduit(List refPorteFeuilleVersionCommercialeProduit) {
		this.refPorteFeuilleVersionCommercialeProduit = refPorteFeuilleVersionCommercialeProduit;
	}
	
	
}
