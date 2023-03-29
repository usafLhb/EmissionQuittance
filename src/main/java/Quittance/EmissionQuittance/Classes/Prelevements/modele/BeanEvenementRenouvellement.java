package Quittance.EmissionQuittance.Classes.Prelevements.modele;

import com.rmawatanya.convergence.utile.common.Constantes;


public class BeanEvenementRenouvellement {
	
	private String id;
	
	private String numeroContrat;
	private String periode;
	
	private String numeroAdhesion;
	private String montant;
	private String numeroCompteBancaire;
	private String etat;
	private String dateEcheance;
	private String typePrelevement;
	
	private String dateDebut;
	private String dateFin;	
	private String titre;
    private String dateImpression;
    private String logoRma;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNumeroContrat() {
		return numeroContrat;
	}
	public void setNumeroContrat(String numeroContrat) {
		this.numeroContrat = numeroContrat;
	}
	public String getNumeroAdhesion() {
		return numeroAdhesion;
	}
	public void setNumeroAdhesion(String numeroAdhesion) {
		this.numeroAdhesion = numeroAdhesion;
	}
	public String getMontant() {
		return montant;
	}
	public void setMontant(String montant) {
		this.montant = montant;
	}
	public String getNumeroCompteBancaire() {
		return numeroCompteBancaire;
	}
	public void setNumeroCompteBancaire(String numeroCompteBancaire) {
		this.numeroCompteBancaire = numeroCompteBancaire;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public String getDateEcheance() {
		return dateEcheance;
	}
	public void setDateEcheance(String dateEcheance) {
		this.dateEcheance = dateEcheance;
	}
	public String getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}
	public String getDateFin() {
		return dateFin;
	}
	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDateImpression() {
		return dateImpression;
	}
	public void setDateImpression(String dateImpression) {
		this.dateImpression = dateImpression;
	}
	public String getTypePrelevement() {
		return typePrelevement;
	}
	public void setTypePrelevement(String typePrelevement) {
		this.typePrelevement = typePrelevement;
	}
	public String getLogoRma() {
		return logoRma;
	}
	public void setLogoRma(String logoRma) {
		this.logoRma = logoRma;
	}
	
	public String getLibelleEtat() 
	   {
	   	  if(Constantes.PRL_ETAT_ECHEANCIER_CREE.equals(etat)) {
	   	  	return Constantes.PRL_LIBELLE_ETAT_ECHEANCIER_CREE;
	   	  }
	   	  if(Constantes.PRL_ETAT_ECHEANCIER_ENVOYE.equals(etat)) {
	   	  	return Constantes.PRL_LIBELLE_ETAT_ECHEANCIER_ENVOYE;
	   	  }
	   	  if(Constantes.PRL_ETAT_ECHEANCIER_REGLE.equals(etat)) {
	   	  	return Constantes.PRL_LIBELLE_ETAT_ECHEANCIER_REGLE;
	   	  }
	   	  if(Constantes.PRL_ETAT_ECHEANCIER_REJETE.equals(etat)) {
	   	  	return Constantes.PRL_LIBELLE_ETAT_ECHEANCIER_REJETE;
	   	  }
	   	  if(Constantes.PRL_ETAT_ECHEANCIER_BLOQUE.equals(etat)) {
	   	  	return Constantes.PRL_LIBELLE_ETAT_ECHEANCIER_BLOQUE;
	   	  }
	   	  if(Constantes.PRL_ETAT_ECHEANCIER_SUSPENDU.equals(etat)) {
	   	  	return Constantes.PRL_LIBELLE_ETAT_ECHEANCIER_SUSPENDU;
	   	  }
	   	  if(Constantes.PRL_ETAT_ECHEANCIER_ANNULE.equals(etat)) {
	   	  	return Constantes.PRL_LIBELLE_ETAT_ECHEANCIER_ANNULE;
	   	  }
	   	  
	   	  if(Constantes.PRL_ETAT_ECHEANCIER_ANNULE_PAR_RACHAT.equals(etat)) {
	   	  	return Constantes.PRL_LIBELLE_ETAT_ECHEANCIER_ANNULE_PAR_RACHAT;
	      }
	   	  if(Constantes.PRL_ETAT_ECHEANCIER_REGLE_APRES_RACHAT.equals(etat)) {
	   	  	return Constantes.PRL_LIBELLE_ETAT_ECHEANCIER_REGLE_APRES_RACHAT;
	      }   
	   	  if(Constantes.PRL_ETAT_ECHEANCIER_RISTOURNE.equals(etat)) {
	    	  	return Constantes.PRL_LIBELLE_ETAT_ECHEANCIER_RISTOURNE;
	       }   
	   	  if(Constantes.PRL_ETAT_ECHEANCIER_TRANSFERE.equals(etat)) {
	 	  	return Constantes.PRL_LIBELLE_ETAT_ECHEANCIER_TRANSFERE;
	   	  } 
	   	  
	      return null;
	   }
	public String getPeriode() {
		return periode;
	}
	public void setPeriode(String periode) {
		this.periode = periode;
	}
	
}
