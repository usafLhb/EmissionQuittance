package Quittance.EmissionQuittance.Classes.Prestation.modele;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;
import ma.co.omnidata.framework.utile.DateUtile;
import ma.co.omnidata.framework.utile.DoubleUtile;

import com.rmawatanya.convergence.application.oct.metier.modele.BienHabitation;
import com.rmawatanya.convergence.application.oct.metier.modele.Client;
import com.rmawatanya.convergence.application.oct.metier.modele.Contrat;
import com.rmawatanya.convergence.application.tpr.metier.manager.PrestationFactory;
import com.rmawatanya.convergence.application.tpr.metier.valueobjects.TprAvanceItem;
import com.rmawatanya.convergence.application.tpr.metier.valueobjects.TprDistributionItem;
import com.rmawatanya.convergence.application.tpr.metier.valueobjects.TprPrestationItem;
import com.rmawatanya.convergence.application.tpr.metier.valueobjects.TprRachatItem;
import com.rmawatanya.convergence.utile.common.Constantes;
import com.rmawatanya.convergence.utile.habilitations.Utilisateur;
import com.rmawatanya.convergence.utile.referentiel.CompagnieAssurance;
import com.rmawatanya.convergence.utile.referentiel.EtatPrestation;
import com.rmawatanya.convergence.utile.referentiel.NatureSinistre;
import com.rmawatanya.convergence.utile.referentiel.TypePrestation;
import com.rmawatanya.convergence.utile.referentiel.TypeRachatPartiel;
import com.rmawatanya.convergence.utile.referentiel.TypeRente;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;
import ma.co.omnidata.framework.utile.DateUtile;
import ma.co.omnidata.framework.utile.DoubleUtile;

public class Prestation implements IEntite {
	private long id;
	private String numeroDeclaration;
	private String numeroSinistre;
	private Calendar dateDemande;
	private Calendar dateCreation;
	/**
	 * enregistr�e, valid�e (en cours), termin�e (r�gl�e si rachat ou avance)
	 * sans suite annul�e
	 */
	private String etat;
	private EtatPrestation refEtatPrestation;
	private Calendar dateEtat;
	private BienHabitation refBiensAssure;
	private String valide;

	private Double montantRemboursementAvanceParRachat;

	private Collection refRemboursementsAvance;
	private TypePrestation refTypePrestation;
	
	// said (champs pour le cas des UC
	private TypeRachatPartiel refTypeRachatPartiel;
	
	private TypeRente refTypeRente;
	private Collection refQuittancesReglement = new ArrayList();
	private Contrat refContrat;
	private Integer numeroVersionContrat;

	private Calendar dateOuvertureSinistre;

	/**
	 * souscripteur, assur�, b�n�ficiaire ou autre
	 */
	private String typeDeclarant;
	private String typeDeclarantComplement;
	private Calendar dateSurvenance;
	private String lieuSurvenance;
	private String natureMaladie;
	private Boolean assuranceComplementaire;
	private Double mntRemboursementAssuranceComplementaire;
	private String commentaires;
	private Double montantEvaluation;

	private List refAttestationsPresentees;
	private Client refAssure;
	private CompagnieAssurance refCompagnieAssuranceComplementaire;

	private Double montant;
	private Double montantRachatDemande;
	private Double epargneRevaloriseeDemande;
	private Double montantPenalites;
	private Double montantIgr;
	private Double montantPrestationImposable;
	
	// Said : Cas UC
	private Double montantFraisGP;
	private Double montantFraisGestionUC;
	private Double montantFraisSortie;
	// fin Cas UC
	
	private Double cumulVersementsRachat;
	private Double prorataEpargneRachete;
	private Double plusValueRachat;

	private Boolean edite;
	private Calendar dateEditionDemande;
	private Calendar dateEditionQuittance;

	private String causes;
	private Calendar dateDebutPeriode;
	private Calendar dateFinPeriode;
	private String prestataireSante;
	private String raisonSocialePrestataireSante;
	private String nomMedecinTraitant;
	private String question;
	private String infosComplementaires;
	private Boolean sync2Centrale;
	private Boolean sync2Convergence;
	private Utilisateur utilisateurCC;
	private Utilisateur gestionnaire;

	private Boolean attestationFiscale;

	private Calendar dateMigration;
	private Boolean migre;

	// Pour la migration
	private String numeroLien;
	private String typeLien;
	private String nomEnfant;
	private String prenomEnfant;
	private String numeroLienQuittance;

	// Pour Monetique
	private NatureSinistre refNatureSinistre;
	private Collection refCartes;
	private Double montantUtilisationsFrauduleuses;
	private Double prixCartes;

	private Boolean papierCIN;
	private Boolean papierCSE;
	private Boolean papierPasseport;
	private Boolean papierPermisConduire;
	private Boolean papierCarteGrise;
	private Double montantFraisEngages;

	private String nomPrenomTransporteur;
	private Calendar dateNaissanceTransporteur;
	private String natureFondsTransportes;
	private Double montantPertes;

	// modification dans le cadre de l'adaptation du volet prestation pour les
	// contrats groupe
	private Double tauxPartPatronal;
	private Boolean rachatPatronal;
	private Prestation refPrestationPatronal;
	private String modeReglement;
	// besoin de comptabilit�
	private Double soldeAvanceEnAttente;
	private Double montantAvanceNominale;

	// besoin de colture de contrat apres un dece ou invalidite

	private Boolean clotureContrat;
	private String noteGestionnaire;
	private Calendar dateReceptionDossierPhysique;
	private String enAttenteInfo;
	// uc
	private Collection refDetailPrestationParSupport;
	private Collection refPorteFeuillesClient;

	// Distribution
	private String idOperation;
	private Calendar dateCreationOperation;
	private OperationDistribution refOperationDistribution;

	// Cas de r�version
	private Integer age;
	private Boolean sexe;

	// Avance associ� au Rachat Partiel
	private Prestation refAvance;

	// D�clarant D�c�s
	private DeclarantSinistre refDeclarant;
	// D�claration D�c�s
	private DeclarationDeces refDeclarationDeces;
	
	// Liquidation
	private Liquidation refLiquidation;
	
	
	private OperationRente refOperationRente;
	
	private String flagSynchBDC;
	
	//Commentaire Traitement sinistre
	//le motif de rejet en cas de rejet
	private String motifTraitement;
	
	// montant reserve initial sans r�glement
	private Double montantReserve;
	
	private Double montantReserveMaj;
	private Calendar dateReouverture;
	
	private Boolean calculIgrAvecAbattement;
	private Boolean exonereIgr;
	
	public OperationRente getRefOperationRente() {
		return refOperationRente;
	}

	public void setRefOperationRente(OperationRente refOperationRente) {
		this.refOperationRente = refOperationRente;
	}

	private Double montantTaxeSolidarite;
	
	private DeclarationSinistre refDeclarationSinistre;
	
	
	public Prestation getRefAvance() {
		return refAvance;
	}

