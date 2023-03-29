package Quittance.EmissionQuittance.Classes.Prelevements.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.application.oct.metier.modele.Contrat;
import com.rmawatanya.convergence.utile.referentiel.Support;
import com.rmawatanya.convergence.utile.referentiel.TypeEvenement;

/**
 * 
 *  Agregation
 * 
 */
public class Agregation implements IEntite {

	private long id;
	private Double nombreDePart;
	private Double montant;
	private Support refSupport;
	private Contrat refContrat;
	private Operation refOperation;
	private TypeEvenement refTypeEvenement;
	private Double vl;
	private Calendar dateVL;
	private Calendar dateDernierCalcul;
	private Double pourcentage;
	
	public Double getVL() {
		return vl;
	}

	public void setVL(Double vl) {
		this.vl = vl;
	}

	public Calendar getDateVL() {
		return dateVL;
	}

	public void setDateVL(Calendar dateVL) {
		this.dateVL = dateVL;
	}

	public Calendar getDateDernierCalcul() {
		return dateDernierCalcul;
	}

	public void setDateDernierCalcul(Calendar dateDernierCalcul) {
		this.dateDernierCalcul = dateDernierCalcul;
	}

	public TypeEvenement getRefTypeEvenement() {
		return refTypeEvenement;
	}

	public void setRefTypeEvenement(TypeEvenement refTypeEvenement) {
		this.refTypeEvenement = refTypeEvenement;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Double getNombreDePart() {
		return nombreDePart;
	}

	public void setNombreDePart(Double nombreDePart) {
		this.nombreDePart = nombreDePart;
	}

	public Double getMontant() {
		return montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}

	public Support getRefSupport() {
		return refSupport;
	}

	public void setRefSupport(Support refSupport) {
		this.refSupport = refSupport;
	}

	public Contrat getRefContrat() {
		return refContrat;
	}

	public void setRefContrat(Contrat refContrat) {
		this.refContrat = refContrat;
	}

	public Operation getRefOperation() {
		return refOperation;
	}

	public void setRefOperation(Operation refOperation) {
		this.refOperation = refOperation;
	}

	
	public Double getVl() {
		return vl;
	}

	public void setVl(Double vl) {
		this.vl = vl;
	}

	public Double getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(Double pourcentage) {
		this.pourcentage = pourcentage;
	}


	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

}