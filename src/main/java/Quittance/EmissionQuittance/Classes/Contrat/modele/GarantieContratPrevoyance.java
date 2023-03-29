package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Set;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.utile.referentiel.FormulePrevoyance;

/**
 * Classe qui d�finit les options choisies lors de la souscription d'un contrat
 * groupe du produit DIT.
 * 
 * @author elfaramo
 *
 */

public class GarantieContratPrevoyance implements IEntite {

	/** Serial version ID. */
	private static final long serialVersionUID = 1L;
	private long id;

	private Contrat contrat;
	private FormulePrevoyance formule;
	private String option;
	
	/**
	 * Garantie Obligatoire
	 */
	
	private Double ageMoyen;
	private Integer nbCollaborateur;
	private Integer nbConjoint;
	private Integer nbEnfant;
	private Double tauxCollaborateur;
	private Set<CapitalCategorieAdherent> capitalCategorieAdherents;
	private Double tauxPrimeCalculeObligatoire;

	/**
	 * Garantie Optionnelle 
	 */
	
	private Double tauxMajorationEnfant;
	private Double maxTauxMajorationEnfant;
	
	private Double tauxMajorationConjoint;
	
	private Double tauxMajorationDecesAccidentel;
	
	private Double tauxPrimeGarantieOpt;
	
	/**
	 * Invalidit�/incapacit�
	 */
	
	private Double franchiseIncInval;
	private Double maxDureeIncInval;
	
	private Double tauxPrimeInvalIncap;
	
	/**
	 * Garantie compl�mentaire
	 */
	
	private Double capitalAssure;
	
	private Double montantRente;
	
	private Double capitalFraisFuneraires;
	
	private Double tauxPrimeGarantieComplementaire;
	
	/**
	 * Liste des garanties choisies � partir du referentiel Garanties
	 */
	
	private Set<GarantiePrevoyance> garantieList;
	
	/**
	 * Taux Globaux
	 */
	
