
package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;

import ma.co.omnidata.framework.services.core.ServicesFactory;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;
import ma.co.omnidata.framework.services.historique.HistoryHelper;
import ma.co.omnidata.framework.services.historique.HistoryItem;
import ma.co.omnidata.framework.services.historique.IHistorisable;
import ma.co.omnidata.framework.services.lock.ILockable;
import ma.co.omnidata.framework.utile.DateUtile;

import com.rmawatanya.convergence.application.pack.metier.modele.Pack;
import com.rmawatanya.convergence.application.prd.metier.modele.Option;
import com.rmawatanya.convergence.application.prd.metier.modele.Produit;
import com.rmawatanya.convergence.application.prd.metier.modele.VersionCommercialeProduit;
import com.rmawatanya.convergence.application.utile.Fonctions;
import com.rmawatanya.convergence.utile.common.Constantes;
import com.rmawatanya.convergence.utile.habilitations.Utilisateur;
import com.rmawatanya.convergence.utile.organisation.Entite;
import com.rmawatanya.convergence.utile.referentiel.MotifProposition;
import com.rmawatanya.convergence.utile.referentiel.MotifResiliation;
import com.rmawatanya.convergence.utile.referentiel.MotifSurprime;
import com.rmawatanya.convergence.utile.referentiel.ProfilRisque;
import com.rmawatanya.convergence.utile.referentiel.TypeFractionnementPrime;
import com.rmawatanya.convergence.utile.referentiel.TypePeriodiciteCotisation;
import com.rmawatanya.convergence.utile.referentiel.TypeSalarie;

public class Contrat implements IHistorisable, IEntite, ILockable{
	private long id;

	/**
	 * 0 : individuel, 1 : groupe
	 */
	private String typeContrat;
	private String numero;

	/**
	 * numero d'adhesion du contrat dans un contrat groupe
	 */
	private String numeroAdhesion;
	private Calendar dateSouscription;
	private String numeroAuthorisation;
	private String commentaire;
	private Calendar dateAutorisation;
	private String numeroCompteBancaire;
	private Double prime;
	private Double surprime;
	private Double primeTotale;
	private Calendar dateVersementPremierePrime;
	private String racineVendeur;
	private String racineGPP;
	private Calendar dateReceptionCP;
	private String etat;

	/**
	 * Motif de la derni�re intervention sur le contrat (motif de r�siliation
	 * par exemple)
	 */

	private String partieResiliante;
	private Calendar dateDerniereModification;
	private Utilisateur refUtilisateurModification;
	private String commentaires;

	/**
	 * Nombre salari�s de l'entreprise dans souscripteur d'un contrat groupe
	 */
	private Integer nombreSalariesCG;
	private Calendar dateEntreeEntreprise;
	private Double capitalAssureMin;
	private Double capitalAssureMax;

	//Donn�es sp�cifiques au contrat groupe / adh�sion
	private String identifiantRepresentant;
	private String qualiteRepresentant;
	private String modePaiement;
	private Double masseSalariale;
	private Integer ageRetraite;
	private String typeCalculPrime;
	private String matricule;
	private Calendar dateEffet;
	private TypePeriodiciteCotisation refTypePeriodiciteCotisation;
	private Integer dureeContratGroupe;
	private String numeroCompteAdherent;

	/**
	 * 0: Automatique, 1: Ch�que, 2: Virement
	 */
	private Boolean modePrelevement;

	/**
	 * versement de la totalit� � l'assur�, restitution � la soci�t�, autres �
	 * pr�ciser
	 */
	//private String sortPartPatronale;

	/**
	 * Autre sort de la part patronale
	 */
	//private String complementSortPartPatronale;
	private PartieDommages refPartieDommages;
	private Collection refBeneficiaires;
	private Client refSouscripteur;
	private Client refAdherent;
	private Client refConjoint;
	private PartieEpargne refPartieEpargne;
	private Collection refReponsesQuestionsDeclaration = new ArrayList();
	private Produit refProduit;
	private VersionCommercialeProduit refVersionCommercialeProduit;

	private Utilisateur refUtilisateurCreateur;
	private Entite refAgence;
	private TypeFractionnementPrime refTypeFractionnementPrime;
	private PartiePrevoyance refPartiePrevoyance;
	private Collection refCoassurances;
	private Collection refDemandesRegularisation;
	private TypeSalarie refTypeSalarieAdherent;
	private Contrat refContratGroupe;
	private List<PrimePersonnel> refPrimesPersonnel =new ArrayList<PrimePersonnel>();
	private Collection refEnfants = new ArrayList();
	private MotifResiliation refMotifResiliation;
	private Option refOption;

	private Collection refEcheanciersPrelevements;
	private Boolean edite;
	private String complementTypeSalarieAdherent;
	private ContratState contratState;
	private int lastNumVersion; // pour besoin d'historisation
	private String natureBeneficiaires; // 0: ayant droit, 1: bmce, 2: b�neficiaires sp�cifi�s dans refBeneficiaires

	private Contrat refContratRemplacant;

	private Boolean enInstance;
	protected HistoryItem lastHistoryItem;
	private Boolean avenant;
	private Boolean avenantResiliation;
	private Double primeTotaleEcheance;
	private Calendar dateEcheance;
	private Boolean migre;


	private Double epargneStocke;

	private String nouveauCompteBancaire;
	private String motifTransfert;

	// GED
	private Calendar dateValidation;

	// Pour Pack
	private Pack refPack;
	private String numeroContratPack;
	private String pacweb;
	// UC
	private ProfilRisque refProfilRisque ;
	private Integer nombreMaxSuspensionCotisationsParAnnee;
	private Calendar dateDernierSuspension;
	private Boolean avecGarantiePlancher;

	private String referenceExterne;

	//Risques
	private Collection refRisques;

	//RisquesPrevoyance
	private Collection refRisquesPrevoyance;

	//Reclamation
	private Collection refReclamation;

	//CASH pooling
    private String avecPrelevement;


    private ConditionPreferentielle refConditionPreferentielle;

    //Prevoyance
    private MotifProposition refMotifProposition;
    private MotifSurprime refMotifSurprime;
    private List<ReponseVisiteMedical> refReponseVisitesMedicales;


