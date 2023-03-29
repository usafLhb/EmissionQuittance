package Quittance.EmissionQuittance.Classes.Produit.modele;

import java.util.Calendar;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class PenaliteRachat extends ParametrageBO implements IEntite {
	
	private static final long serialVersionUID = 1L;
	private long id;
   private Calendar dateDebut;
   private Calendar dateFin;
   private Boolean typeRachat;
   private Integer nombreAnnees;
   private Double tauxPenalite;
   private Double montantMin;
   private Double montantMax;
   private String libelle;
   
   private ParametresEpargne refParametresEpargne;
   
   public String getLibelle() {
	   return libelle;
   }

   public void setLibelle(String libelle) {
	   this.libelle = libelle;
   }

   public boolean equals(Object obj) {
	   if(this.getId()==((PenaliteRachat)obj).getId()){
		   return true;
	   }
	   return false;
   }

   public PenaliteRachat() {
    
   }
   
	public String getDescription() {
		return id+" "+libelle;
	}

   /**
    * Access method for the id property.
    * 
    * @return   the current value of the id property
    */
   public long getId() 
   {
      return id;
   }
   
   /**
    * Sets the value of the id property.
    * 
    * @param aId the new value of the id property
    */
   public void setId(long aId) 
   {
      id = aId;
   }
   
   /**
    * Access method for the dateDebut property.
    * 
    * @return   the current value of the dateDebut property
    */
   public Calendar getDateDebut() 
   {
      return dateDebut;
   }
   
   /**
    * Sets the value of the dateDebut property.
    * 
    * @param aDateDebut the new value of the dateDebut property
    */
   public void setDateDebut(Calendar aDateDebut) 
   {
      dateDebut = aDateDebut;
   }
   
   /**
    * Access method for the dateFin property.
    * 
    * @return   the current value of the dateFin property
    */
   public Calendar getDateFin() 
   {
      return dateFin;
   }
   
   /**
    * Sets the value of the dateFin property.
    * 
    * @param aDateFin the new value of the dateFin property
    */
   public void setDateFin(Calendar aDateFin) 
   {
      dateFin = aDateFin;
   }
   
   /**
    * Access method for the typeRachat property.
    * 
    * @return   the current value of the typeRachat property
    */
   public Boolean getTypeRachat() 
   {
      return typeRachat;
   }
   
   /**
    * Sets the value of the typeRachat property.
    * 
    * @param aTypeRachat the new value of the typeRachat property
    */
   public void setTypeRachat(Boolean aTypeRachat) 
   {
      typeRachat = aTypeRachat;
   }
   
   /**
    * Access method for the nombreAnnees property.
    * 
    * @return   the current value of the nombreAnnees property
    */
   public Integer getNombreAnnees() 
   {
      return nombreAnnees;
   }
   
   /**
    * Sets the value of the nombreAnnees property.
    * 
    * @param aNombreAnnees the new value of the nombreAnnees property
    */
   public void setNombreAnnees(Integer aNombreAnnees) 
   {
      nombreAnnees = aNombreAnnees;
   }
   
   /**
    * Access method for the tauxPenalite property.
    * 
    * @return   the current value of the tauxPenalite property
    */
   public Double getTauxPenalite() 
   {
      return tauxPenalite;
   }
   
   /**
    * Sets the value of the tauxPenalite property.
    * 
    * @param aTauxPenalite the new value of the tauxPenalite property
    */
   public void setTauxPenalite(Double aTauxPenalite) 
   {
      tauxPenalite = aTauxPenalite;
   }
   
   /**
    * Access method for the montantMin property.
    * 
    * @return   the current value of the montantMin property
    */
   public Double getMontantMin() 
   {
      return montantMin;
   }
   
   /**
    * Sets the value of the montantMin property.
    * 
    * @param aMontantMin the new value of the montantMin property
    */
   public void setMontantMin(Double aMontantMin) 
   {
      montantMin = aMontantMin;
   }
   
   /**
    * Access method for the montantMax property.
    * 
    * @return   the current value of the montantMax property
    */
   public Double getMontantMax() 
   {
      return montantMax;
   }
   
   /**
    * Sets the value of the montantMax property.
    * 
    * @param aMontantMax the new value of the montantMax property
    */
   public void setMontantMax(Double aMontantMax) 
   {
      montantMax = aMontantMax;
   }
   
   /**
    * Access method for the refParametresEpargne property.
    * 
    * @return   the current value of the refParametresEpargne property
    */
   public ParametresEpargne getRefParametresEpargne() 
   {
      return refParametresEpargne;
   }
   
   /**
    * Sets the value of the refParametresEpargne property.
    * 
    * @param aRefParametresEpargne the new value of the refParametresEpargne property
    */
   public void setRefParametresEpargne(ParametresEpargne aRefParametresEpargne) 
   {
      refParametresEpargne = aRefParametresEpargne;
   }
   
	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}   
}
