package Quittance.EmissionQuittance.Classes.Contrat.modele;

import com.rmawatanya.convergence.application.prd.metier.modele.GarantieFormule;
import com.rmawatanya.convergence.utile.referentiel.Garantie;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class GarantiePrevoyance implements IEntite {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String type;
	private Double taux;
	private Double prime;
	private Garantie refGarantie;
	private GarantieFormule refGarantieFormule;
	private PartiePrevoyance refPartiePrevoyance;
	
	
	public GarantiePrevoyance(){
		
	}
	

	public GarantiePrevoyance(String type, Double taux, Double prime, Garantie refGarantie,
			GarantieFormule refGarantieFormule, PartiePrevoyance refPartiePrevoyance) {
		super();
		this.type = type;
		this.taux = taux;
		this.prime = prime;
		this.refGarantie = refGarantie;
		this.refGarantieFormule = refGarantieFormule;
		this.refPartiePrevoyance = refPartiePrevoyance;
	}


	public EntiteFactory getFactory() {
		return null;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}



	public Garantie getRefGarantie() {
		return refGarantie;
	}


	public void setRefGarantie(Garantie refGarantie) {
		this.refGarantie = refGarantie;
	}

	public Double getTaux() {
		return taux;
	}

	public void setTaux(Double taux) {
		this.taux = taux;
	}


	public Double getPrime() {
		return prime;
	}


	public void setPrime(Double prime) {
		this.prime = prime;
	}


	public GarantieFormule getRefGarantieFormule() {
		return refGarantieFormule;
	}


	public void setRefGarantieFormule(GarantieFormule refGarantieFormule) {
		this.refGarantieFormule = refGarantieFormule;
	}


	public PartiePrevoyance getRefPartiePrevoyance() {
		return refPartiePrevoyance;
	}


	public void setRefPartiePrevoyance(PartiePrevoyance refPartiePrevoyance) {
		this.refPartiePrevoyance = refPartiePrevoyance;
	}


}
