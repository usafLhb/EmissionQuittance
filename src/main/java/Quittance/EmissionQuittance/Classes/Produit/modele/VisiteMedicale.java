package Quittance.EmissionQuittance.Classes.Produit.modele;

import java.util.Calendar;
import java.util.Collection;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class VisiteMedicale extends ParametrageBO implements IEntite {

	private static final long serialVersionUID = 1L;
	
	private long id;
	private Calendar dateDebut;
	private Calendar dateFin;
	private Double engagementCumuleMin;
	private Double engagementCumuleMax;
	private ParametresPrevoyance refParametresPrevoyance;
	private Collection refCapitauxAssures;

	public boolean equals(Object obj) {
		if (this.getId() == ((VisiteMedicale) obj).getId()) {
			return true;
		}
		return false;
	}

	public VisiteMedicale() {

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
	 * Access method for the engagementCumuleMin property.
	 * 
	 * @return the current value of the engagementCumuleMin property
	 */
	public Double getEngagementCumuleMin() {
		return engagementCumuleMin;
	}

	/**
	 * Sets the value of the engagementCumuleMin property.
	 * 
	 * @param aEngagementCumuleMin
	 *            the new value of the engagementCumuleMin property
	 */
	public void setEngagementCumuleMin(Double aEngagementCumuleMin) {
		engagementCumuleMin = aEngagementCumuleMin;
	}

	/**
	 * Access method for the engagementCumuleMax property.
	 * 
	 * @return the current value of the engagementCumuleMax property
	 */
	public Double getEngagementCumuleMax() {
		return engagementCumuleMax;
	}

	/**
	 * Sets the value of the engagementCumuleMax property.
	 * 
	 * @param aEngagementCumuleMax
	 *            the new value of the engagementCumuleMax property
	 */
	public void setEngagementCumuleMax(Double aEngagementCumuleMax) {
		engagementCumuleMax = aEngagementCumuleMax;
	}

	/**
	 * Access method for the refParametresPrevoyance property.
	 * 
	 * @return the current value of the refParametresPrevoyance property
	 */
	public ParametresPrevoyance getRefParametresPrevoyance() {
		return refParametresPrevoyance;
	}

	public String getDescription() {
		return refParametresPrevoyance.getLibelle();
	}

	/**
	 * Sets the value of the refParametresPrevoyance property.
	 * 
	 * @param aRefParametresPrevoyance
	 *            the new value of the refParametresPrevoyance property
	 */
	public void setRefParametresPrevoyance(
			ParametresPrevoyance aRefParametresPrevoyance) {
		refParametresPrevoyance = aRefParametresPrevoyance;
	}

	/**
	 * @return Returns the refCapitauxAssures.
	 */
	public Collection getRefCapitauxAssures() {
		return refCapitauxAssures;
	}

	/**
	 * @param refCapitauxAssures
	 *            The refCapitauxAssures to set.
	 */
	public void setRefCapitauxAssures(Collection refCapitauxAssures) {
		this.refCapitauxAssures = refCapitauxAssures;
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
}
