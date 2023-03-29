//Source file: E:\\_Abdel\\Rmawatanya\\CONVERGENCE\\MOD\\ClassesJava\\com\\rmawatanya\\convergence\\application\\oct\\metier\\modele\\PrimePersonnel.java

package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;
import java.util.List;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.historique.HistoryItem;

import com.rmawatanya.convergence.utile.habilitations.Utilisateur;

public class ConditionPreferentielleHistoryItem extends HistoryItem
{
   /**
    * 0 : taux, 1 : montant
    */
   private Calendar  dateValidation;
   private ContratHistoryItem refContratHistoryItem;
   private Utilisateur refUtilisateur;
 
   private List<FraisAquisitionHistoryItem> refFraisAquisitionHistoryItem;
   private List<PenaliteRachatCndHistoryItem> refPenaliteRachatHistoryItem;
   private List<InteretAvanceCndHistoryItem>  refInteretAvanceHistoryItem;



   public ConditionPreferentielleHistoryItem() 
   {
   }



public Calendar getDateValidation() {
	return dateValidation;
}



public void setDateValidation(Calendar dateValidation) {
	this.dateValidation = dateValidation;
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





public ContratHistoryItem getRefContratHistoryItem() {
	return refContratHistoryItem;
}



public void setRefContratHistoryItem(ContratHistoryItem refContratHistoryItem) {
	this.refContratHistoryItem = refContratHistoryItem;
}



public List<FraisAquisitionHistoryItem> getRefFraisAquisitionHistoryItem() {
	return refFraisAquisitionHistoryItem;
}



public void setRefFraisAquisitionHistoryItem(
		List<FraisAquisitionHistoryItem> refFraisAquisitionHistoryItem) {
	this.refFraisAquisitionHistoryItem = refFraisAquisitionHistoryItem;
}



public List<PenaliteRachatCndHistoryItem> getRefPenaliteRachatHistoryItem() {
	return refPenaliteRachatHistoryItem;
}



public void setRefPenaliteRachatHistoryItem(
		List<PenaliteRachatCndHistoryItem> refPenaliteRachatHistoryItem) {
	this.refPenaliteRachatHistoryItem = refPenaliteRachatHistoryItem;
}



public List<InteretAvanceCndHistoryItem> getRefInteretAvanceHistoryItem() {
	return refInteretAvanceHistoryItem;
}



public void setRefInteretAvanceHistoryItem(
		List<InteretAvanceCndHistoryItem> refInteretAvanceHistoryItem) {
	this.refInteretAvanceHistoryItem = refInteretAvanceHistoryItem;
}



}
