package Quittance.EmissionQuittance.Classes.Contrat.modele;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class ColonneReponse implements IEntite {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String reponse;
	
	/** Fait r�f�rence � la colonne pr�cision de la table ColonnePrecisionPossible */
	private String nomColonnePrecision;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;

	}

	public EntiteFactory getFactory() {
		return null;
	}

	public String getReponse() {
		return reponse;
	}

	public void setReponse(String reponse) {
		this.reponse = reponse;
	}

	public String getNomColonnePrecision() {
		return nomColonnePrecision;
	}

	public void setNomColonnePrecision(String nomColonnePrecision) {
		this.nomColonnePrecision = nomColonnePrecision;
	}

}
