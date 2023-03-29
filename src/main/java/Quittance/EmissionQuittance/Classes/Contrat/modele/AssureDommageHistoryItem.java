package Quittance.EmissionQuittance.Classes.Contrat.modele;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.historique.HistoryItem;

import com.rmawatanya.convergence.application.prd.metier.modele.Option;
import com.rmawatanya.convergence.utile.referentiel.Specialite;

public class AssureDommageHistoryItem extends HistoryItem {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long id;	
	
	private String nom;
	private String prenom;
	private String cin;
	private Double prime;
	private Double salaire;
	private Double capitalChoisi;
	
	private GarantieDommageHistoryItem refGarantieDommageHistoryItem;	
	private Specialite refSpecialite;	
	private Option refOption;

	

	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getCin() {
		return cin;
	}



	public void setCin(String cin) {
		this.cin = cin;
	}



	public Double getPrime() {
		return prime;
	}



	public void setPrime(Double prime) {
		this.prime = prime;
	}



	public Double getSalaire() {
		return salaire;
	}



	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}



	public GarantieDommageHistoryItem getRefGarantieDommageHistoryItem() {
		return refGarantieDommageHistoryItem;
	}



	public void setRefGarantieDommageHistoryItem(
			GarantieDommageHistoryItem refGarantieDommageHistoryItem) {
		this.refGarantieDommageHistoryItem = refGarantieDommageHistoryItem;
	}



	public Specialite getRefSpecialite() {
		return refSpecialite;
	}



	public void setRefSpecialite(Specialite refSpecialite) {
		this.refSpecialite = refSpecialite;
	}



	public Option getRefOption() {
		return refOption;
	}



	public void setRefOption(Option refOption) {
		this.refOption = refOption;
	}

	

	public Double getCapitalChoisi() {
		return capitalChoisi;
	}



	public void setCapitalChoisi(Double capitalChoisi) {
		this.capitalChoisi = capitalChoisi;
	}



	public EntiteFactory getFactory() {
		return null;
	}

}
