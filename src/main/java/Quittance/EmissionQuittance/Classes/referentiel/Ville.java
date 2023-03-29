//Source file: E:\\_Abdel\\Rmawatanya\\CONVERGENCE\\MOD\\ClassesJava\\com\\rmawatanya\\convergence\\utile\\referentiel\\Ville.java

package Quittance.EmissionQuittance.Classes.referentiel;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class Ville extends ParametrageBO implements IEntite {
	private long id;
	private Integer code;
	private String libelle;
	
	private Integer zoneSismique;
	private Integer zoneInnondation;
	
	private Pays refPays;

	public Ville() {

	}

	public long getId() {
		return id;
	}

	public void setId(long aId) {
		id = aId;
	}

	public String getDescription() {
		return code + " - " + libelle;
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

	public Pays getRefPays() {
		return refPays;
	}

	public void setRefPays(Pays refPays) {
		this.refPays = refPays;
	}

	
	public Integer getZoneSismique() {
		return zoneSismique;
	}

	public void setZoneSismique(Integer zoneSismique) {
		this.zoneSismique = zoneSismique;
	}

	public Integer getZoneInnondation() {
		return zoneInnondation;
	}

	public void setZoneInnondation(Integer zoneInnondation) {
		this.zoneInnondation = zoneInnondation;
	}

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

}
