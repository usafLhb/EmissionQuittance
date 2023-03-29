package Quittance.EmissionQuittance.Classes.Produit.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.utile.referentiel.Support;

public class ValeurLiquidative implements IEntite {

	private static final long serialVersionUID = 1L;
	
	private long id;
	private Double valeur;
	private Calendar dateValeur;
	private Calendar dateCreation;
	private Support refSupport;

	private Double nombrePartsDetenu;
	private Calendar dateOperation;
	private String nomFichier;
	
	public ValeurLiquidative() {

	}

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Double getValeur() {
		return valeur;
	}

	public void setValeur(Double valeur) {
		this.valeur = valeur;
	}

	public Calendar getDateValeur() {
		return dateValeur;
	}

	public void setDateValeur(Calendar dateValeur) {
		this.dateValeur = dateValeur;
	}

	public Calendar getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Calendar dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Support getRefSupport() {
		return refSupport;
	}

	public void setRefSupport(Support refSupport) {
		this.refSupport = refSupport;
	}

	public Double getNombrePartsDetenu() {
		return nombrePartsDetenu;
	}

	public void setNombrePartsDetenu(Double nombrePartsDetenu) {
		this.nombrePartsDetenu = nombrePartsDetenu;
	}

	public Calendar getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(Calendar dateOperation) {
		this.dateOperation = dateOperation;
	}

	public String getNomFichier() {
		return nomFichier;
	}

	public void setNomFichier(String nomFichier) {
		this.nomFichier = nomFichier;
	}
	
	
}
