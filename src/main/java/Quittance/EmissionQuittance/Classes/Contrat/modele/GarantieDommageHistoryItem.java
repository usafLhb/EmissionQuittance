package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.List;

import ma.co.omnidata.framework.services.historique.HistoryItem;

import com.rmawatanya.convergence.application.prd.metier.modele.GarantieFormule;

public class GarantieDommageHistoryItem extends HistoryItem {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id;
//	private Garantie refGarantie;
	private GarantieFormule refGarantieFormule;
	private Double prime;	
//	private Double pourcentage;
	private Double rabais;
	private Double majoration;
	private Double surprime;
	private Integer optionRC;
	
	private Boolean active;
	
	private PartieDommagesHistoryItem refPartieDommagesHistoryItem;
	
	private List<DetailGarantieDommageHistoryItem> refDetailsGarantieDommage;
	
	private List<AssureDommageHistoryItem> refAssures;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	
	/**
	 * @return the refPartieDommagesHistoryItem
	 */
	public PartieDommagesHistoryItem getRefPartieDommagesHistoryItem() {
		return refPartieDommagesHistoryItem;
	}
	/**
	 * @param refPartieDommagesHistoryItem the refPartieDommagesHistoryItem to set
	 */
	public void setRefPartieDommagesHistoryItem(
			PartieDommagesHistoryItem refPartieDommagesHistoryItem) {
		this.refPartieDommagesHistoryItem = refPartieDommagesHistoryItem;
	}
	/**
	 * @return the prime
	 */
	public Double getPrime() {
		return prime;
	}
	/**
	 * @param prime the prime to set
	 */
	public void setPrime(Double prime) {
		this.prime = prime;
	}
	public GarantieFormule getRefGarantieFormule() {
		return refGarantieFormule;
	}
	public void setRefGarantieFormule(GarantieFormule refGarantieFormule) {
		this.refGarantieFormule = refGarantieFormule;
	}
	public Double getRabais() {
		return rabais;
	}
	public void setRabais(Double rabais) {
		this.rabais = rabais;
	}
	public Double getMajoration() {
		return majoration;
	}
	public void setMajoration(Double majoration) {
		this.majoration = majoration;
	}
	public Integer getOptionRC() {
		return optionRC;
	}
	public void setOptionRC(Integer optionRC) {
		this.optionRC = optionRC;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public List<DetailGarantieDommageHistoryItem> getRefDetailsGarantieDommage() {
		return refDetailsGarantieDommage;
	}
	public void setRefDetailsGarantieDommage(
			List<DetailGarantieDommageHistoryItem> refDetailsGarantieDommage) {
		this.refDetailsGarantieDommage = refDetailsGarantieDommage;
	}
	public List<AssureDommageHistoryItem> getRefAssures() {
		return refAssures;
	}
	public void setRefAssures(List<AssureDommageHistoryItem> refAssures) {
		this.refAssures = refAssures;
	}
	public Double getSurprime() {
		return surprime;
	}
	public void setSurprime(Double surprime) {
		this.surprime = surprime;
	}
	
	
	
	

}
