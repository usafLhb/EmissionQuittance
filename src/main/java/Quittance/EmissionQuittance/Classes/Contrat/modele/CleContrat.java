package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

/**
 * Classe d�finissant la clef d'authentification pour les adh�rent des contrats.
 * 
 * @author elfaramo
 *
 */
public class CleContrat implements IEntite {

	/**
	 * Serial version id.
	 */
	private static final long serialVersionUID = 1L;
	private long id;

	/** la clef d'authentification */
	private String cle;
	private Contrat contrat;
	private String dateCreation;
	private Calendar dateExpiration;
	
	/** L'�tat de la cl� */
	private String etat;

	/** Constante d�finissant les �tats possible de la clef */
	public static enum ETAT_CLE {
		NEW("00"), ACTIVE("01"), DESACTIVE("99");
		
		private String value;
		
		private ETAT_CLE(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	};

	@Override
	public long getId() {
		return id;
	}

	@Override
	public void setId(long id) {
		this.id = id;

	}

	@Override
	public EntiteFactory getFactory() {
		return null;
	}

	public String getCle() {
		return cle;
	}

	public void setCle(String cle) {
		this.cle = cle;
	}

	public Contrat getContrat() {
		return contrat;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}

	public String getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Calendar getDateExpiration() {
		return dateExpiration;
	}

	public void setDateExpiration(Calendar dateExpiration) {
		this.dateExpiration = dateExpiration;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

}