    //GP BSM
    private Boolean questionnaire;
    private Integer nbActifs;
    private Integer nbRetraites;
    private String orgAssurBase;
    private String orgAssurCompl;
    private Double tauxAssurBase;
    private Double tauxAssurCompl;
    private Boolean avecCommission;
    private String typeBareme;
    private List<BaremeBSMG>  refBaremesBSMG;
    private String ice;
    private Boolean contratMemeNatureResilie;
    private Boolean contratMemeNature;
    private String numeroIdentification;
    /**
     * Utilise dans le cader des contrats groupes AMC
     */
    private Integer effectif;
    
    private Boolean digital;

    private Boolean insertStock;
    /**
     * flag les contrat avec des donnees de conformite non completes
     */
    private Boolean fatcaNonConforme;
    
    public String getNumeroIdentification() {
		return numeroIdentification;
	}
	public void setNumeroIdentification(String numeroIdentification) {
		this.numeroIdentification = numeroIdentification;
	}
	public String getTypeBareme() {
		return typeBareme;
	}
	public void setTypeBareme(String typeBareme) {
		this.typeBareme = typeBareme;
	}

	public MotifProposition getRefMotifProposition() {
		return refMotifProposition;
	}
	public void setRefMotifProposition(MotifProposition refMotifProposition) {
		this.refMotifProposition = refMotifProposition;
	}
	public MotifSurprime getRefMotifSurprime() {
		return refMotifSurprime;
	}
	public void setRefMotifSurprime(MotifSurprime refMotifSurprime) {
		this.refMotifSurprime = refMotifSurprime;
	}

	public Calendar getDateValidation() {
		return dateValidation;
	}
	public void setDateValidation(Calendar dateValidation) {
		this.dateValidation = dateValidation;
	}
	public Pack getRefPack() {
		return refPack;
	}
	public void setRefPack(Pack refPack) {
		this.refPack = refPack;
	}
	public String getNumeroContratPack() {
		return numeroContratPack;
	}
	public void setNumeroContratPack(String numeroContratPack) {
		this.numeroContratPack = numeroContratPack;
	}
	public String getPacweb() {
		return pacweb;
	}
	public void setPacweb(String pacweb) {
		this.pacweb = pacweb;
	}
	public String getMotifTransfert() {
		return motifTransfert;
	}


	public void setMotifTransfert(String motifTransfert) {
		this.motifTransfert = motifTransfert;
	}

	public Contrat() {

	}

	/**
	 * Access method for the id property.
	 *
	 * @return the current value of the id property
	 */
	@Override
	public long getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 *
	 * @param aId
	 *            the new value of the id property
	 */
	@Override
	public void setId(long aId) {
		id = aId;
	}

	/**
	 * Access method for the typeContrat property.
	 *
	 * @return the current value of the typeContrat property
	 */
	public String getTypeContrat() {
		return typeContrat;
	}

	/**
	 * Sets the value of the typeContrat property.
	 *
	 * @param aTypeContrat
	 *            the new value of the typeContrat property
	 */
	public void setTypeContrat(String aTypeContrat) {
		typeContrat = aTypeContrat;
	}

	/**
	 * Access method for the numero property.
	 *
	 * @return the current value of the numero property
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * Sets the value of the numero property.
	 *
	 * @param aNumero
	 *            the new value of the numero property
	 */
	public void setNumero(String aNumero) {
		numero = aNumero;
	}

	/**
	 * Access method for the numeroAdhesion property.
	 *
	 * @return the current value of the numeroAdhesion property
	 */
	public String getNumeroAdhesion() {
		return numeroAdhesion;
	}

	/**
	 * Sets the value of the numeroAdhesion property.
	 *
	 * @param aNumeroAdhesion
	 *            the new value of the numeroAdhesion property
	 */
	public void setNumeroAdhesion(String aNumeroAdhesion) {
		numeroAdhesion = aNumeroAdhesion;
	}

	/**
	 * Access method for the dateSouscription property.
	 *
	 * @return the current value of the dateSouscription property
	 */
	public Calendar getDateSouscription() {
		return dateSouscription;
	}

	/**
	 * Sets the value of the dateSouscription property.
	 *
	 * @param aDateSouscription
	 *            the new value of the dateSouscription property
	 */
	public void setDateSouscription(Calendar aDateSouscription) {
		dateSouscription = aDateSouscription;
	}

	/**
	 * Access method for the numeroAuthorisation property.
	 *
	 * @return the current value of the numeroAuthorisation property
	 */
	public String getNumeroAuthorisation() {
		return numeroAuthorisation;
	}

	/**
	 * Sets the value of the numeroAuthorisation property.
	 *
	 * @param aNumeroAuthorisation
	 *            the new value of the numeroAuthorisation property
	 */
	public void setNumeroAuthorisation(String aNumeroAuthorisation) {
		numeroAuthorisation = aNumeroAuthorisation;
	}

	/**
	 * Access method for the dateAutorisation property.
	 *
	 * @return the current value of the dateAutorisation property
	 */
	public Calendar getDateAutorisation() {
		return dateAutorisation;
	}

	/**
	 * Sets the value of the dateAutorisation property.
	 *
	 * @param aDateAutorisation
	 *            the new value of the dateAutorisation property
	 */
	public void setDateAutorisation(Calendar aDateAutorisation) {
		dateAutorisation = aDateAutorisation;
	}

	/**
	 * Access method for the numeroCompteBancaire property.
	 *
	 * @return the current value of the numeroCompteBancaire property
	 */
	public String getNumeroCompteBancaire() {
		return numeroCompteBancaire;
	}

	/**
	 * Sets the value of the numeroCompteBancaire property.
	 *
	 * @param aNumeroCompteBancaire
	 *            the new value of the numeroCompteBancaire property
	 */
	public void setNumeroCompteBancaire(String aNumeroCompteBancaire) {
		numeroCompteBancaire = aNumeroCompteBancaire;
	}

	/**
	 * Access method for the prime property.
	 *
	 * @return the current value of the prime property
	 */
	public Double getPrime() {
		return prime;
	}

