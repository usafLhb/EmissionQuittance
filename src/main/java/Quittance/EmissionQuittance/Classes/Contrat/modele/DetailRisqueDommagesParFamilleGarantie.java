package Quittance.EmissionQuittance.Classes.Contrat.modele;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.utile.referentiel.FamilleGarantie;

public class DetailRisqueDommagesParFamilleGarantie extends ParametrageBO implements IEntite {

	// Champs communs

	private RisqueDommages refRisque;

	private FamilleGarantie refFamilleGarantie;

	private Double prime;

	public String getDescription() {
		// TODO Auto-generated method stub
		return "";
	}

	public RisqueDommages getRefRisque() {
		return refRisque;
	}

	public void setRefRisque(RisqueDommages refRisque) {
		this.refRisque = refRisque;
	}

	public FamilleGarantie getRefFamilleGarantie() {
		return refFamilleGarantie;
	}

	public void setRefFamilleGarantie(FamilleGarantie refFamilleGarantie) {
		this.refFamilleGarantie = refFamilleGarantie;
	}

	public Double getPrime() {
		return prime;
	}

	public void setPrime(Double prime) {
		this.prime = prime;
	}

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setId(long id) {
		// TODO Auto-generated method stub
		
	}

}