	private Boolean avecComission;
	private Double tauxPrimeTotaleCalcule;
	private Double tauxPrimeCommercial;
	
	
	/**
	 * Getters & Setters 
	 */
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Contrat getContrat() {
		return contrat;
	}
	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}
	public FormulePrevoyance getFormule() {
		return formule;
	}
	public void setFormule(FormulePrevoyance formule) {
		this.formule = formule;
	}
	public Double getAgeMoyen() {
		return ageMoyen;
	}
	public void setAgeMoyen(Double ageMoyen) {
		this.ageMoyen = ageMoyen;
	}
	public Integer getNbCollaborateur() {
		return nbCollaborateur;
	}
	public void setNbCollaborateur(Integer nbCollaborateur) {
		this.nbCollaborateur = nbCollaborateur;
	}
	public Integer getNbConjoint() {
		return nbConjoint;
	}
	public void setNbConjoint(Integer nbConjoint) {
		this.nbConjoint = nbConjoint;
	}
	public Integer getNbEnfant() {
		return nbEnfant;
	}
	public void setNbEnfant(Integer nbEnfant) {
		this.nbEnfant = nbEnfant;
	}
	public Double getTauxPrimeCommercial() {
		return tauxPrimeCommercial;
	}
	public void setTauxPrimeCommercial(Double tauxPrimeCommercial) {
		this.tauxPrimeCommercial = tauxPrimeCommercial;
	}
	public Double getMaxTauxMajorationEnfant() {
		return maxTauxMajorationEnfant;
	}
	public void setMaxTauxMajorationEnfant(Double maxTauxMajorationEnfant) {
		this.maxTauxMajorationEnfant = maxTauxMajorationEnfant;
	}
	public Double getTauxMajorationDecesAccidentel() {
		return tauxMajorationDecesAccidentel;
	}
	public void setTauxMajorationDecesAccidentel(Double tauxMajorationDecesAccidentel) {
		this.tauxMajorationDecesAccidentel = tauxMajorationDecesAccidentel;
	}
	public Double getTauxPrimeGarantieOpt() {
		return tauxPrimeGarantieOpt;
	}
	public void setTauxPrimeGarantieOpt(Double tauxPrimeGarantieOpt) {
		this.tauxPrimeGarantieOpt = tauxPrimeGarantieOpt;
	}
	public Double getFranchiseIncInval() {
		return franchiseIncInval;
	}
	public void setFranchiseIncInval(Double franchiseIncInval) {
		this.franchiseIncInval = franchiseIncInval;
	}
	public Double getMaxDureeIncInval() {
		return maxDureeIncInval;
	}
	public void setMaxDureeIncInval(Double maxDureeIncInval) {
		this.maxDureeIncInval = maxDureeIncInval;
	}
	public Double getMontantRente() {
		return montantRente;
	}
	public void setMontantRente(Double montantRente) {
		this.montantRente = montantRente;
	}

	public Double getTauxPrimeGarantieComplementaire() {
		return tauxPrimeGarantieComplementaire;
	}
	public void setTauxPrimeGarantieComplementaire(
			Double tauxPrimeGarantieComplementaire) {
		this.tauxPrimeGarantieComplementaire = tauxPrimeGarantieComplementaire;
	}
	public Set<GarantiePrevoyance> getGarantieList() {
		return garantieList;
	}
	public void setGarantieList(Set<GarantiePrevoyance> garantieList) {
		this.garantieList = garantieList;
	}
	public EntiteFactory getFactory() {
		return null;
	}
	public Boolean getAvecComission() {
		return avecComission;
	}
	public void setAvecComission(Boolean avecComission) {
		this.avecComission = avecComission;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public Double getTauxPrimeCalculeObligatoire() {
		return tauxPrimeCalculeObligatoire;
	}
	public void setTauxPrimeCalculeObligatoire(Double tauxPrimeCalculeObligatoire) {
		this.tauxPrimeCalculeObligatoire = tauxPrimeCalculeObligatoire;
	}
	public Double getTauxMajorationEnfant() {
		return tauxMajorationEnfant;
	}
	public void setTauxMajorationEnfant(Double tauxMajorationEnfant) {
		this.tauxMajorationEnfant = tauxMajorationEnfant;
	}
	public Double getTauxMajorationConjoint() {
		return tauxMajorationConjoint;
	}
	public void setTauxMajorationConjoint(Double tauxMajorationConjoint) {
		this.tauxMajorationConjoint = tauxMajorationConjoint;
	}
	public Double getTauxPrimeInvalIncap() {
		return tauxPrimeInvalIncap;
	}
	public void setTauxPrimeInvalIncap(Double tauxPrimeInvalIncap) {
		this.tauxPrimeInvalIncap = tauxPrimeInvalIncap;
	}
	public Double getCapitalAssure() {
		return capitalAssure;
	}
	public void setCapitalAssure(Double capitalAssure) {
		this.capitalAssure = capitalAssure;
	}
	public Double getCapitalFraisFuneraires() {
		return capitalFraisFuneraires;
	}
	public void setCapitalFraisFuneraires(Double capitalFraisFuneraires) {
		this.capitalFraisFuneraires = capitalFraisFuneraires;
	}
	public Double getTauxPrimeTotaleCalcule() {
		return tauxPrimeTotaleCalcule;
	}
	public void setTauxPrimeTotaleCalcule(Double tauxPrimeTotaleCalcule) {
		this.tauxPrimeTotaleCalcule = tauxPrimeTotaleCalcule;
	}
	public Set<CapitalCategorieAdherent> getCapitalCategorieAdherents() {
		return capitalCategorieAdherents;
	}
	public void setCapitalCategorieAdherents(
			Set<CapitalCategorieAdherent> capitalCategorieAdherents) {
		this.capitalCategorieAdherents = capitalCategorieAdherents;
	}
	public Double getTauxCollaborateur() {
		return tauxCollaborateur;
	}
	public void setTauxCollaborateur(Double tauxCollaborateur) {
		this.tauxCollaborateur = tauxCollaborateur;
	}
	


}