	/**
	 * Sets the value of the prime property.
	 *
	 * @param aPrime
	 *            the new value of the prime property
	 */
	public void setPrime(Double aPrime) {
		prime = aPrime;
	}

	/**
	 * Access method for the surprime property.
	 *
	 * @return the current value of the surprime property
	 */
	public Double getSurprime() {
		return surprime;
	}

	/**
	 * Sets the value of the surprime property.
	 *
	 * @param aSurprime
	 *            the new value of the surprime property
	 */
	public void setSurprime(Double aSurprime) {
		surprime = aSurprime;
	}

	/**
	 * Access method for the primeTotale property.
	 *
	 * @return the current value of the primeTotale property
	 */
	public Double getPrimeTotale() {
		return primeTotale;
	}

	/**
	 * Sets the value of the primeTotale property.
	 *
	 * @param aPrimeTotale
	 *            the new value of the primeTotale property
	 */
	public void setPrimeTotale(Double aPrimeTotale) {
		primeTotale = aPrimeTotale;
	}

	/**
	 * Access method for the dateVersementPremierePrime property.
	 *
	 * @return the current value of the dateVersementPremierePrime property
	 */
	public Calendar getDateVersementPremierePrime() {
		return dateVersementPremierePrime;
	}

	/**
	 * Sets the value of the dateVersementPremierePrime property.
	 *
	 * @param aDateVersementPremierePrime
	 *            the new value of the dateVersementPremierePrime property
	 */
	public void setDateVersementPremierePrime(
			Calendar aDateVersementPremierePrime) {
		dateVersementPremierePrime = aDateVersementPremierePrime;
	}

	/**
	 * Access method for the racineVendeur property.
	 *
	 * @return the current value of the racineVendeur property
	 */
	public String getRacineVendeur() {
		return racineVendeur;
	}

