package Quittance.EmissionQuittance.Classes.habilitations;

import java.util.ArrayList;
import java.util.List;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.utile.referentiel.TypePrestation;

public class Ordonnancement implements IEntite {

	private long id;
	private String code;
	private String libelle;

	private TypePrestation refTypePrestation;
	private Double montantOrdonnancement;
	private Double montantSeuilAcceptation;

	private List<DetailOrdonnancement> refsDetailsOrdonnancement = new ArrayList<DetailOrdonnancement>();
	
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

	public TypePrestation getRefTypePrestation() {
		return refTypePrestation;
	}

	public void setRefTypePrestation(TypePrestation refTypePrestation) {
		this.refTypePrestation = refTypePrestation;
	}

	public Double getMontantOrdonnancement() {
		return montantOrdonnancement;
	}

	public void setMontantOrdonnancement(Double montantOrdonnancement) {
		this.montantOrdonnancement = montantOrdonnancement;
	}

	public Double getMontantSeuilAcceptation() {
		return montantSeuilAcceptation;
	}

	public void setMontantSeuilAcceptation(Double montantSeuilAcceptation) {
		this.montantSeuilAcceptation = montantSeuilAcceptation;
	}

	
	public List<DetailOrdonnancement> getRefsDetailsOrdonnancement() {
		return refsDetailsOrdonnancement;
	}

	public void setRefsDetailsOrdonnancement(
			List<DetailOrdonnancement> refsDetailsOrdonnancement) {
		this.refsDetailsOrdonnancement = refsDetailsOrdonnancement;
	}

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

}
