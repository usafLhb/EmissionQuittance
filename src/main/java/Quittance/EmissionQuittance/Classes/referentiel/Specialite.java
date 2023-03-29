package Quittance.EmissionQuittance.Classes.referentiel;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;


public class Specialite extends ParametrageBO implements IEntite {
   
	private long id;
   private Integer code;   
   private String libelle;
   private String typeSpecialite;
   private ClasseActivite refClasseRisque;
    public Specialite() {
    
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
   
   public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getTypeSpecialite() {
		return typeSpecialite;
	}

	public void setTypeSpecialite(String typeSpecialite) {
		this.typeSpecialite = typeSpecialite;
	}

	public ClasseActivite getRefClasseRisque() {
		return refClasseRisque;
	}

	public void setRefClasseRisque(ClasseActivite refClasseRisque) {
		this.refClasseRisque = refClasseRisque;
	}
	
}