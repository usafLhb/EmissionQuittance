/**
 * 
 */
package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.utile.referentiel.FamilleGarantie;

/**
 * @author M.ayouch
 * 
 */
public class DetailBienAssure implements IEntite {


	private long id;
	private long codeDetailEcheancier;
	private BienAssure refBienAssure;

	private FamilleGarantie refFamilleGarantie;

	private Calendar dateCreation;

	private Calendar dateEcheance;

	private Double prime;
	
	private Double primePromotion;

	private String usageHabitation;
	
	private String typeHabitation;
	
	private String formule;
	
	

	

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

	public BienAssure getRefBienAssure() {
		return refBienAssure;
	}

	public void setRefBienAssure(BienAssure refBienAssure) {
		this.refBienAssure = refBienAssure;
	}

	public long getCodeDetailEcheancier() {
		return codeDetailEcheancier;
	}

	public void setCodeDetailEcheancier(long codeDetailEcheancier) {
		this.codeDetailEcheancier = codeDetailEcheancier;
	}

	
}
