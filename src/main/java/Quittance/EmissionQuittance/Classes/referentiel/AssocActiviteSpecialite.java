package Quittance.EmissionQuittance.Classes.referentiel;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class AssocActiviteSpecialite extends ParametrageBO implements	IEntite {
	private long id;
	private Activite refActivite;
	private Specialite refSpecialite;
	
	public AssocActiviteSpecialite() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	

	public Activite getRefActivite() {
		return refActivite;
	}

	public void setRefActivite(Activite refActivite) {
		this.refActivite = refActivite;
	}

	public Specialite getRefSpecialite() {
		return refSpecialite;
	}

	public void setRefSpecialite(Specialite refSpecialite) {
		this.refSpecialite = refSpecialite;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescription() {		
		return this.refSpecialite.getLibelle();
	}

}
