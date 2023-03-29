package Quittance.EmissionQuittance.Classes.referentiel;

import java.util.Collection;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class Honoraire extends ParametrageBO implements IEntite{
	
	private long id;
	private Integer code;
	private String libelle;
	private Double montant;
	private Collection refPrestataireService;
	
	public Collection getRefPrestataireService() {
		return refPrestataireService;
	}
	public void setRefPrestataireService(Collection refPrestataireService) {
		this.refPrestataireService = refPrestataireService;
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
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public String getDescription() {

		return null;
	}
	public EntiteFactory getFactory() {

		return null;
	}
	

}
