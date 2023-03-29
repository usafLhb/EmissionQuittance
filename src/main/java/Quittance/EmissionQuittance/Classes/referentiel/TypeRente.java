package Quittance.EmissionQuittance.Classes.referentiel;

import java.math.BigDecimal;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class TypeRente implements IEntite {
	private static final long serialVersionUID = 1L;
	private long id;
	private String code;
	private String libelle;
	private Integer duree;
	private BigDecimal tauxReversion;

	public EntiteFactory getFactory() {
		return null;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Integer getDuree() {
		return duree;
	}

	public void setDuree(Integer duree) {
		this.duree = duree;
	}

	public BigDecimal getTauxReversion() {
		return tauxReversion;
	}

	public void setTauxReversion(BigDecimal tauxReversion) {
		this.tauxReversion = tauxReversion;
	}
	
}
