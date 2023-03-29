
package Quittance.EmissionQuittance.Classes.referentiel;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class ParametresRentes extends ParametrageBO implements IEntite {

	private static final long serialVersionUID = 1L;
	
	private long id;

	private Double fraisArrerage;

	private Double tauxTechnique;
	
	private Integer frequence;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Double getFraisArrerage() {
		return fraisArrerage;
	}

	public void setFraisArrerage(Double fraisArrerage) {
		this.fraisArrerage = fraisArrerage;
	}

	public Double getTauxTechnique() {
		return tauxTechnique;
	}

	public void setTauxTechnique(Double tauxTechnique) {
		this.tauxTechnique = tauxTechnique;
	}

	


	public Integer getFrequence() {
		return frequence;
	}

	public void setFrequence(Integer afrequence) {
		frequence = afrequence;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean equals(Object obj) {
		if(this.getId()==((ParametresRentes)obj).getId()){
			return true;
		}
			return false;
	}
	

	
	

	

}
