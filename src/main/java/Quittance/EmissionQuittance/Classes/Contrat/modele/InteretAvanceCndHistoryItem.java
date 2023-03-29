//Source file: E:\\_Abdel\\Rmawatanya\\CONVERGENCE\\MOD\\ClassesJava\\com\\rmawatanya\\convergence\\application\\oct\\metier\\modele\\PrimePersonnel.java

package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.historique.HistoryItem;

public class InteretAvanceCndHistoryItem extends HistoryItem
{
   /**
    * 0 : taux, 1 : montant
    */
   private Calendar  dateDebut;
   private Calendar  dateFin;
   private Double majoration;
   private ConditionPreferentielleHistoryItem refConditionPreferentielleHistoryItem;
 
   



public InteretAvanceCndHistoryItem() 
   {
    
   }


public EntiteFactory getFactory() {
	// TODO Auto-generated method stub
	return null;
}



public Calendar getDateDebut() {
	return dateDebut;
}



public void setDateDebut(Calendar dateDebut) {
	this.dateDebut = dateDebut;
}



public Calendar getDateFin() {
	return dateFin;
}



public void setDateFin(Calendar dateFin) {
	this.dateFin = dateFin;
}






public Double getMajoration() {
	return majoration;
}



public void setMajoration(Double majoration) {
	this.majoration = majoration;
}



public ConditionPreferentielleHistoryItem getRefConditionPreferentielleHistoryItem() {
	return refConditionPreferentielleHistoryItem;
}



public void setRefConditionPreferentielleHistoryItem(
		ConditionPreferentielleHistoryItem refConditionPreferentielleHistoryItem) {
	this.refConditionPreferentielleHistoryItem = refConditionPreferentielleHistoryItem;
}



}
