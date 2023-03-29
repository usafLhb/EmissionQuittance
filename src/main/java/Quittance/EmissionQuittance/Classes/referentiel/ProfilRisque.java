package Quittance.EmissionQuittance.Classes.referentiel;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class ProfilRisque implements IEntite {
	private long id;
	private Integer code;
	private String libelle;
	private Boolean reservee;
	private ModeGestion refModeGestion;

	public ProfilRisque() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Boolean getReservee() {
		return reservee;
	}

	public void setReservee(Boolean reservee) {
		this.reservee = reservee;
	}

	public ModeGestion getRefModeGestion() {
		return refModeGestion;
	}

	public void setRefModeGestion(ModeGestion refModeGestion) {
		this.refModeGestion = refModeGestion;
	}
	
	public String getDescription() {
		return code + " - " + libelle;
	}

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}
}
