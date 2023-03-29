package Quittance.EmissionQuittance.Classes.Prelevements.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.application.oct.metier.modele.Contrat;

/**
 * 
 *  FraisMensuelGPUC
 *  
 * 	@author M.BERR
 *	@Date 	1 ao�t 11
 */
public class FraisMensuelGPUC implements IEntite {
	
	private long id;
	private Contrat refContrat;
	private Integer exercice;
	private Integer mois;
	private Calendar dateCalcul;
	private Double taux;
	private Double CSR;
	private Double montant;
	private String etat;
	private Calendar datePrelevement;
	
	
	public Contrat getRefContrat() {
		return refContrat;
	}

	public void setRefContrat(Contrat refContrat) {
		this.refContrat = refContrat;
	}

	public Integer getExercice() {
		return exercice;
	}

	public void setExercice(Integer exercice) {
		this.exercice = exercice;
	}

	public Integer getMois() {
		return mois;
	}

	public void setMois(Integer mois) {
		this.mois = mois;
	}

	public Calendar getDateCalcul() {
		return dateCalcul;
	}

	public void setDateCalcul(Calendar dateCalcul) {
		this.dateCalcul = dateCalcul;
	}

	public Double getTaux() {
		return taux;
	}

	public void setTaux(Double taux) {
		this.taux = taux;
	}

	public Double getCSR() {
		return CSR;
	}

	public void setCSR(Double csr) {
		CSR = csr;
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

	public Calendar getDatePrelevement() {
		return datePrelevement;
	}

	public void setDatePrelevement(Calendar datePrelevement) {
		this.datePrelevement = datePrelevement;
	}

	public EntiteFactory getFactory() {
		return null;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

}
