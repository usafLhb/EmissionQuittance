//Source file: E:\\_Abdel\\Rmawatanya\\CONVERGENCE\\MOD\\ClassesJava\\com\\rmawatanya\\convergence\\application\\prd\\metier\\modele\\ParametreSpecifique.java

package Quittance.EmissionQuittance.Classes.Produit.modele;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;


/**
 * Valeur min engagement cumul� continuit�
 * Valeur max engagement cumul� continuit�
 * Valeur min engagement de la compagnie (produit continuit�)
 * Valeur max engagement de la compagnie (produit continuit�)
 */
public class ParametreSpecifique implements IEntite
{
   private long id;
   private String code;
   private String libelle;
   private String valeur;
   
   public ParametreSpecifique() 
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
   public String getCode() 
   {
      return code;
   }
   
   /**
    * Sets the value of the code property.
    * 
    * @param aCode the new value of the code property
    */
   public void setCode(String aCode) 
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
    * Access method for the valeur property.
    * 
    * @return   the current value of the valeur property
    */
   public String getValeur() 
   {
      return valeur;
   }
   
   /**
    * Sets the value of the valeur property.
    * 
    * @param aValeur the new value of the valeur property
    */
   public void setValeur(String aValeur) 
   {
      valeur = aValeur;
   }
   
	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}   
}
