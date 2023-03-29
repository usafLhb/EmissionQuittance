
package Quittance.EmissionQuittance.Classes.Produit.modele;

import java.util.Collection;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

/**
 * @author Ayouch
 *
 */
public class Produit extends ParametrageBO implements IEntite {

	private static final long serialVersionUID = 1L;
	private long id;
	private String code;
	private String libelle;
	private String codeAbrege;
	private String codePolice;

   private String codeService;
   private java.util.Calendar dateLancement;
   private java.util.Calendar dateFin;
   
    // 3 valeurs sont possibles pour ce champs : 1- Partie Obligatoire, 2- Partie Facultative, 3- Partie Inexistante
   private String avecEpargne;
   private String avecPrevoyance;
   private String avecDommages;
   
   private Integer nombreMinGaranties;
   private Boolean avecPrimesSeparees;
   private Boolean avecPrimePeriodique;
   
    // 0 : imm�diat, 1 : prochaine �ch�ance

   private String effetModification;
   private String typeSouscripteur;
   
   private String typeAdherent;
   private Boolean roleAdherent;
   private Integer ageMinAdherent;
   private Integer ageMaxAdherent;
   private Integer ageLimiteAdherent;
   
   //R�le: 0: Absent, 1: Optionnel, 2: Obligatoire
   private String roleConjoint;
   private Integer ageMinConjoint;
   private Integer ageMaxConjoint;
   private Integer ageLimiteConjoint;
   
   private String roleEnfants;
   private Integer nombreMaxEnfantsAssures;
   private Integer ageMinEnfant;
   private Integer ageMaxEnfant;
   private Integer ageLimiteEnfant;   
   
   // 0 : sans beneficiaires, 1 : avec beneficiaires de l'assur�, 2 : avec beneficiaires de l'assur� et avec beneficiaires du conjoint, 
   // 3 : avecb�n�ficiaires de l'assur�, du conjoint et du contrat

   private String avecBeneficiaires;
   
   private String avecPoidsTaille;
   
   /**
    * 0 : pour contrat individuel, 1 : pour contrat groupe seulement.
    */
   private String typeContrat;
   
   
   // Le contrat, en cas de prime globale, peut �tre avec coassurance. 0 : Non, 1 : Oui
   private Boolean avecCoassurance;
   
   /**
    * 0 : Sans questions d�clarations, 1 : Avec questions d�claration pour l'adh�rent 
    * seulement, 2 : avec questions d�clarations pour l'adh�rent et pour le conjoint
    */
   private String avecQuestionDeclaration;   
   
   private String avecReferenceExterne;
   private String categorie;
   private String comptecomptable;
   private String compteavance;
   private String compteprestation;
   private String comptecontrepartie;
   private Integer codecomptable;
   private Integer modulable;   
   private ParametresEpargne refParametresEpargne;
   private ParametresPrevoyance refParametresPrevoyance;
   private ParametresDommages refParametresDommages;  
   private Produit refProduitRemplacant;
   private Collection refQuestionsDeclaration;   
   private Collection refFractionnementsPrimePossibles;
   
   private Boolean avecBienAssure;      
   private Boolean avecPersonneAssure;

   private Collection refTypesPrestation;  
   
   private Collection refAssocProduitTypeBienAssureFamilleGaranties;
   private Collection refAssocProduitTypePersonneAssureeFamilleGaranties;
   
   private String refHomologation;
   private Integer delaiPreavis ;
   
	public String getRefHomologation() {
	return refHomologation;
}

public void setRefHomologation(String refHomologation) {
	this.refHomologation = refHomologation;
}

	public boolean equals(Object obj) {
		if(this.getId()==((Produit)obj).getId()){
			return true;
		}
		return false;
	}

   public Produit() {
	   
   }
   
	public String getAvecReferenceExterne() {
	return avecReferenceExterne;
	}

	public void setAvecReferenceExterne(String avecReferenceExterne) {
		this.avecReferenceExterne = avecReferenceExterne;
	}

