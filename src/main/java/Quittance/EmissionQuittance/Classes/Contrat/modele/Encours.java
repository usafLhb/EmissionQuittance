
package Quittance.EmissionQuittance.Classes.Contrat.modele;



import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;


public class Encours implements IEntite
{


   private long id;	
   private Double encoursBrut;
   private Integer exercice;
   private Double epargneRevalPatr;
   public Double getEpargneRevalPatr() {
	return epargneRevalPatr;
}


private Double epargneRevalSalr;
   private Double rachatAdhesion;
   private Calendar dateMaj;
   private Calendar dateCalculEncours;
 
   private Contrat refContrat;
   

   
   public Encours() 
   {
    
   }

   public boolean equals(Object o) {
	   if(o == null) {
		   return false;
	   }

	   Encours c = (Encours) o;
	   if(c.getId() != this.id) {
		   return false;
	   }

	   return true;
   }

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public Double getEncoursBrut() {
		return encoursBrut;
	}
	
	public void setEncoursBrut(Double encoursBrut) {
		this.encoursBrut = encoursBrut;
	}
	
	public Integer getExercice() {
		return exercice;
	}
	
	public void setExercice(Integer exercice) {
		this.exercice = exercice;
	}
	
	public Double getRachatAdhesion() {
		return rachatAdhesion;
	}
	
	public void setRachatAdhesion(Double rachatAdhesion) {
		this.rachatAdhesion = rachatAdhesion;
	}
	
	public Calendar getDateMaj() {
		return dateMaj;
	}
	
	public void setDateMaj(Calendar dateMaj) {
		this.dateMaj = dateMaj;
	}
	
	public Calendar getDateCalculEncours() {
		return dateCalculEncours;
	}
	
	public void setDateCalculEncours(Calendar dateCalculEncours) {
		this.dateCalculEncours = dateCalculEncours;
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
	public void setEpargneRevalPatr(Double epargneRevalPatr) {
		this.epargneRevalPatr = epargneRevalPatr;
	}

	public Double getEpargneRevalSalr() {
		return epargneRevalSalr;
	}

	public void setEpargneRevalSalr(Double epargneRevalSalr) {
		this.epargneRevalSalr = epargneRevalSalr;
	}


}
