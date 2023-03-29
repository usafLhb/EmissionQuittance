//Source file: E:\\_Abdel\\Rmawatanya\\CONVERGENCE\\MOD\\ClassesJava\\com\\rmawatanya\\convergence\\application\\oct\\metier\\modele\\PrimePersonnel.java

package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.historique.HistoryItem;

public class PenaliteRachatCndHistoryItem extends HistoryItem
{
   /**
    * 0 : taux, 1 : montant
    */
   private Calendar  dateDebut;
   private Calendar  dateFin;
   private Integer  nombreAnnees;
   private Double tauxPanalite; 
   private ConditionPreferentielleHistoryItem refConditionPreferentielleHistoryItem;
 
   



public PenaliteRachatCndHistoryItem() 
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



public Integer getNombreAnnees() {
	return nombreAnnees;
}



public void setNombreAnnees(Integer nombreAnnees) {
	this.nombreAnnees = nombreAnnees;
}





public Double getTauxPanalite() {
	return tauxPanalite;
}



public void setTauxPanalite(Double tauxPanalite) {
	this.tauxPanalite = tauxPanalite;
}



public ConditionPreferentielleHistoryItem getRefConditionPreferentielleHistoryItem() {
	return refConditionPreferentielleHistoryItem;
}



public void setRefConditionPreferentielleHistoryItem(
		ConditionPreferentielleHistoryItem refConditionPreferentielleHistoryItem) {
	this.refConditionPreferentielleHistoryItem = refConditionPreferentielleHistoryItem;
}






}
