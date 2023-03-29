package Quittance.EmissionQuittance.Classes.referentiel;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class AssocClasseActiviteGarantie extends ParametrageBO implements	IEntite {
	
	private long id;	
	private Garantie refGarantie;
	private Activite refActivite;
	private ClasseActivite refClasseActivite;
	private Boolean avecDelegation; 
	
	public AssocClasseActiviteGarantie() {

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

	

	public Garantie getRefGarantie() {
		return refGarantie;
	}

	public void setRefGarantie(Garantie refGarantie) {
		this.refGarantie = refGarantie;
	}

	public ClasseActivite getRefClasseActivite() {
		return refClasseActivite;
	}

	public void setRefClasseActivite(ClasseActivite refClasseActivite) {
		this.refClasseActivite = refClasseActivite;
	}

	
	public Boolean getAvecDelegation() {
		return avecDelegation;
	}

	public void setAvecDelegation(Boolean avecDelegation) {
		this.avecDelegation = avecDelegation;
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
		return this.refGarantie.getLibelle();
	}

}
