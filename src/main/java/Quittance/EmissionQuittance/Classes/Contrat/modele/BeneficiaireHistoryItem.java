package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.historique.HistoryItem;

public class BeneficiaireHistoryItem extends HistoryItem 
{
   private String nom;
   private String prenom;
   private Calendar dateNaissance;
   private String lienAssure;
   private String roleAssure;
   private Double pourcentageRente;
   private ContratHistoryItem refContratHistoryItem;
   
   public BeneficiaireHistoryItem() 
   {
    
   }
   
   /**
    * Access method for the nom property.
    * 
    * @return   the current value of the nom property
    */
   public String getNom() 
   {
      return nom;
   }
   
   /**
    * Sets the value of the nom property.
    * 
    * @param aNom the new value of the nom property
    */
   public void setNom(String aNom) 
   {
      nom = aNom;
   }
   
   /**
    * Access method for the prenom property.
    * 
    * @return   the current value of the prenom property
    */
   public String getPrenom() 
   {
      return prenom;
   }
   
   /**
    * Sets the value of the prenom property.
    * 
    * @param aPrenom the new value of the prenom property
    */
   public void setPrenom(String aPrenom) 
   {
      prenom = aPrenom;
   }
   
   /**
    * Access method for the dateNaissance property.
    * 
    * @return   the current value of the dateNaissance property
    */
   public Calendar getDateNaissance() 
   {
      return dateNaissance;
   }
   
   /**
    * Sets the value of the dateNaissance property.
    * 
    * @param aDateNaissance the new value of the dateNaissance property
    */
   public void setDateNaissance(Calendar aDateNaissance) 
   {
      dateNaissance = aDateNaissance;
   }
   
   /**
    * Access method for the lienAssure property.
    * 
    * @return   the current value of the lienAssure property
    */
   public String getLienAssure() 
   {
      return lienAssure;
   }
   
   /**
    * Sets the value of the lienAssure property.
    * 
    * @param aLienAssure the new value of the lienAssure property
    */
   public void setLienAssure(String aLienAssure) 
   {
      lienAssure = aLienAssure;
   }
   
   /**
    * Access method for the roleAssure property.
    * 
    * @return   the current value of the roleAssure property
    */
   public String getRoleAssure() 
   {
      return roleAssure;
   }
   
   /**
    * Sets the value of the roleAssure property.
    * 
    * @param aRoleAssure the new value of the roleAssure property
    */
   public void setRoleAssure(String aRoleAssure) 
   {
      roleAssure = aRoleAssure;
   }
   
   /**
    * Access method for the pourcentageRente property.
    * 
    * @return   the current value of the pourcentageRente property
    */
   public Double getPourcentageRente() 
   {
      return pourcentageRente;
   }
   
   /**
    * Sets the value of the pourcentageRente property.
    * 
    * @param aPourcentageRente the new value of the pourcentageRente property
    */
   public void setPourcentageRente(Double aPourcentageRente) 
   {
      pourcentageRente = aPourcentageRente;
   }

	public ContratHistoryItem getRefContratHistoryItem() {
		return refContratHistoryItem;
	}
	
	public void setRefContratHistoryItem(ContratHistoryItem refContratHistoryItem) {
		this.refContratHistoryItem = refContratHistoryItem;
	}
    
}
