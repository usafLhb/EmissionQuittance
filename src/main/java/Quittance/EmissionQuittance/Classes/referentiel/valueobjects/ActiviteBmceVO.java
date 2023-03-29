//Source file: E:\\_Abdel\\Rmawatanya\\CONVERGENCE\\MOD\\ClassesJava\\com\\rmawatanya\\convergence\\utile\\referentiel\\Activite.java

package Quittance.EmissionQuittance.Classes.referentiel.valueobjects;

import java.util.List;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;


public class ActiviteBmceVO extends ParametrageBO implements IEntite {
   private long id;
   private Integer code;
   private String libelle;
   private String niveau;
  				   
   @ManyToOne //add column definitions as needed
   private ActiviteBmceVO refActiviteSup;      //each Activite with parent==null is a root ActiviteBmce, all others are ActiviteBmce Fils

   @OneToMany //add column definitions as needed
   private List<ActiviteBmceVO> refActiviteFils;
 
   public ActiviteBmceVO() 
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
 
	
	public String getNiveau() {
	return niveau;
}

public void setNiveau(String niveau) {
	this.niveau = niveau;
}




	public ActiviteBmceVO getRefActiviteSup() {
	return refActiviteSup;
}

public void setRefActiviteSup(ActiviteBmceVO refActiviteSup) {
	this.refActiviteSup = refActiviteSup;
}

public List<ActiviteBmceVO> getRefActiviteFils() {
	return refActiviteFils;
}

public void setRefActiviteFils(List<ActiviteBmceVO> refActiviteFils) {
	this.refActiviteFils = refActiviteFils;
}

	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}	
}
