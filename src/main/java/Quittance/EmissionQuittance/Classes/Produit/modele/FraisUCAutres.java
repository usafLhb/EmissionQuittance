package Quittance.EmissionQuittance.Classes.Produit.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

/**
 * 
 *  FraisUCAutres
 *  
 */
public class FraisUCAutres implements IEntite {
	
	private static final long	serialVersionUID	= 1L;
	private long id;
	private Calendar dateDebut;
	private Calendar dateFin;
	private String typeFrais;
	private Double tauxCompagnie;
	private Double tauxPartenaire;
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
	public ParametresEpargne getRefParametresEpargne() {
		return refParametresEpargne;
	}
	public void setRefParametresEpargne(ParametresEpargne refParametresEpargne) {
		this.refParametresEpargne = refParametresEpargne;
	}
	
	/**
	 * @return the tauxPartenaire
	 */
	public Double getTauxPartenaire() {
		return tauxPartenaire;
	}
	/**
	 * @param tauxPartenaire the tauxPartenaire to set
	 */
	public void setTauxPartenaire(Double tauxPartenaire) {
		this.tauxPartenaire = tauxPartenaire;
	}
	
	/**
	 * @return the tauxCompagnie
	 */
	public Double getTauxCompagnie() {
		return tauxCompagnie;
	}
	/**
	 * @param tauxCompagnie the tauxCompagnie to set
	 */
	public void setTauxCompagnie(Double tauxCompagnie) {
		this.tauxCompagnie = tauxCompagnie;
	}
	public EntiteFactory getFactory() {
		return null;
	}
}
