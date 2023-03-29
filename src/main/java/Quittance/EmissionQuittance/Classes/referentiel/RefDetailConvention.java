package Quittance.EmissionQuittance.Classes.referentiel;

import java.util.Calendar;

import com.rmawatanya.convergence.application.prd.metier.modele.Option;
import com.rmawatanya.convergence.application.prd.metier.modele.VersionCommercialeProduit;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class RefDetailConvention  extends ParametrageBO implements IEntite {
	
	private long id;
	private String libelle;
	private Calendar dateCreation;
	private Boolean actif;
	private Double Rabais;
	private RefConvention refConvention;   
	private Option refOption;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Calendar getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Calendar dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Boolean getActif() {
		return actif;
	}
	public void setActif(Boolean actif) {
		this.actif = actif;
	}
	public Double getRabais() {
		return Rabais;
	}
	public void setRabais(Double rabais) {
		Rabais = rabais;
	}
	public RefConvention getRefConvention() {
		return refConvention;
	}
	public void setRefConvention(RefConvention refConvention) {
		this.refConvention = refConvention;
	}
	public Option getRefOption() {
		return refOption;
	}
	public void setRefOption(Option refOption) {
		this.refOption = refOption;
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
