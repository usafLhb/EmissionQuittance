
package Quittance.EmissionQuittance.Classes.Prestation.modele;



import java.util.Calendar;
import java.util.Collection;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;


public class OperationRente implements IEntite
{


   private long id;	
   private Calendar dateExecution;
   private Integer nbRente;
   private Collection refPrestation;
  
   
   public Calendar getDateExecution() {
	return dateExecution;
}



public void setDateExecution(Calendar dateExecution) {
	this.dateExecution = dateExecution;
}



public Integer getNbRente() {
	return nbRente;
}



public void setNbRente(Integer nbRente) {
	this.nbRente = nbRente;
}



public OperationRente() 
   {
    
   }



public EntiteFactory getFactory() {
	// TODO Auto-generated method stub
	return null;
}











public Collection getRefPrestation() {
	return refPrestation;
}



public void setRefPrestation(Collection refPrestation) {
	this.refPrestation = refPrestation;
}



public long getId() {
	return id;
}



public void setId(long id) {
	this.id = id;
}

  

}
