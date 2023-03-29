package Quittance.EmissionQuittance.Classes.Produit.modele;

import java.util.Calendar;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class Accessoire extends ParametrageBO implements IEntite {

	private static final long serialVersionUID = 1L;
	private long id;
	private Calendar dateDebut;
	private Calendar dateFin;
	private Double montant;
	private String libelle;

	private VersionCommercialeProduit refVersionCommercialeProduit;

	public boolean equals(Object obj) {
		if(this.getId()==((Accessoire)obj).getId()){
			return true;
		}
		return false;
	}

	public Accessoire() {

	}

	public String getDescription() {
		return id+" "+libelle;
	}

	/**
	 * Access method for the id property.
	 * 
	 * @return the current value of the id property
	 */
	public long getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param aId
	 *            the new value of the id property
	 */
	public void setId(long aId) {
		id = aId;
	}

	/**
	 * Access method for the dateDebut property.
	 * 
	 * @return the current value of the dateDebut property
	 */
	public Calendar getDateDebut() {
		return dateDebut;
	}

	/**
	 * Sets the value of the dateDebut property.
	 * 
	 * @param aDateDebut
	 *            the new value of the dateDebut property
	 */
	public void setDateDebut(Calendar aDateDebut) {
		dateDebut = aDateDebut;
	}

	/**
	 * Access method for the dateFin property.
	 * 
	 * @return the current value of the dateFin property
	 */
	public Calendar getDateFin() {
		return dateFin;
	}

	/**
	 * Sets the value of the dateFin property.
	 * 
	 * @param aDateFin
	 *            the new value of the dateFin property
	 */
	public void setDateFin(Calendar aDateFin) {
		dateFin = aDateFin;
	}

	/**
	 * Access method for the montant property.
	 * 
	 * @return the current value of the montant property
	 */
	public Double getMontant() {
		return montant;
	}

	/**
	 * Sets the value of the montant property.
	 * 
	 * @param aMontant
	 *            the new value of the montant property
	 */
	public void setMontant(Double aMontant) {
		montant = aMontant;
	}

	public VersionCommercialeProduit getRefVersionCommercialeProduit() {
		return refVersionCommercialeProduit;
	}
	
	public void setRefVersionCommercialeProduit(VersionCommercialeProduit refVersionCommercialeProduit) {
		this.refVersionCommercialeProduit = refVersionCommercialeProduit;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
}
