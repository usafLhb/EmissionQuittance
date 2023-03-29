package Quittance.EmissionQuittance.Classes.Produit.modele;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.utile.referentiel.Garantie;

public class VentillationOption implements IEntite {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id;
	private Double pourcentage;
	private Garantie refGarantie;
	private Option refOption;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public Double getPourcentage() {
		return pourcentage;
	}
	public void setPourcentage(Double pourcentage) {
		this.pourcentage = pourcentage;
	}
	public Garantie getRefGarantie() {
		return refGarantie;
	}
	public void setRefGarantie(Garantie refGarantie) {
		this.refGarantie = refGarantie;
	}
	public Option getRefOption() {
		return refOption;
	}
	public void setRefOption(Option refOption) {
		this.refOption = refOption;
	}
	
	public EntiteFactory getFactory() {
		return null;
	}
	
	
	

}
