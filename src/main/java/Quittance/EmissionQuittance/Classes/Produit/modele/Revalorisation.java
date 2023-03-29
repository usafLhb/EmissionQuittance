
package Quittance.EmissionQuittance.Classes.Produit.modele;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class Revalorisation extends ParametrageBO implements IEntite {

	private static final long serialVersionUID = 1L;
	
	private long id;
   private Integer exercice;
   private Double tauxMinimum;
   private Double tauxRevalorisation;
   private Double dernierTauxCommunique;
   private Double tauxTechnique;
   private String libelle;
   
   private ParametresEpargne refParametresEpargne;
   
   public boolean equals(Object obj) {
		if(this.getId()==((Revalorisation)obj).getId()){
			return true;
		}
		return false;
	}
   
   public Revalorisation() 
   {
    
   }
   
	public String getDescription() {
		return id+" "+libelle;
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
    * Access method for the exercice property.
    * 
    * @return   the current value of the exercice property
    */
   public Integer getExercice() 
   {
      return exercice;
   }
   
   /**
    * Sets the value of the exercice property.
    * 
    * @param aExercice the new value of the exercice property
    */
   public void setExercice(Integer aExercice) 
   {
      exercice = aExercice;
   }
   
   /**
    * Access method for the tauxMinimum property.
    * 
    * @return   the current value of the tauxMinimum property
    */
   public Double getTauxMinimum() 
   {
      return tauxMinimum;
   }
   
   /**
    * Sets the value of the tauxMinimum property.
    * 
    * @param aTauxMinimum the new value of the tauxMinimum property
    */
   public void setTauxMinimum(Double aTauxMinimum) 
   {
      tauxMinimum = aTauxMinimum;
   }
   
   /**
    * Access method for the tauxRevalorisation property.
    * 
    * @return   the current value of the tauxRevalorisation property
    */
   public Double getTauxRevalorisation() 
   {
      return tauxRevalorisation;
   }
   
   /**
    * Sets the value of the tauxRevalorisation property.
    * 
    * @param aTauxRevalorisation the new value of the tauxRevalorisation property
    */
   public void setTauxRevalorisation(Double aTauxRevalorisation) 
   {
      tauxRevalorisation = aTauxRevalorisation;
   }
   
   /**
    * Access method for the refParametresEpargne property.
    * 
    * @return   the current value of the refParametresEpargne property
    */
   public ParametresEpargne getRefParametresEpargne() 
   {
      return refParametresEpargne;
   }
   
   /**
    * Sets the value of the refParametresEpargne property.
    * 
    * @param aRefParametresEpargne the new value of the refParametresEpargne property
    */
   public void setRefParametresEpargne(ParametresEpargne aRefParametresEpargne) 
   {
      refParametresEpargne = aRefParametresEpargne;
   }
   
	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public Double getDernierTauxCommunique() {
		return dernierTauxCommunique;
	}

	public void setDernierTauxCommunique(Double dernierTauxCommunique) {
		this.dernierTauxCommunique = dernierTauxCommunique;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Double getTauxTechnique() {
		return tauxTechnique;
	}

	public void setTauxTechnique(Double tauxTechnique) {
		this.tauxTechnique = tauxTechnique;
	}   
	
}
