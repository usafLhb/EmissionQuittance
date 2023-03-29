package Quittance.EmissionQuittance.Classes.referentiel;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.application.prd.metier.modele.Produit;

public class ProduitProfilRisqueSupport implements IEntite {
	private long id;
	private Double pourcentage;
	private Produit refProduit;
	private ProfilRisque refProfilRisque;
	private Support refSupport;

	public ProduitProfilRisqueSupport() {

	}

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Double getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(Double pourcentage) {
		this.pourcentage = pourcentage;
	}

	public Produit getRefProduit() {
		return refProduit;
	}

	public void setRefProduit(Produit refProduit) {
		this.refProduit = refProduit;
	}

	public ProfilRisque getRefProfilRisque() {
		return refProfilRisque;
	}

	public void setRefProfilRisque(ProfilRisque refProfilRisque) {
		this.refProfilRisque = refProfilRisque;
	}

	public Support getRefSupport() {
		return refSupport;
	}

	public void setRefSupport(Support refSupport) {
		this.refSupport = refSupport;
	}
}
