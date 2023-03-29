package Quittance.EmissionQuittance.Classes.referentiel;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class FormulePrevoyance implements IEntite {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id;
	
	private String code;
	
	private String libelle;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EntiteFactory getFactory() {
		return null;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
