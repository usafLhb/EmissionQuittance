package Quittance.EmissionQuittance.Classes.referentiel;

import com.rmawatanya.convergence.application.prd.metier.modele.Produit;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

@SuppressWarnings("serial")
public class Franchise extends ParametrageBO implements IEntite {
	
	
	private long id;
	private Integer valeurFranchise;
	private String libelle;
	private Produit refProduit;

	public Franchise() {

	}

	public long getId() {
		return id;
	}

	public void setId(long aId) {
		id = aId;
	}

	public Integer getValeurFranchise() {
		return valeurFranchise;
	}

	public void setValeurFranchise(Integer valeurFranchise) {
		this.valeurFranchise = valeurFranchise;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Produit getRefProduit() {
		return refProduit;
	}

	public void setRefProduit(Produit refProduit) {
		this.refProduit = refProduit;
	}

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return id + " - " + libelle;
	}

}
