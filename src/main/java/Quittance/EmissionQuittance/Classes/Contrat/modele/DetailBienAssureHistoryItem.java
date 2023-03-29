/**
 * 
 */
package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.utile.referentiel.FamilleGarantie;
import com.rmawatanya.convergence.utile.referentiel.TypeBienAssure;

/**
 * @author M.ayouch
 * 
 */
public class DetailBienAssureHistoryItem implements IEntite {


	private long id;

	private TypeBienAssure refTypeBienAssure;

	private FamilleGarantie refFamilleGarantie;

	private Calendar dateCreation;

	private Calendar dateEcheance;

	private Double prime;
	
	private Double primePromotion;

	private String usageHabitation;
	
	private String typeHabitation;
	
	private String formule;
	
	protected String ojbConcreteClass;

	public DetailBienAssureHistoryItem() {
		super();
		ojbConcreteClass = DetailBienAssureHistoryItem.class.getName();
	}

	public String getOjbConcreteClass() {
		return ojbConcreteClass;
	}

	public void setOjbConcreteClass(String ojbConcreteClass) {
		this.ojbConcreteClass = ojbConcreteClass;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public TypeBienAssure getRefTypeBienAssure() {
		return refTypeBienAssure;
	}

	public void setRefTypeBienAssure(TypeBienAssure refTypeBienAssure) {
		this.refTypeBienAssure = refTypeBienAssure;
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

	
}
