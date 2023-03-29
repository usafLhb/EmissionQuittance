//Source file: E:\\_Abdel\\Rmawatanya\\CONVERGENCE\\MOD\\ClassesJava\\com\\rmawatanya\\convergence\\application\\oct\\metier\\modele\\ReponseQuestionDeclaration.java

package Quittance.EmissionQuittance.Classes.Contrat.modele;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import java.util.ArrayList;
import java.util.List;

import com.rmawatanya.convergence.utile.referentiel.QuestionDeclaration;
import com.rmawatanya.convergence.utile.referentiel.ReponseQuestionPossible;

public class ReponseQuestionDeclaration implements IEntite
{
   private long id;
   private Boolean reponse;
   private String reponseMulti;
   /**
    * Une pr�cision est fournie si une r�ponse du questionnaire m�dical est positive.
    */
   private String precisionReponse;
   private Contrat refContrat;
   private QuestionDeclaration refQuestionDeclaration;
   private ReponseQuestionPossible refReponseChoisie;
      
   private List<LigneReponseQuestion> refLignesReponse = new ArrayList<LigneReponseQuestion>();
   private Client refClient;
   
   public ReponseQuestionDeclaration() 
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
    * Access method for the refContrat property.
    * 
    * @return   the current value of the refContrat property
    */
   public Contrat getRefContrat() 
   {
      return refContrat;
   }
   
   /**
    * Sets the value of the refContrat property.
    * 
    * @param aRefContrat the new value of the refContrat property
    */
   public void setRefContrat(Contrat aRefContrat) 
   {
      refContrat = aRefContrat;
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
   

	public Client getRefClient() {
	return refClient;
}

public void setRefClient(Client refClient) {
	this.refClient = refClient;
}

	public String getReponseMulti() {
		return reponseMulti;
	}

	public void setReponseMulti(String reponseMulti) {
		this.reponseMulti = reponseMulti;
	}

	public ReponseQuestionPossible getRefReponseChoisie() {
		return refReponseChoisie;
	}

	public void setRefReponseChoisie(ReponseQuestionPossible refReponseChoisie) {
		this.refReponseChoisie = refReponseChoisie;
	}

	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final ReponseQuestionDeclaration other = (ReponseQuestionDeclaration) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public List<LigneReponseQuestion> getRefLignesReponse() {
		return refLignesReponse;
	}

	public void setRefLignesReponse(List<LigneReponseQuestion> refLignesReponse) {
		this.refLignesReponse = refLignesReponse;
	} 
	
}
