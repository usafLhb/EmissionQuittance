package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.List;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;
 
import com.rmawatanya.convergence.application.prd.metier.modele.GarantieFormule;

public class GarantieDommage implements IEntite {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id;
//	private Garantie refGarantie;
	private GarantieFormule refGarantieFormule;
//	private Double pourcentage;
	private Double prime;
	private Double rabais;
	private Double majoration;
	private Double surprime;
	private Integer optionRC;
	private Double montantTaxeParafiscale;
	
	private Boolean active;
	
	private PartieDommages refPartieDommages;
	
	private List<DetailGarantieDommage> refDetailsGarantieDommage;
	
	private List<AssureDommage> refAssures;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
//	public Garantie getRefGarantie() {
//		return refGarantie;
//	}
//	public void setRefGarantie(Garantie refGarantie) {
//		this.refGarantie = refGarantie;
//	}
	
	public PartieDommages getRefPartieDommages() {
		return refPartieDommages;
	}
	public void setRefPartieDommages(PartieDommages refPartieDommages) {
		this.refPartieDommages = refPartieDommages;
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
	
	
	
//	/**
//	 * @return the pourcentage
//	 */
//	public Double getPourcentage() {
//		return pourcentage;
//	}
//	/**
//	 * @param pourcentage the pourcentage to set
//	 */
//	public void setPourcentage(Double pourcentage) {
//		this.pourcentage = pourcentage;
//	}
	
	
	
//	public String getTypeChoixGarantie() {
//		return typeChoixGarantie;
//	}
//	public void setTypeChoixGarantie(String typeChoixGarantie) {
//		this.typeChoixGarantie = typeChoixGarantie;
//	}
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
	public EntiteFactory getFactory() {
		return null;
	}
	public List<DetailGarantieDommage> getRefDetailsGarantieDommage() {
		return refDetailsGarantieDommage;
	}
	public void setRefDetailsGarantieDommage(
			List<DetailGarantieDommage> refDetailsGarantieDommage) {
		this.refDetailsGarantieDommage = refDetailsGarantieDommage;
	}
	public List<AssureDommage> getRefAssures() {
		return refAssures;
	}
	public void setRefAssures(List<AssureDommage> refAssures) {
		this.refAssures = refAssures;
	}
	public GarantieFormule getRefGarantieFormule() {
		return refGarantieFormule;
	}
	public void setRefGarantieFormule(GarantieFormule refGarantieFormule) {
		this.refGarantieFormule = refGarantieFormule;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public Double getSurprime() {
		return surprime;
	}
	public void setSurprime(Double surprime) {
		this.surprime = surprime;
	}
	public Double getMontantTaxeParafiscale() {
		return montantTaxeParafiscale;
	}
	public void setMontantTaxeParafiscale(Double montantTaxeParafiscale) {
		this.montantTaxeParafiscale = montantTaxeParafiscale;
	}
	
	

}
