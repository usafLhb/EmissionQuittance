//Source file: E:\\_Abdel\\Rmawatanya\\CONVERGENCE\\MOD\\ClassesJava\\com\\rmawatanya\\convergence\\utile\\referentiel\\QuestionDeclaration.java

package Quittance.EmissionQuittance.Classes.referentiel;

import java.util.List;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;


public class QuestionDeclaration extends ParametrageBO implements IEntite {
	
   /**
	 * 
	 */
   private static final long serialVersionUID = 1L;
   private long id;
   private Integer code;
   private String libelle;
   private String libelleAr;
   /***
    * Valeurs possibles : 
    *  0 : oui/ non avec precision
    *  1 : reponses multiples sans oui/non
    *  2 : reponses multiples avec oui/non
    *  3 : cas specifique pour BSM (compagnie)
    */
   private Integer typeQuestion;
   private Integer nbrReponse;
   private Boolean reponsePositiveInduitProposition;
   
   /**
    * 0 : pas pour conjoint, 1 : pour conjoint
    */
   private Boolean pourConjoint;
   private Boolean pourEnfant;
   
   private List<ReponseQuestionPossible> refReponsesPossibles;
   
   private String libelleSousQuestion;
   
   private Integer versionQuestion;
   
   private List<ColonnePrecisionPossible> refColonnePrecisionPosible;
   
   
   public QuestionDeclaration() 
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
    * Access method for the code property.
    * 
    * @return   the current value of the code property
    */
   public Integer getCode() 
   {
      return code;
   }
   
   /**
    * Sets the value of the code property.
    * 
    * @param aCode the new value of the code property
    */
   public void setCode(Integer aCode) 
   {
      code = aCode;
   }
   
   /**
    * Access method for the libelle property.
    * 
    * @return   the current value of the libelle property
    */
   public String getLibelle() 
   {
      return libelle;
   }
	public String getDescription() {
		return code + " - " + libelle;
	}

   /**
    * Sets the value of the libelle property.
    * 
    * @param aLibelle the new value of the libelle property
    */
   public void setLibelle(String aLibelle) 
   {
      libelle = aLibelle;
   }
   
   /**
    * Access method for the reponsePositiveInduitProposition property.
    * 
    * @return   the current value of the reponsePositiveInduitProposition property
    */
   public Boolean getReponsePositiveInduitProposition() 
   {
      return reponsePositiveInduitProposition;
   }
   
   /**
    * Sets the value of the reponsePositiveInduitProposition property.
    * 
    * @param aReponsePositiveInduitProposition the new value of the reponsePositiveInduitProposition property
    */
   public void setReponsePositiveInduitProposition(Boolean aReponsePositiveInduitProposition) 
   {
      reponsePositiveInduitProposition = aReponsePositiveInduitProposition;
   }
   
   /**
    * Access method for the pourConjoint property.
    * 
    * @return   the current value of the pourConjoint property
    */
   public Boolean getPourConjoint() 
   {
      return pourConjoint;
   }
   




	public Integer getTypeQuestion() {
	return typeQuestion;
	}

	public void setTypeQuestion(Integer typeQuestion) {
		this.typeQuestion = typeQuestion;
	}

	public Integer getNbrReponse() {
		return nbrReponse;
	}

	public void setNbrReponse(Integer nbrReponse) {
		this.nbrReponse = nbrReponse;
	}

/**
    * Sets the value of the pourConjoint property.
    * 
    * @param aPourConjoint the new value of the pourConjoint property
    */
   public void setPourConjoint(Boolean aPourConjoint) 
   {
      pourConjoint = aPourConjoint;
   }
   
	public Boolean getPourEnfant() {
	return pourEnfant;
}

public void setPourEnfant(Boolean aPourEnfant) {
	pourEnfant = aPourEnfant;
}

	
	
	public List<ReponseQuestionPossible> getRefReponsesPossibles() {
		return refReponsesPossibles;
	}
	
	public void setRefReponsesPossibles(
			List<ReponseQuestionPossible> refReponsesPossibles) {
		this.refReponsesPossibles = refReponsesPossibles;
	}


	public String getLibelleSousQuestion() {
		return libelleSousQuestion;
	}

	public void setLibelleSousQuestion(String libelleSousQuestion) {
		this.libelleSousQuestion = libelleSousQuestion;
	}
	
	

	public Integer getVersionQuestion() {
		return versionQuestion;
	}

	public void setVersionQuestion(Integer versionQuestion) {
		this.versionQuestion = versionQuestion;
	}

	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ColonnePrecisionPossible> getRefColonnePrecisionPosible() {
		return refColonnePrecisionPosible;
	}

	public void setRefColonnePrecisionPosible(List<ColonnePrecisionPossible> refColonnePrecisionPosible) {
		this.refColonnePrecisionPosible = refColonnePrecisionPosible;
	}

	public String getLibelleAr() {
		return libelleAr;
	}

	public void setLibelleAr(String libelleAr) {
		this.libelleAr = libelleAr;
	}   
}
