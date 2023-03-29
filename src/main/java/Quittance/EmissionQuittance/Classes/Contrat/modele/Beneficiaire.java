//Source file: E:\\_Abdel\\Rmawatanya\\CONVERGENCE\\MOD\\ClassesJava\\com\\rmawatanya\\convergence\\application\\oct\\metier\\modele\\Beneficiaire.java

package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;

import com.rmawatanya.convergence.utile.referentiel.TitreCivilite;
import com.rmawatanya.convergence.utile.referentiel.Ville;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class Beneficiaire implements IEntite 
{
   private long id;
   private String nom;
   private String prenom;
   private Calendar dateNaissance;
   private String numeroPieceIdentite;
   private String sexe;
   private String lienAssure;
   private String roleAssure;
   private Double pourcentageRente;
   private String numCB; 
   private String adresse;
   private Integer codePostal;
   private Ville refVille;
   private String profession;
   private String telephone;
   private TitreCivilite refTitreCivilite;
   private Contrat refContrat;
   
   public Beneficiaire() 
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
   
   
	public String getNumeroPieceIdentite() {
		return numeroPieceIdentite;
	}

	public void setNumeroPieceIdentite(String numeroPieceIdentite) {
		this.numeroPieceIdentite = numeroPieceIdentite;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
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
   
	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNumCB() {
		return numCB;
	}

	public void setNumCB(String numCB) {
		this.numCB = numCB;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Integer getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(Integer codePostal) {
		this.codePostal = codePostal;
	}

	public Ville getRefVille() {
		return refVille;
	}

	public void setRefVille(Ville refVille) {
		this.refVille = refVille;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public TitreCivilite getRefTitreCivilite() {
		return refTitreCivilite;
	}

	public void setRefTitreCivilite(TitreCivilite refTitreCivilite) {
		this.refTitreCivilite = refTitreCivilite;
	}


	
	
}
