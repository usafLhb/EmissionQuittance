//Source file: E:\\_Abdel\\Rmawatanya\\CONVERGENCE\\MOD\\ClassesJava\\com\\rmawatanya\\convergence\\utile\\referentiel\\Activite.java

package Quittance.EmissionQuittance.Classes.referentiel;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;


public class SousMarche extends ParametrageBO implements IEntite {
   private long id;
   private String code;
   private String libelle;
   private Marche refMarche;
     
   
   public SousMarche() 
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
   
 
   public String getCode() {
	return code;
}

public void setCode(String code) {
	this.code = code;
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
   
  
  
	public Marche getRefMarche() {
	return refMarche;
	}

	public void setRefMarche(Marche refMarche) {
	this.refMarche = refMarche;
	}

	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}	
}
