package Quittance.EmissionQuittance.Classes.referentiel;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class PlafondSinistre extends ParametrageBO implements IEntite {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private Double mntLimiteSinistre;
	private String option;
	private NatureSinistre  refNaturesinistre;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Double getMntLimiteSinistre() {
		return mntLimiteSinistre;
	}
	public void setMntLimiteSinistre(Double mntLimiteSinistre) {
		this.mntLimiteSinistre = mntLimiteSinistre;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public NatureSinistre getRefNaturesinistre() {
		return refNaturesinistre;
	}
	public void setRefNaturesinistre(NatureSinistre refNaturesinistre) {
		this.refNaturesinistre = refNaturesinistre;
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