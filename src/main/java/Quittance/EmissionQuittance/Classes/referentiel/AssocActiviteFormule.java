package Quittance.EmissionQuittance.Classes.referentiel;

import java.util.Calendar;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.application.prd.metier.modele.Formule;
import com.rmawatanya.convergence.utile.habilitations.Utilisateur;

public class AssocActiviteFormule extends ParametrageBO implements IEntite {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long id;
	private Activite refActivite;
	private Formule refFormule;
	private Double minValeurContenu;
	private Double maxValeurContenu;
	private Double minValeurBatiment;
	private Double maxValeurBatiment;
	private Calendar dateAjout;
	private Calendar dateDerniereModification;
	private Utilisateur refUtilisateurAjout;
	private Utilisateur refUtilisateurModification;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Activite getRefActivite() {
		return refActivite;
	}

	public void setRefActivite(Activite refActivite) {
		this.refActivite = refActivite;
	}

	@Override
	public String getDescription() {
		return this.refFormule.getLibelle();
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

}
