
package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.application.prd.metier.modele.Option;
import com.rmawatanya.convergence.utile.referentiel.FamilleGarantie;
import com.rmawatanya.convergence.utile.referentiel.TypePersonneAssuree;

public class PersonneAssuree implements IEntite {

	private long id;
	private RisquePrevoyance refRisquePrevoyance;
	private Option refOption;
	private TypePersonneAssuree refTypePersonneAssuree;
	private FamilleGarantie refFamilleGarantie;
	private Client refClient;
	private String etat;	
	private Calendar dateCreation;
	private Calendar dateDerniereMaj;
	private Double prime;
	private Double tauxPrime;
	private Double surprime;
	private Double tauxSurprime;	

	protected String ojbConcreteClass;

	public PersonneAssuree() {
		super();
		ojbConcreteClass = PersonneAssuree.class.getName();
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

	public RisquePrevoyance getRefRisquePrevoyance() {
		return refRisquePrevoyance;
	}

	public void setRefRisquePrevoyance(RisquePrevoyance refRisquePrevoyance) {
		this.refRisquePrevoyance = refRisquePrevoyance;
	}

	public TypePersonneAssuree getRefTypePersonneAssuree() {
		return refTypePersonneAssuree;
	}

	public void setRefTypePersonneAssuree(TypePersonneAssuree refTypePersonneAssuree) {
		this.refTypePersonneAssuree = refTypePersonneAssuree;
	}

	public Calendar getDateDerniereMaj() {
		return dateDerniereMaj;
	}

	public void setDateDerniereMaj(Calendar dateDerniereMaj) {
		this.dateDerniereMaj = dateDerniereMaj;
	}

	public Client getRefClient() {
		return refClient;
	}

	public void setRefClient(Client refClient) {
		this.refClient = refClient;
	}

	public Option getRefOption() {
		return refOption;
	}

	public void setRefOption(Option refOption) {
		this.refOption = refOption;
	}

	public Double getTauxPrime() {
		return tauxPrime;
	}

	public void setTauxPrime(Double tauxPrime) {
		this.tauxPrime = tauxPrime;
	}

	public Double getTauxSurprime() {
		return tauxSurprime;
	}

	public void setTauxSurprime(Double tauxSurprime) {
		this.tauxSurprime = tauxSurprime;
	}

}
