package Quittance.EmissionQuittance.Classes.Quittancement.modele;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.application.oct.metier.modele.Contrat;



public class Compteur implements IEntite
{
  
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
/**
    *  DECLARATION
    */   
   
   private long idcompteur;
   private Double montant;
   private String exercice;
   private String mois;
   private String ordre;
   private long idproduit;
   private Contrat refContrat;
   
public Compteur() {
	super();
	// TODO Auto-generated constructor stub
}

public String getExercice() {
	return exercice;
}

public void setExercice(String exercice) {
	this.exercice = exercice;
}

public long getIdcompteur() {
	return idcompteur;
}

public void setIdcompteur(long idcompteur) {
	this.idcompteur = idcompteur;
}

public long getIdproduit() {
	return idproduit;
}

public void setIdproduit(long idproduit) {
	this.idproduit = idproduit;
}

public String getMois() {
	return mois;
}

public void setMois(String mois) {
	this.mois = mois;
}

public Double getMontant() {
	return montant;
}

public void setMontant(Double montant) {
	this.montant = montant;
}

public String getOrdre() {
	return ordre;
}

public void setOrdre(String ordre) {
	this.ordre = ordre;
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

public long getId() {
	// TODO Auto-generated method stub
	return 0;
}

public void setId(long id) {
	// TODO Auto-generated method stub
	
}


   
}


