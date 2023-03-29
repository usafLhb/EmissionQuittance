/**
 * 
 */
package Quittance.EmissionQuittance.Classes.Prelevements.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.utile.referentiel.FamilleGarantie;
import com.rmawatanya.convergence.utile.referentiel.Garantie;

/**
 * @author M.ayouch
 * 
 */
public class DetailEcheancier implements IEntite {


	private long id;
	private long codeDetailEcheancier;
	private EcheancierPrelevement refEcheancierPrelevement;

	private FamilleGarantie refFamilleGarantie;

	private Calendar dateCreation;

	private Calendar dateEcheance;

	private Double prime;
	
	private Double primePromotion;

	private String usageHabitation;
	
	private String typeHabitation;
	
	private String formule;
	
	private Garantie refGarantie;
	
	private Double tauxTVA;
	
	private Double montantTaxeParafiscale;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Calendar getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Calendar dateCreation) {
		this.dateCreation = dateCreation;
	}

	

	/*
	 * (non-Javadoc)
	 * 
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public Double getPrime() {
		return prime;
	}

	public void setPrime(Double prime) {
		this.prime = prime;
	}

	public FamilleGarantie getRefFamilleGarantie() {
		return refFamilleGarantie;
	}

	public void setRefFamilleGarantie(FamilleGarantie refFamilleGarantie) {
		this.refFamilleGarantie = refFamilleGarantie;
	}

	public Calendar getDateEcheance() {
		return dateEcheance;
	}

	public void setDateEcheance(Calendar dateEcheance) {
		this.dateEcheance = dateEcheance;
	}

	public Double getPrimePromotion() {
		return primePromotion;
	}

	public void setPrimePromotion(Double primePromotion) {
		this.primePromotion = primePromotion;
	}

	public String getUsageHabitation() {
		return usageHabitation;
	}

	public void setUsageHabitation(String usageHabitation) {
		this.usageHabitation = usageHabitation;
	}

	public String getTypeHabitation() {
		return typeHabitation;
	}

	public void setTypeHabitation(String typeHabitation) {
		this.typeHabitation = typeHabitation;
	}

	public String getFormule() {
		return formule;
	}

	public void setFormule(String formule) {
		this.formule = formule;
	}

	public EcheancierPrelevement getRefEcheancierPrelevement() {
		return refEcheancierPrelevement;
	}

	public void setRefEcheancierPrelevement(
			EcheancierPrelevement refEcheancierPrelevement) {
		this.refEcheancierPrelevement = refEcheancierPrelevement;
	}

	public long getCodeDetailEcheancier() {
		return codeDetailEcheancier;
	}

	public void setCodeDetailEcheancier(long codeDetailEcheancier) {
		this.codeDetailEcheancier = codeDetailEcheancier;
	}

	/**
	 * @return the refGarantie
	 */
	public Garantie getRefGarantie() {
		return refGarantie;
	}

	/**
	 * @param refGarantie the refGarantie to set
	 */
	public void setRefGarantie(Garantie refGarantie) {
		this.refGarantie = refGarantie;
	}

	/**
	 * @return the tauxTVA
	 */
	public Double getTauxTVA() {
		return tauxTVA;
	}

	/**
	 * @param tauxTVA the tauxTVA to set
	 */
	public void setTauxTVA(Double tauxTVA) {
		this.tauxTVA = tauxTVA;
	}

	public Double getMontantTaxeParafiscale() {
		return montantTaxeParafiscale;
	}

	public void setMontantTaxeParafiscale(Double montantTaxeParafiscale) {
		this.montantTaxeParafiscale = montantTaxeParafiscale;
	}

	
	
	
}
