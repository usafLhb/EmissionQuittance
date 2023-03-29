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
 * @author b.slayki
 * 
 */
public class RisqueHistoryItem extends HistoryItem{

	private ContratHistoryItem refContratHistoryItem;
	private TypeFractionnementPrime refTypeFractionnementPrime;
	private Calendar dateCreation;
	private Calendar dateDerniereMaj;
	private Double primeTotale; // calcul� = la somme des primes des biens assur�s
	private Calendar dateVersementPremierePrime;
	private Calendar dateEffet;
	private Calendar dateTerme;
	private Calendar dateEcheance;
	private Collection refBiensAssureHistoryItem;
	
	private Integer nombreDomestiques;
	
	private String garantiePiscineActive;
	
	private Double tauxTaxeParafiscale;
	private Double montantTaxeParafiscale;
	
	private Double primeGarantieEVECATTTC;
	
	protected String ojbConcreteClass;
	public String getOjbConcreteClass() {
		return ojbConcreteClass;
	}
	public void setOjbConcreteClass(String ojbConcreteClass) {
		this.ojbConcreteClass = ojbConcreteClass;
	}

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

	public Calendar getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Calendar dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Double getPrimeTotale() {
		return primeTotale;
	}

	public void setPrimeTotale(Double primeTotale) {
		this.primeTotale = primeTotale;
	}

	public Calendar getDateVersementPremierePrime() {
		return dateVersementPremierePrime;
	}

	public void setDateVersementPremierePrime(
			Calendar dateVersementPremierePrime) {
		this.dateVersementPremierePrime = dateVersementPremierePrime;
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
	public Collection getRefBiensAssureHistoryItem() {
		return refBiensAssureHistoryItem;
	}
	public void setRefBiensAssureHistoryItem(Collection refBiensAssureHistoryItem) {
		this.refBiensAssureHistoryItem = refBiensAssureHistoryItem;
	}
	public Calendar getDateDerniereMaj() {
		return dateDerniereMaj;
	}
	public void setDateDerniereMaj(Calendar dateDerniereMaj) {
		this.dateDerniereMaj = dateDerniereMaj;
	}
	public Integer getNombreDomestiques() {
		return nombreDomestiques;
	}
	public void setNombreDomestiques(Integer nombreDomestiques) {
		this.nombreDomestiques = nombreDomestiques;
	}
	public String getGarantiePiscineActive() {
		return garantiePiscineActive;
	}
	public void setGarantiePiscineActive(String garantiePiscineActive) {
		this.garantiePiscineActive = garantiePiscineActive;
	}
	public Double getTauxTaxeParafiscale() {
		return tauxTaxeParafiscale;
	}
	public void setTauxTaxeParafiscale(Double tauxTaxeParafiscale) {
		this.tauxTaxeParafiscale = tauxTaxeParafiscale;
	}
	public Double getMontantTaxeParafiscale() {
		return montantTaxeParafiscale;
	}
	public void setMontantTaxeParafiscale(Double montantTaxeParafiscale) {
		this.montantTaxeParafiscale = montantTaxeParafiscale;
	}
	public Double getPrimeGarantieEVECATTTC() {
		return primeGarantieEVECATTTC;
	}
	public void setPrimeGarantieEVECATTTC(Double primeGarantieEVECATTTC) {
		this.primeGarantieEVECATTTC = primeGarantieEVECATTTC;
	}

}
