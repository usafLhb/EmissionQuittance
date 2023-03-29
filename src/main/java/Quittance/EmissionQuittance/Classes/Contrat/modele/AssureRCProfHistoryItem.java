package Quittance.EmissionQuittance.Classes.Contrat.modele;

import ma.co.omnidata.framework.services.historique.HistoryItem;

import com.rmawatanya.convergence.application.prd.metier.modele.Option;
import com.rmawatanya.convergence.utile.referentiel.Specialite;

public class AssureRCProfHistoryItem extends HistoryItem {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String nom;
	private String prenom;
	private String cin;
	private Specialite refSpecialite;
	private PartieDommagesHistoryItem refPartieDommagesHistoryItem;
	
	private Double prime;
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
	public Specialite getRefSpecialite() {
		return refSpecialite;
	}
	public void setRefSpecialite(Specialite refSpecialite) {
		this.refSpecialite = refSpecialite;
	}
	
	
	public Double getPrime() {
		return prime;
	}
	public void setPrime(Double prime) {
		this.prime = prime;
	}
	public Option getRefOption() {
		return refOption;
	}
	public void setRefOption(Option refOption) {
		this.refOption = refOption;
	}
	/**
	 * @return the refPartieDommagesHistoryItem
	 */
	public PartieDommagesHistoryItem getRefPartieDommagesHistoryItem() {
		return refPartieDommagesHistoryItem;
	}
	/**
	 * @param refPartieDommagesHistoryItem the refPartieDommagesHistoryItem to set
	 */
	public void setRefPartieDommagesHistoryItem(
			PartieDommagesHistoryItem refPartieDommagesHistoryItem) {
		this.refPartieDommagesHistoryItem = refPartieDommagesHistoryItem;
	}
	
	
	
	
	
}
