//Source file: E:\\_Abdel\\Rmawatanya\\CONVERGENCE\\MOD\\ClassesJava\\com\\rmawatanya\\convergence\\utile\\habilitations\\Connexion.java

package Quittance.EmissionQuittance.Classes.habilitations;

import java.util.Calendar;

public class Connexion 
{
   private long id;
   private Calendar dateConnexion;
   private Calendar dateDeconnexion;
   private Boolean statut;
   private String commentaire;
   private Utilisateur refUtilisateur;
   
   private String sessionId;
   
   public Connexion() 
   {
    
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
    * Access method for the dateConnexion property.
    * 
    * @return   the current value of the dateConnexion property
    */
   public Calendar getDateConnexion() 
   {
      return dateConnexion;
   }
   
   /**
    * Sets the value of the dateConnexion property.
    * 
    * @param aDateConnexion the new value of the dateConnexion property
    */
   public void setDateConnexion(Calendar aDateConnexion) 
   {
      dateConnexion = aDateConnexion;
   }
   
   /**
    * Access method for the dateDeconnexion property.
    * 
    * @return   the current value of the dateDeconnexion property
    */
   public Calendar getDateDeconnexion() 
   {
      return dateDeconnexion;
   }
   
   /**
    * Sets the value of the dateDeconnexion property.
    * 
    * @param aDateDeconnexion the new value of the dateDeconnexion property
    */
   public void setDateDeconnexion(Calendar aDateDeconnexion) 
   {
      dateDeconnexion = aDateDeconnexion;
   }
   
   /**
    * Access method for the statut property.
    * 
    * @return   the current value of the statut property
    */
   public Boolean getStatut() 
   {
      return statut;
   }
   
   /**
    * Sets the value of the statut property.
    * 
    * @param aStatut the new value of the statut property
    */
   public void setStatut(Boolean aStatut) 
   {
      statut = aStatut;
   }
   
   /**
    * Access method for the commentaire property.
    * 
    * @return   the current value of the commentaire property
    */
   public String getCommentaire() 
   {
      return commentaire;
   }
   
   /**
    * Sets the value of the commentaire property.
    * 
    * @param aCommentaire the new value of the commentaire property
    */
   public void setCommentaire(String aCommentaire) 
   {
      commentaire = aCommentaire;
   }
   
   /**
    * Access method for the refUtilisateur property.
    * 
    * @return   the current value of the refUtilisateur property
    */
   public Utilisateur getRefUtilisateur() 
   {
      return refUtilisateur;
   }
   
   /**
    * Sets the value of the refUtilisateur property.
    * 
    * @param aRefUtilisateur the new value of the refUtilisateur property
    */
   public void setRefUtilisateur(Utilisateur aRefUtilisateur) 
   {
      refUtilisateur = aRefUtilisateur;
   }

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}
