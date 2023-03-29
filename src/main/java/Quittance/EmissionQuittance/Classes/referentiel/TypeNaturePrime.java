/**
 * 
 */
package Quittance.EmissionQuittance.Classes.referentiel;

import com.rmawatanya.convergence.application.prd.metier.modele.VersionCommercialeProduit;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

/**
 *  TypeNaturePrime
 *  
 * 	@author M.BERR
 *	@Date 	2 mars 11
 */
public class TypeNaturePrime implements IEntite {
	
	private static final long serialVersionUID = -5909874344343872126L;
	
	private long id;
	private Integer code;
	private String libelle;
	private String libelleAr; // libelle traduit en arabe
	private VersionCommercialeProduit refVersionCommerciale;
	
	/**
	 * Constructeur
	 */
	public TypeNaturePrime() {
		super();
	}

	/**
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		return null;
	}

	/**
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getId()
	 */
	public long getId() {
		return this.id;
	}

	/**
	 * @see ma.co.omnidata.framework.services.entites.IEntite#setId(long)
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the code
	 */
	public Integer getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(Integer code) {
		this.code = code;
	}

	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * return the type description
	 * @return
	 */
	public String getDescription() {
		return code + " - " + libelle;
	}

	public VersionCommercialeProduit getRefVersionCommerciale() {
		return refVersionCommerciale;
	}

	public void setRefVersionCommerciale(VersionCommercialeProduit refVersionCommerciale) {
		this.refVersionCommerciale = refVersionCommerciale;
	}

	public String getLibelleAr() {
		return libelleAr;
	}

	public void setLibelleAr(String libelleAr) {
		this.libelleAr = libelleAr;
	}
	
}
