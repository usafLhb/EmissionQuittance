package Quittance.EmissionQuittance.Classes.referentiel;

import java.util.Calendar;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class IgrAbattement extends ParametrageBO implements IEntite {

	private static final long serialVersionUID = 1L;

	private long id;
	private Double tauxAbattement;
	private Double montantMin;
	private Double montantMax;
	private Double tauxIgrforfaitaire;
	private Double ageMin;
	private Double agetMax;
	private Double dureeContratMin;
	private Double dureeContratMax;
	private Calendar dateDebut;
	private Calendar dateFin;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Double getTauxAbattement() {
		return tauxAbattement;
	}

	public void setTauxAbattement(Double tauxAbattement) {
		this.tauxAbattement = tauxAbattement;
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

	public Double getTauxIgrforfaitaire() {
		return tauxIgrforfaitaire;
	}

	public void setTauxIgrforfaitaire(Double tauxIgrforfaitaire) {
		this.tauxIgrforfaitaire = tauxIgrforfaitaire;
	}

	public Double getAgeMin() {
		return ageMin;
	}

	public void setAgeMin(Double ageMin) {
		this.ageMin = ageMin;
	}

	public Double getAgetMax() {
		return agetMax;
	}

	public void setAgetMax(Double agetMax) {
		this.agetMax = agetMax;
	}

	public Double getDureeContratMin() {
		return dureeContratMin;
	}

	public void setDureeContratMin(Double dureeContratMin) {
		this.dureeContratMin = dureeContratMin;
	}

	public Double getDureeContratMax() {
		return dureeContratMax;
	}

	public void setDureeContratMax(Double dureeContratMax) {
		this.dureeContratMax = dureeContratMax;
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

	@Override
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescription() {
		return id+"";
	}

}
