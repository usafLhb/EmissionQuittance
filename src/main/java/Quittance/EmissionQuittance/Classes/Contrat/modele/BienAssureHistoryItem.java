/**
 * 
 */
package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.historique.HistoryItem;

import com.rmawatanya.convergence.utile.referentiel.FamilleGarantie;
import com.rmawatanya.convergence.utile.referentiel.TypeBienAssure;

/**
 * @author b.slayki
 * 
 */
public abstract class BienAssureHistoryItem extends HistoryItem{

	private String libelle;
	
	private RisqueHistoryItem refRisqueHistoryItem;

	private TypeBienAssure refTypeBienAssure;

	private FamilleGarantie refFamilleGarantie;

	private Calendar dateCreation;

	private Calendar dateDerniereMaj;

	private Double prime;

	private Double surprime;

	private String etat;

	protected String ojbConcreteClass;
	private int numHistoriqueRisque;
	private int numHistorique;
	
	
	public int getNumHistoriqueRisque() {
		return numHistoriqueRisque;
	}

	public void setNumHistoriqueRisque(int numHistoriqueRisque) {
		this.numHistoriqueRisque = numHistoriqueRisque;
	}

	public BienAssureHistoryItem() {
		super();
		ojbConcreteClass = BienAssureHistoryItem.class.getName();
	}

	public String getOjbConcreteClass() {
		return ojbConcreteClass;
	}

	public void setOjbConcreteClass(String ojbConcreteClass) {
		this.ojbConcreteClass = ojbConcreteClass;
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

	public RisqueHistoryItem getRefRisqueHistoryItem() {
		return refRisqueHistoryItem;
	}

	public void setRefRisqueHistoryItem(RisqueHistoryItem refRisqueHistoryItem) {
		this.refRisqueHistoryItem = refRisqueHistoryItem;
	}

	public Calendar getDateDerniereMaj() {
		return dateDerniereMaj;
	}

	public void setDateDerniereMaj(Calendar dateDerniereMaj) {
		this.dateDerniereMaj = dateDerniereMaj;
	}

	public int getNumHistorique() {
		return numHistorique;
	}

	public void setNumHistorique(int numHistorique) {
		this.numHistorique = numHistorique;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
