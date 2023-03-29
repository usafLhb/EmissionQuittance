package Quittance.EmissionQuittance.Classes.referentiel;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class ObjetMission extends ParametrageBO implements IEntite{

	
	private long id;
	private String code;
	private String libelle;
	private String typePrestataire;
	
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
	
	public String getTypePrestataire() {
		return typePrestataire;
	}
	public void setTypePrestataire(String typePrestataire) {
		this.typePrestataire = typePrestataire;
	}
	@Override
	public EntiteFactory getFactory() {
		return null;
	}
	@Override
	public String getDescription() {
		return code + " - " + libelle;
	}



}
