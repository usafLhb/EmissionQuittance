package Quittance.EmissionQuittance.Classes.Prelevements.modele;

import java.util.Collection;
import java.util.Vector;

/**
 * @author FADILI
 */
public class BeanControleCotisation {
	
	private String id;
	
	private String raisonSocialSouscripteur;
	private String numeroContratGroupe;
	private String numeroRemise;
	private String numeroFichier;
	private String dateRemise;
	private String dateImpression;
	private String montantRemise;
	private String totalCotisation;
	private String ecart;
		
	
	//D�tails
	private Collection detail = new Vector();


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getRaisonSocialSouscripteur() {
		return raisonSocialSouscripteur;
	}


	public void setRaisonSocialSouscripteur(String raisonSocialSouscripteur) {
		this.raisonSocialSouscripteur = raisonSocialSouscripteur;
	}


	public String getNumeroContratGroupe() {
		return numeroContratGroupe;
	}


	public void setNumeroContratGroupe(String numeroContratGroupe) {
		this.numeroContratGroupe = numeroContratGroupe;
	}


	public String getNumeroRemise() {
		return numeroRemise;
	}


	public void setNumeroRemise(String numeroRemise) {
		this.numeroRemise = numeroRemise;
	}


	public String getNumeroFichier() {
		return numeroFichier;
	}


	public void setNumeroFichier(String numeroFichier) {
		this.numeroFichier = numeroFichier;
	}


	public String getDateRemise() {
		return dateRemise;
	}


	public void setDateRemise(String dateRemise) {
		this.dateRemise = dateRemise;
	}


	public String getDateImpression() {
		return dateImpression;
	}


	public void setDateImpression(String dateImpression) {
		this.dateImpression = dateImpression;
	}


	public Collection getDetail() {
		return detail;
	}


	public void setDetail(Collection detail) {
		this.detail = detail;
	}


	public String getMontantRemise() {
		return montantRemise;
	}


	public void setMontantRemise(String montantRemise) {
		this.montantRemise = montantRemise;
	}


	public String getTotalCotisation() {
		return totalCotisation;
	}


	public void setTotalCotisation(String totalCotisation) {
		this.totalCotisation = totalCotisation;
	}


	public String getEcart() {
		return ecart;
	}


	public void setEcart(String ecart) {
		this.ecart = ecart;
	}

}
