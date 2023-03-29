package Quittance.EmissionQuittance.Classes.referentiel;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class ColonnePrecisionPossible implements IEntite {
	
	/**
	 * serial version id.
	 */
	private static final long serialVersionUID = 1L;
	
	private long id;
	
	private String libelle;
	
	private String sousLibelle;
	
	private int ordre;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EntiteFactory getFactory() {
		return null;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getSousLibelle() {
		return sousLibelle;
	}

	public void setSousLibelle(String sousLibelle) {
		this.sousLibelle = sousLibelle;
	}

	public int getOrdre() {
		return ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}

}
