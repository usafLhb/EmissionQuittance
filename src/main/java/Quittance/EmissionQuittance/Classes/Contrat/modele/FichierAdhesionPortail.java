package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;
import java.util.List;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class FichierAdhesionPortail implements IEntite {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;	   
	private String refFichier;
	private Calendar dateCreation;
    private String etat;
	private String causeEchec;
	private String numeroContratGroupe;
	private String cle;
	private List<AdherentPortail> refAdhesion;
	   
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRefFichier() {
		return refFichier;
	}
	public void setRefFichier(String refFichier) {
		this.refFichier = refFichier;
	}
	public Calendar getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Calendar dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public String getCauseEchec() {
		return causeEchec;
	}
	public void setCauseEchec(String causeEchec) {
		this.causeEchec = causeEchec;
	}
	public String getNumeroContratGroupe() {
		return numeroContratGroupe;
	}
	public void setNumeroContratGroupe(String numeroContratGroupe) {
		this.numeroContratGroupe = numeroContratGroupe;
	}
	public String getCle() {
		return cle;
	}
	public void setCle(String cle) {
		this.cle = cle;
	}
	public FichierAdhesionPortail() {
	}
	@Override
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}
	public List<AdherentPortail> getRefAdhesion() {
		return refAdhesion;
	}
	public void setRefAdhesion(List<AdherentPortail> refAdhesion) {
		this.refAdhesion = refAdhesion;
	}

	
}
