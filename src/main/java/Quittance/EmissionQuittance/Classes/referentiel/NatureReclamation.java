//Source file: E:\\_Abdel\\Rmawatanya\\CONVERGENCE\\MOD\\ClassesJava\\com\\rmawatanya\\convergence\\utile\\referentiel\\NatureReclamation.java

package Quittance.EmissionQuittance.Classes.referentiel;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;


public class NatureReclamation extends ParametrageBO implements IEntite {
   private long id;
   private Integer code;
   private String libelle;
   private Boolean exigeMontant;   
   private Boolean complementexige;
   private Integer delaiRelance;
   
   public NatureReclamation() 
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
	public String getDescription() {
		return code + " - " + libelle;
	}

   public String getLibelle() 
   {
      return libelle;
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
    * Access method for the exigeMontant property.
    * 
    * @return   the current value of the exigeMontant property
    */
   public Boolean getExigeMontant() 
   {
      return exigeMontant;
   }
   
   /**
    * Sets the value of the exigeMontant property.
    * 
    * @param aExigeMontant the new value of the exigeMontant property
    */
   public void setExigeMontant(Boolean aExigeMontant) 
   {
      exigeMontant = aExigeMontant;
   }
   
   
   
	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}
/*
	public Utilisateur getRefResponsable() {
		return refResponsable;
	}

	public void setRefResponsable(Utilisateur refResponsable) {
		this.refResponsable = refResponsable;
	}
*/
	public Boolean getComplementexige() {
		return complementexige;
	}

	public void setComplementexige(Boolean complementexige) {
		this.complementexige = complementexige;
	}

	public Integer getDelaiRelance() {
		return delaiRelance;
	}

	public void setDelaiRelance(Integer delaiRelance) {
		this.delaiRelance = delaiRelance;
	}
   
}
