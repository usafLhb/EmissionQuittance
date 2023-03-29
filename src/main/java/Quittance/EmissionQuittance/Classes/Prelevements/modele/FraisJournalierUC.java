package Quittance.EmissionQuittance.Classes.Prelevements.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.application.oct.metier.modele.Contrat;

public class FraisJournalierUC implements IEntite {
	
	private long id;
	private Contrat refContrat;
	private Double montant;
	private String etat;
	private Calendar dateCalcul;
	private Calendar datePrelevement;	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Contrat getRefContrat() {
		return refContrat;
	}

	public void setRefContrat(Contrat refContrat) {
		this.refContrat = refContrat;
	}

	public Double getMontant() {
		return montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	
	public Calendar getDateCalcul() {
		return dateCalcul;
	}

	public void setDateCalcul(Calendar dateCalcul) {
		this.dateCalcul = dateCalcul;
	}

	public Calendar getDatePrelevement() {
		return datePrelevement;
	}

	public void setDatePrelevement(Calendar datePrelevement) {
		this.datePrelevement = datePrelevement;
	}

	public EntiteFactory getFactory() {
		return null;
	}

}
