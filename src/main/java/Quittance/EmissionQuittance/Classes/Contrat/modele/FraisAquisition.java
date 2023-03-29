//Source file: E:\\_Abdel\\Rmawatanya\\CONVERGENCE\\MOD\\ClassesJava\\com\\rmawatanya\\convergence\\application\\oct\\metier\\modele\\PrimePersonnel.java

package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.utile.referentiel.TypePrelevement;

public class FraisAquisition implements IEntite
{
   private long id;
   
   /**
    * 0 : taux, 1 : montant
    */
   private Calendar  dateDebut;
   private Calendar  dateFin;
   private Integer  nombreAnnees;
   private Double tauxComApport;
   private Double tauxComGest;
   private Double tauxComProd;
   private Double tauxGestsurPrime;
   private Double tauxTva;
   private Double montantMax;
   private Double montantMin;
   private Integer naturePrelevement;
   private ConditionPreferentielle refConditionPreferentielle;
   private TypePrelevement refTypePrelevement;
 
   



public FraisAquisition() 
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



public Double getTauxComApport() {
	return tauxComApport;
}



public void setTauxComApport(Double tauxComApport) {
	this.tauxComApport = tauxComApport;
}



public Double getTauxComGest() {
	return tauxComGest;
}



public void setTauxComGest(Double tauxComGest) {
	this.tauxComGest = tauxComGest;
}



public Double getTauxComProd() {
	return tauxComProd;
}



public void setTauxComProd(Double tauxComProd) {
	this.tauxComProd = tauxComProd;
}



public Double getTauxGestsurPrime() {
	return tauxGestsurPrime;
}



public void setTauxGestsurPrime(Double tauxGestsurPrime) {
	this.tauxGestsurPrime = tauxGestsurPrime;
}



public Double getTauxTva() {
	return tauxTva;
}



public void setTauxTva(Double tauxTva) {
	this.tauxTva = tauxTva;
}



public Double getMontantMax() {
	return montantMax;
}



public void setMontantMax(Double montantMax) {
	this.montantMax = montantMax;
}



public Double getMontantMin() {
	return montantMin;
}



public void setMontantMin(Double montantMin) {
	this.montantMin = montantMin;
}



public Integer getNaturePrelevement() {
	return naturePrelevement;
}



public void setNaturePrelevement(Integer naturePrelevement) {
	this.naturePrelevement = naturePrelevement;
}



public ConditionPreferentielle getRefConditionPreferentielle() {
	return refConditionPreferentielle;
}



public void setRefConditionPreferentielle(
		ConditionPreferentielle refConditionPreferentielle) {
	this.refConditionPreferentielle = refConditionPreferentielle;
}



public TypePrelevement getRefTypePrelevement() {
	return refTypePrelevement;
}



public void setRefTypePrelevement(TypePrelevement refTypePrelevement) {
	this.refTypePrelevement = refTypePrelevement;
}



}
