package Quittance.EmissionQuittance.Classes.Prestation.modele;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.application.oct.metier.modele.Client;
import com.rmawatanya.convergence.application.oct.metier.modele.Contrat;
import com.rmawatanya.convergence.utile.common.Constantes;
import com.rmawatanya.convergence.utile.habilitations.Utilisateur;

public class DeclarationSinistre implements IEntite {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4090037657195124581L;
	
	private long id;
	private String numero;
	private String etat;
	private Calendar dateEtat;
	private Calendar dateDemande;
	private Calendar dateCreation;
	private Calendar dateSurvenance;

	private String commentaires;
	private String infosComplementaires;
	private Client refClient;
	private String typeDeclarant;
	private String typeDeclarantComplement;
	private DeclarantSinistre refDeclarant;
	private List refPiecesPresentees;
	
	private Utilisateur gestionnaire;
	
	private Contrat refContrat;
	private Integer numeroVersionContrat; 
	private List<Prestation> refsSinistres = new ArrayList<Prestation>();
	private List<ComplementInfosDeclaration> refsComplementInfos = new ArrayList<ComplementInfosDeclaration>();
	
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


//	public List<PieceDeclarationDeces> getRefPiecesPresentees() {
//		return refPiecesPresentees;
//	}
//
//
//	public void setRefPiecesPresentees(List refPiecesPresentees) {
//		this.refPiecesPresentees = refPiecesPresentees;
//	}


	public Utilisateur getGestionnaire() {
		return gestionnaire;
	}


	public Calendar getDateEtat() {
		return dateEtat;
	}


	public void setDateEtat(Calendar dateEtat) {
		this.dateEtat = dateEtat;
	}


	public void setGestionnaire(Utilisateur gestionnaire) {
		this.gestionnaire = gestionnaire;
	}
	
	public String getLibelleEtat() {

		if (Constantes.TPR_ETAT_DECLARATION_SINISTRE_ENINSTANCE.equals(etat)) {
			return Constantes.TPR_LIBELLE_ETAT_DECLARATION_SINISTRE_ENINSTANCE;
		}
		if (Constantes.TPR_ETAT_DECLARATION_SINISTRE_ENREGISTRE.equals(etat)) {
			return Constantes.TPR_LIBELLE_ETAT_DECLARATION_SINISTRE_ENREGISTRE;
		}
		if (Constantes.TPR_ETAT_DECLARATION_SINISTRE_VALIDE.equals(etat)) {
			return Constantes.TPR_LIBELLE_ETAT_DECLARATION_SINISTRE_VALIDE;
		}
		return "";
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


	public List getRefPiecesPresentees() {
		return refPiecesPresentees;
	}


	public void setRefPiecesPresentees(List refPiecesPresentees) {
		this.refPiecesPresentees = refPiecesPresentees;
	}


	public List<Prestation> getRefsSinistres() {
		return refsSinistres;
	}


	public void setRefsSinistres(List<Prestation> refsSinistres) {
		this.refsSinistres = refsSinistres;
	}


	public Contrat getRefContrat() {
		return refContrat;
	}


	public void setRefContrat(Contrat refContrat) {
		this.refContrat = refContrat;
	}


	public Integer getNumeroVersionContrat() {
		return numeroVersionContrat;
	}


	public void setNumeroVersionContrat(Integer numeroVersionContrat) {
		this.numeroVersionContrat = numeroVersionContrat;
	}


	public List<ComplementInfosDeclaration> getRefsComplementInfos() {
		return refsComplementInfos;
	}


	public void setRefsComplementInfos(
			List<ComplementInfosDeclaration> refsComplementInfos) {
		this.refsComplementInfos = refsComplementInfos;
	}
	
	
	
}
