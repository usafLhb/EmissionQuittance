/**
 * 
 */
package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;
import java.util.Collection;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.historique.HistoryItem;

import com.rmawatanya.convergence.utile.referentiel.TypeFractionnementPrime;

/**
 * @author FADILI
 * 
 */
public class RisquePrevoyanceHistoryItem extends HistoryItem {

	   private Double primeTotale;
	   private Calendar dateVersementPermierePrime; 
	   private Calendar dateCreation;
	   private Calendar dateEffet;
	   private Calendar dateEcheance;
	   private Calendar dateTerme;
	   private Calendar dateDerniereMaj;

	   private ContratHistoryItem refContratHistoryItem;
	   private TypeFractionnementPrime refTypeFractionnementPrime;
	   private Collection refCoassurancesHistoryItem;
	   private Collection refPersonnesAssureesHistoryItem;
   
	public ContratHistoryItem getRefContratHistoryItem() {
		return refContratHistoryItem;
	}

	public void setRefContratHistoryItem(ContratHistoryItem refContratHistoryItem) {
		this.refContratHistoryItem = refContratHistoryItem;
	}

	public TypeFractionnementPrime getRefTypeFractionnementPrime() {
		return refTypeFractionnementPrime;
	}

	public void setRefTypeFractionnementPrime(
			TypeFractionnementPrime refTypeFractionnementPrime) {
		this.refTypeFractionnementPrime = refTypeFractionnementPrime;
	}

	public Double getPrimeTotale() {
		return primeTotale;
	}

	public void setPrimeTotale(Double primeTotale) {
		this.primeTotale = primeTotale;
	}

	public Calendar getDateEffet() {
		return dateEffet;
	}

	public void setDateEffet(Calendar dateEffet) {
		this.dateEffet = dateEffet;
	}

	public Calendar getDateTerme() {
		return dateTerme;
	}

	public void setDateTerme(Calendar dateTerme) {
		this.dateTerme = dateTerme;
	}

	public Calendar getDateEcheance() {
		return dateEcheance;
	}

	public void setDateEcheance(Calendar dateEcheance) {
		this.dateEcheance = dateEcheance;
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
	public Collection getRefPersonnesAssureesHistoryItem() {
		return refPersonnesAssureesHistoryItem;
	}
	public void setRefPersonnesAssureesHistoryItem(Collection refPersonnesAssureesHistoryItem) {
		this.refPersonnesAssureesHistoryItem = refPersonnesAssureesHistoryItem;
	}

	public Calendar getDateVersementPermierePrime() {
		return dateVersementPermierePrime;
	}

	public void setDateVersementPermierePrime(Calendar dateVersementPermierePrime) {
		this.dateVersementPermierePrime = dateVersementPermierePrime;
	}

	public Collection getRefCoassurancesHistoryItem() {
		return refCoassurancesHistoryItem;
	}

	public void setRefCoassurancesHistoryItem(Collection refCoassurancesHistoryItem) {
		this.refCoassurancesHistoryItem = refCoassurancesHistoryItem;
	}
	
	public Calendar getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Calendar dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Calendar getDateDerniereMaj() {
		return dateDerniereMaj;
	}

	public void setDateDerniereMaj(Calendar dateDerniereMaj) {
		this.dateDerniereMaj = dateDerniereMaj;
	}
}
