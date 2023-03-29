
package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;
import java.util.Collection;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.utile.referentiel.TypeFractionnementPrime;

public class RisquePrevoyance implements IEntite {

	   private long id;
	   private Double primeTotale;
	   private Calendar dateVersementPermierePrime; 
	   private Calendar dateCreation;
	   private Calendar dateEffet;
	   private Calendar dateEcheance;
	   private Calendar dateTerme;
	   private Calendar dateDerniereMaj;

	   private Contrat refContrat;
	   private TypeFractionnementPrime refTypeFractionnementPrime;
	   private Collection refPersonnesAssurees;
	   private Collection refCoassurances;

	   
	   public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public Contrat getRefContrat() {
		return refContrat;
	}

	public void setRefContrat(Contrat refContrat) {
		this.refContrat = refContrat;
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
	public Collection getRefPersonnesAssurees() {
		return refPersonnesAssurees;
	}
	public void setRefPersonnesAssurees(Collection refPersonnesAssurees) {
		this.refPersonnesAssurees = refPersonnesAssurees;
	}

	public Calendar getDateVersementPermierePrime() {
		return dateVersementPermierePrime;
	}

	public void setDateVersementPermierePrime(Calendar dateVersementPermierePrime) {
		this.dateVersementPermierePrime = dateVersementPermierePrime;
	}

	public Collection getRefCoassurances() {
		return refCoassurances;
	}

	public void setRefCoassurances(Collection refCoassurances) {
		this.refCoassurances = refCoassurances;
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
