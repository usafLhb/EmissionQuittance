
package Quittance.EmissionQuittance.Classes.Prestation.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class AvisReglement implements IEntite
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String numeroHist;
	private QuittanceReglement refQuittanceReglement;
	private String refPositionnement;
	private String refReglement;
	private String modeReglement;
	private String numeroCheque;
	private String fichierSimt;
	private String etat;
	private Calendar dateReglement;
	
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	
	public Calendar getDateReglement() {
		return dateReglement;
	}

	public void setDateReglement(Calendar dateReglement) {
		this.dateReglement = dateReglement;
	}
	
	
	public String getNumeroHist() {
		return numeroHist;
	}

	public void setNumeroHist(String numeroHist) {
		this.numeroHist = numeroHist;
	}


	public QuittanceReglement getRefQuittanceReglement() {
		return refQuittanceReglement;
	}

	public void setRefQuittanceReglement(
			QuittanceReglement refQuittanceReglement) {
		this.refQuittanceReglement = refQuittanceReglement;
	}

	public String getRefPositionnement() {
		return refPositionnement;
	}

	public void setRefPositionnement(String refPositionnement) {
		this.refPositionnement = refPositionnement;
	}

	public String getRefReglement() {
		return refReglement;
	}

	public void setRefReglement(String refReglement) {
		this.refReglement = refReglement;
	}

	public String getModeReglement() {
		return modeReglement;
	}

	public void setModeReglement(String modeReglement) {
		this.modeReglement = modeReglement;
	}

	public String getNumeroCheque() {
		return numeroCheque;
	}

	public void setNumeroCheque(String numeroCheque) {
		this.numeroCheque = numeroCheque;
	}

	public String getFichierSimt() {
		return fichierSimt;
	}

	public void setFichierSimt(String fichierSimt) {
		this.fichierSimt = fichierSimt;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public EntiteFactory getFactory() {
		return null;
	}
   
   
 
		
}
