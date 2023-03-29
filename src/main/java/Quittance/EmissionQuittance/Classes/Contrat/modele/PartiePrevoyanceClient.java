package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;

import com.rmawatanya.convergence.utile.referentiel.ProduitAssuranceBase;
import com.rmawatanya.convergence.utile.referentiel.RegimeBase;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class PartiePrevoyanceClient implements IEntite {

	private static final long serialVersionUID = 1L;

	private long id;
	private Client refClient;
	private PartiePrevoyance refPartiePrevoyance;
	private Calendar dateEffet;
	private Calendar dateTerme;
	private Double prime;
	private Double surprime;
	private Double tauxSurprime; 
	private Double montantTax; 
	private Boolean prorogation;
	private Calendar dateDebut;
	private Calendar dateFin;
	private String etat;
	private String evenement;
	private Calendar dateEvenement;
	private Calendar dateEffetModification;
	private Boolean infirmite;
	//AMC
	private Double salaireAnnuel;
	private RegimeBase refRegimeBase;
	private ProduitAssuranceBase refProduitAssurBase; 
	private Calendar dateAdhAssur;
	private String numAffiliation;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Client getRefClient() {
		return refClient;
	}
	public void setRefClient(Client refClient) {
		this.refClient = refClient;
	}
	public PartiePrevoyance getRefPartiePrevoyance() {
		return refPartiePrevoyance;
	}
	public void setRefPartiePrevoyance(PartiePrevoyance refPartiePrevoyance) {
		this.refPartiePrevoyance = refPartiePrevoyance;
	}
	
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
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
	public Double getPrime() {
		return prime;
	}
	public void setPrime(Double prime) {
		this.prime = prime;
	}
	public Double getSurprime() {
		return surprime;
	}
	public void setSurprime(Double surprime) {
		this.surprime = surprime;
	}
	public Double getTauxSurprime() {
		return tauxSurprime;
	}
	public void setTauxSurprime(Double tauxSurprime) {
		this.tauxSurprime = tauxSurprime;
	}
	public Boolean getProrogation() {
		return prorogation;
	}
	public void setProrogation(Boolean prorogation) {
		this.prorogation = prorogation;
	}
	public Calendar getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Calendar dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Calendar getDateFin() {
		return dateFin;
	}
	public void setDateFin(Calendar dateFin) {
		this.dateFin = dateFin;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public String getEvenement() {
		return evenement;
	}
	public void setEvenement(String evenement) {
		this.evenement = evenement;
	}
	public Calendar getDateEvenement() {
		return dateEvenement;
	}
	public void setDateEvenement(Calendar dateEvenement) {
		this.dateEvenement = dateEvenement;
	}
	public Calendar getDateEffetModification() {
		return dateEffetModification;
	}
	public void setDateEffetModification(Calendar dateEffetModification) {
		this.dateEffetModification = dateEffetModification;
	}
	public Boolean getInfirmite() {
		return infirmite;
	}
	public void setInfirmite(Boolean infirmite) {
		this.infirmite = infirmite;
	}
	public Double getMontantTax() {
		return montantTax;
	}
	public void setMontantTax(Double montantTax) {
		this.montantTax = montantTax;
	}
	public Double getSalaireAnnuel() {
		return salaireAnnuel;
	}
	public void setSalaireAnnuel(Double salaireAnnuel) {
		this.salaireAnnuel = salaireAnnuel;
	}
	public RegimeBase getRefRegimeBase() {
		return refRegimeBase;
	}
	public void setRefRegimeBase(RegimeBase refRegimeBase) {
		this.refRegimeBase = refRegimeBase;
	}
	public ProduitAssuranceBase getRefProduitAssurBase() {
		return refProduitAssurBase;
	}
	public void setRefProduitAssurBase(ProduitAssuranceBase refProduitAssurBase) {
		this.refProduitAssurBase = refProduitAssurBase;
	}
	public Calendar getDateAdhAssur() {
		return dateAdhAssur;
	}
	public void setDateAdhAssur(Calendar dateAdhAssur) {
		this.dateAdhAssur = dateAdhAssur;
	}
	public String getNumAffiliation() {
		return numAffiliation;
	}
	public void setNumAffiliation(String numAffiliation) {
		this.numAffiliation = numAffiliation;
	}



}