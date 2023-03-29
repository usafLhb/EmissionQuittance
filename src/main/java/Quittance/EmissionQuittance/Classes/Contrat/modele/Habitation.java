/**
 * 
 */
package Quittance.EmissionQuittance.Classes.Contrat.modele;

import com.rmawatanya.convergence.application.prd.metier.modele.Option;
import com.rmawatanya.convergence.utile.referentiel.QualiteOccupantHabitation;
import com.rmawatanya.convergence.utile.referentiel.SecteurActivite;
import com.rmawatanya.convergence.utile.referentiel.Ville;

/**
 * @author b.slayki
 * 
 */
public class Habitation extends BienAssure {

	private long id;

	private SecteurActivite refSecteur;

	private String delegation;

	private String organismeDelegataire;

	private String montantDelegation;

	private String usageHabitation;

	private Double valeurContenu;

	private Double valeurBatiment;

	private String adresseSituationRisque;

	private Ville refVille;

	private String codePostale;

	private QualiteOccupantHabitation refQualiteOccupantHabitation;

	private String complementQualiteOccupant; // autre

	private String gardien;

	private String typeHabitation;

	private String typeClient;

	private String piscine;

	private Option refOption;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public SecteurActivite getRefSecteur() {
		return refSecteur;
	}

	public void setRefSecteur(SecteurActivite refSecteur) {
		this.refSecteur = refSecteur;
	}

	public String getDelegation() {
		return delegation;
	}

	public void setDelegation(String delegation) {
		this.delegation = delegation;
	}

	public String getOrganismeDelegataire() {
		return organismeDelegataire;
	}

	public void setOrganismeDelegataire(String organismeDelegataire) {
		this.organismeDelegataire = organismeDelegataire;
	}

	public String getMontantDelegation() {
		return montantDelegation;
	}

	public void setMontantDelegation(String montantDelegation) {
		this.montantDelegation = montantDelegation;
	}

	public String getUsageHabitation() {
		return usageHabitation;
	}

	public void setUsageHabitation(String usageHabitation) {
		this.usageHabitation = usageHabitation;
	}

	public Double getValeurContenu() {
		return valeurContenu;
	}

	public void setValeurContenu(Double valeurContenu) {
		this.valeurContenu = valeurContenu;
	}

	public Double getValeurBatiment() {
		return valeurBatiment;
	}

	public void setValeurBatiment(Double valeurBatiment) {
		this.valeurBatiment = valeurBatiment;
	}

	public String getAdresseSituationRisque() {
		return adresseSituationRisque;
	}

	public void setAdresseSituationRisque(String adresseSituationRisque) {
		this.adresseSituationRisque = adresseSituationRisque;
	}

	public Ville getRefVille() {
		return refVille;
	}

	public void setRefVille(Ville refVille) {
		this.refVille = refVille;
	}

	public String getCodePostale() {
		return codePostale;
	}

	public void setCodePostale(String codePostale) {
		this.codePostale = codePostale;
	}

	public QualiteOccupantHabitation getRefQualiteOccupantHabitation() {
		return refQualiteOccupantHabitation;
	}

	public void setRefQualiteOccupantHabitation(QualiteOccupantHabitation refQualiteOccupantHabitation) {
		this.refQualiteOccupantHabitation = refQualiteOccupantHabitation;
	}

	public String getComplementQualiteOccupant() {
		return complementQualiteOccupant;
	}

	public void setComplementQualiteOccupant(String complementQualiteOccupant) {
		this.complementQualiteOccupant = complementQualiteOccupant;
	}

	public String getGardien() {
		return gardien;
	}

	public void setGardien(String gardien) {
		this.gardien = gardien;
	}

	public String getTypeHabitation() {
		return typeHabitation;
	}

	public void setTypeHabitation(String typeHabitation) {
		this.typeHabitation = typeHabitation;
	}

	public String getTypeClient() {
		return typeClient;
	}

	public void setTypeClient(String typeClient) {
		this.typeClient = typeClient;
	}

	public String getPiscine() {
		return piscine;
	}

	public void setPiscine(String piscine) {
		this.piscine = piscine;
	}

	public Option getRefOption() {
		return refOption;
	}

	public void setRefOption(Option refOption) {
		this.refOption = refOption;
	}

}