	public void setRefAvance(Prestation refAvance) {
		this.refAvance = refAvance;
	}

	public String getValide() {
		return valide;
	}

	public void setValide(String valide) {
		this.valide = valide;
	}

	public Calendar getDateReceptionDossierPhysique() {
		return dateReceptionDossierPhysique;
	}

	public void setDateReceptionDossierPhysique(
			Calendar dateReceptionDossierPhysique) {
		this.dateReceptionDossierPhysique = dateReceptionDossierPhysique;
	}

	public String getNoteGestionnaire() {
		return noteGestionnaire;
	}

	public void setNoteGestionnaire(String noteGestionaire) {
		this.noteGestionnaire = noteGestionaire;
	}

	public Double getSoldeAvanceEnAttente() {
		return soldeAvanceEnAttente;
	}

	public void setSoldeAvanceEnAttente(Double soldeAvanceEnAttente) {
		this.soldeAvanceEnAttente = soldeAvanceEnAttente;
	}

	public String getModeReglement() {
		return modeReglement;
	}

	public void setModeReglement(String modeReglement) {
		this.modeReglement = modeReglement;
	}

	public Boolean getRachatPatronal() {
		return rachatPatronal;
	}

	public void setRachatPatronal(Boolean rachatPatronal) {
		this.rachatPatronal = rachatPatronal;
	}

	public Prestation getRefPrestationPatronal() {
		return refPrestationPatronal;
	}

	public void setRefPrestationPatronal(Prestation refPrestationPatronal) {
		this.refPrestationPatronal = refPrestationPatronal;
	}

	public Prestation() {

	}

	/**
	 * Access method for the id property.
	 * 
	 * @return the current value of the id property
	 */
	public long getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param aId
	 *            the new value of the id property
	 */
	public void setId(long aId) {
		id = aId;
	}

	/**
	 * Access method for the dateDemande property.
	 * 
	 * @return the current value of the dateDemande property
	 */
	public Calendar getDateDemande() {
		return dateDemande;
	}

	public String getDateDemandeLibelle() {
		return DateUtile.calendarToString(dateDemande);
	}

	/**
	 * Sets the value of the dateDemande property.
	 * 
	 * @param aDateDemande
	 *            the new value of the dateDemande property
	 */
	public void setDateDemande(Calendar aDateDemande) {
		dateDemande = aDateDemande;
	}

	/**
	 * Access method for the montant property.
	 * 
	 * @return the current value of the montant property
	 */
	public Double getMontant() {
		return montant;
	}

	/**
	 * Sets the value of the montant property.
	 * 
	 * @param aMontant
	 *            the new value of the montant property
	 */
	public void setMontant(Double aMontant) {
		montant = aMontant;
	}

	/**
	 * Access method for the etat property.
	 * 
	 * @return the current value of the etat property
	 */
	public String getEtat() {
		return etat;
	}

	/**
	 * Sets the value of the etat property.
	 * 
	 * @param aEtat
	 *            the new value of the etat property
	 */
	public void setEtat(String aEtat) {
		etat = aEtat;
	}

	/**
	 * Access method for the dateEtat property.
	 * 
	 * @return the current value of the dateEtat property
	 */
	public Calendar getDateEtat() {
		return dateEtat;
	}

	/**
	 * Sets the value of the dateEtat property.
	 * 
	 * @param aDateEtat
	 *            the new value of the dateEtat property
	 */
	public void setDateEtat(Calendar aDateEtat) {
		dateEtat = aDateEtat;
	}

	/**
	 * @return Returns the refRemboursementsAvance.
	 */
	public Collection getRefRemboursementsAvance() {
		return refRemboursementsAvance;
	}

	/**
	 * @param refRemboursementsAvance
	 *            The refRemboursementsAvance to set.
	 */
	public void setRefRemboursementsAvance(Collection refRemboursementsAvance) {
		this.refRemboursementsAvance = refRemboursementsAvance;
	}

	/**
	 * Access method for the refTypePrestation property.
	 * 
	 * @return the current value of the refTypePrestation property
	 */
	public TypePrestation getRefTypePrestation() {
		return refTypePrestation;
	}

	/**
	 * Sets the value of the refTypePrestation property.
	 * 
	 * @param aRefTypePrestation
	 *            the new value of the refTypePrestation property
	 */
	public void setRefTypePrestation(TypePrestation aRefTypePrestation) {
		refTypePrestation = aRefTypePrestation;
	}

	/**
	 * @return Returns the refQuittancesReglement.
	 */
	public Collection getRefQuittancesReglement() {
		return refQuittancesReglement;
	}

	/**
	 * @param refQuittancesReglement
	 *            The refQuittancesReglement to set.
	 */
	public void setRefQuittancesReglement(Collection refQuittancesReglement) {
		this.refQuittancesReglement = refQuittancesReglement;
	}

	/**
	 * Access method for the refContrat property.
	 * 
	 * @return the current value of the refContrat property
	 */
	public Contrat getRefContrat() {
		return refContrat;
	}

	/**
	 * Sets the value of the refContrat property.
	 * 
	 * @param aRefContrat
	 *            the new value of the refContrat property
	 */
	public void setRefContrat(Contrat aRefContrat) {
		refContrat = aRefContrat;
	}

	public Boolean getAssuranceComplementaire() {
		return assuranceComplementaire;
	}

	public void setAssuranceComplementaire(Boolean assuranceComplementaire) {
		this.assuranceComplementaire = assuranceComplementaire;
	}

	public String getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(String commentaires) {
		this.commentaires = commentaires;
	}

	public Calendar getDateOuvertureSinistre() {
		return dateOuvertureSinistre;
	}

	public void setDateOuvertureSinistre(Calendar dateOuvertureSinistre) {
		this.dateOuvertureSinistre = dateOuvertureSinistre;
	}

	public Calendar getDateSurvenance() {
		return dateSurvenance;
	}

	public String getDateSurvenanceLibelle() {
		return DateUtile.calendarToString(dateSurvenance);
	}

	public void setDateSurvenance(Calendar dateSurvenance) {
		this.dateSurvenance = dateSurvenance;
	}

	public String getLieuSurvenance() {
		return lieuSurvenance;
	}

	public void setLieuSurvenance(String lieuSurvenance) {
		this.lieuSurvenance = lieuSurvenance;
	}

	public Double getMontantEvaluation() {
		return montantEvaluation;
	}

	public void setMontantEvaluation(Double montantEvaluation) {
		this.montantEvaluation = montantEvaluation;
	}

	public String getNatureMaladie() {
		return natureMaladie;
	}

	public void setNatureMaladie(String natureMaladie) {
		this.natureMaladie = natureMaladie;
	}

	public Client getRefAssure() {
		return refAssure;
	}

	public void setRefAssure(Client refAssure) {
		this.refAssure = refAssure;
	}

	public List getRefAttestationsPresentees() {
		return refAttestationsPresentees;
	}

	public void setRefAttestationsPresentees(List refAttestationsPresentees) {
		this.refAttestationsPresentees = refAttestationsPresentees;
	}

