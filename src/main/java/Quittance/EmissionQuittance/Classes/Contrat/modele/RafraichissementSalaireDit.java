package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Set;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class RafraichissementSalaireDit implements IEntite {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id;
	private long idContrat;
	private String dateRafraichissement;
	private String utilisateur;
	private boolean	contientErreurs;
	private String dateReception;
	private String numeroContrat;
	private Set<NouveauSalaireDit> nouveauxSalaires;
	

	public EntiteFactory getFactory() {
		return null;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}

	public long getIdContrat() {
		return idContrat;
	}


	public void setIdContrat(long idContrat) {
		this.idContrat = idContrat;
	}


	public String getDateRafraichissement() {
		return dateRafraichissement;
	}


	public void setDateRafraichissement(String dateRafraichissement) {
		this.dateRafraichissement = dateRafraichissement;
	}


	public String getUtilisateur() {
		return utilisateur;
	}


	public void setUtilisateur(String utilisateur) {
		this.utilisateur = utilisateur;
	}


	public boolean isContientErreurs() {
		return contientErreurs;
	}


	public void setContientErreurs(boolean contientErreurs) {
		this.contientErreurs = contientErreurs;
	}



	/**
	 * @return the dateReception
	 */
	public String getDateReception() {
		return dateReception;
	}


	/**
	 * @param dateReception the dateReception to set
	 */
	public void setDateReception(String dateReception) {
		this.dateReception = dateReception;
	}


	public Set<NouveauSalaireDit> getNouveauxSalaires() {
		return nouveauxSalaires;
	}


	public void setNouveauxSalaires(Set<NouveauSalaireDit> nouveauxSalaires) {
		this.nouveauxSalaires = nouveauxSalaires;
	}


	/**
	 * @return the numeroContrat
	 */
	public String getNumeroContrat() {
		return numeroContrat;
	}


	/**
	 * @param numeroContrat the numeroContrat to set
	 */
	public void setNumeroContrat(String numeroContrat) {
		this.numeroContrat = numeroContrat;
	}






}
