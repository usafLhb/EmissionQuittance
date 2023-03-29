package Quittance.EmissionQuittance.Classes.Quittancement.modele;


import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;
 
import com.rmawatanya.convergence.utile.referentiel.Garantie;

public class DetailQuittance implements IEntite
{
   private static final long serialVersionUID = 1L;
   
   private long id;
   private Double pourcentageGarantie;
   private Double primeNette;
   private Double montantEncaise;
   private Double montantTaxe;
   private Double tauxCommission;
   private Double montantCommission;
   private Double tauxTaxeSurCommission;
   private Double montantTaxeSurCommission;
   private Double montantTaxeParafiscale;
   
   private Quittance refQuittance;   
   private Garanties refGarantie;
   private Garantie refGarantieDommage;
   
public DetailQuittance() {
	super();
	// TODO Auto-generated constructor stub
}

public static long getSerialVersionUID() {
	return serialVersionUID;
}


public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public Double getMontantCommission() {
	return montantCommission;
}

public void setMontantCommission(Double montantCommission) {
	this.montantCommission = montantCommission;
}

public Double getMontantTaxe() {
	return montantTaxe;
}

public void setMontantTaxe(Double montantTaxe) {
	this.montantTaxe = montantTaxe;
}

public Double getMontantTaxeSurCommission() {
	return montantTaxeSurCommission;
}

public void setMontantTaxeSurCommission(Double montantTaxeSurCommission) {
	this.montantTaxeSurCommission = montantTaxeSurCommission;
}

public Double getPourcentageGarantie() {
	return pourcentageGarantie;
}

public void setPourcentageGarantie(Double pourcentageGarantie) {
	this.pourcentageGarantie = pourcentageGarantie;
}

public Double getPrimeNette() {
	return primeNette;
}

public void setPrimeNette(Double primeNette) {
	this.primeNette = primeNette;
}

public Double getMontantEncaise() {
	return montantEncaise;
}

public void setMontantEncaise(Double montantEncaise) {
	this.montantEncaise = montantEncaise;
}

public Garanties getRefGarantie() {
	return refGarantie;
}

public void setRefGarantie(Garanties refGarantie) {
	this.refGarantie = refGarantie;
}

public Quittance getRefQuittance() {
	return refQuittance;
}

public void setRefQuittance(Quittance refQuittance) {
	this.refQuittance = refQuittance;
}

public Double getTauxCommission() {
	return tauxCommission;
}

public void setTauxCommission(Double tauxCommission) {
	this.tauxCommission = tauxCommission;
}

public Double getTauxTaxeSurCommission() {
	return tauxTaxeSurCommission;
}

public void setTauxTaxeSurCommission(Double tauxTaxeSurCommission) {
	this.tauxTaxeSurCommission = tauxTaxeSurCommission;
}

public EntiteFactory getFactory() {
	// TODO Auto-generated method stub
	return null;
}

public Garantie getRefGarantieDommage() {
	return refGarantieDommage;
}

public void setRefGarantieDommage(Garantie refGarantieDommage) {
	this.refGarantieDommage = refGarantieDommage;
}

/**
 * @return montantTaxeParafiscale par garantie
 */
public Double getMontantTaxeParafiscale() {
	return montantTaxeParafiscale;
}

/**
 * @param montantTaxeParafiscale the montantTaxeParafiscale to set
 */
public void setMontantTaxeParafiscale(Double montantTaxeParafiscale) {
	this.montantTaxeParafiscale = montantTaxeParafiscale;
}




}