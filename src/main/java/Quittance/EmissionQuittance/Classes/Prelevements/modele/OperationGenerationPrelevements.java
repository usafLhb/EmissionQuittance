package Quittance.EmissionQuittance.Classes.Prelevements.modele;

import java.util.Calendar;
import java.util.Collection;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;
import ma.co.omnidata.framework.utile.DateUtile;

import com.rmawatanya.convergence.application.qtc.metier.valueobjects.QtcOperationItem;

public class OperationGenerationPrelevements implements IEntite 
{
   private long id;
   private long idOperationPrelevement;
   private String nomFichier;
   private Calendar dateGenerationFichier;
   private Integer nombrePrelevements;
   private Calendar dateReceptionSort;
   private Integer nombrePrelevementsRejetes;
   private Calendar dateValeur;
   private String numeroRIBClientTire;
   private Double montantStandard;
   private Double montantAPreleverClient;
   private Double montantNetRMAWATANYA;
   private Double montantEpargne;
   private Double modePrelevement;
   private Double montantRemise;
   private String numeroRemise;
   private String numeroContrat;
   private Long idContrat; 
   private Long idProduit; 
   private String codeUser;
  

public String getCodeUser() {
	return codeUser;
}

public void setCodeUser(String codeUser) {
	this.codeUser = codeUser;
}

private String typeProduitChoisi;
   private Collection typesProduits;
   
   private String referenceBordereau;
   
   private boolean paramMeg;
   
   /**
    * envoy�, sort trait�, rejet� compl�tement
    */
   private String etatTraitementFichier;
   private Collection refEcheanciersPrelevement;
   
   public OperationGenerationPrelevements() {
   }

   public long getId() {
       return id;
   }