	public CompagnieAssurance getRefCompagnieAssuranceComplementaire() {
		return refCompagnieAssuranceComplementaire;
	}

	public void setRefCompagnieAssuranceComplementaire(
			CompagnieAssurance refCompagnieAssuranceComplementaire) {
		this.refCompagnieAssuranceComplementaire = refCompagnieAssuranceComplementaire;
	}

	public String getTypeDeclarant() {
		return typeDeclarant;
	}

	public void setTypeDeclarant(String typeDeclarant) {
		this.typeDeclarant = typeDeclarant;
	}

	public String getTypeDeclarantComplement() {
		return typeDeclarantComplement;
	}

	public void setTypeDeclarantComplement(String typeDeclarantComplement) {
		this.typeDeclarantComplement = typeDeclarantComplement;
	}

	public String getNomEnfant() {
		return nomEnfant;
	}

	public void setNomEnfant(String nomEnfant) {
		this.nomEnfant = nomEnfant;
	}

	public String getNumeroLien() {
		return numeroLien;
	}

	public void setNumeroLien(String numeroLien) {
		this.numeroLien = numeroLien;
	}

	public String getPrenomEnfant() {
		return prenomEnfant;
	}

	public void setPrenomEnfant(String prenomEnfant) {
		this.prenomEnfant = prenomEnfant;
	}

	public String getTypeLien() {
		return typeLien;
	}

	public void setTypeLien(String typeLien) {
		this.typeLien = typeLien;
	}

