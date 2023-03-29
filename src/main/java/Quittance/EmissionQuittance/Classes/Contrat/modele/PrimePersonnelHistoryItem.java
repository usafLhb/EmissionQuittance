package Quittance.EmissionQuittance.Classes.Contrat.modele;

import ma.co.omnidata.framework.services.historique.HistoryItem;
import ma.co.omnidata.framework.utile.DoubleUtile;

import com.rmawatanya.convergence.application.oct.metier.valueobjects.OctPrimePersonnelVO;
import com.rmawatanya.convergence.utile.referentiel.TypeSalarie;

public class PrimePersonnelHistoryItem extends HistoryItem
{
   /**
    * 0 : taux, 1 : montant
    */
   private Boolean typeCalculPrime;
   private Double montantPrimeSalariale;
   private Double tauxPrimeSalariale;
   private Double montantPrimePatronale;
   private Double tauxPrimePatronale;
   private Integer effectif;
   private TypeSalarie refTypeSalarie;
   private ContratHistoryItem refContratHistoryItem;
   
   public PrimePersonnelHistoryItem() 
   {
    
   }
   
   /**
    * Access method for the typeCalculPrime property.
    * 
    * @return   the current value of the typeCalculPrime property
    */
   public Boolean getTypeCalculPrime() 
   {
      return typeCalculPrime;
   }
   
   /**
    * Sets the value of the typeCalculPrime property.
    * 
    * @param aTypeCalculPrime the new value of the typeCalculPrime property
    */
   public void setTypeCalculPrime(Boolean aTypeCalculPrime) 
   {
      typeCalculPrime = aTypeCalculPrime;
   }
   
  
public Double getMontantPrimeSalariale() {
	return montantPrimeSalariale;
}

public void setMontantPrimeSalariale(Double montantPrimeSalariale) {
	this.montantPrimeSalariale = montantPrimeSalariale;
}

public Double getTauxPrimeSalariale() {
	return tauxPrimeSalariale;
}

public void setTauxPrimeSalariale(Double tauxPrimeSalariale) {
	this.tauxPrimeSalariale = tauxPrimeSalariale;
}

public Double getMontantPrimePatronale() {
	return montantPrimePatronale;
}

public void setMontantPrimePatronale(Double montantPrimePatronale) {
	this.montantPrimePatronale = montantPrimePatronale;
}

public Double getTauxPrimePatronale() {
	return tauxPrimePatronale;
}

public void setTauxPrimePatronale(Double tauxPrimePatronale) {
	this.tauxPrimePatronale = tauxPrimePatronale;
}

/**
    * Access method for the refTypeSalarie property.
    * 
    * @return   the current value of the refTypeSalarie property
    */
   public TypeSalarie getRefTypeSalarie() 
   {
      return refTypeSalarie;
   }
   
   /**
    * Sets the value of the refTypeSalarie property.
    * 
    * @param aRefTypeSalarie the new value of the refTypeSalarie property
    */
   public void setRefTypeSalarie(TypeSalarie aRefTypeSalarie) 
   {
      refTypeSalarie = aRefTypeSalarie;
   }

	public ContratHistoryItem getRefContratHistoryItem() {
		return refContratHistoryItem;
	}
	
	public void setRefContratHistoryItem(ContratHistoryItem refContratHistoryItem) {
		this.refContratHistoryItem = refContratHistoryItem;
	}

	public Integer getEffectif() {
		return effectif;
	}

	public void setEffectif(Integer effectif) {
		this.effectif = effectif;
	}
	
	
	public boolean isToBeRemoved() {
		if(this.effectif == null 
				&& this.refTypeSalarie == null && this.refContratHistoryItem == null 
				&& this.montantPrimePatronale == null && this.montantPrimeSalariale == null
				&& this.effectif.equals("0") 
				)
		{
			return true;
		}
		return false;
	}
  
	public OctPrimePersonnelVO convertToVo() {
		OctPrimePersonnelVO octPrimePersonnelVO = new OctPrimePersonnelVO();
		octPrimePersonnelVO.setIdTypeSalarie(String.valueOf(this.getId()));
		octPrimePersonnelVO.setEffectif(String.valueOf(this.effectif));
		if(this.refTypeSalarie != null) {
			octPrimePersonnelVO.setIdTypeSalarie(String.valueOf(this.refTypeSalarie.getId()));
			octPrimePersonnelVO.setLibelleCategorie(String.valueOf(this.refTypeSalarie.getLibelle()));
		}
		if(this.montantPrimePatronale != null) {
			octPrimePersonnelVO.setPrimePatronale(DoubleUtile.convertDoubleToString(this.montantPrimePatronale.doubleValue()));
		}
		if(this.montantPrimeSalariale != null) {
			octPrimePersonnelVO.setPrimeSalariale(DoubleUtile.convertDoubleToString(this.montantPrimeSalariale.doubleValue()));
		}
		return octPrimePersonnelVO;
	}
    
}
