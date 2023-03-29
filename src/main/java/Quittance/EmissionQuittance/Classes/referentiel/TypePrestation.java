
package Quittance.EmissionQuittance.Classes.referentiel;

import java.util.Collection;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.application.technique.referentiel.metier.manager.TypePrestationFactory;
import com.rmawatanya.convergence.utile.habilitations.Utilisateur;

/**
 * avance
 * rachat total
 * rachat partiel
 * d�c�s
 * invalidit�
 * hospitalisation
 * incendie
 * d�g�ts des eaux
 * vol
 * bris de glasse
 * rente viag�re
 * rente certaine
 * rente et capital
 */
public class TypePrestation extends ParametrageBO implements IEntite {

	private static final long serialVersionUID = 1L;
	
	private long id;
   private Integer code;
   private String libelle;
   
   /**
    * 0 : Non, 1 : Oui. Ce type de prestation est un sinistre.
    */
   private Boolean sinistre;
   private Boolean natureMaladieExigee;
   private Boolean montantsExiges;
   
   
   /**
    * 0 : Non, 1 : Oui. Ce type de prestation peut etre avec co-assurance (ihm).
    */
   private Boolean avecCoassurance;

   private String categorie;
   private Utilisateur responsable;   
   
   private Collection refAttestationSinistres;
   
   /**
    * Ajout� pour la migration Conso 
    */
   private Garantie refGarantie;
   
   public TypePrestation() 
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
    * Access method for the typeGarantie property.
    * 
    * @return   the current value of the typeGarantie property
    */
   /*public String getTypeGarantie() 
   {
      return typeGarantie;
   }*/
   
   /**
    * Sets the value of the typeGarantie property.
    * 
    * @param aTypeGarantie the new value of the typeGarantie property
    */
   /*public void setTypeGarantie(String aTypeGarantie) 
   {
      typeGarantie = aTypeGarantie;
   }*/
   
   /**
    * Access method for the sinistre property.
    * 
    * @return   the current value of the sinistre property
    */
   public Boolean getSinistre() 
   {
      return sinistre;
   }
   
   /**
    * Sets the value of the sinistre property.
    * 
    * @param aSinistre the new value of the sinistre property
    */
   public void setSinistre(Boolean aSinistre) 
   {
      sinistre = aSinistre;
   }
   
   /**
    * Access method for the natureMaladieExigee property.
    * 
    * @return   the current value of the natureMaladieExigee property
    */
   public Boolean getNatureMaladieExigee() 
   {
      return natureMaladieExigee;
   }
   
   /**
    * Sets the value of the natureMaladieExigee property.
    * 
    * @param aNatureMaladieExigee the new value of the natureMaladieExigee property
    */
   public void setNatureMaladieExigee(Boolean aNatureMaladieExigee) 
   {
      natureMaladieExigee = aNatureMaladieExigee;
   }
   
   /**
    * Access method for the montantsExiges property.
    * 
    * @return   the current value of the montantsExiges property
    */
   public Boolean getMontantsExiges() 
   {
      return montantsExiges;
   }
   
   /**
    * Sets the value of the montantsExiges property.
    * 
    * @param aMontantsExiges the new value of the montantsExiges property
    */
   public void setMontantsExiges(Boolean aMontantsExiges) 
   {
      montantsExiges = aMontantsExiges;
   }
   
	public EntiteFactory getFactory() {
		return  new TypePrestationFactory() ;
	}

	public Utilisateur getResponsable() {
		return responsable;
	}

	public void setResponsable(Utilisateur responsable) {
		this.responsable = responsable;
	}

	public Boolean getAvecCoassurance() {
		return avecCoassurance;
	}

	public void setAvecCoassurance(Boolean avecCoassurance) {
		this.avecCoassurance = avecCoassurance;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
/*
	public Collection getRefTypesAttestation() {
		return refTypesAttestation;
	}

	public void setRefTypesAttestation(Collection refTypesAttestation) {
		this.refTypesAttestation = refTypesAttestation;
	}  
	*/

	public Collection getRefAttestationSinistres() {
		return refAttestationSinistres;
	}

	public void setRefAttestationSinistres(
			Collection refAttestationSinistres) {
		this.refAttestationSinistres = refAttestationSinistres;
	} 

	public Garantie getRefGarantie() {
		return refGarantie;
	}

	public void setRefGarantie(Garantie refGarantie) {
		this.refGarantie = refGarantie;
	} 
	
	
}
