package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.List;

import com.rmawatanya.convergence.application.prd.metier.modele.GarantieFormule;
import com.rmawatanya.convergence.utile.referentiel.Garantie;

import ma.co.omnidata.framework.services.historique.HistoryItem;

public class GarantiePrevoyanceHistoryItem extends HistoryItem {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id;
	private int numHistorique;
	
	private GarantieFormule refGarantieFormule;
	private Garantie refGarantie;
	private Double prime;	
	private Double type;
	private Double taux;
	
	
	private List<PartiePrevoyanceHistoryItem> refPartiePrevoyanceHistoryItem;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNumHistorique() {
		return numHistorique;
	}
	public void setNumHistorique(int numHistorique) {
		this.numHistorique = numHistorique;
	}
	public GarantieFormule getRefGarantieFormule() {
		return refGarantieFormule;
	}
	public void setRefGarantieFormule(GarantieFormule refGarantieFormule) {
		this.refGarantieFormule = refGarantieFormule;
	}
	public Garantie getRefGarantie() {
		return refGarantie;
	}
	public void setRefGarantie(Garantie refGarantie) {
		this.refGarantie = refGarantie;
	}
	public Double getPrime() {
		return prime;
	}
	public void setPrime(Double prime) {
		this.prime = prime;
	}
	public Double getType() {
		return type;
	}
	public void setType(Double type) {
		this.type = type;
	}
	public Double getTaux() {
		return taux;
	}
	public void setTaux(Double taux) {
		this.taux = taux;
	}
	public List<PartiePrevoyanceHistoryItem> getRefPartiePrevoyanceHistoryItem() {
		return refPartiePrevoyanceHistoryItem;
	}
	public void setRefPartiePrevoyanceHistoryItem(List<PartiePrevoyanceHistoryItem> refPartiePrevoyanceHistoryItem) {
		this.refPartiePrevoyanceHistoryItem = refPartiePrevoyanceHistoryItem;
	}
	
		

}
