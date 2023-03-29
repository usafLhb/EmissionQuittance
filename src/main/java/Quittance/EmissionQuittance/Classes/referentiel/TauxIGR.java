package Quittance.EmissionQuittance.Classes.referentiel;

import java.util.Calendar;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class TauxIGR extends ParametrageBO implements IEntite {
	
	private static final long serialVersionUID = 1L;
	
	private long id;
	private Double valeurMin;
	private Double valeurMax;
	private Double tauxIGR;
	private Double residu;
	private Calendar dateDebut;
	private Calendar dateFin;

	public boolean equals(Object obj) {
		if(this.getId()==((TauxIGR)obj).getId()){
			return true;
		}
		return false;
	}

	public TauxIGR() {

	}

	public long getId() {
		return id;
	}

	public void setId(long aId) {
		id = aId;
	}
	
	public String getDescription() {
		return id+"";
	}

	/**
	 * Access method for the valeurMin property.
	 * 
	 * @return the current value of the valeurMin property
	 */
	public Double getValeurMin() {
		return valeurMin;
	}

	/**
	 * Sets the value of the valeurMin property.
	 * 
	 * @param aValeurMin
	 *            the new value of the valeurMin property
	 */
	public void setValeurMin(Double aValeurMin) {
		valeurMin = aValeurMin;
	}

	/**
	 * Access method for the valeurMax property.
	 * 
	 * @return the current value of the valeurMax property
	 */
	public Double getValeurMax() {
		return valeurMax;
	}

	/**
	 * Sets the value of the valeurMax property.
	 * 
	 * @param aValeurMax
	 *            the new value of the valeurMax property
	 */
	public void setValeurMax(Double aValeurMax) {
		valeurMax = aValeurMax;
	}

	/**
	 * Access method for the tauxIGR property.
	 * 
	 * @return the current value of the tauxIGR property
	 */
	public Double getTauxIGR() {
		return tauxIGR;
	}

	/**
	 * Sets the value of the tauxIGR property.
	 * 
	 * @param aTauxIGR
	 *            the new value of the tauxIGR property
	 */
	public void setTauxIGR(Double aTauxIGR) {
		tauxIGR = aTauxIGR;
	}

	/**
	 * Access method for the residu property.
	 * 
	 * @return the current value of the residu property
	 */
	public Double getResidu() {
		return residu;
	}

	/**
	 * Sets the value of the residu property.
	 * 
	 * @param aResidu
	 *            the new value of the residu property
	 */
	public void setResidu(Double aResidu) {
		residu = aResidu;
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
}
