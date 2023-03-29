package Quittance.EmissionQuittance.Classes.referentiel;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class TypePrestationDommage  extends ParametrageBO implements IEntite {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String code;
	private String libelle;
	private String libelle_Ar;
	private String typePrestation;
	
	
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
	public String getTypePrestation() {
		return typePrestation;
	}
	public void setTypePrestation(String typePrestation) {
		this.typePrestation = typePrestation;
	}
	

	public EntiteFactory getFactory() {
		return null;
	}

	public String getDescription() {
		return code + " - " + libelle;
	}
	public String getLibelle_Ar() {
		return libelle_Ar;
	}
	public void setLibelle_Ar(String libelle_Ar) {
		this.libelle_Ar = libelle_Ar;
	}
	
	


}
