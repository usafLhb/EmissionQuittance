package Quittance.EmissionQuittance.Classes.Produit.modele;

import java.util.Calendar;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.utile.habilitations.Utilisateur;
import com.rmawatanya.convergence.utile.referentiel.Franchise;
import com.rmawatanya.convergence.utile.referentiel.Garantie;

public class GarantieFormule extends ParametrageBO implements IEntite {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id;
	private Garantie refGarantie;
	private Formule refFormule;
	
	private Double minValeurContenu;
	private Double maxValeurContenu;
	
	private Double minValeurBatiment;
	private Double maxValeurBatiment;
	private Double primeMinimale;
	private String typeChoixGarantie;
	
	private Integer ordre;
	private Calendar dateAjout;
	private Calendar dateDerniereModification;
	private Utilisateur refUtilisateurAjout;
	private Utilisateur refUtilisateurModification;
	private Double capital;
	private Double pourcentagePrime;
	private Double tauxVentilation;;
	private Franchise refFranchise;
	private Integer optionPF;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	

	public Garantie getRefGarantie() {
		return refGarantie;
	}
	public void setRefGarantie(Garantie refGarantie) {
		this.refGarantie = refGarantie;
	}
	public Formule getRefFormule() {
		return refFormule;
	}
	public void setRefFormule(Formule refFormule) {
		this.refFormule = refFormule;
	}
	
	
	public EntiteFactory getFactory() {
		return null;
	}
	
	public String getDescription() {
		return refGarantie.getLibelle();
	}
	
	public String getTypeChoixGarantie() {
		return typeChoixGarantie;
	}
	public void setTypeChoixGarantie(String typeChoixGarantie) {
		this.typeChoixGarantie = typeChoixGarantie;
	}
	public Double getMinValeurContenu() {
		return minValeurContenu;
	}
	public void setMinValeurContenu(Double minValeurContenu) {
		this.minValeurContenu = minValeurContenu;
	}
	public Double getMaxValeurContenu() {
		return maxValeurContenu;
	}
	public void setMaxValeurContenu(Double maxValeurContenu) {
		this.maxValeurContenu = maxValeurContenu;
	}
	public Double getMinValeurBatiment() {
		return minValeurBatiment;
	}
	public void setMinValeurBatiment(Double minValeurBatiment) {
		this.minValeurBatiment = minValeurBatiment;
	}
	public Double getMaxValeurBatiment() {
		return maxValeurBatiment;
	}
	public void setMaxValeurBatiment(Double maxValeurBatiment) {
		this.maxValeurBatiment = maxValeurBatiment;
	}
	public Integer getOrdre() {
		return ordre;
	}
	public void setOrdre(Integer ordre) {
		this.ordre = ordre;
	}
	public Double getPrimeMinimale() {
		return primeMinimale;
	}
	public void setPrimeMinimale(Double primeMinimale) {
		this.primeMinimale = primeMinimale;
	}
	public Calendar getDateAjout() {
		return dateAjout;
	}
	public void setDateAjout(Calendar dateAjout) {
		this.dateAjout = dateAjout;
	}
	public Calendar getDateDerniereModification() {
		return dateDerniereModification;
	}
	public void setDateDerniereModification(Calendar dateDerniereModification) {
		this.dateDerniereModification = dateDerniereModification;
	}
	public Utilisateur getRefUtilisateurAjout() {
		return refUtilisateurAjout;
	}
	public void setRefUtilisateurAjout(Utilisateur refUtilisateurAjout) {
		this.refUtilisateurAjout = refUtilisateurAjout;
	}
	public Utilisateur getRefUtilisateurModification() {
		return refUtilisateurModification;
	}
	public void setRefUtilisateurModification(Utilisateur refUtilisateurModification) {
		this.refUtilisateurModification = refUtilisateurModification;
	}
	public Double getCapital() {
		return capital;
	}
	public void setCapital(Double capital) {
		this.capital = capital;
	}
	public Double getPourcentagePrime() {
		return pourcentagePrime;
	}
	public void setPourcentagePrime(Double pourcentagePrime) {
		this.pourcentagePrime = pourcentagePrime;
	}
	public Franchise getRefFranchise() {
		return refFranchise;
	}
	public void setRefFranchise(Franchise refFranchise) {
		this.refFranchise = refFranchise;
	}
	public Integer getOptionPF() {
		return optionPF;
	}
	public void setOptionPF(Integer optionPF) {
		this.optionPF = optionPF;
	}
	public Double getTauxVentilation() {
		return tauxVentilation;
	}
	public void setTauxVentilation(Double tauxVentilation) {
		this.tauxVentilation = tauxVentilation;
	}
	
	
}
