package Quittance.EmissionQuittance.Classes.Produit.modele;

import java.util.Calendar;

import com.rmawatanya.convergence.utile.referentiel.Garantie;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class TaxeAssurance extends ParametrageBO implements IEntite {

	private static final long serialVersionUID = 1L;
	
	private long id;
	private Calendar dateDebut;
	private Calendar dateFin;
	private Double taux;
	private String libelle;
	private Double tauxTaxeParafiscale;
	
	private VersionCommercialeProduit refVersionCommercialeProduit;
	private ParametresEpargne refParametresEpargne;
	private ParametresPrevoyance refParametresPrevoyance;
	private ParametresDommages refParametresDommages;
	
	private Garantie refGarantie;

	public boolean equals(Object obj) {
		if(this.getId()==((TaxeAssurance)obj).getId()){
			return true;
		}
		return false;
	}

	public TaxeAssurance() {

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
	 * @return Returns the taux.
	 */
	public Double getTaux() {
		return taux;
	}

	/**
	 * @param taux
	 *            The taux to set.
	 */
	public void setTaux(Double taux) {
		this.taux = taux;
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
	 * Access method for the refProduit property.
	 * 
	 * @return the current value of the refProduit property
	 */
	/*
	public Produit getRefProduit() {
		return refProduit;
	}
*/
	/**
	 * Sets the value of the refProduit property.
	 * 
	 * @param aRefProduit
	 *            the new value of the refProduit property
	 */
	/*
	public void setRefProduit(Produit aRefProduit) {
		refProduit = aRefProduit;
	}
*/
	public ParametresEpargne getRefParametresEpargne() {
		return refParametresEpargne;
	}

	public void setRefParametresEpargne(ParametresEpargne refParametresEpargne) {
		this.refParametresEpargne = refParametresEpargne;
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

//	public Produit getRefProduit() {
//		return refProduit;
//	}
//
//	public void setRefProduit(Produit refProduit) {
//		this.refProduit = refProduit;
//	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public VersionCommercialeProduit getRefVersionCommercialeProduit() {
		return refVersionCommercialeProduit;
	}

	public void setRefVersionCommercialeProduit(
			VersionCommercialeProduit refVersionCommercialeProduit) {
		this.refVersionCommercialeProduit = refVersionCommercialeProduit;
	}

	/**
	 * @return the refGarantie
	 */
	public Garantie getRefGarantie() {
		return refGarantie;
	}

	/**
	 * @param refGarantie the refGarantie to set
	 */
	public void setRefGarantie(Garantie refGarantie) {
		this.refGarantie = refGarantie;
	}

	/**
	 * get Taux taxe parafiscale
	 * @return
	 */
	public Double getTauxTaxeParafiscale() {
		return tauxTaxeParafiscale;
	}
	
	/**
	 * Set taux taxe parafiscale
	 * @param tauxTaxeParafiscale
	 */
	public void setTauxTaxeParafiscale(Double tauxTaxeParafiscale) {
		this.tauxTaxeParafiscale = tauxTaxeParafiscale;
	}
	
	
}
