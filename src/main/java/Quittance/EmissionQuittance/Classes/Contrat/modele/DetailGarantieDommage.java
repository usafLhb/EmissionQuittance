package Quittance.EmissionQuittance.Classes.Contrat.modele;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.application.prd.metier.modele.PrestationFormule;

public class DetailGarantieDommage implements IEntite {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long id;
	private PrestationFormule refPrestationFormule;
	private GarantieDommage refGarantieDommage;
	private Double tauxPropose;
	private Double tauxTarif;
	
	private Double capital;
	private Double capitalMax;
	private Boolean active;
	
	private Double prime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public PrestationFormule getRefPrestationFormule() {
		return refPrestationFormule;
	}

	public void setRefPrestationFormule(PrestationFormule refPrestationFormule) {
		this.refPrestationFormule = refPrestationFormule;
	}

	public GarantieDommage getRefGarantieDommage() {
		return refGarantieDommage;
	}

	public void setRefGarantieDommage(GarantieDommage refGarantieDommage) {
		this.refGarantieDommage = refGarantieDommage;
	}

	public Double getTauxPropose() {
		return tauxPropose;
	}

	public void setTauxPropose(Double tauxPropose) {
		this.tauxPropose = tauxPropose;
	}

	public Double getCapital() {
		return capital;
	}

	public void setCapital(Double capital) {
		this.capital = capital;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	
	public Double getTauxTarif() {
		return tauxTarif;
	}

	public void setTauxTarif(Double tauxTarif) {
		this.tauxTarif = tauxTarif;
	}

	public Double getPrime() {
		return prime;
	}

	public void setPrime(Double prime) {
		this.prime = prime;
	}

	
	public Double getCapitalMax() {
		return capitalMax;
	}

	public void setCapitalMax(Double capitalMax) {
		this.capitalMax = capitalMax;
	}

	public EntiteFactory getFactory() {
		return null;
	}

}
