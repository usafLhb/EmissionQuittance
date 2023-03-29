package Quittance.EmissionQuittance.Classes.Prestation.modele;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.application.oct.metier.modele.CarteHistoryItem;



public class AssciationPrestationCarte implements IEntite
{
	private long id;
	private Prestation refPrestation;
	private CarteHistoryItem refCarte;
	private int numHistorique;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public Prestation getRefPrestation() {
		return refPrestation;
	}

	public void setRefPrestation(Prestation refPrestation) {
		this.refPrestation = refPrestation;
	}

	public CarteHistoryItem getRefCarte() {
		return refCarte;
	}

	public void setRefCarte(CarteHistoryItem refCarte) {
		this.refCarte = refCarte;
	}

	public int getNumHistorique() {
		return numHistorique;
	}

	public void setNumHistorique(int numHistorique) {
		this.numHistorique = numHistorique;
	}

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

}
