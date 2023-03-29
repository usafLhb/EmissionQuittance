package Quittance.EmissionQuittance.Classes.referentiel;

import java.util.Calendar;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class RefProduitBanque  extends ParametrageBO implements IEntite{
	
	private long id;
	private Integer code;
	private String libelle;
	private Calendar dateCreation;
	private Boolean actif;
	private RefTypeCredit refTypeCredit;

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

	public RefTypeCredit getRefTypeCredit() {
		return refTypeCredit;
	}

	public void setRefTypeCredit(RefTypeCredit refTypeCredit) {
		this.refTypeCredit = refTypeCredit;
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
