/**
 * 
 */
package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.List;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.historique.HistoryItem;

import com.rmawatanya.convergence.application.prd.metier.modele.Option;
import com.rmawatanya.convergence.utile.referentiel.QualiteOccupantHabitation;
import com.rmawatanya.convergence.utile.referentiel.Ville;

/**
 * @author b.slayki
 * 
 */
public class BienHabitationHistoryItem extends BienAssureHistoryItem {

	private Option refOption;
	private String delegation;
	private String organismeDelegataire;
	private Double montantDelegation;
	private String usageHabitation;
	private Double valeurContenu;
	private Double valeurBatiment;
	private String adresseSituationRisque;
	private Ville refVille;
	private Integer codePostale;
	private QualiteOccupantHabitation refQualiteOccupantHabitation;
	private String complementQualiteOccupant;
	private String gardien;
	private String typeHabitation;
	private String typeClient;
	private Integer optionChoisie;
	// Piscine
	private String piscine;

	public BienHabitationHistoryItem() {
		super();
		ojbConcreteClass = BienHabitationHistoryItem.class.getName();
	}

	public String getAdresseSituationRisque() {
		return adresseSituationRisque;
	}

	public void setAdresseSituationRisque(String adressesituationrisque) {
		this.adresseSituationRisque = adressesituationrisque;
	}

	public Integer getCodePostale() {
		return codePostale;
	}

	public void setCodePostale(Integer codepostale) {
		this.codePostale = codepostale;
	}

	public String getComplementQualiteOccupant() {
		return complementQualiteOccupant;
	}

	public void setComplementQualiteOccupant(String complementqualiteoccupant) {
		this.complementQualiteOccupant = complementqualiteoccupant;
	}

	public String getDelegation() {
		return delegation;
	}

	public void setDelegation(String delegation) {
		this.delegation = delegation;
	}

	public String getGardien() {
		return gardien;
	}

	public void setGardien(String gardien) {
		this.gardien = gardien;
	}

	public Double getMontantDelegation() {
		return montantDelegation;
	}

	public void setMontantDelegation(Double montantdelegation) {
		this.montantDelegation = montantdelegation;
	}

	public String getOrganismeDelegataire() {
		return organismeDelegataire;
	}

	public void setOrganismeDelegataire(String organismedelegataire) {
		this.organismeDelegataire = organismedelegataire;
	}

	public Option getRefOption() {
		return refOption;
	}

	public void setRefOption(Option refOption) {
		this.refOption = refOption;
	}

	public QualiteOccupantHabitation getRefQualiteOccupantHabitation() {
		return refQualiteOccupantHabitation;
	}

	public void setRefQualiteOccupantHabitation(
			QualiteOccupantHabitation refQualiteOccupantHabitation) {
		this.refQualiteOccupantHabitation = refQualiteOccupantHabitation;
	}

	public Ville getRefVille() {
		return refVille;
	}

	public void setRefVille(Ville refVille) {
		this.refVille = refVille;
	}

	public String getTypeClient() {
		return typeClient;
	}

	public void setTypeClient(String typeclient) {
		this.typeClient = typeclient;
	}

	public String getTypeHabitation() {
		return typeHabitation;
	}

	public void setTypeHabitation(String typehabitation) {
		this.typeHabitation = typehabitation;
	}

	public String getUsageHabitation() {
		return usageHabitation;
	}

	public void setUsageHabitation(String usagehabitation) {
		this.usageHabitation = usagehabitation;
	}

	public Double getValeurBatiment() {
		return valeurBatiment;
	}

	public void setValeurBatiment(Double valeurbatiment) {
		this.valeurBatiment = valeurbatiment;
	}

	public Double getValeurContenu() {
		return valeurContenu;
	}

	public void setValeurContenu(Double valeurcontenu) {
		this.valeurContenu = valeurcontenu;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see ma.co.omnidata.framework.services.historique.IHistorisable#getHistory()
	 */
	public List getHistory() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ma.co.omnidata.framework.services.historique.IHistorisable#getLastHistoryItem()
	 */
	public HistoryItem getLastHistoryItem() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ma.co.omnidata.framework.services.historique.IHistorisable#getParents()
	 */
	public List getParents() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ma.co.omnidata.framework.services.historique.IHistorisable#historiser()
	 */
	public void historiser() {
		// TODO Auto-generated method stub

	}

	public String getPiscine() {
		return piscine;
	}

	public void setPiscine(String piscine) {
		this.piscine = piscine;
	}

	public Integer getOptionChoisie() {
		return optionChoisie;
	}

	public void setOptionChoisie(Integer optionChoisie) {
		this.optionChoisie = optionChoisie;
	}

}
