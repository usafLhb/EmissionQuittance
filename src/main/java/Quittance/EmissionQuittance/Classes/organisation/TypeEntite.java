package Quittance.EmissionQuittance.Classes.organisation;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class TypeEntite extends ParametrageBO implements IEntite {

	private long id;
	private Integer code;
	private String libelle;
	private Societe refSociete;

	public TypeEntite() {

	}

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
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

	/**
	 * Access method for the code property.
	 * 
	 * @return the current value of the code property
	 */
	public Integer getCode() {
		return code;
	}

	/**
	 * Sets the value of the code property.
	 * 
	 * @param aId
	 *            the new value of the code property
	 */
	public void setCode(Integer code) {
		this.code = code;
	}

	/**
	 * Access method for the libelle property.
	 * 
	 * @return the current value of the libelle property
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Sets the value of the libelle property.
	 * 
	 * @param aId
	 *            the new value of the libelle property
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Societe getRefSociete() {
		return refSociete;
	}

	public void setRefSociete(Societe refSociete) {
		this.refSociete = refSociete;
	}

}
