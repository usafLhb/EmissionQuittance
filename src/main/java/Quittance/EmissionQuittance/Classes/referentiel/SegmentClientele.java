//Source file: E:\\_Abdel\\Rmawatanya\\CONVERGENCE\\MOD\\ClassesJava\\com\\rmawatanya\\convergence\\application\\prm\\metier\\modele\\SegmentClientele.java

package Quittance.EmissionQuittance.Classes.referentiel;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.utile.organisation.Societe;


/**
 * P : Professionnel, G : Grand public, H : Haute gamme
 */
public class SegmentClientele implements IEntite
{
   private long id;
   private Integer code;
   private String libelle;
   private Societe refSociete;
   
   public Societe getRefSociete() {
	return refSociete;
}

public void setRefSociete(Societe refSociete) {
	this.refSociete = refSociete;
}

public SegmentClientele() 
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
   
	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}   
}
