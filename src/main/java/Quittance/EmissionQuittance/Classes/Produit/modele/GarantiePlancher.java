package Quittance.EmissionQuittance.Classes.Produit.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class GarantiePlancher implements IEntite {

	private long id;
	private Double taux;
	private Calendar dateDebut;
	private Calendar dateFin;
	private Double ageMin;
	private Double ageMax;
	private Produit refProduit;

	public GarantiePlancher() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Double getTaux() {
		return taux;
	}

	public void setTaux(Double taux) {
		this.taux = taux;
	}

	public Calendar getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Calendar dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Calendar getDateFin() {
		return dateFin;
	}

	public void setDateFin(Calendar dateFin) {
		this.dateFin = dateFin;
	}

	public Double getAgeMin() {
		return ageMin;
	}

	public void setAgeMin(Double ageMin) {
		this.ageMin = ageMin;
	}

	public Double getAgeMax() {
		return ageMax;
	}

	public void setAgeMax(Double ageMax) {
		this.ageMax = ageMax;
	}

	public Produit getRefProduit() {
		return refProduit;
	}

	public void setRefProduit(Produit refProduit) {
		this.refProduit = refProduit;
	}

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}
}
