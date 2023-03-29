package Quittance.EmissionQuittance.Classes.referentiel;

import java.util.Calendar;

import com.rmawatanya.convergence.application.prd.metier.modele.VersionCommercialeProduit;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class RefConvention extends ParametrageBO implements IEntite {
	
	private long id;
	private Integer code;
	private String libelle;
	private Calendar dateCreation;
	private Calendar dateDebut;
	private Calendar dateFin;
	private Double primeMinimale;
	private Boolean active;
	private VersionCommercialeProduit refVersionCommercialeProduit;   
	private RefTypeConvention refTypeConvention;

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

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Double getPrimeMinimale() {
		return primeMinimale;
	}

	public void setPrimeMinimale(Double primeMinimale) {
		this.primeMinimale = primeMinimale;
	}

	public Calendar getDateCreation() {
		return dateCreation;
	}

	public Calendar getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Calendar dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Calendar getDateFin() {
		return dateFin;
	}

	public void setDateFin(Calendar dateFin) {
		this.dateFin = dateFin;
	}

	public void setDateCreation(Calendar dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public VersionCommercialeProduit getRefVersionCommercialeProduit() {
		return refVersionCommercialeProduit;
	}

	public RefTypeConvention getRefTypeConvention() {
		return refTypeConvention;
	}

	public void setRefTypeConvention(RefTypeConvention refTypeConvention) {
		this.refTypeConvention = refTypeConvention;
	}

	public void setRefVersionCommercialeProduit(VersionCommercialeProduit refVersionCommercialeProduit) {
		this.refVersionCommercialeProduit = refVersionCommercialeProduit;
	}

	@Override
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
