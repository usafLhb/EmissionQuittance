package Quittance.EmissionQuittance.Classes.Prestation.modele;

import java.util.Calendar;
import java.util.List;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.application.oct.metier.modele.Contrat;
import com.rmawatanya.convergence.utile.common.Constantes;
import com.rmawatanya.convergence.utile.referentiel.TypeLiquidation;
import com.rmawatanya.convergence.utile.referentiel.TypeRente;

public class Liquidation implements IEntite {
	
	private static final long serialVersionUID = 6252328985943311895L;

	private long id;
	private String numero;
	private Calendar dateDemande;
	private Calendar dateCreation;
	private Calendar dateEtat;
	private String etat;
	private Double montantCapital;
	private Double montantRente;
	private Double cumulCotisations;
	private Double epargneRevaloriseDemande;
	private Double montantPenalites;
	private Double montantIGR;
	private boolean nonDeductibiliteFiscale;
	private Integer modeReglement;
	private String noteGestionnaire;
	private Calendar dateReceptionDossierPhysique;
	private TypeLiquidation refTypeLiquidation;
	private Double partCapital;
	private Contrat refContrat;
	private TypeRente refTypeRente;
	private BeneficiaireRente refBeneficiaireRente;
	private List<PieceLiquidation> refPiecesPresentees;
	private String infosComplementaires;
	private Calendar dateProchaineRente;
	private boolean reversementRente;
	private Calendar dateReversementRente; 
	private String numSinistrePartCapital;
	private Integer frequenceRente;
	private Double montantTaxeSolidarite;
	
	private Double montantRemboursementAvance;
	
