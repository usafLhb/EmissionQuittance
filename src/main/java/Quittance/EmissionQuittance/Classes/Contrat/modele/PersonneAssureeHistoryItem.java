
package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.historique.HistoryItem;

import com.rmawatanya.convergence.application.prd.metier.modele.Option;
import com.rmawatanya.convergence.utile.referentiel.FamilleGarantie;
import com.rmawatanya.convergence.utile.referentiel.TypePersonneAssuree;

public class PersonneAssureeHistoryItem extends HistoryItem {

	private RisquePrevoyanceHistoryItem refRisquePrevoyanceHistoryItem;
	private Option refOption;
	private TypePersonneAssuree refTypePersonneAssuree;
	private FamilleGarantie refFamilleGarantie;
	private Client refClientHistoryItem;
	private String etat;	
	private Calendar dateCreation;
	private Calendar dateDerniereMaj;
	private Double prime;
	private Double tauxPrime;
	private Double surPrime;
	private Double tauxSurprime;	

	protected String ojbConcreteClass;

	public PersonneAssureeHistoryItem() {
		super();
		ojbConcreteClass = PersonneAssureeHistoryItem.class.getName();
	}

	public String getOjbConcreteClass() {
		return ojbConcreteClass;
	}

	public void setOjbConcreteClass(String ojbConcreteClass) {
		this.ojbConcreteClass = ojbConcreteClass;
	}

	public Calendar getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Calendar dateCreation) {
		this.dateCreation = dateCreation;
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

	public RisquePrevoyanceHistoryItem getRefRisquePrevoyanceHistoryItem() {
		return refRisquePrevoyanceHistoryItem;
	}

	public void setRefRisquePrevoyanceHistoryItem(
			RisquePrevoyanceHistoryItem refRisquePrevoyanceHistoryItem) {
		this.refRisquePrevoyanceHistoryItem = refRisquePrevoyanceHistoryItem;
	}

	public Client getRefClientHistoryItem() {
		return refClientHistoryItem;
	}

	public void setRefClientHistoryItem(Client refClientHistoryItem) {
		this.refClientHistoryItem = refClientHistoryItem;
	}

	public Double getSurPrime() {
		return surPrime;
	}

	public void setSurPrime(Double surPrime) {
		this.surPrime = surPrime;
	}

}
