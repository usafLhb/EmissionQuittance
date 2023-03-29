package Quittance.EmissionQuittance.Classes.Produit.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.utile.referentiel.Support;

/**
 * 
 *  FraisUC
 *  
 * 	@author M.BERR
 *	@Date 	29 juin 11
 */
public class FraisUC implements IEntite {
	
	
	private static final long	serialVersionUID	= 1L;
	
	private long id;
	private Calendar dateDebut;
	private Calendar dateFin;
	private String typeFrais;
	private Double taux;
	private Double plafond;
	private Support refSupport;
	private ParametresEpargne refParametresEpargne ;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getTypeFrais() {
		return typeFrais;
	}
	public void setTypeFrais(String typeFrais) {
		this.typeFrais = typeFrais;
	}
	public Double getTaux() {
		return taux;
	}
	public void setTaux(Double taux) {
		this.taux = taux;
	}
	public Double getPlafond() {
		return plafond;
	}
	public void setPlafond(Double plafond) {
		this.plafond = plafond;
	}
	public Support getRefSupport() {
		return refSupport;
	}
	public void setRefSupport(Support refSupport) {
		this.refSupport = refSupport;
	}
	public ParametresEpargne getRefParametresEpargne() {
		return refParametresEpargne;
	}
	public void setRefParametresEpargne(ParametresEpargne refParametresEpargne) {
		this.refParametresEpargne = refParametresEpargne;
	}
	public EntiteFactory getFactory() {
		return null;
	}
}
