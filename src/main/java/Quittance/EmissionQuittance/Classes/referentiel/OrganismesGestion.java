//Source file: E:\\_Abdel\\Rmawatanya\\CONVERGENCE\\MOD\\ClassesJava\\com\\rmawatanya\\convergence\\utile\\referentiel\\Activite.java

package Quittance.EmissionQuittance.Classes.referentiel;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class OrganismesGestion implements IEntite {
	private long id;
	private Integer code;
	private String libelle;

	public OrganismesGestion() {

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

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

}
