package Quittance.EmissionQuittance.Classes.Prelevements.modele;

import java.util.Calendar;
import java.util.Collection;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.application.oct.metier.modele.Contrat;
import com.rmawatanya.convergence.utile.habilitations.Utilisateur;

public class OperationIntegrationCotisation implements IEntite
{
   private long id;
   private String referenceBordereau;
   private String nomFichier;
   private Calendar date;
   private String etat;
   private Calendar dateValeur;
   private Calendar dateEcheance;
   private String numeroRemise;
   private Double montantRemise;
   private Double montantDeclarationsValides;
   private Collection refEnregistrementRejeteIntegration;
   private Collection<DeclarationCotisation> refDeclarationCotisations;
   private Utilisateur refUtilisateur;
   private Utilisateur refUtilisateurCreateur;
   private Contrat refContrat;
   private Double montantTotalImpaye;
   private Double montantTotalPaye;
   private Double montantTotalPrime;
   
   public OperationIntegrationCotisation() 
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
    * Access method for the nomFichier property.
    * 
    * @return   the current value of the nomFichier property
    */
   public String getNomFichier() 
   {
      return nomFichier;
   }
   
   /**
    * Sets the value of the nomFichier property.
    * 
    * @param aNomFichier the new value of the nomFichier property
    */
   public void setNomFichier(String aNomFichier) 
   {
      nomFichier = aNomFichier;
   }
   
   /**
    * Access method for the date property.
    * 
    * @return   the current value of the date property
    */

   /**
    * Access method for the etat property.
    * 
    * @return   the current value of the etat property
    */
   public String getEtat() 
   {
      return etat;
   }
   
   /**
    * Sets the value of the etat property.
    * 
    * @param aEtat the new value of the etat property
    */
   public void setEtat(String aEtat) 
   {
      etat = aEtat;
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
   
	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		return null;
	}

	public Collection getRefEnregistrementRejeteIntegration() {
		return refEnregistrementRejeteIntegration;
	}

	public void setRefEnregistrementRejeteIntegration(
			Collection refEnregistrementRejeteIntegration) {
		this.refEnregistrementRejeteIntegration = refEnregistrementRejeteIntegration;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public Calendar getDateValeur() {
		return dateValeur;
	}

	public void setDateValeur(Calendar dateValeur) {
		this.dateValeur = dateValeur;
	}

	public String getNumeroRemise() {
		return numeroRemise;
	}

	public void setNumeroRemise(String numeroRemise) {
		this.numeroRemise = numeroRemise;
	}

	public Double getMontantRemise() {
		return montantRemise;
	}

	public void setMontantRemise(Double montantRemise) {
		this.montantRemise = montantRemise;
	}

	/**
	 * @return the refContrat
	 */
	public Contrat getRefContrat() {
		return refContrat;
	}

	/**
	 * @param refContrat the refContrat to set
	 */
	public void setRefContrat(Contrat refContrat) {
		this.refContrat = refContrat;
	}

	

	/**
	 * @return the refDeclarationCotisations
	 */
	public Collection<DeclarationCotisation> getRefDeclarationCotisations() {
		return refDeclarationCotisations;
	}

	/**
	 * @param refDeclarationCotisations the refDeclarationCotisations to set
	 */
	public void setRefDeclarationCotisations(
			Collection<DeclarationCotisation> refDeclarationCotisations) {
		this.refDeclarationCotisations = refDeclarationCotisations;
	}

	/**
	 * @return the referenceBordereau
	 */
	public String getReferenceBordereau() {
		return referenceBordereau;
	}

	/**
	 * @param referenceBordereau the referenceBordereau to set
	 */
	public void setReferenceBordereau(String referenceBordereau) {
		this.referenceBordereau = referenceBordereau;
	}

	/**
	 * @return the dateEcheance
	 */
	public Calendar getDateEcheance() {
		return dateEcheance;
	}

	/**
	 * @param dateEcheance the dateEcheance to set
	 */
	public void setDateEcheance(Calendar dateEcheance) {
		this.dateEcheance = dateEcheance;
	}

	/**
	 * @return the montantDeclarationsValides
	 */
	public Double getMontantDeclarationsValides() {
		return montantDeclarationsValides;
	}

	/**
	 * @param montantDeclarationsValides the montantDeclarationsValides to set
	 */
	public void setMontantDeclarationsValides(Double montantDeclarationsValides) {
		this.montantDeclarationsValides = montantDeclarationsValides;
	}

	/**
	 * @return the refUtilisateurCreateur
	 */
	public Utilisateur getRefUtilisateurCreateur() {
		return refUtilisateurCreateur;
	}

	/**
	 * @param refUtilisateurCreateur the refUtilisateurCreateur to set
	 */
	public void setRefUtilisateurCreateur(Utilisateur refUtilisateurCreateur) {
		this.refUtilisateurCreateur = refUtilisateurCreateur;
	}

	public void setMontantTotalImpaye(Double value) {
		this.montantTotalImpaye = value;
		
	}

	public Double getMontantTotalPaye() {
		return montantTotalPaye;
	}

	public void setMontantTotalPaye(Double montantTotalPaye) {
		this.montantTotalPaye = montantTotalPaye;
	}

	public Double getMontantTotalPrime() {
		return montantTotalPrime;
	}

	public void setMontantTotalPrime(Double montantTotalPrime) {
		this.montantTotalPrime = montantTotalPrime;
	}

	public Double getMontantTotalImpaye() {
		return montantTotalImpaye;
	}
	
	
	
}
