package Quittance.EmissionQuittance.Classes.Quittancement.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.application.prl.metier.modele.OperationGenerationPrelevements;

public class RemiseMultiple implements IEntite
{
	private long id;
	private String numeroRemise;
	private Double montantRemise;
	private String sens;
	private String etat;
	private Calendar dateEtat;
	private Double montantConsomme;
	private Double 	montantDiff;
	private Calendar dateComptabilisation;
	private OperationGenerationPrelevements refOperationPrelevement;
	
	
	public Calendar getDateComptabilisation() {
		return dateComptabilisation;
	}
	public void setDateComptabilisation(Calendar dateComptabilisation) {
		this.dateComptabilisation = dateComptabilisation;
	}
	public Calendar getDateEtat() {
		return dateEtat;
	}
	public void setDateEtat(Calendar dateEtat) {
		this.dateEtat = dateEtat;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public OperationGenerationPrelevements getRefOperationPrelevement() {
		return refOperationPrelevement;
	}
	public void setRefOperationPrelevement(
			OperationGenerationPrelevements refOperationPrelevement) {
		this.refOperationPrelevement = refOperationPrelevement;
	}
	public Double getMontantConsomme() {
		return montantConsomme;
	}
	public void setMontantConsomme(Double montantConsomme) {
		this.montantConsomme = montantConsomme;
	}
	public Double getMontantRemise() {
		return montantRemise;
	}
	public void setMontantRemise(Double montantRemise) {
		this.montantRemise = montantRemise;
	}
	public String getNumeroRemise() {
		return numeroRemise;
	}
	public void setNumeroRemise(String numeroRemise) {
		this.numeroRemise = numeroRemise;
	}
	public String getSens() {
		return sens;
	}
	public void setSens(String sens) {
		this.sens = sens;
	}
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}
	public Double getMontantDiff() {
		return montantDiff;
	}
	public void setMontantDiff(Double montantDiff) {
		this.montantDiff = montantDiff;
	}
	
	@Override
	public String toString() {
		return "Remise [id=" + id + ", numeroRemise=" + numeroRemise + ", montantRemise=" + montantRemise + ", sens="
				+ sens + ", etat=" + etat + ", dateEtat=" + dateEtat + ", montantConsomme=" + montantConsomme
				+ ", montantDiff=" + montantDiff + ", dateComptabilisation=" + dateComptabilisation
				+ ", refOperationPrelevement=" + refOperationPrelevement + "]";
	}

	
	
}
