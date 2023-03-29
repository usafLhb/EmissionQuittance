package Quittance.EmissionQuittance.Classes.referentiel;

import java.util.Calendar;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.application.prd.metier.modele.Formule;
import com.rmawatanya.convergence.application.prd.metier.modele.Produit;
import com.rmawatanya.convergence.utile.habilitations.Utilisateur;

public class AssocProduitSecteurActivite extends ParametrageBO implements
		IEntite {
	private long id;
	private Produit refProduit;
	private Formule refFromule;
	private SecteurActivite refSecteur;
	private Double tauxDepassmentBatiment;
	private Double minValeurContenu;
	private Double maxValeurContenu;
	private Double minValeurBatiment;
	private Double maxValeurBatiment;
	private Double pourcentageMarchandise;
	private Double pourcMarchandiseChambreFr;
	private Double pourcMateriel;
	private Calendar dateAjout;
	private Calendar dateDerniereModification;
	private Utilisateur refUtilisateurAjout;
	private Utilisateur refUtilisateurModification;
	public AssocProduitSecteurActivite() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Produit getRefProduit() {
		return refProduit;
	}

	public void setRefProduit(Produit refProduit) {
		this.refProduit = refProduit;
	}

	public SecteurActivite getRefSecteur() {
		return refSecteur;
	}

	public void setRefSecteur(SecteurActivite refSecteur) {
		this.refSecteur = refSecteur;
	}

	/**
	 * @return the tauxDepassmentBatiment
	 */
	public Double getTauxDepassmentBatiment() {
		return tauxDepassmentBatiment;
	}

	/**
	 * @param tauxDepassmentBatiment
	 *            the tauxDepassmentBatiment to set
	 */
	public void setTauxDepassmentBatiment(Double tauxDepassmentBatiment) {
		this.tauxDepassmentBatiment = tauxDepassmentBatiment;
	}

	/**
	 * @return the minValeurContenu
	 */
	public Double getMinValeurContenu() {
		return minValeurContenu;
	}

	/**
	 * @param minValeurContenu
	 *            the minValeurContenu to set
	 */
	public void setMinValeurContenu(Double minValeurContenu) {
		this.minValeurContenu = minValeurContenu;
	}

	/**
	 * @return the maxValeurContenu
	 */
	public Double getMaxValeurContenu() {
		return maxValeurContenu;
	}

	/**
	 * @param maxValeurContenu
	 *            the maxValeurContenu to set
	 */
	public void setMaxValeurContenu(Double maxValeurContenu) {
		this.maxValeurContenu = maxValeurContenu;
	}

	/**
	 * @return the minValeurBatiment
	 */
	public Double getMinValeurBatiment() {
		return minValeurBatiment;
	}

	/**
	 * @param minValeurBatiment
	 *            the minValeurBatiment to set
	 */
	public void setMinValeurBatiment(Double minValeurBatiment) {
		this.minValeurBatiment = minValeurBatiment;
	}

	/**
	 * @return the maxValeurBatiment
	 */
	public Double getMaxValeurBatiment() {
		return maxValeurBatiment;
	}

	/**
	 * @param maxValeurBatiment
	 *            the maxValeurBatiment to set
	 */
	public void setMaxValeurBatiment(Double maxValeurBatiment) {
		this.maxValeurBatiment = maxValeurBatiment;
	}

	/**
	 * @return the pourcentageMarchandise
	 */
	public Double getPourcentageMarchandise() {
		return pourcentageMarchandise;
	}

	/**
	 * @param pourcentageMarchandise
	 *            the pourcentageMarchandise to set
	 */
	public void setPourcentageMarchandise(Double pourcentageMarchandise) {
		this.pourcentageMarchandise = pourcentageMarchandise;
	}

	/**
	 * @return the pourcMarchandiseChambreFr
	 */
	public Double getPourcMarchandiseChambreFr() {
		return pourcMarchandiseChambreFr;
	}

	/**
	 * @param pourcMarchandiseChambreFr
	 *            the pourcMarchandiseChambreFr to set
	 */
	public void setPourcMarchandiseChambreFr(Double pourcMarchandiseChambreFr) {
		this.pourcMarchandiseChambreFr = pourcMarchandiseChambreFr;
	}

	
	
	public Double getPourcMateriel() {
		return pourcMateriel;
	}

	public void setPourcMateriel(Double pourcMateriel) {
		this.pourcMateriel = pourcMateriel;
	}

	/**
	 * @return the refFromule
	 */
	public Formule getRefFromule() {
		return refFromule;
	}

	/**
	 * @param refFromule the refFromule to set
	 */
	public void setRefFromule(Formule refFromule) {
		this.refFromule = refFromule;
	}

	public EntiteFactory getFactory() {
		return null;
	}

	@Override
	public String getDescription() {
		return this.refSecteur.getLibelle();
	}

	public Calendar getDateAjout() {
		return dateAjout;
	}

	public void setDateAjout(Calendar dateAjout) {
		this.dateAjout = dateAjout;
	}

	public Calendar getDateDerniereModification() {
		return dateDerniereModification;
	}

	public void setDateDerniereModification(Calendar dateDerniereModification) {
		this.dateDerniereModification = dateDerniereModification;
	}

	public Utilisateur getRefUtilisateurAjout() {
		return refUtilisateurAjout;
	}

	public void setRefUtilisateurAjout(Utilisateur refUtilisateurAjout) {
		this.refUtilisateurAjout = refUtilisateurAjout;
	}

	public Utilisateur getRefUtilisateurModification() {
		return refUtilisateurModification;
	}

	public void setRefUtilisateurModification(Utilisateur refUtilisateurModification) {
		this.refUtilisateurModification = refUtilisateurModification;
	}

}
