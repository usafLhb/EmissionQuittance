package Quittance.EmissionQuittance.Classes.Prelevements.modele;

import java.util.Calendar;
import java.util.Collection;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.application.prd.metier.modele.Produit;
import com.rmawatanya.convergence.utile.referentiel.TypeOperation;

public class Operation implements IEntite {

	private long id;
	private String numero;
	private String etat;
	private Calendar dateGeneration;
	private Calendar dateExecution;
	private TypeOperation refTypeOperation;
	private Collection refAgregations;

	private String nomFichierEnvoye;
	private String nomFichierRecu;
	
	private Produit refProduit;

	public Collection getRefAgregations() {
		return refAgregations;
	}

	public void setRefAgregations(Collection refAgregations) {
		this.refAgregations = refAgregations;
	}

	public TypeOperation getRefTypeOperation() {
		return refTypeOperation;
	}

	public void setRefTypeOperation(TypeOperation refTypeOperation) {
		this.refTypeOperation = refTypeOperation;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Calendar getDateGeneration() {
		return dateGeneration;
	}

	public void setDateGeneration(Calendar dateGeneration) {
		this.dateGeneration = dateGeneration;
	}

	public Calendar getDateExecution() {
		return dateExecution;
	}

	public void setDateExecution(Calendar dateExecution) {
		this.dateExecution = dateExecution;
	}

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getNomFichierEnvoye() {
		return nomFichierEnvoye;
	}

	public void setNomFichierEnvoye(String nomFichierEnvoye) {
		this.nomFichierEnvoye = nomFichierEnvoye;
	}

	public String getNomFichierRecu() {
		return nomFichierRecu;
	}

	public void setNomFichierRecu(String nomFichierRecu) {
		this.nomFichierRecu = nomFichierRecu;
	}

	public Produit getRefProduit() {
		return refProduit;
	}

	public void setRefProduit(Produit refProduit) {
		this.refProduit = refProduit;
	}
	
	

}