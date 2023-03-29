package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.historique.HistoryItem;

/**
 * Classe de d�finition de l'historisation de l'entit� clientVehicule.
 * @author elfaramo
 *
 */
public class ClientVehiculeHistoryItem extends HistoryItem {

	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = 1L;
	private Calendar dateNaissance;
	private String gsm;
	private String nom;
	private String prenom;
	private String sexe;
	private String adresse1;
	private String adresse2;
	private String adresse3;
	private Calendar dateCreation;
	private Calendar dateDernierMaj;
	private String email;
	private String numeroCin;
	private String pays;
	private String racineVendeur;
	private String ville;
	private String nomAgence;
	private String numeroProspect;
	private Boolean concretisation;
	private Calendar dateConcretisation;
	private String police;
	private String commentaireConcretisation;
	
	private List<VehiculeHistoryItem> refVehiculeHistoryItem = new ArrayList<VehiculeHistoryItem>();

	public String getNomAgence() {
		return nomAgence;
	}

	public void setNomAgence(String nomAgence) {
		this.nomAgence = nomAgence;
	}

	private Calendar dateObtentionPermis;

	public ClientVehiculeHistoryItem() {

	}

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public Calendar getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Calendar dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getGsm() {
		return gsm;
	}

	public void setGsm(String gsm) {
		this.gsm = gsm;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getAdresse1() {
		return adresse1;
	}

	public void setAdresse1(String adresse1) {
		this.adresse1 = adresse1;
	}

	public String getAdresse2() {
		return adresse2;
	}

	public void setAdresse2(String adresse2) {
		this.adresse2 = adresse2;
	}

	public String getAdresse3() {
		return adresse3;
	}

	public void setAdresse3(String adresse3) {
		this.adresse3 = adresse3;
	}

	public Calendar getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Calendar dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Calendar getDateDernierMaj() {
		return dateDernierMaj;
	}

	public void setDateDernierMaj(Calendar dateDernierMaj) {
		this.dateDernierMaj = dateDernierMaj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumeroCin() {
		return numeroCin;
	}

	public void setNumeroCin(String numeroCin) {
		this.numeroCin = numeroCin;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public Calendar getDateObtentionPermis() {
		return dateObtentionPermis;
	}

	public void setDateObtentionPermis(Calendar dateObtentionPermis) {
		this.dateObtentionPermis = dateObtentionPermis;
	}

	public String getRacineVendeur() {
		return racineVendeur;
	}

	public void setRacineVendeur(String racineVendeur) {
		this.racineVendeur = racineVendeur;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getNumeroProspect() {
		return numeroProspect;
	}

	public void setNumeroProspect(String numeroProspect) {
		this.numeroProspect = numeroProspect;
	}

	public List<VehiculeHistoryItem> getRefVehiculeHistoryItem() {
		return refVehiculeHistoryItem;
	}

	public void setRefVehiculeHistoryItem(
			List<VehiculeHistoryItem> refVehiculeHistoryItem) {
		this.refVehiculeHistoryItem = refVehiculeHistoryItem;
	}

	public Boolean getConcretisation() {
		return concretisation;
	}

	public void setConcretisation(Boolean concretisation) {
		this.concretisation = concretisation;
	}

	public Calendar getDateConcretisation() {
		return dateConcretisation;
	}

	public void setDateConcretisation(Calendar dateConcretisation) {
		this.dateConcretisation = dateConcretisation;
	}

	public String getPolice() {
		return police;
	}

	public void setPolice(String police) {
		this.police = police;
	}

	public String getCommentaireConcretisation() {
		return commentaireConcretisation;
	}

	public void setCommentaireConcretisation(String commentaireConcretisation) {
		this.commentaireConcretisation = commentaireConcretisation;
	}

}
