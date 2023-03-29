package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.HashMap;
import java.util.Map;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class LigneReponseQuestion implements IEntite {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id;
	
	Map<String, ColonneReponse> refColonneReponse = new HashMap<String, ColonneReponse>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;

	}

	public EntiteFactory getFactory() {
		return null;
	}

	public Map<String, ColonneReponse> getRefColonneReponse() {
		return refColonneReponse;
	}

	public void setRefColonneReponse(Map<String, ColonneReponse> refColonneReponse) {
		this.refColonneReponse = refColonneReponse;
	}

}
