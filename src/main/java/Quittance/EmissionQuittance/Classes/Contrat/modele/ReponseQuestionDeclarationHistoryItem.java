package Quittance.EmissionQuittance.Classes.Contrat.modele;

import ma.co.omnidata.framework.services.historique.HistoryItem;

import com.rmawatanya.convergence.utile.referentiel.QuestionDeclaration;

public class ReponseQuestionDeclarationHistoryItem extends HistoryItem
{
   private Boolean reponse;
   
   /**
    * Une pr�cision est fournie si une r�ponse du questionnaire m�dical est positive.
    */
   private String precisionReponse;
   private ContratHistoryItem refContratHistoryItem;
   private QuestionDeclaration refQuestionDeclaration;
   
   public ReponseQuestionDeclarationHistoryItem() 
   {
    
   }
   
   /**
    * Access method for the reponse property.
    * 
    * @return   the current value of the reponse property
    */
   public Boolean getReponse() 
   {
      return reponse;
   }
   
   /**
    * Sets the value of the reponse property.
    * 
    * @param aReponse the new value of the reponse property
    */
   public void setReponse(Boolean aReponse) 
   {
      reponse = aReponse;
   }
   
   /**
    * Access method for the precisionReponse property.
    * 
    * @return   the current value of the precisionReponse property
    */
   public String getPrecisionReponse() 
   {
      return precisionReponse;
   }
   
   /**
    * Sets the value of the precisionReponse property.
    * 
    * @param aPrecisionReponse the new value of the precisionReponse property
    */
   public void setPrecisionReponse(String aPrecisionReponse) 
   {
      precisionReponse = aPrecisionReponse;
   }
    
   /**
    * Access method for the refQuestionDeclaration property.
    * 
    * @return   the current value of the refQuestionDeclaration property
    */
   public QuestionDeclaration getRefQuestionDeclaration() 
   {
      return refQuestionDeclaration;
   }
   
   /**
    * Sets the value of the refQuestionDeclaration property.
    * 
    * @param aRefQuestionDeclaration the new value of the refQuestionDeclaration property
    */
   public void setRefQuestionDeclaration(QuestionDeclaration aRefQuestionDeclaration) 
   {
      refQuestionDeclaration = aRefQuestionDeclaration;
   }

	public ContratHistoryItem getRefContratHistoryItem() {
		return refContratHistoryItem;
	}
	
	public void setRefContratHistoryItem(ContratHistoryItem refContratHistoryItem) {
		this.refContratHistoryItem = refContratHistoryItem;
	}
     
}