	public String getLibelleEtat() {

		if (this.refTypePrestation != null
				&& (Constantes.TPR_TYPE_PRESTATION_RACHAT_PARTIEL.equals(String
						.valueOf(this.refTypePrestation.getCode())) || Constantes.TPR_TYPE_PRESTATION_RACHAT_TOTAL
						.equals(String.valueOf(this.refTypePrestation.getCode())))) {
			if (Constantes.TPR_ETAT_PRESTATION_ENINSTANCE.equals(etat)) {
				return "Rachat " + Constantes.TPR_LIBELLE_PRESTATION_ENINSTANCE;
			}
			if (Constantes.TPR_ETAT_PRESTATION_ENREGISTREE.equals(etat)) {
				return "Rachat " + Constantes.TPR_LIBELLE_PRESTATION_ENREGISTRE;
			}
			if (Constantes.TPR_ETAT_PRESTATION_VALIDEE.equals(etat)) {
				return "Rachat " + Constantes.TPR_LIBELLE_PRESTATION_VALIDE;
			}
			if (Constantes.TPR_ETAT_PRESTATION_TERMINEE.equals(etat)) {
				return "Rachat " + Constantes.TPR_LIBELLE_RACHAT_TERMINEE;
			}
			if (Constantes.TPR_ETAT_PRESTATION_SANSSUITE.equals(etat)) {
				return "Rachat " + Constantes.TPR_LIBELLE_PRESTATION_SANSSUITE;
			}
			if (Constantes.TPR_ETAT_PRESTATION_ANNULEE.equals(etat)) {
				return "Rachat " + Constantes.TPR_LIBELLE_PRESTATION_ANNULE;
			}
			if (Constantes.TPR_ETAT_PRESTATION_EN_AGREGATION.equals(etat)) {
				return "Rachat " + Constantes.TPR_LIBELLE_PRESTATION_EN_AGREGATION;
			}
			if (Constantes.TPR_ETAT_PRESTATION_CONVERTIE.equals(etat)) {
				return "Rachat " + Constantes.TPR_LIBELLE_PRESTATION_CONVERTIE;
			}
			return "";
		}

		if (this.refTypePrestation != null
				&& Constantes.TPR_TYPE_PRESTATION_AVANCE.equals(String
						.valueOf(this.refTypePrestation.getCode()))) {
			if (Constantes.TPR_ETAT_PRESTATION_ENINSTANCE.equals(etat)) {
				return "Avance " + Constantes.TPR_LIBELLE_PRESTATION_ENINSTANCE;
			}
			if (Constantes.TPR_ETAT_PRESTATION_ENREGISTREE.equals(etat)) {
				return "Avance "
						+ Constantes.TPR_LIBELLE_PRESTATION_ENREGISTREE;
			}
			if (Constantes.TPR_ETAT_PRESTATION_VALIDEE.equals(etat)) {
				return "Avance " + Constantes.TPR_LIBELLE_PRESTATION_VALIDEE;
			}
			if (Constantes.TPR_ETAT_PRESTATION_TERMINEE.equals(etat)) {
				return "Avance " + Constantes.TPR_LIBELLE_AVANCE_TERMINEE;
			}
			if (Constantes.TPR_ETAT_PRESTATION_SANSSUITE.equals(etat)) {
				return "Avance " + Constantes.TPR_LIBELLE_PRESTATION_SANSSUITE;
			}
			if (Constantes.TPR_ETAT_PRESTATION_ANNULEE.equals(etat)) {
				return "Avance " + Constantes.TPR_LIBELLE_PRESTATION_ANNULEE;
			}
			if (Constantes.TPR_ETAT_AVANCE_REMBOURSEE_ENINSTANCE.equals(etat)) {
				return "Avance "
						+ Constantes.TPR_LIBELLE_AVANCE_REMBOURSEE_ENINSTANCE;
			}
			if (Constantes.TPR_ETAT_AVANCE_REMBOURSEE.equals(etat)) {
				return "Avance " + Constantes.TPR_LIBELLE_AVANCE_REMBOURSEE;
			}
			return "";
		}
		if (this.refTypePrestation != null
				&& Constantes.TPR_TYPE_PRESTATION_DISTRIBUTION.equals(String
						.valueOf(this.refTypePrestation.getCode()))) {
			if (Constantes.TPR_ETAT_DISTRIBUTION_CREE.equals(etat)) {
				return "Distribution "
						+ Constantes.TPR_LIBELLE_DISTRIBUTION_CREE;
			}
			if (Constantes.TPR_ETAT_DISTRIBUTION_VALIDEE.equals(etat)) {
				return "Distribution "
						+ Constantes.TPR_LIBELLE_DISTRIBUTION_VALIDEE;
			}
			if (Constantes.TPR_ETAT_DISTRIBUTION_ANNULEE.equals(etat)) {
				return "Distribution "
						+ Constantes.TPR_LIBELLE_DISTRIBUTION_ANNULEE;
			}
			if (Constantes.TPR_ETAT_DISTRIBUTION_REGLEE.equals(etat)) {
				return "Distribution "
						+ Constantes.TPR_LIBELLE_DISTRIBUTION_REGLEE;
			}
			if (Constantes.TPR_ETAT_DISTRIBUTION_REJETEE.equals(etat)) {
				return "Distribution "
						+ Constantes.TPR_LIBELLE_DISTRIBUTION_REJETEE;
			}
			if (Constantes.TPR_ETAT_DISTRIBUTION_ENVOYEE.equals(etat)) {
				return "Distribution "
						+ Constantes.TPR_LIBELLE_DISTRIBUTION_ENVOYEE;
			}
			return "";
		}
		
		if (this.refTypePrestation != null
				&& ( Constantes.TPR_TYPE_LIQUIDATION_CAPITAL.equals(String.valueOf(this.refTypePrestation.getCode())) ||
						Constantes.TPR_TYPE_LIQUIDATION_COMBINE.equals(String.valueOf(this.refTypePrestation.getCode())) ||
						Constantes.TPR_TYPE_LIQUIDATION_RENTE.equals(String.valueOf(this.refTypePrestation.getCode())))) {
			if (Constantes.TPR_ETAT_PRESTATION_ENINSTANCE.equals(etat)) {
				return "Rente "
						+ Constantes.TPR_LIBELLE_PRESTATION_ENINSTANCE;
			}

			if (Constantes.TPR_ETAT_PRESTATION_ENREGISTREE.equals(etat)) {
				return "Rente "
						+ Constantes.TPR_LIBELLE_PRESTATION_ENREGISTREE;
			}

			if (Constantes.TPR_ETAT_PRESTATION_VALIDEE.equals(etat)) {
				return "Rente " + Constantes.TPR_LIBELLE_PRESTATION_VALIDEE;
			}

			if (Constantes.TPR_ETAT_PRESTATION_TERMINEE.equals(etat)) {
				return "Rente " + Constantes.TPR_LIBELLE_PRESTATION_TERMINEE;
			}

			if (Constantes.TPR_ETAT_PRESTATION_SANSSUITE.equals(etat)) {
				return "Rente " + Constantes.TPR_LIBELLE_PRESTATION_SANSSUITE;
			}

			if (Constantes.TPR_ETAT_PRESTATION_ANNULEE.equals(etat)) {
				return "Rente " + Constantes.TPR_LIBELLE_PRESTATION_ANNULEE;
			}

			if (Constantes.TPR_ETAT_PRESTATION_EN_ATTE_INFO.equals(etat)) {
				return "Rente "
						+ Constantes.TPR_LIBELLE_PRESTATION_EN_ATTE_INFO;
			}
			if (Constantes.TPR_ETAT_PRESTATION_FERMEE.equals(etat)) {
				return "Rente " + Constantes.TPR_LIBELLE_PRESTATION_FERMEE;
			}
			if (Constantes.TPR_ETAT_PRESTATION_CLOTUREE.equals(etat)) {
				return "Sinistre " + Constantes.TPR_LIBELLE_PRESTATION_CLOTURE;
			}
			return "";
		}

		if (Constantes.TPR_ETAT_PRESTATION_ENINSTANCE.equals(etat)) {
			return "D�claration "
					+ Constantes.TPR_LIBELLE_PRESTATION_ENINSTANCE;
		}

		if (Constantes.TPR_ETAT_PRESTATION_ENREGISTREE.equals(etat)) {
			return "D�claration "
					+ Constantes.TPR_LIBELLE_PRESTATION_ENREGISTREE;
		}

		if (Constantes.TPR_ETAT_PRESTATION_VALIDEE.equals(etat)) {
			return "D�claration " + Constantes.TPR_LIBELLE_PRESTATION_VALIDEE;
		}

		if (Constantes.TPR_ETAT_PRESTATION_TERMINEE.equals(etat)) {
			return "D�claration " + Constantes.TPR_LIBELLE_PRESTATION_TERMINEE;
		}

		if (Constantes.TPR_ETAT_PRESTATION_SANSSUITE.equals(etat)) {
			return "D�claration " + Constantes.TPR_LIBELLE_PRESTATION_SANSSUITE;
		}

		if (Constantes.TPR_ETAT_PRESTATION_ANNULEE.equals(etat)) {
			return "D�claration " + Constantes.TPR_LIBELLE_PRESTATION_ANNULEE;
		}

		if (Constantes.TPR_ETAT_PRESTATION_EN_ATTE_INFO.equals(etat)) {
			return "D�claration "
					+ Constantes.TPR_LIBELLE_PRESTATION_EN_ATTE_INFO;
		}
		if (Constantes.TPR_ETAT_PRESTATION_FERMEE.equals(etat)) {
			return "D�claration " + Constantes.TPR_LIBELLE_PRESTATION_FERMEE;
		}
		if (Constantes.TPR_ETAT_PRESTATION_CLOTUREE.equals(etat)) {
			return "Sinistre " + Constantes.TPR_LIBELLE_PRESTATION_CLOTURE;
		}
		if (Constantes.TPR_ETAT_PRESTATION_MISSIONNEMENT_ENCOURS.equals(etat)) {
			return "Sinistre " + Constantes.TPR_LIBELLE_ETAT_PRESTATION_MISSIONNEMENT_ENCOURS;
		}
		if (Constantes.TPR_ETAT_PRESTATION_REJETEE.equals(etat)) {
			return "Sinistre " + Constantes.TPR_LIBELLE_PRESTATION_REJETEE;
		}
		if (Constantes.TPR_ETAT_PRESTATION_REGLEMENT_ENCOURS.equals(etat)) {
			return "Sinistre " + Constantes.TPR_LIBELLE_ETAT_PRESTATION_REGLEMENT_ENCOURS;
		}
		if (Constantes.TPR_ETAT_PRESTATION_EN_INSTANCE_VALIDE.equals(etat)) {
			return "Sinistre " + Constantes.TPR_LIBELLE_PRESTATION_EN_INSTANCE_VALIDE;
		}
		
		
		return "";
	}

	public Double getEpargneRevaloriseeDemande() {
		return epargneRevaloriseeDemande;
	}

	public void setEpargneRevaloriseeDemande(Double epargneRevaloriseeDemande) {
		this.epargneRevaloriseeDemande = epargneRevaloriseeDemande;
	}

	public Boolean getEdite() {
		return edite;
	}

	public void setEdite(Boolean edite) {
		this.edite = edite;
	}

	public Double getMontantIgr() {
		return montantIgr;
	}

	public void setMontantIgr(Double montantIgr) {
		this.montantIgr = montantIgr;
	}

	public Double getMontantPenalites() {
		return montantPenalites;
	}

	public void setMontantPenalites(Double montantPenalites) {
		this.montantPenalites = montantPenalites;
	}

	public Double getMontantPrestationImposable() {
		return montantPrestationImposable;
	}

	public void setMontantPrestationImposable(Double montantPrestationImposable) {
		this.montantPrestationImposable = montantPrestationImposable;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return new PrestationFactory();
	}

	public String getCauses() {
		return causes;
	}

	public void setCauses(String causes) {
		this.causes = causes;
	}

	public Calendar getDateDebutPeriode() {
		return dateDebutPeriode;
	}

	public void setDateDebutPeriode(Calendar dateDebutPeriode) {
		this.dateDebutPeriode = dateDebutPeriode;
	}

	public Calendar getDateFinPeriode() {
		return dateFinPeriode;
	}

