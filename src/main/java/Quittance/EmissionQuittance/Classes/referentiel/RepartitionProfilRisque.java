package Quittance.EmissionQuittance.Classes.referentiel;


import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.application.prd.metier.modele.Produit;

public class RepartitionProfilRisque implements IEntite {
	private long id;
	private Double pourcentage;
	private ProfilRisque refProfilRisque;
	private Produit refProduit;

	public RepartitionProfilRisque() {

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

	public ProfilRisque getRefProfilRisque() {
		return refProfilRisque;
	}

	public void setRefProfilRisque(ProfilRisque refProfilRisque) {
		this.refProfilRisque = refProfilRisque;
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
}
