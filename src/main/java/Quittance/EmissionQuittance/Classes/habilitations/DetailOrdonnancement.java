package Quittance.EmissionQuittance.Classes.habilitations;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class DetailOrdonnancement implements IEntite{

	private long id;
	private Integer ordreOrdonnancement;
	private Integer ordreSeuilAcceptation;
	private Utilisateur refGestionnaire;
	private Ordonnancement refOrdonnancement;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Integer getOrdreOrdonnancement() {
		return ordreOrdonnancement;
	}
	public void setOrdreOrdonnancement(Integer ordreOrdonnancement) {
		this.ordreOrdonnancement = ordreOrdonnancement;
	}
	
	public Integer getOrdreSeuilAcceptation() {
		return ordreSeuilAcceptation;
	}
	public void setOrdreSeuilAcceptation(Integer ordreSeuilAcceptation) {
		this.ordreSeuilAcceptation = ordreSeuilAcceptation;
	}
	public Utilisateur getRefGestionnaire() {
		return refGestionnaire;
	}
	public void setRefGestionnaire(Utilisateur refGestionnaire) {
		this.refGestionnaire = refGestionnaire;
	}
	public Ordonnancement getRefOrdonnancement() {
		return refOrdonnancement;
	}
	public void setRefOrdonnancement(Ordonnancement refOrdonnancement) {
		this.refOrdonnancement = refOrdonnancement;
	}
	
	@Override
	public EntiteFactory getFactory() {
		return null;
	}
	
	
}
