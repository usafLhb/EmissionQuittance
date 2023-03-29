package Quittance.EmissionQuittance.Classes.Contrat.modele;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.application.prd.metier.modele.Produit;

public class GarantiesPlafonds implements IEntite {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String codeFormule;
	private String codeGarantie;
	private String libelleFormule;
	private String libelleGarantie;
	private String plafond;
	private String capital;
	private String franchise;
	private Produit refProduit;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getCodeFormule() {
		return codeFormule;
	}
	public void setCodeFormule(String codeFormule) {
		this.codeFormule = codeFormule;
	}
	public String getCodeGarantie() {
		return codeGarantie;
	}
	public void setCodeGarantie(String codeGarantie) {
		this.codeGarantie = codeGarantie;
	}
	public String getLibelleFormule() {
		return libelleFormule;
	}
	public void setLibelleFormule(String libelleFormule) {
		this.libelleFormule = libelleFormule;
	}
	public String getLibelleGarantie() {
		return libelleGarantie;
	}
	public void setLibelleGarantie(String libelleGarantie) {
		this.libelleGarantie = libelleGarantie;
	}
	public String getPlafond() {
		return plafond;
	}
	public void setPlafond(String plafond) {
		this.plafond = plafond;
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
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getFranchise() {
		return franchise;
	}
	public void setFranchise(String franchise) {
		this.franchise = franchise;
	}


}
