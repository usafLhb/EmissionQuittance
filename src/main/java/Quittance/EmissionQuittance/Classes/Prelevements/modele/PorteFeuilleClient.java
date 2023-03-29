package Quittance.EmissionQuittance.Classes.Prelevements.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.application.oct.metier.modele.Contrat;
import com.rmawatanya.convergence.application.rbt.metier.model.DemandeArbitrage;
import com.rmawatanya.convergence.application.rbt.metier.model.DetailDemandeArbitrage;
import com.rmawatanya.convergence.application.tpr.metier.modele.Prestation;
import com.rmawatanya.convergence.utile.referentiel.Support;
import com.rmawatanya.convergence.utile.referentiel.TypeEvenement;

public class PorteFeuilleClient implements IEntite {
	
	private long id;
	private Double pourcentage;
	private Double montantNetInvesti;
	private Calendar dateDemande;
	private Double vlDateDemande;
	private Calendar dateExecution; // date vl
	private Double vlDateExecution;// montant VL
	private Double nombrePart;//nbr de part
	private String sens;
	private Support refSupport;
	private TypeEvenement refTypeEvenement;
	private EcheancierPrelevement refEcheancierPrelevement;
	private Prestation refPrestation;
	private DetailDemandeArbitrage refDetailDemandeArbitrage;
	private DemandeArbitrage refDemandeArbitrage;
	private Contrat refContrat;
	
	//private Boolean synchron2actuavis ;
	private Boolean agregee ;
	private String etat;

	private Double montantRompu;
	
//	public Boolean getSynchron2actuavis() {
//		return synchron2actuavis;
//	}
//
//	public void setSynchron2actuavis(Boolean synchron2actuavis) {
//		this.synchron2actuavis = synchron2actuavis;
//	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Double getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(Double pourcentage) {
		this.pourcentage = pourcentage;
	}

	public Double getMontantNetInvesti() {
		return montantNetInvesti;
	}

	public void setMontantNetInvesti(Double montantNetInvesti) {
		this.montantNetInvesti = montantNetInvesti;
	}

	public Calendar getDateDemande() {
		return dateDemande;
	}

	public void setDateDemande(Calendar dateDemande) {
		this.dateDemande = dateDemande;
	}

	public Double getVlDateDemande() {
		return vlDateDemande;
	}

	public void setVlDateDemande(Double vlDateDemande) {
		this.vlDateDemande = vlDateDemande;
	}

	public Calendar getDateExecution() {
		return dateExecution;
	}

	public void setDateExecution(Calendar dateExecution) {
		this.dateExecution = dateExecution;
	}

	public Double getVlDateExecution() {
		return vlDateExecution;
	}

	public void setVlDateExecution(Double vlDateExecution) {
		this.vlDateExecution = vlDateExecution;
	}

	public Double getNombrePart() {
		return nombrePart;
	}

	public void setNombrePart(Double nombrePart) {
		this.nombrePart = nombrePart;
	}

	public String getSens() {
		return sens;
	}

	public void setSens(String sens) {
		this.sens = sens;
	}

	public Support getRefSupport() {
		return refSupport;
	}

	public void setRefSupport(Support refSupport) {
		this.refSupport = refSupport;
	}

	public TypeEvenement getRefTypeEvenement() {
		return refTypeEvenement;
	}

	public void setRefTypeEvenement(TypeEvenement refTypeEvenement) {
		this.refTypeEvenement = refTypeEvenement;
	}

	public EcheancierPrelevement getRefEcheancierPrelevement() {
		return refEcheancierPrelevement;
	}

	public void setRefEcheancierPrelevement(
			EcheancierPrelevement refEcheancierPrelevement) {
		this.refEcheancierPrelevement = refEcheancierPrelevement;
	}

	public Prestation getRefPrestation() {
		return refPrestation;
	}

	public void setRefPrestation(Prestation refPrestation) {
		this.refPrestation = refPrestation;
	}

	public Contrat getRefContrat() {
		return refContrat;
	}

	public void setRefContrat(Contrat refContrat) {
		this.refContrat = refContrat;
	}

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public DetailDemandeArbitrage getRefDetailDemandeArbitrage() {
		return refDetailDemandeArbitrage;
	}

	public void setRefDetailDemandeArbitrage(
			DetailDemandeArbitrage refDetailDemandeArbitrage) {
		this.refDetailDemandeArbitrage = refDetailDemandeArbitrage;
	}


	public DemandeArbitrage getRefDemandeArbitrage() {
		return refDemandeArbitrage;
	}

	public void setRefDemandeArbitrage(DemandeArbitrage refDemandeArbitrage) {
		this.refDemandeArbitrage = refDemandeArbitrage;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public Boolean getAgregee() {
		return agregee;
	}

	public void setAgregee(Boolean agregee) {
		this.agregee = agregee;
	}

	public Double getMontantRompu() {
		return montantRompu;
	}

	public void setMontantRompu(Double montantRompu) {
		this.montantRompu = montantRompu;
	}


	
}