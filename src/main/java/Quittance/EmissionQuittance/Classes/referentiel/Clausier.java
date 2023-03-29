package Quittance.EmissionQuittance.Classes.referentiel;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.application.prd.metier.modele.Produit;

public class Clausier extends ParametrageBO implements IEntite {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private Integer code;
	private String libelle;
	private String libelle_Ar;
	private String titre;
	private String titre_Ar;
	private Produit refProduit;
	private String garantie;
	private String garantie_Ar;

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
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

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Produit getRefProduit() {
		return refProduit;
	}

	public void setRefProduit(Produit refProduit) {
		this.refProduit = refProduit;
	}

	public String getGarantie() {
		return garantie;
	}

	public void setGarantie(String garantie) {
		this.garantie = garantie;
	}

	public String getLibelle_Ar() {
		return libelle_Ar;
	}

	public void setLibelle_Ar(String libelle_Ar) {
		this.libelle_Ar = libelle_Ar;
	}

	public String getTitre_Ar() {
		return titre_Ar;
	}

	public void setTitre_Ar(String titre_Ar) {
		this.titre_Ar = titre_Ar;
	}

	public String getGarantie_Ar() {
		return garantie_Ar;
	}

	public void setGarantie_Ar(String garantie_Ar) {
		this.garantie_Ar = garantie_Ar;
	}

}
