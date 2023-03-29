package Quittance.EmissionQuittance.Classes.referentiel;

import com.rmawatanya.convergence.application.prd.metier.modele.VersionCommercialeProduit;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;
/**
 * 
 *  TypeModeFinancement
 *  
 *  CODE: 1 --> LIBELLE: Client  
 *  CODE: 2 --> LIBELLE: Banque
 *  
 * 	@author M.BERR
 *	@Date 	2 mars 11
 */
public class TypeModeFinancement implements IEntite {

	private static final long serialVersionUID = 4449202458992900101L;
	
	private long id;
	private Integer code;
	private String libelle;
	private VersionCommercialeProduit refVersionCommerciale;
	
	/**
	 * 
	 * Constructeur
	 */
	public TypeModeFinancement() {
		super();
	}

	
	public Integer getCode() {
		return code;
	}

	/**
	 * 
	 * @param code
	 */
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
		
		return null;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
	
}
