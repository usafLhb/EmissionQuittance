package Quittance.EmissionQuittance.Classes.Produit.modele;

import java.util.Calendar;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.utile.referentiel.TypePrelevement;

public class Commission extends ParametrageBO implements IEntite {

	private static final long serialVersionUID = 1L;
	
	private long id;
	private Calendar dateDebut;
	private Calendar dateFin;
	private Double tauxCommissionApport;
	private Double tauxCommissionGestion;
	private Double tauxCommissionProductivite;
	private Double tauxCommissionCATNAT;
	private Double tauxGestionSurPrime;
	private Double tauxTVA;
	
	private String libelle;

	/*** 0 : en sus, 1 : d�duit */
	private Boolean modePrelevement;
	
	// A supprimer apres le d�marrage en production
	//private Produit refProduit;
	// ***
	
	private VersionCommercialeProduit refVersionCommercialeProduit;
	private ParametresEpargne refParametresEpargne;
	private ParametresPrevoyance refParametresPrevoyance;
	private ParametresDommages refParametresDommages;		
	private TypePrelevement refTypePrelevement;
	private Double montantMin;
	private Double montantMax;

	public TypePrelevement getRefTypePrelevement() {
		return refTypePrelevement;
	}

	public void setRefTypePrelevement(TypePrelevement refTypePrelevement) {
		this.refTypePrelevement = refTypePrelevement;
	}

	public Double getMontantMin() {
		return montantMin;
	}

	public void setMontantMin(Double montantMin) {
		this.montantMin = montantMin;
	}

	public Double getMontantMax() {
		return montantMax;
	}

	public void setMontantMax(Double montantMax) {
		this.montantMax = montantMax;
	}

	public boolean equals(Object obj) {
		if(this.getId()==((Commission)obj).getId()){
			return true;
		}
		return false;
	}

	public Commission() {

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
	 * Access method for the tauxCommissionApport property.
	 * 
	 * @return the current value of the tauxCommissionApport property
	 */
	public Double getTauxCommissionApport() {
		return tauxCommissionApport;
	}

	/**
	 * Sets the value of the tauxCommissionApport property.
	 * 
	 * @param aTauxCommissionApport
	 *            the new value of the tauxCommissionApport property
	 */
	public void setTauxCommissionApport(Double aTauxCommissionApport) {
		tauxCommissionApport = aTauxCommissionApport;
	}

	/**
	 * Access method for the tauxCommissionGestion property.
	 * 
	 * @return the current value of the tauxCommissionGestion property
	 */
	public Double getTauxCommissionGestion() {
		return tauxCommissionGestion;
	}

	/**
	 * Sets the value of the tauxCommissionGestion property.
	 * 
	 * @param aTauxCommissionGestion
	 *            the new value of the tauxCommissionGestion property
	 */
	public void setTauxCommissionGestion(Double aTauxCommissionGestion) {
		tauxCommissionGestion = aTauxCommissionGestion;
	}

	/**
	 * Access method for the tauxCommissionProductivite property.
	 * 
	 * @return the current value of the tauxCommissionProductivite property
	 */
	public Double getTauxCommissionProductivite() {
		return tauxCommissionProductivite;
	}

	/**
	 * Sets the value of the tauxCommissionProductivite property.
	 * 
	 * @param aTauxCommissionProductivite
	 *            the new value of the tauxCommissionProductivite property
	 */
	public void setTauxCommissionProductivite(Double aTauxCommissionProductivite) {
		tauxCommissionProductivite = aTauxCommissionProductivite;
	}

	/**
	 * Access method for the tauxTVA property.
	 * 
	 * @return the current value of the tauxTVA property
	 */
	public Double getTauxTVA() {
		return tauxTVA;
	}

	/**
	 * Sets the value of the tauxTVA property.
	 * 
	 * @param aTauxTVA
	 *            the new value of the tauxTVA property
	 */
	public void setTauxTVA(Double aTauxTVA) {
		tauxTVA = aTauxTVA;
	}

	/**
	 * Access method for the modePrelevement property.
	 * 
	 * @return the current value of the modePrelevement property
	 */
	public Boolean getModePrelevement() {
		return modePrelevement;
	}

	/**
	 * Sets the value of the modePrelevement property.
	 * 
	 * @param aModePrelevement
	 *            the new value of the modePrelevement property
	 */
	public void setModePrelevement(Boolean aModePrelevement) {
		modePrelevement = aModePrelevement;
	}

	/**
	 * Access method for the refProduit property.
	 * 
	 * @return the current value of the refProduit property
	 */	

	/**
	 * Access method for the refParametresDommages property.
	 * 
	 * @return the current value of the refParametresDommages property
	 */
	public ParametresDommages getRefParametresDommages() {
		return refParametresDommages;
	}

	/**
	 * Sets the value of the refParametresDommages property.
	 * 
	 * @param aRefParametresDommages
	 *            the new value of the refParametresDommages property
	 */
	public void setRefParametresDommages(ParametresDommages aRefParametresDommages) {
		refParametresDommages = aRefParametresDommages;
	}

	/**
	 * Access method for the refParametresPrevoyance property.
	 * 
	 * @return the current value of the refParametresPrevoyance property
	 */
	public ParametresPrevoyance getRefParametresPrevoyance() {
		return refParametresPrevoyance;
	}

	/**
	 * Sets the value of the refParametresPrevoyance property.
	 * 
	 * @param aRefParametresPrevoyance
	 *            the new value of the refParametresPrevoyance property
	 */
	public void setRefParametresPrevoyance(ParametresPrevoyance aRefParametresPrevoyance) {
		refParametresPrevoyance = aRefParametresPrevoyance;
	}

	/**
	 * Access method for the refParametresEpargne property.
	 * 
	 * @return the current value of the refParametresEpargne property
	 */
	public ParametresEpargne getRefParametresEpargne() {
		return refParametresEpargne;
	}

	/**
	 * Sets the value of the refParametresEpargne property.
	 * 
	 * @param aRefParametresEpargne
	 *            the new value of the refParametresEpargne property
	 */
	public void setRefParametresEpargne(ParametresEpargne aRefParametresEpargne) {
		refParametresEpargne = aRefParametresEpargne;
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

	public Double getTauxGestionSurPrime() {
		return tauxGestionSurPrime;
	}

	public void setTauxGestionSurPrime(Double tauxGestionSurPrime) {
		this.tauxGestionSurPrime = tauxGestionSurPrime;
	}

	public Double getTauxCommissionCATNAT() {
		return tauxCommissionCATNAT;
	}

	public void setTauxCommissionCATNAT(Double tauxCommissionCATNAT) {
		this.tauxCommissionCATNAT = tauxCommissionCATNAT;
	}
	
}