	public void setDateFinPeriode(Calendar dateFinPeriode) {
		this.dateFinPeriode = dateFinPeriode;
	}

	public Utilisateur getGestionnaire() {
		return gestionnaire;
	}

	public void setGestionnaire(Utilisateur gestionnaire) {
		this.gestionnaire = gestionnaire;
	}

	public String getNomMedecinTraitant() {
		return nomMedecinTraitant;
	}

	public void setNomMedecinTraitant(String nomMedecinTraitant) {
		this.nomMedecinTraitant = nomMedecinTraitant;
	}

	public String getPrestataireSante() {
		return prestataireSante;
	}

	public void setPrestataireSante(String prestataireSante) {
		this.prestataireSante = prestataireSante;
	}

	public String getRaisonSocialePrestataireSante() {
		return raisonSocialePrestataireSante;
	}

	public void setRaisonSocialePrestataireSante(
			String raisonSocialePrestataireSante) {
		this.raisonSocialePrestataireSante = raisonSocialePrestataireSante;
	}

	public Utilisateur getUtilisateurCC() {
		return utilisateurCC;
	}

	public void setUtilisateurCC(Utilisateur utilisateurCC) {
		this.utilisateurCC = utilisateurCC;
	}

	public String getInfosComplementaires() {
		return infosComplementaires;
	}

