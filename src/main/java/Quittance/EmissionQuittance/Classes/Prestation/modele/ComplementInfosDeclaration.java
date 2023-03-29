package Quittance.EmissionQuittance.Classes.Prestation.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.application.sinistre.metier.modele.ReglementSinistre;
import com.rmawatanya.convergence.utile.common.Constantes;

public class ComplementInfosDeclaration implements IEntite {

	private long id;
	private Integer numero;
	// S: sinistre  R : reglement
	private String typeComplement;
	private Calendar dateDemande;
	private Calendar dateReponse;
	private String complementAfournir;
	private String reponse;
	private String etat;
	private Calendar dateEtat;
	private DeclarationSinistre refDeclaration;
	private Prestation refPrestation;
	private ReglementSinistre refReglement;
	private String scenarioDiscussion;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Calendar getDateDemande() {
		return dateDemande;
	}

	public void setDateDemande(Calendar dateDemande) {
		this.dateDemande = dateDemande;
	}

	public Calendar getDateReponse() {
		return dateReponse;
	}

	public void setDateReponse(Calendar dateReponse) {
		this.dateReponse = dateReponse;
	}

	public String getComplementAfournir() {
		return complementAfournir;
	}

	public void setComplementAfournir(String complementAfournir) {
		this.complementAfournir = complementAfournir;
	}

	public String getReponse() {
		return reponse;
	}

	public void setReponse(String reponse) {
		this.reponse = reponse;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public Calendar getDateEtat() {
		return dateEtat;
	}

	public void setDateEtat(Calendar dateEtat) {
		this.dateEtat = dateEtat;
	}

	public DeclarationSinistre getRefDeclaration() {
		return refDeclaration;
	}

	public void setRefDeclaration(DeclarationSinistre refDeclaration) {
		this.refDeclaration = refDeclaration;
	}

	public Prestation getRefPrestation() {
		return refPrestation;
	}

	public void setRefPrestation(Prestation refPrestation) {
		this.refPrestation = refPrestation;
	}

	public ReglementSinistre getRefReglement() {
		return refReglement;
	}

	public void setRefReglement(ReglementSinistre refReglement) {
		this.refReglement = refReglement;
	}
	
	public String getLibelleEtat() {
		if(etat != null){
			if(etat.equals(Constantes.TPR_ETAT_COMPLEMENTINFOS_ENVOYE)){
				return Constantes.TPR_LIBELLE_ETAT_COMPLEMENTINFOS_ENVOYE;
			}
			if(etat.equals(Constantes.TPR_ETAT_COMPLEMENTINFOS_RECU)){
				return Constantes.TPR_LIBELLE_ETAT_COMPLEMENTINFOS_RECU;
			}
		}
		return "";
	}
	
	public String getTypeComplement() {
		return typeComplement;
	}

	public void setTypeComplement(String typeComplement) {
		this.typeComplement = typeComplement;
	}


	public String getScenarioDiscussion() {
		return scenarioDiscussion;
	}

	public void setScenarioDiscussion(String scenarioDiscussion) {
		this.scenarioDiscussion = scenarioDiscussion;
	}

	@Override
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

}
