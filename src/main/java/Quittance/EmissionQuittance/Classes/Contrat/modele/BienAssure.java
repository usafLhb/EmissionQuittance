/**
 * 
 */
package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;
import java.util.Collection;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.utile.referentiel.FamilleGarantie;
import com.rmawatanya.convergence.utile.referentiel.TypeBienAssure;

/**
 * @author b.slayki
 * 
 */
public abstract class BienAssure implements IEntite {

	// Champs communs
	private long id;
	private String libelle;
	private RisqueDommages refRisque;
	
	private Collection refDetailBienAssure;

	private TypeBienAssure refTypeBienAssure;

	private FamilleGarantie refFamilleGarantie;

	private Calendar dateCreation;

	private Calendar dateDerniereMaj;

	private Double prime;
	
	private Double primePromotion;

	private Double surprime;

	private String etat;
	
	private Calendar dateQuittancement;
	
	private Double primeProratat;

	protected String ojbConcreteClass;

	public BienAssure() {
		super();
		ojbConcreteClass = BienAssure.class.getName();
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

	public Double getSurprime() {
		return surprime;
	}

	public void setSurprime(Double surprime) {
		this.surprime = surprime;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
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

	public RisqueDommages getRefRisque() {
		return refRisque;
	}

	public void setRefRisque(RisqueDommages refRisque) {
		this.refRisque = refRisque;
	}

	public Calendar getDateDerniereMaj() {
		return dateDerniereMaj;
	}

	public void setDateDerniereMaj(Calendar dateDerniereMaj) {
		this.dateDerniereMaj = dateDerniereMaj;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Double getPrimePromotion() {
		return primePromotion;
	}

	public void setPrimePromotion(Double primePromotion) {
		this.primePromotion = primePromotion;
	}

	public Calendar getDateQuittancement() {
		return dateQuittancement;
	}

	public void setDateQuittancement(Calendar dateQuittancement) {
		this.dateQuittancement = dateQuittancement;
	}

	public Double getPrimeProratat() {
		return primeProratat;
	}

	public void setPrimeProratat(Double primeProratat) {
		this.primeProratat = primeProratat;
	}

	public Collection getRefDetailBienAssure() {
		return refDetailBienAssure;
	}

	public void setRefDetailBienAssure(Collection refDetailBienAssure) {
		this.refDetailBienAssure = refDetailBienAssure;
	}



}
