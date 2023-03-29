//Source file: E:\\_Abdel\\Rmawatanya\\CONVERGENCE\\MOD\\ClassesJava\\com\\rmawatanya\\convergence\\utile\\referentiel\\Activite.java

package Quittance.EmissionQuittance.Classes.referentiel;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;


public class Activite extends ParametrageBO implements IEntite {
   private long id;
   private Integer code;
   private String libelle;
   private Boolean reservee;
   private SecteurActivite refSecteurActivite;
   private ClasseActivite refClasseActivite;   
   private String clause;
   private String avecdeclaration;
   
   public Activite() 
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
    * Access method for the reservee property.
    * 
    * @return   the current value of the reservee property
    */
   public Boolean getReservee() 
   {
      return reservee;
   }
   
   /**
    * Sets the value of the reservee property.
    * 
    * @param aReservee the new value of the reservee property
    */
   public void setReservee(Boolean aReservee) 
   {
      reservee = aReservee;
   }
   
   /**
    * Access method for the refSecteurActivite property.
    * 
    * @return   the current value of the refSecteurActivite property
    */
   public SecteurActivite getRefSecteurActivite() 
   {
      return refSecteurActivite;
   }
   
   /**
    * Sets the value of the refSecteurActivite property.
    * 
    * @param aRefSecteurActivite the new value of the refSecteurActivite property
    */
   public void setRefSecteurActivite(SecteurActivite aRefSecteurActivite) 
   {
      refSecteurActivite = aRefSecteurActivite;
   }
   
	public ClasseActivite getRefClasseActivite() {
		return refClasseActivite;
	}
	
	public void setRefClasseActivite(ClasseActivite refClasseActivite) {
		this.refClasseActivite = refClasseActivite;
	}
	
	public String getClause() {
		return clause;
	}

	public void setClause(String clause) {
		this.clause = clause;
	}

	public String getAvecdeclaration() {
		return avecdeclaration;
	}

	public void setAvecdeclaration(String avecdeclaration) {
		this.avecdeclaration = avecdeclaration;
	}


	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}	
}
