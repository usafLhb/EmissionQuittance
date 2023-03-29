package Quittance.EmissionQuittance.Classes.Contrat.modele;

import ma.co.omnidata.framework.services.lieux.LieuUnit;

/**
 * @author FZ EL OUERKHAOUI
 */
public class Pays extends LieuUnit {

	private String libelleNationaliteArabe;
	private String libelleNationaliteLatin;
	
	
	
	public String getLibelleNationaliteArabe() {
		return libelleNationaliteArabe;
	}
	public void setLibelleNationaliteArabe(String libelleNationaliteArabe) {
		this.libelleNationaliteArabe = libelleNationaliteArabe;
	}
	public String getLibelleNationaliteLatin() {
		return libelleNationaliteLatin;
	}
	public void setLibelleNationaliteLatin(String libelleNationaliteLatin) {
		this.libelleNationaliteLatin = libelleNationaliteLatin;
	}
}