	/**
	 * Sets the value of the racineVendeur property.
	 *
	 * @param aRacineVendeur
	 *            the new value of the racineVendeur property
	 */
	public void setRacineVendeur(String aRacineVendeur) {
		racineVendeur = aRacineVendeur;
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
	 * Access method for the commentaires property.
	 *
	 * @return the current value of the commentaires property
	 */
	public String getCommentaires() {
		return commentaires;
	}

	/**
	 * Sets the value of the commentaires property.
	 *
	 * @param aCommentaires
	 *            the new value of the commentaires property
	 */
	public void setCommentaires(String aCommentaires) {
		commentaires = aCommentaires;
	}

	/**
	 * Access method for the nombreSalariesCG property.
	 *
	 * @return the current value of the nombreSalariesCG property
	 */
	public Integer getNombreSalariesCG() {
		return nombreSalariesCG;
	}

	/**
	 * Sets the value of the nombreSalariesCG property.
	 *
	 * @param aNombreSalariesCG
	 *            the new value of the nombreSalariesCG property
	 */
	public void setNombreSalariesCG(Integer aNombreSalariesCG) {
		nombreSalariesCG = aNombreSalariesCG;
	}

	/**
	 * Access method for the dateEntreeEntreprise property.
	 *
	 * @return the current value of the dateEntreeEntreprise property
	 */
	public Calendar getDateEntreeEntreprise() {
		return dateEntreeEntreprise;
	}

	/**
	 * Sets the value of the dateEntreeEntreprise property.
	 *
	 * @param aDateEntreeEntreprise
	 *            the new value of the dateEntreeEntreprise property
	 */
	public void setDateEntreeEntreprise(Calendar aDateEntreeEntreprise) {
		dateEntreeEntreprise = aDateEntreeEntreprise;
	}

	/**
	 * Access method for the capitalAssureMin property.
	 *
	 * @return the current value of the capitalAssureMin property
	 */
	public Double getCapitalAssureMin() {
		return capitalAssureMin;
	}

	/**
	 * Sets the value of the capitalAssureMin property.
	 *
	 * @param aCapitalAssureMin
	 *            the new value of the capitalAssureMin property
	 */
	public void setCapitalAssureMin(Double aCapitalAssureMin) {
		capitalAssureMin = aCapitalAssureMin;
	}

	/**
	 * Access method for the capitalAssureMax property.
	 *
	 * @return the current value of the capitalAssureMax property
	 */
	public Double getCapitalAssureMax() {
		return capitalAssureMax;
	}

	/**
	 * Sets the value of the capitalAssureMax property.
	 *
	 * @param aCapitalAssureMax
	 *            the new value of the capitalAssureMax property
	 */
	public void setCapitalAssureMax(Double aCapitalAssureMax) {
		capitalAssureMax = aCapitalAssureMax;
	}

	/**
	 * Access method for the modePrelevement property.
	 *
	 * @return the current value of the modePrelevement property
	 */
	public Boolean getModePrelevement() {
		return modePrelevement;
	}

	/**
	 * Sets the value of the modePrelevement property.
	 *
	 * @param aModePrelevement
	 *            the new value of the modePrelevement property
	 */
	public void setModePrelevement(Boolean aModePrelevement) {
		modePrelevement = aModePrelevement;
	}

	/**
	 * Access method for the sortPartPatronale property.
	 *
	 * @return the current value of the sortPartPatronale property
	 */


	/**
	 * Access method for the refPartieDommages property.
	 *
	 * @return the current value of the refPartieDommages property
	 */
	public PartieDommages getRefPartieDommages() {
		return refPartieDommages;
	}

	/**
	 * Sets the value of the refPartieDommages property.
	 *
	 * @param aRefPartieDommages
	 *            the new value of the refPartieDommages property
	 */
	public void setRefPartieDommages(PartieDommages aRefPartieDommages) {
		refPartieDommages = aRefPartieDommages;
	}

	/**
	 * @return Returns the refBeneficiaires.
	 */
	public Collection getRefBeneficiaires() {
		return refBeneficiaires;
	}

	/**
	 * @param refBeneficiaires
	 *            The refBeneficiaires to set.
	 */
	public void setRefBeneficiaires(Collection refBeneficiaires) {
		this.refBeneficiaires = refBeneficiaires;
	}

	/**
	 * Access method for the refSouscripteur property.
	 *
	 * @return the current value of the refSouscripteur property
	 */
	public Client getRefSouscripteur() {
		return refSouscripteur;
	}

	/**
	 * Sets the value of the refSouscripteur property.
	 *
	 * @param aRefSouscripteur
	 *            the new value of the refSouscripteur property
	 */
	public void setRefSouscripteur(Client aRefSouscripteur) {
		refSouscripteur = aRefSouscripteur;
	}

	/**
	 * Access method for the refPartieEpargne property.
	 *
	 * @return the current value of the refPartieEpargne property
	 */
	public PartieEpargne getRefPartieEpargne() {
		return refPartieEpargne;
	}

	/**
	 * Sets the value of the refPartieEpargne property.
	 *
	 * @param aRefPartieEpargne
	 *            the new value of the refPartieEpargne property
	 */
	public void setRefPartieEpargne(PartieEpargne aRefPartieEpargne) {
		refPartieEpargne = aRefPartieEpargne;
	}

	/**
	 * Access method for the refAdherent property.
	 *
	 * @return the current value of the refAdherent property
	 */
	public Client getRefAdherent() {
		return refAdherent;
	}

	/**
	 * Sets the value of the refAdherent property.
	 *
	 * @param aRefAdherent
	 *            the new value of the refAdherent property
	 */
	public void setRefAdherent(Client aRefAdherent) {
		refAdherent = aRefAdherent;
	}

	/**
	 * @return Returns the refReponsesQuestionsDeclaration.
	 */
	public Collection getRefReponsesQuestionsDeclaration() {
		return refReponsesQuestionsDeclaration;
	}

	/**
	 * @param refReponsesQuestionsDeclaration
	 *            The refReponsesQuestionsDeclaration to set.
	 */
	public void setRefReponsesQuestionsDeclaration(
			Collection refReponsesQuestionsDeclaration) {
		this.refReponsesQuestionsDeclaration = refReponsesQuestionsDeclaration;
	}

	/**
	 * Access method for the refProduit property.
	 *
	 * @return the current value of the refProduit property
	 */
	public Produit getRefProduit() {
		return this.refProduit;
	}

	/**
	 * Sets the value of the refProduit property.
	 *
	 * @param aRefProduit
	 *            the new value of the refProduit property
	 */
	public void setRefProduit(Produit aRefProduit) {
		refProduit = aRefProduit;
	}

	/**
	 * Access method for the refUtilisateurCreateur property.
	 *
	 * @return the current value of the refUtilisateurCreateur property
	 */
	public Utilisateur getRefUtilisateurCreateur() {
		return refUtilisateurCreateur;
	}

	/**
	 * Sets the value of the refUtilisateurCreateur property.
	 *
	 * @param aRefUtilisateurCreateur
	 *            the new value of the refUtilisateurCreateur property
	 */
	public void setRefUtilisateurCreateur(Utilisateur aRefUtilisateurCreateur) {
		refUtilisateurCreateur = aRefUtilisateurCreateur;
	}

	/**
	 * Access method for the refAgence property.
	 *
	 * @return the current value of the refAgence property
	 */
	public Entite getRefAgence() {
		return refAgence;
	}

	/**
	 * Sets the value of the refAgence property.
	 *
	 * @param aRefAgence
	 *            the new value of the refAgence property
	 */
	public void setRefAgence(Entite aRefAgence) {
		refAgence = aRefAgence;
	}

	/**
	 * Access method for the refTypeFractionnementPrime property.
	 *
	 * @return the current value of the refTypeFractionnementPrime property
	 */
	public TypeFractionnementPrime getRefTypeFractionnementPrime() {
		return refTypeFractionnementPrime;
	}

	/**
	 * Sets the value of the refTypeFractionnementPrime property.
	 *
	 * @param aRefTypeFractionnementPrime
	 *            the new value of the refTypeFractionnementPrime property
	 */
	public void setRefTypeFractionnementPrime(
			TypeFractionnementPrime aRefTypeFractionnementPrime) {
		refTypeFractionnementPrime = aRefTypeFractionnementPrime;
	}

	/**
	 * Access method for the refPartiePrevoyance property.
	 *
	 * @return the current value of the refPartiePrevoyance property
	 */
	public PartiePrevoyance getRefPartiePrevoyance() {
		return refPartiePrevoyance;
	}

	/**
	 * Sets the value of the refPartiePrevoyance property.
	 *
	 * @param aRefPartiePrevoyance
	 *            the new value of the refPartiePrevoyance property
	 */
	public void setRefPartiePrevoyance(PartiePrevoyance aRefPartiePrevoyance) {
		refPartiePrevoyance = aRefPartiePrevoyance;
	}

	/**
	 * Access method for the refConjoint property.
	 *
	 * @return the current value of the refConjoint property
	 */
	public Client getRefConjoint() {
		return refConjoint;
	}

	/**
	 * Sets the value of the refConjoint property.
	 *
	 * @param aRefConjoint
	 *            the new value of the refConjoint property
	 */
	public void setRefConjoint(Client aRefConjoint) {
		refConjoint = aRefConjoint;
	}

	/**
	 * @return Returns the refCoassurances.
	 */
	public Collection getRefCoassurances() {
		return refCoassurances;
	}

	/**
	 * @param refCoassurances
	 *            The refCoassurances to set.
	 */
	public void setRefCoassurances(Collection refCoassurances) {
		this.refCoassurances = refCoassurances;
	}

	/**
	 * @return Returns the refDemandesRegularisation.
	 */
	public Collection getRefDemandesRegularisation() {
		return refDemandesRegularisation;
	}

	/**
	 * @param refDemandesRegularisation
	 *            The refDemandesRegularisation to set.
	 */
	public void setRefDemandesRegularisation(
			Collection refDemandesRegularisation) {
		this.refDemandesRegularisation = refDemandesRegularisation;
	}

	/**
	 * Access method for the refTypeSalarieAdherent property.
	 *
	 * @return the current value of the refTypeSalarieAdherent property
	 */
	public TypeSalarie getRefTypeSalarieAdherent() {
		return refTypeSalarieAdherent;
	}

	/**
	 * Sets the value of the refTypeSalarieAdherent property.
	 *
	 * @param aRefTypeSalarieAdherent
	 *            the new value of the refTypeSalarieAdherent property
	 */
	public void setRefTypeSalarieAdherent(TypeSalarie aRefTypeSalarieAdherent) {
		refTypeSalarieAdherent = aRefTypeSalarieAdherent;
	}

	/**
	 * Access method for the refContratGroupe property.
	 *
	 * @return the current value of the refContratGroupe property
	 */
	public com.rmawatanya.convergence.application.oct.metier.modele.Contrat getRefContratGroupe() {
		return refContratGroupe;
	}

	/**
	 * Sets the value of the refContratGroupe property.
	 *
	 * @param aRefContratGroupe
	 *            the new value of the refContratGroupe property
	 */
	public void setRefContratGroupe(
			com.rmawatanya.convergence.application.oct.metier.modele.Contrat aRefContratGroupe) {
		refContratGroupe = aRefContratGroupe;
	}


	/**
	 * @return Returns the refEnfants.
	 */
	public Collection getRefEnfants() {
		return refEnfants;
	}

	/**
	 * @param refEnfants
	 *            The refEnfants to set.
	 */
	public void setRefEnfants(Collection refEnfants) {
		this.refEnfants = refEnfants;
	}

	/**
	 * Access method for the refMotifResiliation property.
	 *
	 * @return the current value of the refMotifResiliation property
	 */
	public MotifResiliation getRefMotifResiliation() {
		return refMotifResiliation;
	}

	/**
	 * Sets the value of the refMotifResiliation property.
	 *
	 * @param aRefMotifResiliation
	 *            the new value of the refMotifResiliation property
	 */
	public void setRefMotifResiliation(MotifResiliation aRefMotifResiliation) {
		refMotifResiliation = aRefMotifResiliation;
	}

	/**
	 * Access method for the refOption property.
	 *
	 * @return the current value of the refOption property
	 */
	public Option getRefOption() {
		return refOption;
	}

	/**
	 * Sets the value of the refOption property.
	 *
	 * @param aRefOption
	 *            the new value of the refOption property
	 */
	public void setRefOption(Option aRefOption) {
		refOption = aRefOption;
	}


	/**
	 * @return Returns the refEcheanciersPrelevements.
	 */
	public Collection getRefEcheanciersPrelevements() {
		return refEcheanciersPrelevements;
	}

	/**
	 * @param refEcheanciersPrelevements
	 *            The refEcheanciersPrelevements to set.
	 */
	public void setRefEcheanciersPrelevements(
			Collection refEcheanciersPrelevements) {
		this.refEcheanciersPrelevements = refEcheanciersPrelevements;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	@Override
	public EntiteFactory getFactory() {
		return null;
	}

	public ContratState getContratState() {
		if (Constantes.ETAT_CONTRAT_ENCOURS.equals(etat)) {
			return new ContratStateEncours();
		}
		if (Constantes.ETAT_CONTRAT_PROPOSITION_ASSURANCE.equals(etat)) {
			return new ContratStatePropositionAssurance();
		}
		if (Constantes.ETAT_CONTRAT_PROPOSITION_ASSURANCE_ACCEPTEE.equals(etat)) {
			return new ContratStatePropositionAssuranceAcceptee();
		}
		if (Constantes.ETAT_CONTRAT_PROPOSITION_ASSURANCE_AJOURNEE.equals(etat)) {
			return new ContratStatePropositionAssuranceAjournee();
		}
		if (Constantes.ETAT_CONTRAT_PROPOSITION_ASSURANCE_REJETEE.equals(etat)) {
			return new ContratStatePropositionAssuranceRejetee();
		}
		if (Constantes.ETAT_CONTRAT_PROPOSITION_ASSURANCE_ANNULEE.equals(etat)) {
			return new ContratStatePropositionAssuranceAnnulee();
		}
		if (Constantes.ETAT_CONTRAT_RESILIATION_ENREGISTREE.equals(etat)) {
			return new ContratStateResiliationEnregistree();
		}
		if (Constantes.ETAT_CONTRAT_ENATTENTE_DEBLOQUAGE.equals(etat)) {
			return new ContratStateEncours();
		}
		return null;
	}

	public Calendar getDateDerniereModification() {
		return dateDerniereModification;
	}

	public void setDateDerniereModification(Calendar dateDerniereModification) {
		this.dateDerniereModification = dateDerniereModification;
	}

	public String getPartieResiliante() {
		return partieResiliante;
	}

	public void setPartieResiliante(String partieResiliante) {
		this.partieResiliante = partieResiliante;
	}

	public Utilisateur getRefUtilisateurModification() {
		return refUtilisateurModification;
	}

	public void setRefUtilisateurModification(
			Utilisateur refUtilisateurModification) {
		this.refUtilisateurModification = refUtilisateurModification;
	}

	public void setContratState(ContratState contratState) {
		this.contratState = contratState;
	}

	public String getLibelleDateSouscription() {
		if (this.dateSouscription == null) {
			return null;
		} else {
			try {
				return DateUtile.calendarToString(dateSouscription);
			} catch (Exception e) {
				return null;
			}
		}
	}

	public String getLibelleEtat() {

		if (Constantes.ETAT_CONTRAT_ENINSTANCE.equals(etat)) {
			return Constantes.LIBELLE_ETAT_CONTRAT_ENINSTANCE;
		}
		if (Constantes.ETAT_CONTRAT_ENCOURS.equals(etat)) {
			return Constantes.LIBELLE_ETAT_CONTRAT_ENCOURS;
		}
		if (Constantes.ETAT_CONTRAT_RESILIE.equals(etat)) {
			return Constantes.LIBELLE_ETAT_CONTRAT_RESILIE;
		}
		if (Constantes.ETAT_CONTRAT_RESILIATION_ENREGISTREE.equals(etat)) {
			return Constantes.LIBELLE_ETAT_CONTRAT_RESILIATION_ENREGISTREE;
		}
		if (Constantes.ETAT_CONTRAT_REMPLACE.equals(etat)) {
			return Constantes.LIBELLE_ETAT_CONTRAT_REMPLACE;
		}
		if (Constantes.ETAT_CONTRAT_RACHETE_TOTALEMENT.equals(etat)) {
			return Constantes.LIBELLE_ETAT_CONTRAT_RACHETE_TOTALEMENT;
		}
		if (Constantes.ETAT_CONTRAT_RACHETE_TOTALEMENT_ENINSTANCE.equals(etat)) {
			return Constantes.LIBELLE_ETAT_CONTRAT_RACHETE_TOTALEMENT_ENINSTANCE;
		}
		if (Constantes.ETAT_CONTRAT_RACHETE_TOTALEMENT_ENATTENTE_REGLEMENT
				.equals(etat)) {
			return Constantes.LIBELLE_ETAT_CONTRAT_RACHETE_TOTALEMENT_ENATTENTE_REGLEMENT;
		}
		if (Constantes.ETAT_CONTRAT_ANNULE.equals(etat)) {
			return Constantes.LIBELLE_ETAT_CONTRAT_ANNULE;
		}
		if (Constantes.ETAT_CONTRAT_PROPOSITION_ASSURANCE_ENINSTANCE
				.equals(etat)) {
			return Constantes.LIBELLE_ETAT_CONTRAT_PROPOSITION_ASSURANCE_ENINSTANCE;
		}
		if (Constantes.ETAT_CONTRAT_PROPOSITION_ASSURANCE.equals(etat)) {
			return Constantes.LIBELLE_ETAT_CONTRAT_PROPOSITION_ASSURANCE;
		}
		if (Constantes.ETAT_CONTRAT_PROPOSITION_ASSURANCE_ACCEPTEE.equals(etat)) {
			return Constantes.LIBELLE_ETAT_CONTRAT_PROPOSITION_ASSURANCE_ACCEPTEE;
		}
		if (Constantes.ETAT_CONTRAT_PROPOSITION_ASSURANCE_REJETEE.equals(etat)) {
			return Constantes.LIBELLE_ETAT_CONTRAT_PROPOSITION_ASSURANCE_REJETEE;
		}
		if (Constantes.ETAT_CONTRAT_PROPOSITION_ASSURANCE_AJOURNEE.equals(etat)) {
			return Constantes.LIBELLE_ETAT_CONTRAT_PROPOSITION_ASSURANCE_AJOURNEE;
		}
		if (Constantes.ETAT_CONTRAT_PROPOSITION_ASSURANCE_ANNULEE.equals(etat)) {
			return Constantes.LIBELLE_ETAT_CONTRAT_PROPOSITION_ASSURANCE_ANNULEE;
		}
		if (Constantes.ETAT_CONTRAT_MODIF_ENINSTANCE.equals(etat)) {
			return Constantes.LIBELLE_ETAT_CONTRAT_MOFIF_ENINSTANCE;
		}
		if (Constantes.ETAT_CONTRAT_REMPLACEMENT_ENINSTANCE.equals(etat)) {
			return Constantes.LIBELLE_ETAT_CONTRAT_REMPLACEMENT_ENINSTANCE;
		}
		if (Constantes.ETAT_CONTRAT_SUSPENDU.equals(etat)) {
			return Constantes.LIBELLE_ETAT_CONTRAT_SUSPENDU;
		}
		if (Constantes.ETAT_CONTRAT_IMPORTE.equals(etat)) {
			return Constantes.LIBELLE_ETAT_CONTRAT_IMPORTE;
		}
		if (Constantes.ETAT_CONTRAT_TRANSFERE_SC.equals(etat)) {
			return Constantes.LIBELLE_ETAT_CONTRAT_TRANSFERE_SC;
		}
		if (Constantes.ETAT_CONTRAT_ENATTENTE_TRANSFERT.equals(etat)) {
			return Constantes.LIBELLE_ETAT_CONTRAT_ENATTENTE_TRANSFERT;
		}
		if (Constantes.ETAT_CONTRAT_LIQUIDE.equals(etat)) {
			return Constantes.LIBELLE_ETAT_CONTRAT_LIQUIDE;
		}
		if (Constantes.ETAT_CONTRAT_ENATTENTE_DEBLOQUAGE.equals(etat)) {
			return Constantes.LIBELLE_ETAT_CONTRAT_ENATTENTE_DEBLOCAGE;
		}
		return null;
	}

	public int getLastNumVersion() {
		return lastNumVersion;
	}

	public void setLastNumVersion(int lastNumVersion) {
		this.lastNumVersion = lastNumVersion;
	}

	public String getNatureBeneficiaires() {
		return natureBeneficiaires;
	}

	public void setNatureBeneficiaires(String natureBeneficiaires) {
		this.natureBeneficiaires = natureBeneficiaires;
	}

	public Boolean getEnInstance() {
		return enInstance;
	}

	public void setEnInstance(Boolean enInstance) {
		this.enInstance = enInstance;
	}

	public Boolean getEdite() {
		return edite;
	}

	public void setEdite(Boolean edite) {
		this.edite = edite;
	}

	public boolean isContrat() {
		return Fonctions.isContrat(this.etat);
	}

	@Override
	public void historiser() {
		// Cr�er l'historique de contrat
		HistoryHelper historyHelper = (HistoryHelper) ServicesFactory
				.getService(HistoryHelper.class);
		this.setLastNumVersion(this.getLastNumVersion() + 1);
		this.lastHistoryItem = historyHelper.historiserHelper(
				new ContratHistoryItem(), this.getLastNumVersion() - 1, this);
	}

	@Override
	public List getHistory() {
		HistoryHelper historyHelper = (HistoryHelper) ServicesFactory
				.getService(HistoryHelper.class);
		return historyHelper.getHistoryHelper(ContratHistoryItem.class, this
				.getId());
	}

	@Override
	public HistoryItem getLastHistoryItem() {
		if (this.lastHistoryItem != null) {
			return this.lastHistoryItem;
		}
		HistoryHelper historyHelper = (HistoryHelper) ServicesFactory
				.getService(HistoryHelper.class);
		return historyHelper.getHistoryItemHelper(ContratHistoryItem.class,
				this.getLastNumVersion() - 1, this.getId());
	}

	/**
	 * 16/03/2011
	 * M.BERR
	 * @return the last modfied contract
	 */
	public HistoryItem getLastModifiedHistoryItem() {

		HistoryHelper historyHelper = (HistoryHelper) ServicesFactory
				.getService(HistoryHelper.class);
		return historyHelper.getHistoryItemHelper(ContratHistoryItem.class,
				this.getLastNumVersion() - 2, this.getId());
	}

	/**
	 *
	 */
	@Override
	public List getParents() {
		List res = new ArrayList();

		if (!Constantes.TYPE_CONTRAT_GROUPE.equals(this.getTypeContrat())) {
			if (this.getRefContratGroupe() != null)
				res.add(this.getRefContratGroupe());
		} else
			return null;

		// TYPE_CONTRAT_GROUPE
		return res;
	}

	public Contrat getRefContratRemplacant() {
		return refContratRemplacant;
	}

	public void setRefContratRemplacant(Contrat refContratRemplacant) {
		this.refContratRemplacant = refContratRemplacant;
	}

	public String getComplementTypeSalarieAdherent() {
		return complementTypeSalarieAdherent;
	}

	public void setComplementTypeSalarieAdherent(
			String complementTypeSalarieAdherent) {
		this.complementTypeSalarieAdherent = complementTypeSalarieAdherent;
	}

	public Boolean getAvenant() {
		return avenant;
	}

	public void setAvenant(Boolean avenant) {
		this.avenant = avenant;
	}

	public Boolean getAvenantResiliation() {
		return avenantResiliation;
	}

	public void setAvenantResiliation(Boolean avenantResiliation) {
		this.avenantResiliation = avenantResiliation;
	}

	public Double getPrimeTotaleEcheance() {
		return primeTotaleEcheance;
	}

	public void setPrimeTotaleEcheance(Double primeTotaleEcheance) {
		this.primeTotaleEcheance = primeTotaleEcheance;
	}

	public Calendar getDateEcheance() {
		return dateEcheance;
	}

	public void setDateEcheance(Calendar dateEcheance) {
		this.dateEcheance = dateEcheance;
	}

	public Boolean getMigre() {
		return migre;
	}

	public void setMigre(Boolean migre) {
		this.migre = migre;
	}

	@Override
	public String getIdLockable() {
		return getNumero();
	}

	@Override
	public String getLockableType() {
		return this.getClass().getName();
	}

	public Double getEpargneStocke() {
		return epargneStocke;
	}

	public void setEpargneStocke(Double epargneStocke) {
		this.epargneStocke = epargneStocke;
	}

	public String getIdentifiantRepresentant() {
		return identifiantRepresentant;
	}

	public void setIdentifiantRepresentant(String identifiantRepresentant) {
		this.identifiantRepresentant = identifiantRepresentant;
	}

	public String getQualiteRepresentant() {
		return qualiteRepresentant;
	}

	public void setQualiteRepresentant(String qualiteRepresentant) {
		this.qualiteRepresentant = qualiteRepresentant;
	}

	public String getModePaiement() {
		return modePaiement;
	}

	public void setModePaiement(String modePaiement) {
		this.modePaiement = modePaiement;
	}

	public Double getMasseSalariale() {
		return masseSalariale;
	}

	public void setMasseSalariale(Double masseSalariale) {
		this.masseSalariale = masseSalariale;
	}

	public Integer getAgeRetraite() {
		return ageRetraite;
	}

	public void setAgeRetraite(Integer ageRetraite) {
		this.ageRetraite = ageRetraite;
	}

	public String getTypeCalculPrime() {
		return typeCalculPrime;
	}

	public void setTypeCalculPrime(String typeCalculPrime) {
		this.typeCalculPrime = typeCalculPrime;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public Calendar getDateEffet() {
		return dateEffet;
	}

	public void setDateEffet(Calendar dateEffet) {
		this.dateEffet = dateEffet;
	}

	public TypePeriodiciteCotisation getRefTypePeriodiciteCotisation() {
		return refTypePeriodiciteCotisation;
	}
	public void setRefTypePeriodiciteCotisation(TypePeriodiciteCotisation refTypePeriodiciteCotisation) {
		this.refTypePeriodiciteCotisation = refTypePeriodiciteCotisation;
	}
	public Integer getDureeContratGroupe() {
		return dureeContratGroupe;
	}

	public void setDureeContratGroupe(Integer dureeContratGroupe) {
		this.dureeContratGroupe = dureeContratGroupe;
	}

	public String getNumeroCompteAdherent() {
		return numeroCompteAdherent;
	}

	public void setNumeroCompteAdherent(String numeroCompteAdherent) {
		this.numeroCompteAdherent = numeroCompteAdherent;
	}

	public String getNouveauCompteBancaire() {
		return nouveauCompteBancaire;
	}

	public void setNouveauCompteBancaire(String nouveauCompteBancaire) {
		this.nouveauCompteBancaire = nouveauCompteBancaire;
	}
	public VersionCommercialeProduit getRefVersionCommercialeProduit() {
		return refVersionCommercialeProduit;
	}
	public void setRefVersionCommercialeProduit(VersionCommercialeProduit refVersionCommercialeProduit) {
		this.refVersionCommercialeProduit = refVersionCommercialeProduit;
	}

	public String getReferenceExterne() {
		return referenceExterne;
	}
	public void setReferenceExterne(String referenceExterne) {
		this.referenceExterne = referenceExterne;
	}
	public Collection getRefRisques() {
		return refRisques;
	}
	public void setRefRisques(Collection refRisques) {
		this.refRisques = refRisques;
	}
	public void setLastHistoryItem(HistoryItem lastHistoryItem) {
		this.lastHistoryItem = lastHistoryItem;
	}
	public Collection getRefRisquesPrevoyance() {
		return refRisquesPrevoyance;
	}
	public void setRefRisquesPrevoyance(Collection refRisquesPrevoyance) {
		this.refRisquesPrevoyance = refRisquesPrevoyance;
	}
	public String getRacineGPP() {
		return racineGPP;
	}
	public void setRacineGPP(String racineGPP) {
		this.racineGPP = racineGPP;
	}
	public Calendar getDateReceptionCP() {
		return dateReceptionCP;
	}
	public void setDateReceptionCP(Calendar dateReceptionCP) {
		this.dateReceptionCP = dateReceptionCP;
	}
	public ProfilRisque getRefProfilRisque() {
		return refProfilRisque;
	}
	public void setRefProfilRisque(ProfilRisque refProfilRisque) {
		this.refProfilRisque = refProfilRisque;
	}
	public Integer getNombreMaxSuspensionCotisationsParAnnee() {
		return nombreMaxSuspensionCotisationsParAnnee;
	}
	public void setNombreMaxSuspensionCotisationsParAnnee(
			Integer nombreMaxSuspensionCotisationsParAnnee) {
		this.nombreMaxSuspensionCotisationsParAnnee = nombreMaxSuspensionCotisationsParAnnee;
	}
	public Calendar getDateDernierSuspension() {
		return dateDernierSuspension;
	}
	public void setDateDernierSuspension(Calendar dateDernierSuspension) {
		this.dateDernierSuspension = dateDernierSuspension;
	}
	public Boolean getAvecGarantiePlancher() {
		return avecGarantiePlancher;
	}
	public void setAvecGarantiePlancher(Boolean avecGarantiePlancher) {
		this.avecGarantiePlancher = avecGarantiePlancher;
	}
	public String getAvecPrelevement() {
		return avecPrelevement;
	}
	public void setAvecPrelevement(String avecPrelevement) {
		this.avecPrelevement = avecPrelevement;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public List<PrimePersonnel> getRefPrimesPersonnel() {
		return refPrimesPersonnel;
	}
	public void setRefPrimesPersonnel(List<PrimePersonnel> refPrimesPersonnel) {
		this.refPrimesPersonnel = refPrimesPersonnel;
	}
	public ConditionPreferentielle getRefConditionPreferentielle() {
		return refConditionPreferentielle;
	}
	public void setRefConditionPreferentielle(
			ConditionPreferentielle refConditionPreferentielle) {
		this.refConditionPreferentielle = refConditionPreferentielle;
	}

	public List<ReponseVisiteMedical> getRefReponseVisitesMedicales() {
		return refReponseVisitesMedicales;
	}
	public void setRefReponseVisitesMedicales(
			List<ReponseVisiteMedical> refReponseVisitesMedicales) {
		this.refReponseVisitesMedicales = refReponseVisitesMedicales;
	}
	public Collection getRefReclamation() {
		return refReclamation;
	}
	public void setRefReclamation(Collection refReclamation) {
		this.refReclamation = refReclamation;
	}
	public Boolean getQuestionnaire() {
		return questionnaire;
	}
	public void setQuestionnaire(Boolean questionnaire) {
		this.questionnaire = questionnaire;
	}

	public Integer getNbRetraites() {
		return nbRetraites;
	}
	public void setNbRetraites(Integer nbRetraites) {
		this.nbRetraites = nbRetraites;
	}
	public String getOrgAssurBase() {
		return orgAssurBase;
	}
	public void setOrgAssurBase(String orgAssurBase) {
		this.orgAssurBase = orgAssurBase;
	}
	public String getOrgAssurCompl() {
		return orgAssurCompl;
	}
	public void setOrgAssurCompl(String orgAssurCompl) {
		this.orgAssurCompl = orgAssurCompl;
	}
	public Double getTauxAssurBase() {
		return tauxAssurBase;
	}
	public void setTauxAssurBase(Double tauxAssurBase) {
		this.tauxAssurBase = tauxAssurBase;
	}
	public Double getTauxAssurCompl() {
		return tauxAssurCompl;
	}
	public void setTauxAssurCompl(Double tauxAssurCompl) {
		this.tauxAssurCompl = tauxAssurCompl;
	}
	public Integer getNbActifs() {
		return nbActifs;
	}
	public void setNbActifs(Integer nbActifs) {
		this.nbActifs = nbActifs;
	}
	public Boolean getAvecCommission() {
		return avecCommission;
	}
	public void setAvecCommission(Boolean avecCommission) {
		this.avecCommission = avecCommission;
	}
	public List<BaremeBSMG> getRefBaremesBSMG() {
		return refBaremesBSMG;
	}
	public void setRefBaremesBSMG(List<BaremeBSMG> refBaremesBSMG) {
		this.refBaremesBSMG = refBaremesBSMG;
	}
	public String getIce() {
		return ice;
	}
	public void setIce(String ice) {
		this.ice = ice;
	}
	public Boolean getContratMemeNatureResilie() {
		return contratMemeNatureResilie;
	}
	public void setContratMemeNatureResilie(Boolean contratMemeNatureResilie) {
		this.contratMemeNatureResilie = contratMemeNatureResilie;
	}
	public Boolean getContratMemeNature() {
		return contratMemeNature;
	}
	public void setContratMemeNature(Boolean contratMemeNature) {
		this.contratMemeNature = contratMemeNature;
	}
	public Integer getEffectif() {
		return effectif;
	}
	public void setEffectif(Integer effectif) {
		this.effectif = effectif;
	}		
	public Boolean getDigital() {
		return digital;
	}
	public void setDigital(Boolean digital) {
		this.digital = digital;
	}
	public String getRibFormater() {
		String rib = "";
		if(this.numeroCompteBancaire != null && !this.numeroCompteBancaire.trim().equals("")) {
			rib = this.numeroCompteBancaire.substring(0, 3)+" "+this.numeroCompteBancaire.substring(3, 6)+" "+this.numeroCompteBancaire.substring(6, 22)+" "+this.numeroCompteBancaire.substring(22, 24);
		}		
		return rib;
	}
	public String getRibAdherentFormater() {
		String rib = "";
		if(this.numeroCompteAdherent != null && !this.numeroCompteAdherent.trim().equals("")) {
			rib = this.numeroCompteAdherent.substring(0, 3)+" "+this.numeroCompteAdherent.substring(3, 6)+" "+this.numeroCompteAdherent.substring(6, 22)+" "+this.numeroCompteAdherent.substring(22, 24);
		}		
		return rib;
	}
	public Boolean getInsertStock() {
		return insertStock;
	}
	public void setInsertStock(Boolean insertStock) {
		this.insertStock = insertStock;
	}
	
		public Boolean getFatcaNonConforme() {
		return fatcaNonConforme;
	}
	public void setFatcaNonConforme(Boolean fatcaNonConforme) {
		this.fatcaNonConforme = fatcaNonConforme;
	}
}
