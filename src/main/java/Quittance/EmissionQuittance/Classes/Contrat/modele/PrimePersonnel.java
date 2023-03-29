//Source file: E:\\_Abdel\\Rmawatanya\\CONVERGENCE\\MOD\\ClassesJava\\com\\rmawatanya\\convergence\\application\\oct\\metier\\modele\\PrimePersonnel.java

package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.List;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;
import ma.co.omnidata.framework.utile.DoubleUtile;

import com.rmawatanya.convergence.application.oct.metier.valueobjects.OctPrimePersonnelVO;
import com.rmawatanya.convergence.utile.referentiel.TypeSalarie;

public class PrimePersonnel implements IEntite
{
   private long id;
   
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
   private Contrat refContrat;
   private List<SortPartPatronale> refSortPartPatronales;
   



public PrimePersonnel() 
   {
    
   }
   
  
   
	public long getId() {
	return id;
}



public void setId(long id) {
	this.id = id;
}



public Boolean getTypeCalculPrime() {
	return typeCalculPrime;
}



public void setTypeCalculPrime(Boolean typeCalculPrime) {
	this.typeCalculPrime = typeCalculPrime;
}

public TypeSalarie getRefTypeSalarie() {
	return refTypeSalarie;
}



public void setRefTypeSalarie(TypeSalarie refTypeSalarie) {
	this.refTypeSalarie = refTypeSalarie;
}



public Contrat getRefContrat() {
	return refContrat;
}



public void setRefContrat(Contrat refContrat) {
	this.refContrat = refContrat;
}



	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getEffectif() {
		return effectif;
	}

	public void setEffectif(Integer effectif) {
		this.effectif = effectif;
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
	
	public boolean isToBeRemoved() {
		if(this.effectif == null 
				&& this.refTypeSalarie == null
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
		octPrimePersonnelVO.setIdPrimePerso(String.valueOf(this.id));
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



	public List<SortPartPatronale> getRefSortPartPatronales() {
		return refSortPartPatronales;
	}



	public void setRefSortPartPatronales(
			List<SortPartPatronale> refSortPartPatronales) {
		this.refSortPartPatronales = refSortPartPatronales;
	}
}