	public String getDescription() {
		return code + " - " + libelle;
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
   public String getCode() 
   {
      return code;
   }
   
   /**
    * Sets the value of the code property.
    * 
    * @param aCode the new value of the code property
    */
   public void setCode(String aCode) 
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
    * Access method for the codeAbrege property.
    * 
    * @return   the current value of the codeAbrege property
    */
   public String getCodeAbrege() 
   {
      return codeAbrege;
   }
   
   /**
    * Sets the value of the codeAbrege property.
    * 
    * @param aCodeAbrege the new value of the codeAbrege property
    */
   public void setCodeAbrege(String aCodeAbrege) 
   {
      codeAbrege = aCodeAbrege;
   }
   
   /**
    * Access method for the codePolice property.
    * 
    * @return   the current value of the codePolice property
    */
   public String getCodePolice() 
   {
      return codePolice;
   }
   
   /**
    * Sets the value of the codePolice property.
    * 
    * @param aCodePolice the new value of the codePolice property
    */
   public void setCodePolice(String aCodePolice) 
   {
      codePolice = aCodePolice;
   }
   
   
   /**
    * Access method for the codeService property.
    * 
    * @return   the current value of the codeService property
    */
   public String getCodeService() 
   {
      return codeService;
   }
   
   /**
    * Sets the value of the codeService property.
    * 
    * @param aCodeService the new value of the codeService property
    */
   public void setCodeService(String aCodeService) 
   {
      codeService = aCodeService;
   }
   
   /**
    * Access method for the dateLancement property.
    * 
    * @return   the current value of the dateLancement property
    */
   public java.util.Calendar getDateLancement() 
   {
      return dateLancement;
   }
   
   /**
    * Sets the value of the dateLancement property.
    * 
    * @param aDateLancement the new value of the dateLancement property
    */
   public void setDateLancement(java.util.Calendar aDateLancement) 
   {
      dateLancement = aDateLancement;
   }
   
   /**
    * Access method for the dateFin property.
    * 
    * @return   the current value of the dateFin property
    */
   public java.util.Calendar getDateFin() 
   {
      return dateFin;
   }
   
   /**
    * Sets the value of the dateFin property.
    * 
    * @param aDateFin the new value of the dateFin property
    */
   public void setDateFin(java.util.Calendar aDateFin) 
   {
      dateFin = aDateFin;
   }
   
   /**
    * Access method for the avecEpargne property.
    * 
    * @return   the current value of the avecEpargne property
    */
   public String getAvecEpargne() 
   {
      return avecEpargne;
   }
   
   /**
    * Sets the value of the avecEpargne property.
    * 
    * @param aAvecEpargne the new value of the avecEpargne property
    */
   public void setAvecEpargne(String aAvecEpargne) 
   {
      avecEpargne = aAvecEpargne;
   }
   
   /**
    * Access method for the avecPrevoyance property.
    * 
    * @return   the current value of the avecPrevoyance property
    */
   public String getAvecPrevoyance() 
   {
      return avecPrevoyance;
   }
   
   /**
    * Sets the value of the avecPrevoyance property.
    * 
    * @param aAvecPrevoyance the new value of the avecPrevoyance property
    */
   public void setAvecPrevoyance(String aAvecPrevoyance) 
   {
      avecPrevoyance = aAvecPrevoyance;
   }
   
   /**
    * Access method for the avecDommages property.
    * 
    * @return   the current value of the avecDommages property
    */
   public String getAvecDommages() 
   {
      return avecDommages;
   }
   
   /**
    * Sets the value of the avecDommages property.
    * 
    * @param aAvecDommages the new value of the avecDommages property
    */
   public void setAvecDommages(String aAvecDommages) 
   {
      avecDommages = aAvecDommages;
   }
   
   /**
    * Access method for the nombreMinGaranties property.
    * 
    * @return   the current value of the nombreMinGaranties property
    */
   public Integer getNombreMinGaranties() 
   {
      return nombreMinGaranties;
   }
   
   /**
    * Sets the value of the nombreMinGaranties property.
    * 
    * @param aNombreMinGaranties the new value of the nombreMinGaranties property
    */
   public void setNombreMinGaranties(Integer aNombreMinGaranties) 
   {
      nombreMinGaranties = aNombreMinGaranties;
   }
   
   /**
    * Access method for the avecPrimesSeparees property.
    * 
    * @return   the current value of the avecPrimesSeparees property
    */
   public Boolean getAvecPrimesSeparees() 
   {
      return avecPrimesSeparees;
   }
   
   /**
    * Sets the value of the avecPrimesSeparees property.
    * 
    * @param aAvecPrimesSeparees the new value of the avecPrimesSeparees property
    */
   public void setAvecPrimesSeparees(Boolean aAvecPrimesSeparees) 
   {
      avecPrimesSeparees = aAvecPrimesSeparees;
   }
   
   /**
    * Access method for the avecPrimePeriodique property.
    * 
    * @return   the current value of the avecPrimePeriodique property
    */
   public Boolean getAvecPrimePeriodique() 
   {
      return avecPrimePeriodique;
   }
   
   /**
    * Sets the value of the avecPrimePeriodique property.
    * 
    * @param aAvecPrimePeriodique the new value of the avecPrimePeriodique property
    */
   public void setAvecPrimePeriodique(Boolean aAvecPrimePeriodique) 
   {
      avecPrimePeriodique = aAvecPrimePeriodique;
   }
   
   /**
    * Access method for the effetModification property.
    * 
    * @return   the current value of the effetModification property
    */
   public String getEffetModification() 
   {
      return effetModification;
   }
   
   /**
    * Sets the value of the effetModification property.
    * 
    * @param aEffetModification the new value of the effetModification property
    */
   public void setEffetModification(String aEffetModification) 
   {
      effetModification = aEffetModification;
   }
   
   /**
    * Access method for the typeSouscripteur property.
    * 
    * @return   the current value of the typeSouscripteur property
    */
   public String getTypeSouscripteur() 
   {
      return typeSouscripteur;
   }
   
   /**
    * Sets the value of the typeSouscripteur property.
    * 
    * @param aTypeSouscripteur the new value of the typeSouscripteur property
    */
   public void setTypeSouscripteur(String aTypeSouscripteur) 
   {
      typeSouscripteur = aTypeSouscripteur;
   }
   
   /**
    * Access method for the typeAdherent property.
    * 
    * @return   the current value of the typeAdherent property
    */
   public String getTypeAdherent() 
   {
      return typeAdherent;
   }
   
   /**
    * Sets the value of the typeAdherent property.
    * 
    * @param aTypeAdherent the new value of the typeAdherent property
    */
   public void setTypeAdherent(String aTypeAdherent) 
   {
      typeAdherent = aTypeAdherent;
   }
   
   /**
    * Access method for the ageMinAdherent property.
    * 
    * @return   the current value of the ageMinAdherent property
    */
   public Integer getAgeMinAdherent() 
   {
      return ageMinAdherent;
   }
   
   /**
    * Sets the value of the ageMinAdherent property.
    * 
    * @param aAgeMinAdherent the new value of the ageMinAdherent property
    */
   public void setAgeMinAdherent(Integer aAgeMinAdherent) 
   {
      ageMinAdherent = aAgeMinAdherent;
   }
   
   /**
    * Access method for the ageMaxAdherent property.
    * 
    * @return   the current value of the ageMaxAdherent property
    */
   public Integer getAgeMaxAdherent() 
   {
      return ageMaxAdherent;
   }
   
   /**
    * Sets the value of the ageMaxAdherent property.
    * 
    * @param aAgeMaxAdherent the new value of the ageMaxAdherent property
    */
   public void setAgeMaxAdherent(Integer aAgeMaxAdherent) 
   {
      ageMaxAdherent = aAgeMaxAdherent;
   }
   
   /**
    * Access method for the roleConjoint property.
    * 
    * @return   the current value of the roleConjoint property
    */
   public String getRoleConjoint() 
   {
      return roleConjoint;
   }
   
   /**
    * Sets the value of the roleConjoint property.
    * 
    * @param aRoleConjoint the new value of the roleConjoint property
    */
   public void setRoleConjoint(String aRoleConjoint) 
   {
      roleConjoint = aRoleConjoint;
   }
   
   /**
    * Access method for the ageMinConjoint property.
    * 
    * @return   the current value of the ageMinConjoint property
    */
   public Integer getAgeMinConjoint() 
   {
      return ageMinConjoint;
   }
   
   /**
    * Sets the value of the ageMinConjoint property.
    * 
    * @param aAgeMinConjoint the new value of the ageMinConjoint property
    */
   public void setAgeMinConjoint(Integer aAgeMinConjoint) 
   {
      ageMinConjoint = aAgeMinConjoint;
   }
   
   /**
    * Access method for the ageMaxConjoint property.
    * 
    * @return   the current value of the ageMaxConjoint property
    */
   public Integer getAgeMaxConjoint() 
   {
      return ageMaxConjoint;
   }
   
   /**
    * Sets the value of the ageMaxConjoint property.
    * 
    * @param aAgeMaxConjoint the new value of the ageMaxConjoint property
    */
   public void setAgeMaxConjoint(Integer aAgeMaxConjoint) 
   {
      ageMaxConjoint = aAgeMaxConjoint;
   }
   
   /**
    * Access method for the roleEnfants property.
    * 
    * @return   the current value of the roleEnfants property
    */
   public String getRoleEnfants() 
   {
      return roleEnfants;
   }
   
   /**
    * Sets the value of the roleEnfants property.
    * 
    * @param aRoleEnfants the new value of the roleEnfants property
    */
   public void setRoleEnfants(String aRoleEnfants) 
   {
      roleEnfants = aRoleEnfants;
   }
   
   /**
    * Access method for the nombreMaxEnfantsAssures property.
    * 
    * @return   the current value of the nombreMaxEnfantsAssures property
    */
   public Integer getNombreMaxEnfantsAssures() 
   {
      return nombreMaxEnfantsAssures;
   }
   
   /**
    * Sets the value of the nombreMaxEnfantsAssures property.
    * 
    * @param aNombreMaxEnfantsAssures the new value of the nombreMaxEnfantsAssures property
    */
   public void setNombreMaxEnfantsAssures(Integer aNombreMaxEnfantsAssures) 
   {
      nombreMaxEnfantsAssures = aNombreMaxEnfantsAssures;
   }
   
   /**
    * Access method for the ageMinEnfant property.
    * 
    * @return   the current value of the ageMinEnfant property
    */
   public Integer getAgeMinEnfant() 
   {
      return ageMinEnfant;
   }
   
   /**
    * Sets the value of the ageMinEnfant property.
    * 
    * @param aAgeMinEnfant the new value of the ageMinEnfant property
    */
   public void setAgeMinEnfant(Integer aAgeMinEnfant) 
   {
      ageMinEnfant = aAgeMinEnfant;
   }
   
   /**
    * Access method for the ageMaxEnfant property.
    * 
    * @return   the current value of the ageMaxEnfant property
    */
   public Integer getAgeMaxEnfant() 
   {
      return ageMaxEnfant;
   }
   
   /**
    * Sets the value of the ageMaxEnfant property.
    * 
    * @param aAgeMaxEnfant the new value of the ageMaxEnfant property
    */
   public void setAgeMaxEnfant(Integer aAgeMaxEnfant) 
   {
      ageMaxEnfant = aAgeMaxEnfant;
   }
   
   /**
    * Access method for the avecBeneficiaires property.
    * 
    * @return   the current value of the avecBeneficiaires property
    */
   public String getAvecBeneficiaires() 
   {
      return avecBeneficiaires;
   }
   
   /**
    * Sets the value of the avecBeneficiaires property.
    * 
    * @param aAvecBeneficiaires the new value of the avecBeneficiaires property
    */
   public void setAvecBeneficiaires(String aAvecBeneficiaires) 
   {
      avecBeneficiaires = aAvecBeneficiaires;
   }
   
   /**
    * Access method for the avecPoidsTaille property.
    * 
    * @return   the current value of the avecPoidsTaille property
    */
   public String getAvecPoidsTaille() 
   {
      return avecPoidsTaille;
   }
   
   /**
    * Sets the value of the avecPoidsTaille property.
    * 
    * @param aAvecPoidsTaille the new value of the avecPoidsTaille property
    */
   public void setAvecPoidsTaille(String aAvecPoidsTaille) 
   {
      avecPoidsTaille = aAvecPoidsTaille;
   }
   
   /**
    * Access method for the typeContrat property.
    * 
    * @return   the current value of the typeContrat property
    */
   public String getTypeContrat() 
   {
      return typeContrat;
   }
   
   /**
    * Sets the value of the typeContrat property.
    * 
    * @param aTypeContrat the new value of the typeContrat property
    */
   public void setTypeContrat(String aTypeContrat) 
   {
      typeContrat = aTypeContrat;
   }
   
   /**
    * Access method for the avecCoassurance property.
    * 
    * @return   the current value of the avecCoassurance property
    */
   public Boolean getAvecCoassurance() 
   {
      return avecCoassurance;
   }
   
   /**
    * Sets the value of the avecCoassurance property.
    * 
    * @param aAvecCoassurance the new value of the avecCoassurance property
    */
   public void setAvecCoassurance(Boolean aAvecCoassurance) 
   {
      avecCoassurance = aAvecCoassurance;
   }
   
   /**
    * Access method for the avecQuestionDeclaration property.
    * 
    * @return   the current value of the avecQuestionDeclaration property
    */
   public String getAvecQuestionDeclaration() 
   {
      return avecQuestionDeclaration;
   }
   
   /**
    * Sets the value of the avecQuestionDeclaration property.
    * 
    * @param aAvecQuestionDeclaration the new value of the avecQuestionDeclaration property
    */
   public void setAvecQuestionDeclaration(String aAvecQuestionDeclaration) 
   {
      avecQuestionDeclaration = aAvecQuestionDeclaration;
   }
   
   /**
    * Access method for the ageLimiteAdherent property.
    * 
    * @return   the current value of the ageLimiteAdherent property
    */
   public Integer getAgeLimiteAdherent() 
   {
      return ageLimiteAdherent;
   }
   
   /**
    * Sets the value of the ageLimiteAdherent property.
    * 
    * @param aAgeLimiteAdherent the new value of the ageLimiteAdherent property
    */
   public void setAgeLimiteAdherent(Integer aAgeLimiteAdherent) 
   {
      ageLimiteAdherent = aAgeLimiteAdherent;
   }
   
   /**
    * Access method for the ageLimiteConjoint property.
    * 
    * @return   the current value of the ageLimiteConjoint property
    */
   public Integer getAgeLimiteConjoint() 
   {
      return ageLimiteConjoint;
   }
   
   /**
    * Sets the value of the ageLimiteConjoint property.
    * 
    * @param aAgeLimiteConjoint the new value of the ageLimiteConjoint property
    */
   public void setAgeLimiteConjoint(Integer aAgeLimiteConjoint) 
   {
      ageLimiteConjoint = aAgeLimiteConjoint;
   }
   
   /**
    * Access method for the ageLimiteEnfant property.
    * 
    * @return   the current value of the ageLimiteEnfant property
    */
   public Integer getAgeLimiteEnfant() 
   {
      return ageLimiteEnfant;
   }
   
   /**
    * Sets the value of the ageLimiteEnfant property.
    * 
    * @param aAgeLimiteEnfant the new value of the ageLimiteEnfant property
    */
   public void setAgeLimiteEnfant(Integer aAgeLimiteEnfant) 
   {
      ageLimiteEnfant = aAgeLimiteEnfant;
   }
   
	/**
	 * @param refBaremes The refBaremes to set.
	 */

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
  

	
	/**
	 * @param refCommissions The refCommissions to set.
	 */
   
	/**
	 * @return Returns the refQuestionsDeclaration.
	 */
	public Collection getRefQuestionsDeclaration() {
		return refQuestionsDeclaration;
	}
	
	/**
	 * @param refQuestionsDeclaration The refQuestionsDeclaration to set.
	 */
	public void setRefQuestionsDeclaration(Collection refQuestionsDeclaration) {
		this.refQuestionsDeclaration = refQuestionsDeclaration;
	}
  

   /**
    * Access method for the refProduitRemplacant property.
    * 
    * @return   the current value of the refProduitRemplacant property
    */
   public com.rmawatanya.convergence.application.prd.metier.modele.Produit getRefProduitRemplacant() 
   {
      return refProduitRemplacant;
   }
   
   /**
    * Sets the value of the refProduitRemplacant property.
    * 
    * @param aRefProduitRemplacant the new value of the refProduitRemplacant property
    */
   public void setRefProduitRemplacant(com.rmawatanya.convergence.application.prd.metier.modele.Produit aRefProduitRemplacant) 
   {
      refProduitRemplacant = aRefProduitRemplacant;
   }

	
	/**
	 * @param refAccessoires The refAccessoires to set.
	 */
	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public ParametresPrevoyance getRefParametresPrevoyance() {
		return refParametresPrevoyance;
	}
	
	public void setRefParametresPrevoyance(
			ParametresPrevoyance refParametresPrevoyance) {
		this.refParametresPrevoyance = refParametresPrevoyance;
	}
	
	public ParametresDommages getRefParametresDommages() {
		return refParametresDommages;
	}
	
	public void setRefParametresDommages(ParametresDommages refParametresDommages) {
		this.refParametresDommages = refParametresDommages;
	}
	
	public Boolean getRoleAdherent() {
		return roleAdherent;
	}
	
	public void setRoleAdherent(Boolean roleAdherent) {
		this.roleAdherent = roleAdherent;
	}

	public Collection getRefFractionnementsPrimePossibles() {
		return refFractionnementsPrimePossibles;
	}

	public void setRefFractionnementsPrimePossibles(
			Collection refFractionnementsPrimePossibles) {
		this.refFractionnementsPrimePossibles = refFractionnementsPrimePossibles;
	}
	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getCompteavance() {
		return compteavance;
	}

	public void setCompteavance(String compteavance) {
		this.compteavance = compteavance;
	}

	public String getComptecomptable() {
		return comptecomptable;
	}

	public void setComptecomptable(String comptecomptable) {
		this.comptecomptable = comptecomptable;
	}

	public String getComptecontrepartie() {
		return comptecontrepartie;
	}

	public void setComptecontrepartie(String comptecontrepartie) {
		this.comptecontrepartie = comptecontrepartie;
	}

	public String getCompteprestation() {
		return compteprestation;
	}

	public void setCompteprestation(String compteprestation) {
		this.compteprestation = compteprestation;
	}

	public Integer getCodecomptable() {
		return codecomptable;
	}

	public void setCodecomptable(Integer codecomptable) {
		this.codecomptable = codecomptable;
	}

	public Boolean getAvecPersonneAssure() {
		return avecPersonneAssure;
	}

	public void setAvecPersonneAssure(Boolean avecPersonneAssure) {
		this.avecPersonneAssure = avecPersonneAssure;
	}

	public Boolean getAvecBienAssure() {
		return avecBienAssure;
	}

	public void setAvecBienAssure(Boolean avecBienAssure) {
		this.avecBienAssure = avecBienAssure;
	}

	public Collection getRefTypesPrestation() {
		return refTypesPrestation;
	}

	public void setRefTypesPrestation(Collection refTypesPrestation) {
		this.refTypesPrestation = refTypesPrestation;
	}

	public Collection getRefAssocProduitTypeBienAssureFamilleGaranties() {
		return refAssocProduitTypeBienAssureFamilleGaranties;
	}

	public void setRefAssocProduitTypeBienAssureFamilleGaranties(
			Collection refAssocProduitTypeBienAssureFamilleGaranties) {
		this.refAssocProduitTypeBienAssureFamilleGaranties = refAssocProduitTypeBienAssureFamilleGaranties;
	}

	public Collection getRefAssocProduitTypePersonneAssureeFamilleGaranties() {
		return refAssocProduitTypePersonneAssureeFamilleGaranties;
	}

	public void setRefAssocProduitTypePersonneAssureeFamilleGaranties(
			Collection refAssocProduitTypePersonneAssureeFamilleGaranties) {
		this.refAssocProduitTypePersonneAssureeFamilleGaranties = refAssocProduitTypePersonneAssureeFamilleGaranties;
	}

	public Integer getModulable() {
		return modulable;
	}

	public void setModulable(Integer modulable) {
		this.modulable = modulable;
	}

	public Integer getDelaiPreavis() {
		return delaiPreavis;
	}

	public void setDelaiPreavis(Integer delaiPreavis) {
		this.delaiPreavis = delaiPreavis;
	}

}