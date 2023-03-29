//Source file: E:\\_Abdel\\Rmawatanya\\CONVERGENCE\\MOD\\ClassesJava\\com\\rmawatanya\\convergence\\application\\prl\\metier\\modele\\ElementEnregistrementPrelevement.java

package Quittance.EmissionQuittance.Classes.Prelevements.modele;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;


public class ElementEnregistrementPrelevement implements IEntite
{
   private long id;
   private String codeEnregistrement;
   private String codeElement;
   private Integer longueur;
   private String type;
   
   public ElementEnregistrementPrelevement() 
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
    * Access method for the codeEnregistrement property.
    * 
    * @return   the current value of the codeEnregistrement property
    */
   public String getCodeEnregistrement() 
   {
      return codeEnregistrement;
   }
   
   /**
    * Sets the value of the codeEnregistrement property.
    * 
    * @param aCodeEnregistrement the new value of the codeEnregistrement property
    */
   public void setCodeEnregistrement(String aCodeEnregistrement) 
   {
      codeEnregistrement = aCodeEnregistrement;
   }
   
   /**
    * Access method for the codeElement property.
    * 
    * @return   the current value of the codeElement property
    */
   public String getCodeElement() 
   {
      return codeElement;
   }
   
   /**
    * Sets the value of the codeElement property.
    * 
    * @param aCodeElement the new value of the codeElement property
    */
   public void setCodeElement(String aCodeElement) 
   {
      codeElement = aCodeElement;
   }
   
   /**
    * Access method for the longueur property.
    * 
    * @return   the current value of the longueur property
    */
   public Integer getLongueur() 
   {
      return longueur;
   }
   
   /**
    * Sets the value of the longueur property.
    * 
    * @param aLongueur the new value of the longueur property
    */
   public void setLongueur(Integer aLongueur) 
   {
      longueur = aLongueur;
   }
   
   /**
    * Access method for the type property.
    * 
    * @return   the current value of the type property
    */
   public String getType() 
   {
      return type;
   }
   
   /**
    * Sets the value of the type property.
    * 
    * @param aType the new value of the type property
    */
   public void setType(String aType) 
   {
      type = aType;
   }
   
	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}   
}