   public void setId(long id) {
       this.id = id;
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
    * Access method for the dateGenerationFichier property.
    * 
    * @return   the current value of the dateGenerationFichier property
    */
   public Calendar getDateGenerationFichier() 
   {
      return dateGenerationFichier;
   }
   
   /**
    * Sets the value of the dateGenerationFichier property.
    * 
    * @param aDateGenerationFichier the new value of the dateGenerationFichier property
    */
   public void setDateGenerationFichier(Calendar aDateGenerationFichier) 
   {
      dateGenerationFichier = aDateGenerationFichier;
   }
   
   /**
    * Access method for the nombrePrelevements property.
    * 
    * @return   the current value of the nombrePrelevements property
    */
   public Integer getNombrePrelevements() 
   {
      return nombrePrelevements;
   }
   
   /**
    * Sets the value of the nombrePrelevements property.
    * 
    * @param aNombrePrelevements the new value of the nombrePrelevements property
    */
   public void setNombrePrelevements(Integer aNombrePrelevements) 
   {
      nombrePrelevements = aNombrePrelevements;
   }
   
   /**
    * Access method for the dateReceptionSort property.
    * 
    * @return   the current value of the dateReceptionSort property
    */
   public Calendar getDateReceptionSort() 
   {
      return dateReceptionSort;
   }
   
   /**
    * Sets the value of the dateReceptionSort property.
    * 
    * @param aDateReceptionSort the new value of the dateReceptionSort property
    */
   public void setDateReceptionSort(Calendar aDateReceptionSort) 
   {
      dateReceptionSort = aDateReceptionSort;
   }
   
   /**
    * Access method for the nombrePrelevementsRejetes property.
    * 
    * @return   the current value of the nombrePrelevementsRejetes property
    */
   public Integer getNombrePrelevementsRejetes() 
   {
      return nombrePrelevementsRejetes;
   }
   
   /**
    * Sets the value of the nombrePrelevementsRejetes property.
    * 
    * @param aNombrePrelevementsRejetes the new value of the nombrePrelevementsRejetes property
    */
   public void setNombrePrelevementsRejetes(Integer aNombrePrelevementsRejetes) 
   {
      nombrePrelevementsRejetes = aNombrePrelevementsRejetes;
   }
   
   /**
    * Access method for the etatTraitementFichier property.
    * 
    * @return   the current value of the etatTraitementFichier property
    */
   public String getEtatTraitementFichier() 
   {
      return etatTraitementFichier;
   }
   
   /**
    * Sets the value of the etatTraitementFichier property.
    * 
    * @param aEtatTraitementFichier the new value of the etatTraitementFichier property
    */
   public void setEtatTraitementFichier(String aEtatTraitementFichier) 
   {
      etatTraitementFichier = aEtatTraitementFichier;
   }
 
	/**
	 * @return Returns the refEcheancierPrelevement.
	 */
	public Collection getRefEcheanciersPrelevement() {
		return refEcheanciersPrelevement;
	}
	
	/**
	 * @param refEcheancierPrelevement The refEcheancierPrelevement to set.
	 */
	public void setRefEcheanciersPrelevement(Collection refEcheanciersPrelevement) {
		this.refEcheanciersPrelevement = refEcheanciersPrelevement;
	}
	
	
	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public Calendar getDateValeur() {
		return dateValeur;
	}

	public void setDateValeur(Calendar dateValeur) {
		this.dateValeur = dateValeur;
	}

	public Double getMontantRemise() {
		return montantRemise;
	}

	public void setMontantRemise(Double montantRemise) {
		this.montantRemise = montantRemise;
	}



	public String getNumeroRemise() {
		return numeroRemise;
	}

	public void setNumeroRemise(String numeroRemise) {
		this.numeroRemise = numeroRemise;
	}

	public String getNumeroContrat() {
		return numeroContrat;
	}

	public void setNumeroContrat(String numeroContrat) {
		this.numeroContrat = numeroContrat;
	}

	public Long getIdContrat() {
	    return idContrat;
	}

	public void setIdContrat(Long idContrat) {
	    this.idContrat = idContrat;
	}

	public Long getIdProduit() {
	    return idProduit;
	}

	public void setIdProduit(Long idProduit) {
	    this.idProduit = idProduit;
	}

	public QtcOperationItem convertToOperationPrelementItem() {

		QtcOperationItem qtcOperationItem = new QtcOperationItem();
		qtcOperationItem.setId(String.valueOf(this.getId()));
		

		if (this.getNomFichier() != null) {
			qtcOperationItem.setNomFichier(this.getNomFichier());
		}
		
		if (this.getNombrePrelevements() != null) {
			qtcOperationItem.setNombrePrelevements(String.valueOf(this.getNombrePrelevements()));
		}
		if (this.getNombrePrelevementsRejetes() != null) {
			qtcOperationItem.setNombrePrelevementsRejetes(String.valueOf(this.getNombrePrelevementsRejetes()));
		}
		
		if (this.getEtatTraitementFichier()!= null) {
			qtcOperationItem.setEtat(String.valueOf(this.getEtatTraitementFichier()));
		}
		
		if (this.getNumeroRemise() != null) {
			qtcOperationItem.setNumeroRemise(this.getNumeroRemise());
		}

		
		if (this.getDateGenerationFichier() != null) {
			qtcOperationItem.setDateGenerationFichier(DateUtile.calendarToString(this.getDateGenerationFichier()));
		}
		
		if (this.getDateReceptionSort() != null) {
			qtcOperationItem.setDateReceptionSort(DateUtile.calendarToString(this.getDateReceptionSort()));
		}

		if (this.getDateValeur() != null) {
			qtcOperationItem.setDateValeur(DateUtile.calendarToString(this.getDateValeur()));
		}
		
		
		if (this.getMontantRemise() != null) {
			qtcOperationItem.setMontant(String.valueOf(this.getMontantRemise()));
		}else{
			qtcOperationItem.setMontant("0.00");
		}
		
		

		return qtcOperationItem;
	}

	public long getIdOperationPrelevement() {
		return idOperationPrelevement;
	}

	public void setIdOperationPrelevement(long idOperationPrelevement) {
		this.idOperationPrelevement = idOperationPrelevement;
	}



	public Double getModePrelevement() {
		return modePrelevement;
	}

	public void setModePrelevement(Double modePrelevement) {
		this.modePrelevement = modePrelevement;
	}

	public Double getMontantAPreleverClient() {
		return montantAPreleverClient;
	}

	public void setMontantAPreleverClient(Double montantAPreleverClient) {
		this.montantAPreleverClient = montantAPreleverClient;
	}

	public Double getMontantEpargne() {
		return montantEpargne;
	}

	public void setMontantEpargne(Double montantEpargne) {
		this.montantEpargne = montantEpargne;
	}

	public Double getMontantNetRMAWATANYA() {
		return montantNetRMAWATANYA;
	}

	public void setMontantNetRMAWATANYA(Double montantNetRMAWATANYA) {
		this.montantNetRMAWATANYA = montantNetRMAWATANYA;
	}

	public Double getMontantStandard() {
		return montantStandard;
	}

	public void setMontantStandard(Double montantStandard) {
		this.montantStandard = montantStandard;
	}

	public String getNumeroRIBClientTire() {
		return numeroRIBClientTire;
	}

	public void setNumeroRIBClientTire(String numeroRIBClientTire) {
		this.numeroRIBClientTire = numeroRIBClientTire;
	}

	public String getTypeProduitChoisi() {
		return typeProduitChoisi;
	}

	public void setTypeProduitChoisi(String typeProduitChoisi) {
		this.typeProduitChoisi = typeProduitChoisi;
	}

	public Collection getTypesProduits() {
		return typesProduits;
	}

	public void setTypesProduits(Collection typesProduits) {
		this.typesProduits = typesProduits;
	}

	public boolean isParamMeg() {
		return paramMeg;
	}

	public void setParamMeg(boolean paramMeg) {
		this.paramMeg = paramMeg;
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

	
	
	
}