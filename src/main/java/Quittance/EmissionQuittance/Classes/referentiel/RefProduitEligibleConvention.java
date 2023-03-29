package Quittance.EmissionQuittance.Classes.referentiel;

import java.util.Calendar;

import com.rmawatanya.convergence.application.prd.metier.modele.VersionCommercialeProduit;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class RefProduitEligibleConvention  extends ParametrageBO implements IEntite{
	
	private long id;
	private Boolean eligible;
	private Double capitalAssureMax;
	private Integer dureeMax;
	private RefProduitBanque refProduitBanque;   
	private RefConvention refConvention;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Boolean getEligible() {
		return eligible;
	}

	public void setEligible(Boolean eligible) {
		this.eligible = eligible;
	}

	public Double getCapitalAssureMax() {
		return capitalAssureMax;
	}

	public void setCapitalAssureMax(Double capitalAssureMax) {
		this.capitalAssureMax = capitalAssureMax;
	}

	public Integer getDureeMax() {
		return dureeMax;
	}

	public void setDureeMax(Integer dureeMax) {
		this.dureeMax = dureeMax;
	}

	public RefProduitBanque getRefProduitBanque() {
		return refProduitBanque;
	}

	public void setRefProduitBanque(RefProduitBanque refProduitBanque) {
		this.refProduitBanque = refProduitBanque;
	}

	public RefConvention getRefConvention() {
		return refConvention;
	}

	public void setRefConvention(RefConvention refConvention) {
		this.refConvention = refConvention;
	}

	@Override
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

}
