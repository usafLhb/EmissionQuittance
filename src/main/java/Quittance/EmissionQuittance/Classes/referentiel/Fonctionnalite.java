//Source file: E:\\_Abdel\\Rmawatanya\\CONVERGENCE\\MOD\\ClassesJava\\com\\rmawatanya\\convergence\\utile\\habilitations\\Fonctionnalite.java

package Quittance.EmissionQuittance.Classes.referentiel;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;
import ma.co.omnidata.framework.services.securite.impl.OMNIAction;


public class Fonctionnalite extends OMNIAction implements IEntite
{
   private Integer code;
   private String libelle;
   private String titre;
   private Boolean valableToutProduit;
   private String type;
   //private Collection refProduitsValables;
   
   public Fonctionnalite() 
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
    * Access method for the libelle property.
    * 
    * @return   the current value of the libelle property
    */
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
    * Access method for the titre property.
    * 
    * @return   the current value of the titre property
    */
   public String getTitre() 
   {
      return titre;
   }
   
   /**
    * Sets the value of the titre property.
    * 
    * @param aTitre the new value of the titre property
    */
   public void setTitre(String aTitre) 
   {
      titre = aTitre;
   }
   
   /**
    * Access method for the valableToutProduit property.
    * 
    * @return   the current value of the valableToutProduit property
    */
   public Boolean getValableToutProduit() 
   {
      return valableToutProduit;
   }
   
   /**
    * Sets the value of the valableToutProduit property.
    * 
    * @param aValableToutProduit the new value of the valableToutProduit property
    */
   public void setValableToutProduit(Boolean aValableToutProduit) 
   {
      valableToutProduit = aValableToutProduit;
   }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return Returns the refProduitsValables.
	 
	public Collection getRefProduitsValables() {
		return refProduitsValables;
	}*/
	
	/**
	 * @param refProduitsValables The refProduitsValables to set.
	 
	public void setRefProduitsValables(Collection refProduitsValables) {
		this.refProduitsValables = refProduitsValables;
	}*/
	
	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}	
}
