package Quittance.EmissionQuittance.Classes.Prestation.modele;

import java.util.Calendar;
import java.util.List;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.application.oct.metier.modele.Client;
import com.rmawatanya.convergence.utile.common.Constantes;
import com.rmawatanya.convergence.utile.habilitations.Utilisateur;
import com.rmawatanya.convergence.utile.referentiel.TypePrestation;

public class DeclarationDeces implements IEntite {

	private static final long serialVersionUID = 169527089301070988L;
	
	private long id;
	private String numero;
	private String etat;
	private Calendar dateDemande;
	private Calendar dateCreation;
	private Calendar dateSurvenance;
	private String lieuSurvenance;
	private TypePrestation refTypePrestation;
	private String causes;
	private String commentaires;
	private String infosComplementaires;
	private Client refClient;
	private DeclarantSinistre refDeclarant;
	private List refPiecesPresentees;
	
	private Utilisateur gestionnaire;
	
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

	public String getEtat() {
		return etat;
	}


	public void setEtat(String etat) {
		this.etat = etat;
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


	public Calendar getDateSurvenance() {
		return dateSurvenance;
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


	public TypePrestation getRefTypePrestation() {
		return refTypePrestation;
	}


	public void setRefTypePrestation(TypePrestation refTypePrestation) {
		this.refTypePrestation = refTypePrestation;
	}


	public String getCauses() {
		return causes;
	}


	public void setCauses(String causes) {
		this.causes = causes;
	}


	public String getCommentaires() {
		return commentaires;
	}


	public void setCommentaires(String commentaires) {
		this.commentaires = commentaires;
	}

	public String getInfosComplementaires() {
		return infosComplementaires;
	}


	public void setInfosComplementaires(String infosComplementaires) {
		this.infosComplementaires = infosComplementaires;
	}


	public EntiteFactory getFactory() {
		return null;
	}


	public Client getRefClient() {
		return refClient;
	}


	public void setRefClient(Client refClient) {
		this.refClient = refClient;
	}


	public DeclarantSinistre getRefDeclarant() {
		return refDeclarant;
	}


	public void setRefDeclarant(DeclarantSinistre refDeclarant) {
		this.refDeclarant = refDeclarant;
	}


	public List<PieceDeclarationDeces> getRefPiecesPresentees() {
		return refPiecesPresentees;
	}


	public void setRefPiecesPresentees(List refPiecesPresentees) {
		this.refPiecesPresentees = refPiecesPresentees;
	}


	public Utilisateur getGestionnaire() {
		return gestionnaire;
	}


	public void setGestionnaire(Utilisateur gestionnaire) {
		this.gestionnaire = gestionnaire;
	}
	
	public String getLibelleEtat() {

		if (Constantes.TPR_ETAT_PRESTATION_ENINSTANCE.equals(etat)) {
			return Constantes.TPR_LIBELLE_PRESTATION_ENINSTANCE;
		}
		if (Constantes.TPR_ETAT_PRESTATION_VALIDEE.equals(etat)) {
			return Constantes.TPR_LIBELLE_PRESTATION_VALIDE;
		}
		if (Constantes.TPR_ETAT_PRESTATION_EN_ATTE_INFO.equals(etat)) {
			return Constantes.TPR_LIBELLE_PRESTATION_EN_ATTE_INFO;
		}

		return "";
	}
}
