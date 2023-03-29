
package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;
import java.util.List;

import com.rmawatanya.convergence.utile.habilitations.Utilisateur;

import ma.co.omnidata.framework.services.core.ServicesFactory;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;
import ma.co.omnidata.framework.services.historique.HistoryHelper;
import ma.co.omnidata.framework.services.historique.HistoryItem;
import ma.co.omnidata.framework.services.historique.IHistorisable;


public class ClientVehicule implements IEntite, IHistorisable
{
   private long id;
  
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
   private Integer lastNumVersion; // pour besoin d'historisation
   private Integer etat;
   private Boolean concretisation;
   private Calendar dateConcretisation;
   private String police;
   private String commentaireConcretisation;
   
   
   public String getNomAgence() {
	return nomAgence;
}



public void setNomAgence(String nomAgence) {
	this.nomAgence = nomAgence;
}



private Calendar dateObtentionPermis;
   private List<Vehicule> refVehicule;

protected HistoryItem lastHistoryItem;
 
   



public ClientVehicule() 
   {
    
   }
   
  
   
	public long getId() {
	return id;
}



public void setId(long id) {
	this.id = id;
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



public List<Vehicule> getRefVehicule() {
	return refVehicule;
}



public void setRefVehicule(List<Vehicule> refVehicule) {
	this.refVehicule = refVehicule;
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


public void historiser() {
//	// Cr�er l'historique de contrat
//	HistoryHelper historyHelper = (HistoryHelper) ServicesFactory
//			.getService(HistoryHelper.class);
//	this.setLastNumVersion(this.getLastNumVersion() + 1);
//	this.lastHistoryItem = historyHelper.historiserHelper(
//			new ContratHistoryItem(), this.getLastNumVersion() - 1, this);
}

public List getHistory() {
//	HistoryHelper historyHelper = (HistoryHelper) ServicesFactory
//			.getService(HistoryHelper.class);
//	return historyHelper.getHistoryHelper(ContratHistoryItem.class, this
//			.getId());
	return null;
}

public HistoryItem getLastHistoryItem() {
//	if (this.lastHistoryItem != null) {
//		return this.lastHistoryItem;
//	}
//	HistoryHelper historyHelper = (HistoryHelper) ServicesFactory
//			.getService(HistoryHelper.class);
//	return historyHelper.getHistoryItemHelper(ContratHistoryItem.class,
//			this.getLastNumVersion() - 1, this.getId());
	return null;
}

public HistoryItem getLastModifiedHistoryItem() {
	
//	HistoryHelper historyHelper = (HistoryHelper) ServicesFactory
//			.getService(HistoryHelper.class);
//	return historyHelper.getHistoryItemHelper(ContratHistoryItem.class,
//			this.getLastNumVersion() - 2, this.getId());
	return null;
}



public List getParents() {
	// TODO Auto-generated method stub
	return null;
}



public Integer getLastNumVersion() {
	return lastNumVersion;
}



public void setLastNumVersion(Integer lastNumVersion) {
	this.lastNumVersion = lastNumVersion;
}



public Integer getEtat() {
	return etat;
}



public void setEtat(Integer etat) {
	this.etat = etat;
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



public Boolean getConcretisation() {
	return concretisation;
}



public void setConcretisation(Boolean concretisation) {
	this.concretisation = concretisation;
}




}
