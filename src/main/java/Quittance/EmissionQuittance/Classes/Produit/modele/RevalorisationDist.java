
package Quittance.EmissionQuittance.Classes.Produit.modele;

import java.util.Calendar;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class RevalorisationDist extends ParametrageBO implements IEntite {

	
   private long id;
   private Calendar dateDebut;
   private Calendar dateFin;
   private Double tauxTechnique;
   private Double tauxMinGaranti;
   private Double tauxReelRendement;
   private String libelle;
   
   private ParametresEpargne refParametresEpargne;
   
   public boolean equals(Object obj) {
		if(this.getId()==((RevalorisationDist)obj).getId()){
			return true;
		}
		return false;
	}
   
   public RevalorisationDist() 
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

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Calendar getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Calendar dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Calendar getDateFin() {
		return dateFin;
	}

	public void setDateFin(Calendar dateFin) {
		this.dateFin = dateFin;
	}

	public Double getTauxTechnique() {
		return tauxTechnique;
	}

	public void setTauxTechnique(Double tauxTechnique) {
		this.tauxTechnique = tauxTechnique;
	}

	public Double getTauxMinGaranti() {
		return tauxMinGaranti;
	}

	public void setTauxMinGaranti(Double tauxMinGaranti) {
		this.tauxMinGaranti = tauxMinGaranti;
	}

	public Double getTauxReelRendement() {
		return tauxReelRendement;
	}

	public void setTauxReelRendement(Double tauxReelRendement) {
		this.tauxReelRendement = tauxReelRendement;
	}   
}