	public void setInfosComplementaires(String infosComplementaires) {
		this.infosComplementaires = infosComplementaires;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Double getMntRemboursementAssuranceComplementaire() {
		return mntRemboursementAssuranceComplementaire;
	}

	public void setMntRemboursementAssuranceComplementaire(
			Double mntRemboursementAssuranceComplementaire) {
		this.mntRemboursementAssuranceComplementaire = mntRemboursementAssuranceComplementaire;
	}

	public String getNumeroSinistre() {
		return numeroSinistre;
	}

	public void setNumeroSinistre(String numeroSinistre) {
		this.numeroSinistre = numeroSinistre;
	}

	public Boolean getSync2Centrale() {
		return sync2Centrale;
	}

	public void setSync2Centrale(Boolean sync2Centrale) {
		this.sync2Centrale = sync2Centrale;
	}

	public Boolean getSync2Convergence() {
		return sync2Convergence;
	}

	public void setSync2Convergence(Boolean sync2Convergence) {
		this.sync2Convergence = sync2Convergence;
	}

	public Calendar getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Calendar dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Calendar getDateMigration() {
		return dateMigration;
	}

	public void setDateMigration(Calendar dateMigration) {
		this.dateMigration = dateMigration;
	}

	public Boolean getMigre() {
		return migre;
	}

	public void setMigre(Boolean migre) {
		this.migre = migre;
	}

	public Boolean getAttestationFiscale() {
		return attestationFiscale;
	}

	public void setAttestationFiscale(Boolean attestationFiscale) {
		this.attestationFiscale = attestationFiscale;
	}

	public Double getMontantRachatDemande() {
		return montantRachatDemande;
	}

	public void setMontantRachatDemande(Double montantRachatDemande) {
		this.montantRachatDemande = montantRachatDemande;
	}

	public Double getCumulVersementsRachat() {
		return cumulVersementsRachat;
	}

	public void setCumulVersementsRachat(Double cumulVersementsRachat) {
		this.cumulVersementsRachat = cumulVersementsRachat;
	}

	public Double getPlusValueRachat() {
		return plusValueRachat;
	}

	public void setPlusValueRachat(Double plusValueRachat) {
		this.plusValueRachat = plusValueRachat;
	}

	public Double getProrataEpargneRachete() {
		return prorataEpargneRachete;
	}

	public void setProrataEpargneRachete(Double prorataEpargneRachete) {
		this.prorataEpargneRachete = prorataEpargneRachete;
	}
	
	

	/**
	 * @return the refTypeRachatPartiel
	 */
	public TypeRachatPartiel getRefTypeRachatPartiel() {
		return refTypeRachatPartiel;
	}

	/**
	 * @param refTypeRachatPartiel the refTypeRachatPartiel to set
	 */
	public void setRefTypeRachatPartiel(TypeRachatPartiel refTypeRachatPartiel) {
		this.refTypeRachatPartiel = refTypeRachatPartiel;
	}

	public TprRachatItem convertToRachatItem() {
		TprRachatItem tprRachatItem = new TprRachatItem();
		tprRachatItem.setId(String.valueOf(this.getId()));
		if (this.getRefContrat() != null) {
			tprRachatItem.setNumeroContrat(this.getRefContrat().getNumero());
		}
		if (this.getRefContrat() != null
				&& this.getRefContrat().getNumeroAdhesion() != null) {
			tprRachatItem.setNumeroAdhesion(this.getRefContrat()
					.getNumeroAdhesion());
		}
		if (this.getNumeroSinistre() != null
				&& this.getNumeroSinistre().length() == 17) {
			tprRachatItem
					.setNumeroRachat(this.getNumeroSinistre().substring(4));
		}

		tprRachatItem.setDateRachat(DateUtile.calendarToString(this
				.getDateDemande()));
		if (this.getRefTypePrestation() != null) {
			tprRachatItem.setTypeRachat(this.getRefTypePrestation()
					.getLibelle());
		}
		if (this.getRefTypeRachatPartiel() != null) {
			tprRachatItem.setTypeRachatPartiel(this.getRefTypeRachatPartiel().getLibelle());
		}
		if (this.getMontant() != null) {
			tprRachatItem.setMontantRachat(DoubleUtile
					.convertDoubleToString(this.getMontant().doubleValue()));
		}
		tprRachatItem.setEtat(this.getLibelleEtat());

		if (this.getGestionnaire() != null) {
			String gestionnaire = "";
			if (this.getGestionnaire().getPrenom() != null) {
				gestionnaire = gestionnaire
						+ this.getGestionnaire().getPrenom();
			}
			gestionnaire = gestionnaire + " ";
			if (this.getGestionnaire().getNom() != null) {
				gestionnaire = gestionnaire + this.getGestionnaire().getNom();
			}
			tprRachatItem.setGestionnaire(gestionnaire);
		}
		return tprRachatItem;
	}

	public TprDistributionItem convertToDistributionItem() {
		TprDistributionItem tprDistributionItem = new TprDistributionItem();
		tprDistributionItem.setId(String.valueOf(this.getId()));
		if (this.getRefContrat() != null) {
			tprDistributionItem.setNumeroContrat(this.getRefContrat()
					.getNumero());
			tprDistributionItem.setNumeroCompteBancaire((this.getRefContrat()
					.getNumeroCompteBancaire()));
		}
		if (this.getNumeroSinistre() != null) {
			tprDistributionItem.setNumeroDistribution(this.getNumeroSinistre()
					.substring(4));
		}
		if (this.getDateCreationOperation() != null) {
			tprDistributionItem.setDateOperation(DateUtile
					.calendarToString(this.getDateCreationOperation()));
		}
		if (this.getDateEtat() != null) {
			tprDistributionItem.setDateEtat(DateUtile.calendarToString(this
					.getDateEtat()));
		}
		if (this.getIdOperation() != null) {
			tprDistributionItem.setIdOperation((this.getIdOperation()));
		}

		if (this.getMontant() != null) {
			tprDistributionItem.setMontantDistNet(DoubleUtile
					.convertDoubleToString(this.getMontant().doubleValue()));
		}
		if (this.getMontantIgr() != null) {
			tprDistributionItem.setMontantDistIR(DoubleUtile
					.convertDoubleToString(this.getMontantIgr().doubleValue()));
			tprDistributionItem.setMontantDistBrut(DoubleUtile
					.convertDoubleToString(this.getMontantIgr().doubleValue()
							+ this.getMontant().doubleValue()));

		}
		tprDistributionItem.setEtat(this.getLibelleEtat());

		return tprDistributionItem;
	}

//	public TprRenteItem convertToRenteItem() {
//		TprRenteItem tprRenteItem = new TprRenteItem();
//		tprRenteItem.setId(String.valueOf(this.getId()));
//		if (this.getRefContrat() != null) {
//			tprRenteItem.setNumeroContrat(this.getRefContrat()
//					.getNumero());
//			tprRenteItem.setNumeroCompteBancaire((this.getRefContrat()
//					.getNumeroCompteBancaire()));
//		}
//		if (this.getNumeroSinistre() != null) {
//			tprRenteItem.setNumeroDistribution(this.getNumeroSinistre()
//					.substring(4));
//		}
//		if (this.getDateCreationOperation() != null) {
//			tprRenteItem.setDateOperation(DateUtile
//					.calendarToString(this.getDateCreationOperation()));
//		}
//		if (this.getDateEtat() != null) {
//			tprRenteItem.setDateEtat(DateUtile.calendarToString(this
//					.getDateEtat()));
//		}
//		if (this.getIdOperation() != null) {
//			tprRenteItem.setIdOperation((this.getIdOperation()));
//		}
//	
//		tprRenteItem.setEtat(this.getLibelleEtat());
//
//		return tprRenteItem;
//	}
	
	public TprRachatItem convertToRachatInfoItem() {
		TprRachatItem tprRachatItem = new TprRachatItem();
		tprRachatItem.setId(String.valueOf(this.getId()));
		if (this.getRefContrat() != null) {
			tprRachatItem.setNumeroContrat(this.getRefContrat().getNumero());
		}
		if (this.getRefContrat() != null
				&& this.getRefContrat().getNumeroAdhesion() != null) {
			tprRachatItem.setNumeroAdhesion(this.getRefContrat()
					.getNumeroAdhesion());
		}
		if (this.getNumeroSinistre() != null
				&& this.getNumeroSinistre().length() == 17) {
			tprRachatItem
					.setNumeroRachat(this.getNumeroSinistre().substring(4));
		}

		tprRachatItem.setDateRachat(DateUtile.calendarToString(this
				.getDateDemande()));
		if (this.getRefTypePrestation() != null) {
			tprRachatItem.setTypeRachat(this.getRefTypePrestation()
					.getLibelle());
		}
		if (this.getRefTypeRachatPartiel() != null) {
			tprRachatItem.setTypeRachatPartiel(this.getRefTypeRachatPartiel().getLibelle());
		}
		if (this.getMontant() != null) {
			tprRachatItem.setMontantRachat(DoubleUtile
					.convertDoubleToString(this.getMontant().doubleValue()));
		}
		if (this.getEnAttenteInfo() != null
				&& this.getEnAttenteInfo().equals("1")) {
			tprRachatItem
					.setEtat(Constantes.TPR_LIBELLE_PRESTATION_EN_ATTE_INFO);
		} else {
			tprRachatItem.setEtat(this.getLibelleEtat());
		}

		if (this.getGestionnaire() != null) {
			String gestionnaire = "";
			if (this.getGestionnaire().getPrenom() != null) {
				gestionnaire = gestionnaire
						+ this.getGestionnaire().getPrenom();
			}
			gestionnaire = gestionnaire + " ";
			if (this.getGestionnaire().getNom() != null) {
				gestionnaire = gestionnaire + this.getGestionnaire().getNom();
			}
			tprRachatItem.setGestionnaire(gestionnaire);
		}
		return tprRachatItem;
	}

	public TprAvanceItem convertToAvanceItem() {
		TprAvanceItem tprAvanceItem = new TprAvanceItem();
		tprAvanceItem.setId(String.valueOf(this.getId()));
		if (this.getRefContrat() != null) {
			tprAvanceItem.setNumeroContrat(this.getRefContrat().getNumero());
		}
		if (this.getRefContrat() != null
				&& this.getRefContrat().getNumeroAdhesion() != null) {
			tprAvanceItem.setNumeroAdhesion(this.getRefContrat()
					.getNumeroAdhesion());
		}
		if (this.getNumeroSinistre() != null
				&& this.getNumeroSinistre().length() == 17) {
			tprAvanceItem
					.setNumeroAvance(this.getNumeroSinistre().substring(4));
		}
		tprAvanceItem.setDateAvance(DateUtile.calendarToString(this
				.getDateDemande()));
		if (this.getRefTypePrestation() != null) {
			tprAvanceItem.setTypeSinistre(this.getRefTypePrestation()
					.getLibelle());
		}
		if (this.getMontant() != null) {
			tprAvanceItem.setMontantAvance(DoubleUtile
					.convertDoubleToString(this.getMontant().doubleValue()));
		}

		tprAvanceItem.setEtat(this.getLibelleEtat());

		if (this.getGestionnaire() != null) {
			String gestionnaire = "";
			if (this.getGestionnaire().getPrenom() != null) {
				gestionnaire = gestionnaire
						+ this.getGestionnaire().getPrenom();
			}
			gestionnaire = gestionnaire + " ";
			if (this.getGestionnaire().getNom() != null) {
				gestionnaire = gestionnaire + this.getGestionnaire().getNom();
			}
			tprAvanceItem.setGestionnaire(gestionnaire);
		}
		return tprAvanceItem;
	}

	public TprAvanceItem convertToAvanceInfosItem() {
		TprAvanceItem tprAvanceItem = new TprAvanceItem();
		tprAvanceItem.setId(String.valueOf(this.getId()));
		if (this.getRefContrat() != null) {
			tprAvanceItem.setNumeroContrat(this.getRefContrat().getNumero());
		}
		if (this.getRefContrat() != null
				&& this.getRefContrat().getNumeroAdhesion() != null) {
			tprAvanceItem.setNumeroAdhesion(this.getRefContrat()
					.getNumeroAdhesion());
		}
		if (this.getNumeroSinistre() != null
				&& this.getNumeroSinistre().length() == 17) {
			tprAvanceItem
					.setNumeroAvance(this.getNumeroSinistre().substring(4));
		}
		tprAvanceItem.setDateAvance(DateUtile.calendarToString(this
				.getDateDemande()));
		if (this.getRefTypePrestation() != null) {
			tprAvanceItem.setTypeSinistre(this.getRefTypePrestation()
					.getLibelle());
		}
		if (this.getMontant() != null) {
			tprAvanceItem.setMontantAvance(DoubleUtile
					.convertDoubleToString(this.getMontant().doubleValue()));
		}

		if (this.getEnAttenteInfo() != null
				&& this.getEnAttenteInfo().equals("1")) {
			tprAvanceItem
					.setEtat(Constantes.TPR_LIBELLE_PRESTATION_EN_ATTE_INFO);
		} else {
			tprAvanceItem.setEtat(this.getLibelleEtat());
		}

		if (this.getGestionnaire() != null) {
			String gestionnaire = "";
			if (this.getGestionnaire().getPrenom() != null) {
				gestionnaire = gestionnaire
						+ this.getGestionnaire().getPrenom();
			}
			gestionnaire = gestionnaire + " ";
			if (this.getGestionnaire().getNom() != null) {
				gestionnaire = gestionnaire + this.getGestionnaire().getNom();
			}
			tprAvanceItem.setGestionnaire(gestionnaire);
		}
		return tprAvanceItem;
	}

	public TprPrestationItem convertToPrestationItem() {
		TprPrestationItem prestationItem = new TprPrestationItem();

		prestationItem.setId(String.valueOf(this.getId()));
		if (this.getRefContrat() != null) {
			prestationItem.setNumeroContrat(this.getRefContrat().getNumero());
		}
		if (this.getRefContrat() != null
				&& this.getRefContrat().getNumeroAdhesion() != null) {
			prestationItem.setNumeroAdhesion(this.getRefContrat()
					.getNumeroAdhesion());
		}
		prestationItem.setNumeroDeclaration(this.getNumeroDeclaration());

		if (this.getNumeroSinistre() != null
				&& this.getNumeroSinistre().length() == 17) {
			prestationItem.setNumeroSinistre(this.getNumeroSinistre()
					.substring(4));
		}
		prestationItem.setDateDemande(DateUtile.calendarToString(this
				.getDateDemande()));
		if (this.getRefTypePrestation() != null) {
			prestationItem.setTypeSinistre(this.getRefTypePrestation()
					.getLibelle());
		}
		if (this.getRefTypeRachatPartiel() != null) {
			prestationItem.setTypeRachatPartiel(this.getRefTypeRachatPartiel().getLibelle());
		}
		prestationItem.setEtat(this.getLibelleEtat());
		if (this.getGestionnaire() != null) {
			String gestionnaire = "";
			if (this.getGestionnaire().getPrenom() != null) {
				gestionnaire = gestionnaire
						+ this.getGestionnaire().getPrenom();
			}
			gestionnaire = gestionnaire + " ";
			if (this.getGestionnaire().getNom() != null) {
				gestionnaire = gestionnaire + this.getGestionnaire().getNom();
			}
			prestationItem.setGestionnaire(gestionnaire);
		}
		return prestationItem;
	}

	public String getNumeroDeclaration() {
		return numeroDeclaration;
	}

	public void setNumeroDeclaration(String numeroDeclaration) {
		this.numeroDeclaration = numeroDeclaration;
	}

	public String getNumeroLienQuittance() {
		return numeroLienQuittance;
	}

	public void setNumeroLienQuittance(String numeroLienQuittance) {
		this.numeroLienQuittance = numeroLienQuittance;
	}

	public String getLibelleNumeroSinistre() {
		if (this.numeroSinistre != null && this.numeroSinistre.length() > 4) {
			return this.numeroSinistre.substring(4);
		}
		return numeroSinistre;
	}

	public Double getMontantRemboursementAvanceParRachat() {
		return montantRemboursementAvanceParRachat;
	}

	public void setMontantRemboursementAvanceParRachat(
			Double montantRemboursementAvanceParRachat) {
		this.montantRemboursementAvanceParRachat = montantRemboursementAvanceParRachat;
	}

	public Integer getNumeroVersionContrat() {
		return numeroVersionContrat;
	}

	public void setNumeroVersionContrat(Integer numeroVersionContrat) {
		this.numeroVersionContrat = numeroVersionContrat;
	}

	public Calendar getDateEditionDemande() {
		return dateEditionDemande;
	}

	public void setDateEditionDemande(Calendar dateEditionDemande) {
		this.dateEditionDemande = dateEditionDemande;
	}

	public Calendar getDateEditionQuittance() {
		return dateEditionQuittance;
	}

	public void setDateEditionQuittance(Calendar dateEditionQuittance) {
		this.dateEditionQuittance = dateEditionQuittance;
	}

	public NatureSinistre getRefNatureSinistre() {
		return refNatureSinistre;
	}

	public void setRefNatureSinistre(NatureSinistre refNatureSinistre) {
		this.refNatureSinistre = refNatureSinistre;
	}

	public Collection getRefCartes() {
		return refCartes;
	}

	public void setRefCartes(Collection refCartes) {
		this.refCartes = refCartes;
	}

	public Double getMontantUtilisationsFrauduleuses() {
		return montantUtilisationsFrauduleuses;
	}

	public void setMontantUtilisationsFrauduleuses(
			Double montantUtilisationsFrauduleuses) {
		this.montantUtilisationsFrauduleuses = montantUtilisationsFrauduleuses;
	}

	public Double getPrixCartes() {
		return prixCartes;
	}

	public void setPrixCartes(Double prixCartes) {
		this.prixCartes = prixCartes;
	}

	public Boolean getPapierCIN() {
		return papierCIN;
	}

	public void setPapierCIN(Boolean papierCIN) {
		this.papierCIN = papierCIN;
	}

	public Boolean getPapierCSE() {
		return papierCSE;
	}

	public void setPapierCSE(Boolean papierCSE) {
		this.papierCSE = papierCSE;
	}

	public Boolean getPapierPasseport() {
		return papierPasseport;
	}

	public void setPapierPasseport(Boolean papierPasseport) {
		this.papierPasseport = papierPasseport;
	}

	public Boolean getPapierPermisConduire() {
		return papierPermisConduire;
	}

	public void setPapierPermisConduire(Boolean papierPermisConduire) {
		this.papierPermisConduire = papierPermisConduire;
	}

	public Boolean getPapierCarteGrise() {
		return papierCarteGrise;
	}

	public void setPapierCarteGrise(Boolean papierCarteGrise) {
		this.papierCarteGrise = papierCarteGrise;
	}

	public Double getMontantFraisEngages() {
		return montantFraisEngages;
	}

	public void setMontantFraisEngages(Double montantFraisEngages) {
		this.montantFraisEngages = montantFraisEngages;
	}

	public String getNomPrenomTransporteur() {
		return nomPrenomTransporteur;
	}

	public void setNomPrenomTransporteur(String nomPrenomTransporteur) {
		this.nomPrenomTransporteur = nomPrenomTransporteur;
	}

	public String getNatureFondsTransportes() {
		return natureFondsTransportes;
	}

	public void setNatureFondsTransportes(String natureFondsTransportes) {
		this.natureFondsTransportes = natureFondsTransportes;
	}

	public Double getMontantPertes() {
		return montantPertes;
	}

	public void setMontantPertes(Double montantPertes) {
		this.montantPertes = montantPertes;
	}

	public Calendar getDateNaissanceTransporteur() {
		return dateNaissanceTransporteur;
	}

	public void setDateNaissanceTransporteur(Calendar dateNaissanceTransporteur) {
		this.dateNaissanceTransporteur = dateNaissanceTransporteur;
	}

	public Double getTauxPartPatronal() {
		return tauxPartPatronal;
	}

	public void setTauxPartPatronal(Double tauxPartPatronal) {
		this.tauxPartPatronal = tauxPartPatronal;
	}

	public Boolean getClotureContrat() {
		return clotureContrat;
	}

	public void setClotureContrat(Boolean clotureContrat) {
		this.clotureContrat = clotureContrat;
	}

	public String getLibelleDateEtat() {
		if (this.dateEtat == null) {
			return null;
		} else {
			try {
				return DateUtile.calendarToString(dateEtat);
			} catch (Exception e) {
				return null;
			}
		}
	}

	public String getEnAttenteInfo() {
		return enAttenteInfo;
	}

	public void setEnAttenteInfo(String enAttenteInfo) {
		this.enAttenteInfo = enAttenteInfo;
	}

	public Double getMontantAvanceNominale() {
		return montantAvanceNominale;
	}

	public void setMontantAvanceNominale(Double montantAvanceNominale) {
		this.montantAvanceNominale = montantAvanceNominale;
	}

	public Collection getRefDetailPrestationParSupport() {
		return refDetailPrestationParSupport;
	}

	public void setRefDetailPrestationParSupport(
			Collection refDetailPrestationParSupport) {
		this.refDetailPrestationParSupport = refDetailPrestationParSupport;
	}

	public Collection getRefPorteFeuillesClient() {
		return refPorteFeuillesClient;
	}

	public void setRefPorteFeuillesClient(Collection refPorteFeuillesClient) {
		this.refPorteFeuillesClient = refPorteFeuillesClient;
	}

	public String getIdOperation() {
		return idOperation;
	}

	public void setIdOperation(String idOperation) {
		this.idOperation = idOperation;
	}

	public Calendar getDateCreationOperation() {
		return dateCreationOperation;
	}

	public void setDateCreationOperation(Calendar dateCreationOperation) {
		this.dateCreationOperation = dateCreationOperation;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getSexe() {
		return sexe;
	}

	public void setSexe(Boolean sexe) {
		this.sexe = sexe;
	}

	public OperationDistribution getRefOperationDistribution() {
		return refOperationDistribution;
	}

	public void setRefOperationDistribution(
			OperationDistribution refOperationDistribution) {
		this.refOperationDistribution = refOperationDistribution;
	}
	public BienHabitation getRefBiensAssure() {
		return refBiensAssure;
	}

	public void setRefBiensAssure(BienHabitation refBiensAssure) {
		this.refBiensAssure = refBiensAssure;
	}

	public DeclarantSinistre getRefDeclarant() {
		return refDeclarant;
	}

	public void setRefDeclarant(DeclarantSinistre refDeclarant) {
		this.refDeclarant = refDeclarant;
	}

	public DeclarationDeces getRefDeclarationDeces() {
		return refDeclarationDeces;
	}

	public void setRefDeclarationDeces(DeclarationDeces refDeclarationDeces) {
		this.refDeclarationDeces = refDeclarationDeces;
	}

	public Double getMontantFraisGP() {
		return montantFraisGP;
	}

	public void setMontantFraisGP(Double montantFraisGP) {
		this.montantFraisGP = montantFraisGP;
	}

	public Double getMontantFraisGestionUC() {
		return montantFraisGestionUC;
	}

	public void setMontantFraisGestionUC(Double montantFraisGestionUC) {
		this.montantFraisGestionUC = montantFraisGestionUC;
	}
	
	public TypeRente getRefTypeRente() {
		return refTypeRente;
	}

	public void setRefTypeRente(TypeRente refTypeRente) {
		this.refTypeRente = refTypeRente;
	}

	public Liquidation getRefLiquidation() {
		return refLiquidation;
	}

	public void setRefLiquidation(Liquidation refLiquidation) {
		this.refLiquidation = refLiquidation;
	}

	public Double getMontantTaxeSolidarite() {
		return montantTaxeSolidarite;
	}

	public void setMontantTaxeSolidarite(Double montantTaxeSolidarite) {
		this.montantTaxeSolidarite = montantTaxeSolidarite;
	}

	public String getFlagSynchBDC() {
		return flagSynchBDC;
	}

	public void setFlagSynchBDC(String flagSynchBDC) {
		this.flagSynchBDC = flagSynchBDC;
	}
	
	public Double getMontantFraisSortie() {
		if(montantFraisSortie == null) {
			return 0.0;
		}
		return montantFraisSortie;
	}

	public void setMontantFraisSortie(Double montantFraisSortie) {
		this.montantFraisSortie = montantFraisSortie;
	}
	
	public EtatPrestation getRefEtatPrestation() {
		return refEtatPrestation;
	}

	public void setRefEtatPrestation(EtatPrestation refEtatPrestation) {
		this.refEtatPrestation = refEtatPrestation;
	}

	public String getMotifTraitement() {
		return motifTraitement;
	}

	public void setMotifTraitement(String motifTraitement) {
		this.motifTraitement = motifTraitement;
	}

	public Double getMontantReserve() {
		return montantReserve;
	}

	public void setMontantReserve(Double montantReserve) {
		this.montantReserve = montantReserve;
	}

	public DeclarationSinistre getRefDeclarationSinistre() {
		return refDeclarationSinistre;
	}

	public void setRefDeclarationSinistre(DeclarationSinistre refDeclarationSinistre) {
		this.refDeclarationSinistre = refDeclarationSinistre;
	}

	public Double getMontantReserveMaj() {
		return montantReserveMaj;
	}

	public void setMontantReserveMaj(Double montantReserveMaj) {
		this.montantReserveMaj = montantReserveMaj;
	}

	public Calendar getDateReouverture() {
		return dateReouverture;
	}

	public void setDateReouverture(Calendar dateReouverture) {
		this.dateReouverture = dateReouverture;
	}
	
	public Boolean getCalculIgrAvecAbattement() {
		return calculIgrAvecAbattement;
	}

	public void setCalculIgrAvecAbattement(Boolean calculIgrAvecAbattement) {
		this.calculIgrAvecAbattement = calculIgrAvecAbattement;
	}

	public Boolean isExonereIgr() {
		return exonereIgr;
	}

	public void setExonereIgr(Boolean exonereIgr) {
		this.exonereIgr = exonereIgr;
	}

	
}