	public Double getMontantRemboursementAvance() {
		return montantRemboursementAvance;
	}
	public void setMontantRemboursementAvance(Double montantRemboursementAvance) {
		this.montantRemboursementAvance = montantRemboursementAvance;
	}
	public Integer getFrequenceRente() {
		return frequenceRente;
	}
	public void setFrequenceRente(Integer frequenceRente) {
		this.frequenceRente = frequenceRente;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Calendar getDateDemande() {
		return dateDemande;
	}
	public void setDateDemande(Calendar dateDemande) {
		this.dateDemande = dateDemande;
	}
	public Calendar getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Calendar dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Calendar getDateEtat() {
		return dateEtat;
	}
	public void setDateEtat(Calendar dateEtat) {
		this.dateEtat = dateEtat;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Double getMontantRente() {
		return montantRente;
	}
	public void setMontantRente(Double montantRente) {
		this.montantRente = montantRente;
	}
	public Double getMontantCapital() {
		return montantCapital;
	}
	public void setMontantCapital(Double montantCapital) {
		this.montantCapital = montantCapital;
	}
	public Double getCumulCotisations() {
		return cumulCotisations;
	}
	public void setCumulCotisations(Double cumulCotisations) {
		this.cumulCotisations = cumulCotisations;
	}
	public Double getEpargneRevaloriseDemande() {
		return epargneRevaloriseDemande;
	}
	public void setEpargneRevaloriseDemande(Double epargneRevaloriseDemande) {
		this.epargneRevaloriseDemande = epargneRevaloriseDemande;
	}
	public Double getMontantPenalites() {
		return montantPenalites;
	}
	public void setMontantPenalites(Double montantPenalites) {
		this.montantPenalites = montantPenalites;
	}
	public Double getMontantIGR() {
		return montantIGR;
	}
	public void setMontantIGR(Double montantIGR) {
		this.montantIGR = montantIGR;
	}
	public boolean isNonDeductibiliteFiscale() {
		return nonDeductibiliteFiscale;
	}
	public void setNonDeductibiliteFiscale(boolean nonDeductibiliteFiscale) {
		this.nonDeductibiliteFiscale = nonDeductibiliteFiscale;
	}
	public Integer getModeReglement() {
		return modeReglement;
	}
	public void setModeReglement(Integer modeReglement) {
		this.modeReglement = modeReglement;
	}
	public String getNoteGestionnaire() {
		return noteGestionnaire;
	}
	public void setNoteGestionnaire(String noteGestionnaire) {
		this.noteGestionnaire = noteGestionnaire;
	}
	public Calendar getDateReceptionDossierPhysique() {
		return dateReceptionDossierPhysique;
	}
	public void setDateReceptionDossierPhysique(
			Calendar dateReceptionDossierPhysique) {
		this.dateReceptionDossierPhysique = dateReceptionDossierPhysique;
	}
	public TypeLiquidation getRefTypeLiquidation() {
		return refTypeLiquidation;
	}
	public void setRefTypeLiquidation(TypeLiquidation refTypeLiquidation) {
		this.refTypeLiquidation = refTypeLiquidation;
	}
	public Double getPartCapital() {
		return partCapital;
	}
	public void setPartCapital(Double partCapital) {
		this.partCapital = partCapital;
	}
	public TypeRente getRefTypeRente() {
		return refTypeRente;
	}
	public void setRefTypeRente(TypeRente refTypeRente) {
		this.refTypeRente = refTypeRente;
	}
	public BeneficiaireRente getRefBeneficiaireRente() {
		return refBeneficiaireRente;
	}
	public void setRefBeneficiaireRente(BeneficiaireRente refBeneficiaireRente) {
		this.refBeneficiaireRente = refBeneficiaireRente;
	}
	public List<PieceLiquidation> getRefPiecesPresentees() {
		return refPiecesPresentees;
	}
	public void setRefPiecesPresentees(List<PieceLiquidation> refPiecesPresentees) {
		this.refPiecesPresentees = refPiecesPresentees;
	}
	public Contrat getRefContrat() {
		return refContrat;
	}
	public void setRefContrat(Contrat refContrat) {
		this.refContrat = refContrat;
	}
	public String getInfosComplementaires() {
		return infosComplementaires;
	}
	public void setInfosComplementaires(String infosComplementaires) {
		this.infosComplementaires = infosComplementaires;
	}
	public Calendar getDateProchaineRente() {
		return dateProchaineRente;
	}
	public void setDateProchaineRente(Calendar dateProchaineRente) {
		this.dateProchaineRente = dateProchaineRente;
	}
	
	public boolean isReversementRente() {
		return reversementRente;
	}
	public void setReversementRente(boolean reversementRente) {
		this.reversementRente = reversementRente;
	}
	public EntiteFactory getFactory() {
		return null;
	}
	
	public String getLibelleEtat() {
		
		if(Constantes.TPR_ETAT_LIQUIDATION_ENINSTANCE.equals(etat)) {
			return Constantes.TPR_LIBELLE_LIQUIDATION_ENINSTANCE;
		} else if(Constantes.TPR_ETAT_LIQUIDATION_ENREGISTREE.equals(etat)) {
			return Constantes.TPR_LIBELLE_LIQUIDATION_ENREGISTREE;
		} else if(Constantes.TPR_ETAT_LIQUIDATION_VALIDEE.equals(etat)) {
			return Constantes.TPR_LIBELLE_LIQUIDATION_VALIDEE;
		} else if(Constantes.TPR_ETAT_LIQUIDATION_ENATTENTEINFO.equals(etat)) {
			return Constantes.TPR_LIBELLE_LIQUIDATION_ENATTENTEINFO;
		} else if(Constantes.TPR_ETAT_LIQUIDATION_ANNULEE.equals(etat)) {
			return Constantes.TPR_LIBELLE_LIQUIDATION_ANNULEE;
		}else if(Constantes.TPR_ETAT_LIQUIDATION_TERMINEE.equals(etat)) {
			return Constantes.TPR_ETAT_LIQUIDATION_TERMINEE;
		}
		
		return null;
	}
	public Calendar getDateReversementRente() {
		return dateReversementRente;
	}
	public void setDateReversementRente(Calendar dateReversementRente) {
		this.dateReversementRente = dateReversementRente;
	}
	public String getNumSinistrePartCapital() {
		return numSinistrePartCapital;
	}
	public void setNumSinistrePartCapital(String numSinistrePartCapital) {
		this.numSinistrePartCapital = numSinistrePartCapital;
	}
	public Double getMontantTaxeSolidarite() {
		return montantTaxeSolidarite;
	}
	public void setMontantTaxeSolidarite(Double montantTaxeSolidarite) {
		this.montantTaxeSolidarite = montantTaxeSolidarite;
	}

}
