package Quittance.EmissionQuittance.Classes.Produit.modele;

import java.util.Calendar;
import java.util.Collection;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.utile.habilitations.Utilisateur;

public class Formule extends ParametrageBO implements IEntite {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String code;
	private String libelle;
	private Boolean modulable;
	private ParametresDommages refParametrageDommages;
	private VersionCommercialeProduit refVersionCommercialeProduit;
	private Collection refGaranties;
	
	private Integer minGarantiesOptionnelles;
	
	private Double minValeurContenu;
	private Double maxValeurContenu;
	
	private Double minValeurBatiment;
	private Double maxValeurBatiment;
	private Calendar dateAjout;
	private Calendar dateDerniereModification;
	private Utilisateur refUtilisateurAjout;
	private Utilisateur refUtilisateurModification;
	private ParametresPrevoyance refParametragePrevoyance;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}	
	public void setModulable(Boolean modulable) {
		this.modulable = modulable;
	}
	public ParametresDommages getRefParametrageDommages() {
		return refParametrageDommages;
	}
	public void setRefParametrageDommages(ParametresDommages refParametrageDommages) {
		this.refParametrageDommages = refParametrageDommages;
	}
		

	public Collection getRefGaranties() {
		return refGaranties;
	}
	public void setRefGaranties(Collection refGaranties) {
		this.refGaranties = refGaranties;
	}
	public Boolean getModulable() {
		return modulable;
	}
	public EntiteFactory getFactory() {
		return null;
	}
	
	public String getDescription() {
		return code + " - " + libelle;
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
	public Integer getMinGarantiesOptionnelles() {
		return minGarantiesOptionnelles;
	}
	public void setMinGarantiesOptionnelles(Integer minGarantiesOptionnelles) {
		this.minGarantiesOptionnelles = minGarantiesOptionnelles;
	}
	public VersionCommercialeProduit getRefVersionCommercialeProduit() {
		return refVersionCommercialeProduit;
	}
	public void setRefVersionCommercialeProduit(
			VersionCommercialeProduit refVersionCommercialeProduit) {
		this.refVersionCommercialeProduit = refVersionCommercialeProduit;
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
	public ParametresPrevoyance getRefParametragePrevoyance() {
		return refParametragePrevoyance;
	}
	public void setRefParametragePrevoyance(ParametresPrevoyance refParametragePrevoyance) {
		this.refParametragePrevoyance = refParametragePrevoyance;
	}
	
	
}
