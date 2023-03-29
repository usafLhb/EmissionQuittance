//Source file: E:\\_Abdel\\Rmawatanya\\CONVERGENCE\\MOD\\ClassesJava\\com\\rmawatanya\\convergence\\application\\oct\\metier\\modele\\PrimePersonnel.java

package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;
import java.util.List;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.utile.habilitations.Utilisateur;

public class ConditionPreferentielle implements IEntite
{
   private long id;
   
   /**
    * 0 : taux, 1 : montant
    */
   private Calendar  dateValidation;
   private Contrat refContrat;
   private Utilisateur refUtilisateur;
 
   private List<FraisAquisition> refFraisAquisition;
   private List<PenaliteRachatCnd> refPenaliteRachat;
   private List<InteretAvanceCnd>  refInteretAvance;



   public ConditionPreferentielle() 
   {
   }
   
  
   
	public long getId() {
	return id;
}



public void setId(long id) {
	this.id = id;
}



public Calendar getDateValidation() {
	return dateValidation;
}



public void setDateValidation(Calendar dateValidation) {
	this.dateValidation = dateValidation;
}



public Contrat getRefContrat() {
	return refContrat;
}



public void setRefContrat(Contrat refContrat) {
	this.refContrat = refContrat;
}



public Utilisateur getRefUtilisateur() {
	return refUtilisateur;
}



public void setRefUtilisateur(Utilisateur refUtilisateur) {
	this.refUtilisateur = refUtilisateur;
}



public EntiteFactory getFactory() {
	// TODO Auto-generated method stub
	return null;
}



public List<FraisAquisition> getRefFraisAquisition() {
	return refFraisAquisition;
}



public void setRefFraisAquisition(List<FraisAquisition> refFraisAquisition) {
	this.refFraisAquisition = refFraisAquisition;
}



public List<PenaliteRachatCnd> getRefPenaliteRachat() {
	return refPenaliteRachat;
}



public void setRefPenaliteRachat(List<PenaliteRachatCnd> refPenaliteRachat) {
	this.refPenaliteRachat = refPenaliteRachat;
}



public List<InteretAvanceCnd> getRefInteretAvance() {
	return refInteretAvance;
}



public void setRefInteretAvance(List<InteretAvanceCnd> refInteretAvance) {
	this.refInteretAvance = refInteretAvance;
}



}
