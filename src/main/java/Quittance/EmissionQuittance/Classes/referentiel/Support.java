package Quittance.EmissionQuittance.Classes.referentiel;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class Support implements IEntite {
	
	private static final long	serialVersionUID	= 1L;
	private long id;
	private Integer code;
	private String libelle;
	private String codeExterne;
	private Calendar dateDebut;
	private Calendar datefin;
	private Double soldeMinimumConserver;
	private String decisionArbitrage;
	private CategorieSupport refCategorieSupport;
	private Boolean monitaire ;

	public Boolean getMonitaire() {
		return monitaire;
	}

	public void setMonitaire(Boolean monitaire) {
		this.monitaire = monitaire;
	}

	public CategorieSupport getRefCategorieSupport() {
		return refCategorieSupport;
	}

	public void setRefCategorieSupport(CategorieSupport refCategorieSupport) {
		this.refCategorieSupport = refCategorieSupport;
	}

	public String getCodeExterne() {
		return codeExterne;
	}

	public void setCodeExterne(String codeExterne) {
		this.codeExterne = codeExterne;
	}

	public Calendar getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Calendar dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Calendar getDatefin() {
		return datefin;
	}

	public void setDatefin(Calendar datefin) {
		this.datefin = datefin;
	}

	public Double getSoldeMinimumConserver() {
		return soldeMinimumConserver;
	}

	public void setSoldeMinimumConserver(Double soldeMinimumConserver) {
		this.soldeMinimumConserver = soldeMinimumConserver;
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
	
	public String getDescription() {
		return code + " - " + libelle;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public EntiteFactory getFactory() {
		return null;
	}

	/**
	 * @return the decisionArbitrage
	 */
	public String getDecisionArbitrage() {
		return decisionArbitrage;
	}

	/**
	 * @param decisionArbitrage the decisionArbitrage to set
	 */
	public void setDecisionArbitrage(String decisionArbitrage) {
		this.decisionArbitrage = decisionArbitrage;
	}

}