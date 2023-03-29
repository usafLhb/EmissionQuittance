package Quittance.EmissionQuittance.Classes.Produit.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

/**
 * 
 *  FraisGP
 *  
 * 	@author M.BERR
 *	@Date 	5 juil. 11
 */
public class FraisGP implements IEntite {

	
	private static final long	serialVersionUID	= 1L;
	private long id;
	private Double taux;
	private Integer periodiciteTaux;
	private Calendar dateDebut;
	private Calendar dateFin;
	private Double ageMin;
	private Double ageMax;
	private ParametresEpargne refParametresEpargne;

	public FraisGP() {

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

	public EntiteFactory getFactory() {
		return null;
	}
	
	public ParametresEpargne getRefParametresEpargne() {
		return refParametresEpargne;
	}
	public void setRefParametresEpargne(ParametresEpargne refParametresEpargne) {
		this.refParametresEpargne = refParametresEpargne;
	}

	/**
	 * @return the periodiciteTaux
	 */
	public Integer getPeriodiciteTaux() {
		return periodiciteTaux;
	}

	/**
	 * @param periodiciteTaux the periodiciteTaux to set
	 */
	public void setPeriodiciteTaux(Integer periodiciteTaux) {
		this.periodiciteTaux = periodiciteTaux;
	}	
}
