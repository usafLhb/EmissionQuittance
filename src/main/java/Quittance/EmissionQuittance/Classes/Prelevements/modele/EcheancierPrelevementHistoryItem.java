package Quittance.EmissionQuittance.Classes.Prelevements.modele;
 
import java.util.Calendar;
import java.util.Collection;

import ma.co.omnidata.framework.services.historique.HistoryItem;
import ma.co.omnidata.framework.utile.DateUtile;
import ma.co.omnidata.framework.utile.DoubleUtile;

import com.rmawatanya.convergence.application.oct.metier.modele.Client;
import com.rmawatanya.convergence.application.oct.metier.modele.ContratHistoryItem;
import com.rmawatanya.convergence.utile.common.Constantes;
import com.rmawatanya.convergence.utile.referentiel.EvenementPromotion;
import com.rmawatanya.convergence.utile.referentiel.MotifRedressement;
import com.rmawatanya.convergence.utile.referentiel.MotifRejetPrelevement;
import com.rmawatanya.convergence.utile.referentiel.TypeFractionnementPrime;
import com.rmawatanya.convergence.utile.referentiel.TypePeriodiciteCotisation;
import com.rmawatanya.convergence.utile.referentiel.TypePrelevement;

public class EcheancierPrelevementHistoryItem extends HistoryItem
{
   private Calendar dateCreation;
   private String numeroRIBRMAWATANYA;
   private String numeroRIBClientTire;
   private Double montantStandard;
   private Double montantAPreleverClient;
   private Double montantNetRMAWATANYA;
   private Double montantEpargne;   
   private Calendar dateEcheance;
   
   /**
    * cr��, envoy�, rejet�, bloqu� (par le rmawatanya), r�gl�, suspendu
    */
   private String etat;
   private Calendar dateTraitement;
   private Double montantAccessoires;
   private Double montantCommissionApport;
   private Double montantCommissionGestion;
   private Double montantCommissionProductivite;
   private Double montantGestionSurPrime;
   private Double tauxTVA;
   
   /**
    *  0 : en sus, 1 : d�duit
    */
   private Boolean modePrelevement;
   private ContratHistoryItem refContratHistoryItem;
   private Client refClient;
   private TypePrelevement refTypePrelevement;
   private MotifRejetPrelevement refMotifRejetPrelevement;
   private TypeFractionnementPrime refTypeFractionnementPrime;
   private TypePeriodiciteCotisation refTypePeriodiciteCotisation;
   private MotifRedressement refMotifRedressement;
   private String idContratSource;
   
   public String getIdContratSource() {
	return idContratSource;
}

public void setIdContratSource(String idContratSource) {
	this.idContratSource = idContratSource;
}

public MotifRedressement getRefMotifRedressement() {
	return refMotifRedressement;
}

public void setRefMotifRedressement(MotifRedressement refMotifRedressement) {
	this.refMotifRedressement = refMotifRedressement;
}

private EvenementPromotion refEvenementPromotion;
   private Double montantReduction;
   private String typePromotion;
   private String referencePromotion;
   
 	//uc
	private Collection refPorteFeuillesClient;
	private Double tauxGarantiePlancher ;
	private Double montantGarantiePlancher;
	/**
	 * taux de la taxe parafiscale
	 */
	private Double tauxTaxeParafiscale;
	/**
	 * montant de la taxe parafiscale
	 */
	private Double montantTaxeParafiscale;	
	/**
	 * montant COMMISSION CAT NAT
	 */
	private Double montantCommissionCatnat;
   
   public Collection getRefPorteFeuillesClient() {
		return refPorteFeuillesClient;
	}

	public void setRefPorteFeuillesClient(Collection refPorteFeuillesClient) {
		this.refPorteFeuillesClient = refPorteFeuillesClient;
	}

	public Double getTauxGarantiePlancher() {
		return tauxGarantiePlancher;
	}

	public void setTauxGarantiePlancher(Double tauxGarantiePlancher) {
		this.tauxGarantiePlancher = tauxGarantiePlancher;
	}

	public Double getMontantGarantiePlancher() {
		return montantGarantiePlancher;
	}

	public void setMontantGarantiePlancher(Double montantGarantiePlancher) {
		this.montantGarantiePlancher = montantGarantiePlancher;
	}

public EcheancierPrelevementHistoryItem() 
   {
    
   }
   
   /**
    * Access method for the dateCreation property.
    * 
    * @return   the current value of the dateCreation property
    */
   public Calendar getDateCreation() 
   {
      return dateCreation;
   }
   
   /**
    * Sets the value of the dateCreation property.
    * 
    * @param aDateCreation the new value of the dateCreation property
    */
   public void setDateCreation(Calendar aDateCreation) 
   {
      dateCreation = aDateCreation;
   }
   
   /**
    * Access method for the numeroRIBRMAWATANYA property.
    * 
    * @return   the current value of the numeroRIBRMAWATANYA property
    */
   public String getNumeroRIBRMAWATANYA() 
   {
      return numeroRIBRMAWATANYA;
   }
   
   /**
    * Sets the value of the numeroRIBRMAWATANYA property.
    * 
    * @param aNumeroRIBRMAWATANYA the new value of the numeroRIBRMAWATANYA property
    */
   public void setNumeroRIBRMAWATANYA(String aNumeroRIBRMAWATANYA) 
   {
      numeroRIBRMAWATANYA = aNumeroRIBRMAWATANYA;
   }
   
   /**
    * Access method for the numeroRIBClientTire property.
    * 
    * @return   the current value of the numeroRIBClientTire property
    */
   public String getNumeroRIBClientTire() 
   {
      return numeroRIBClientTire;
   }
   
   /**
    * Sets the value of the numeroRIBClientTire property.
    * 
    * @param aNumeroRIBClientTire the new value of the numeroRIBClientTire property
    */
   public void setNumeroRIBClientTire(String aNumeroRIBClientTire) 
   {
      numeroRIBClientTire = aNumeroRIBClientTire;
   }
   
   /**
    * Access method for the montantStandard property.
    * 
    * @return   the current value of the montantStandard property
    */
   public Double getMontantStandard() 
   {
      return montantStandard;
   }
   
   /**
    * Sets the value of the montantStandard property.
    * 
    * @param aMontantStandard the new value of the montantStandard property
    */
   public void setMontantStandard(Double aMontantStandard) 
   {
      montantStandard = aMontantStandard;
   }
   
   /**
    * Access method for the montantAPreleverClient property.
    * 
    * @return   the current value of the montantAPreleverClient property
    */
   public Double getMontantAPreleverClient() 
   {
      return montantAPreleverClient;
   }
   
   public String getLibelleMontantAPreleverClient() 
   {
      if(montantAPreleverClient == null ) { 
    	  return null;
      }
      
      return DoubleUtile.convertDoubleToString(montantAPreleverClient.doubleValue());
   }
   
   
   /**
    * Sets the value of the montantAPreleverClient property.
    * 
    * @param aMontantAPreleverClient the new value of the montantAPreleverClient property
    */
   public void setMontantAPreleverClient(Double aMontantAPreleverClient) 
   {
      montantAPreleverClient = aMontantAPreleverClient;
   }
   
   /**
    * Access method for the montantNetRMAWATANYA property.
    * 
    * @return   the current value of the montantNetRMAWATANYA property
    */
   public Double getMontantNetRMAWATANYA() 
   {
      return montantNetRMAWATANYA;
   }
   
   /**
    * Sets the value of the montantNetRMAWATANYA property.
    * 
    * @param aMontantNetRMAWATANYA the new value of the montantNetRMAWATANYA property
    */
   public void setMontantNetRMAWATANYA(Double aMontantNetRMAWATANYA) 
   {
      montantNetRMAWATANYA = aMontantNetRMAWATANYA;
   }
   
   /**
    * Access method for the dateEcheance property.
    * 
    * @return   the current value of the dateEcheance property
    */
   public Calendar getDateEcheance() 
   {
      return dateEcheance;
   }
   
   
	public String getLibelleDateEcheance() {
		if(this.dateEcheance == null) { 
			return null;
		}
		else {
			try {
			return DateUtile.calendarToString(dateEcheance);
			}catch(Exception e) {
				return null;
			}
		}
	}
   
   /**
    * Sets the value of the dateEcheance property.
    * 
    * @param aDateEcheance the new value of the dateEcheance property
    */
   public void setDateEcheance(Calendar aDateEcheance) 
   {
      dateEcheance = aDateEcheance;
   }
   
   /**
    * Access method for the etat property.
    * 
    * @return   the current value of the etat property
    */
   public String getEtat() 
   {
      return etat;
   }
   
   public String getLibelleEtat() 
   {
   	  if(Constantes.PRL_ETAT_ECHEANCIER_CREE.equals(etat)) {
   	  	return Constantes.PRL_LIBELLE_ETAT_ECHEANCIER_CREE;
   	  }
   	  if(Constantes.PRL_ETAT_ECHEANCIER_ENVOYE.equals(etat)) {
   	  	return Constantes.PRL_LIBELLE_ETAT_ECHEANCIER_ENVOYE;
   	  }
   	  if(Constantes.PRL_ETAT_ECHEANCIER_REGLE.equals(etat)) {
   	  	return Constantes.PRL_LIBELLE_ETAT_ECHEANCIER_REGLE;
   	  }
   	  if(Constantes.PRL_ETAT_ECHEANCIER_REJETE.equals(etat)) {
   	  	return Constantes.PRL_LIBELLE_ETAT_ECHEANCIER_REJETE;
   	  }
   	  if(Constantes.PRL_ETAT_ECHEANCIER_BLOQUE.equals(etat)) {
   	  	return Constantes.PRL_LIBELLE_ETAT_ECHEANCIER_BLOQUE;
   	  }
   	  if(Constantes.PRL_ETAT_ECHEANCIER_SUSPENDU.equals(etat)) {
   	  	return Constantes.PRL_LIBELLE_ETAT_ECHEANCIER_SUSPENDU;
   	  }
   	  if(Constantes.PRL_ETAT_ECHEANCIER_ANNULE.equals(etat)) {
   	  	return Constantes.PRL_LIBELLE_ETAT_ECHEANCIER_ANNULE;
   	  }
      return null;
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
    * Access method for the dateTraitement property.
    * 
    * @return   the current value of the dateTraitement property
    */
   public Calendar getDateTraitement() 
   {
      return dateTraitement;
   }
   
   /**
    * Sets the value of the dateTraitement property.
    * 
    * @param aDateTraitement the new value of the dateTraitement property
    */
   public void setDateTraitement(Calendar aDateTraitement) 
   {
      dateTraitement = aDateTraitement;
   }
   
   /**
    * Access method for the montantAccessoires property.
    * 
    * @return   the current value of the montantAccessoires property
    */
   public Double getMontantAccessoires() 
   {
      return montantAccessoires;
   }
   
   /**
    * Sets the value of the montantAccessoires property.
    * 
    * @param aMontantAccessoires the new value of the montantAccessoires property
    */
   public void setMontantAccessoires(Double aMontantAccessoires) 
   {
      montantAccessoires = aMontantAccessoires;
   }
   
   /**
    * Access method for the montantCommissionApport property.
    * 
    * @return   the current value of the montantCommissionApport property
    */
   public Double getMontantCommissionApport() 
   {
      return montantCommissionApport;
   }
   
   /**
    * Sets the value of the montantCommissionApport property.
    * 
    * @param aMontantCommissionApport the new value of the montantCommissionApport property
    */
   public void setMontantCommissionApport(Double aMontantCommissionApport) 
   {
      montantCommissionApport = aMontantCommissionApport;
   }
   
   /**
    * Access method for the montantCommissionGestion property.
    * 
    * @return   the current value of the montantCommissionGestion property
    */
   public Double getMontantCommissionGestion() 
   {
      return montantCommissionGestion;
   }
   
   /**
    * Sets the value of the montantCommissionGestion property.
    * 
    * @param aMontantCommissionGestion the new value of the montantCommissionGestion property
    */
   public void setMontantCommissionGestion(Double aMontantCommissionGestion) 
   {
      montantCommissionGestion = aMontantCommissionGestion;
   }
   
   /**
    * Access method for the montantCommissionProductivite property.
    * 
    * @return   the current value of the montantCommissionProductivite property
    */
   public Double getMontantCommissionProductivite() 
   {
      return montantCommissionProductivite;
   }
   
   /**
    * Sets the value of the montantCommissionProductivite property.
    * 
    * @param aMontantCommissionProductivite the new value of the montantCommissionProductivite property
    */
   public void setMontantCommissionProductivite(Double aMontantCommissionProductivite) 
   {
      montantCommissionProductivite = aMontantCommissionProductivite;
   }
   
   /**
    * Access method for the tauxTVA property.
    * 
    * @return   the current value of the tauxTVA property
    */
   public Double getTauxTVA() 
   {
      return tauxTVA;
   }
   
   /**
    * Sets the value of the tauxTVA property.
    * 
    * @param aTauxTVA the new value of the tauxTVA property
    */
   public void setTauxTVA(Double aTauxTVA) 
   {
      tauxTVA = aTauxTVA;
   }
   
   /**
    * Access method for the modePrelevement property.
    * 
    * @return   the current value of the modePrelevement property
    */
   public Boolean getModePrelevement() 
   {
      return modePrelevement;
   }
   
	public String getLibelleModePrelevement() {
		if(this.modePrelevement == null) { 
			return null;
		}
		else {
			if(modePrelevement.booleanValue()) {
				return Constantes.PRL_MODEPRELEVEMENT_DEDUIT;
			}
			else {
				return Constantes.PRL_MODEPRELEVEMENT_ENSUS;
			}
		}
	}

   
   /**
    * Sets the value of the modePrelevement property.
    * 
    * @param aModePrelevement the new value of the modePrelevement property
    */
   public void setModePrelevement(Boolean aModePrelevement) 
   {
      modePrelevement = aModePrelevement;
   }
   
	public ContratHistoryItem getRefContratHistoryItem() {
		return refContratHistoryItem;
	}
	
	public void setRefContratHistoryItem(ContratHistoryItem refContratHistoryItem) {
		this.refContratHistoryItem = refContratHistoryItem;
	}

	public TypePrelevement getRefTypePrelevement() {
		return refTypePrelevement;
	}
	public void setRefTypePrelevement(TypePrelevement refTypePrelevement) {
		this.refTypePrelevement = refTypePrelevement;
	}
   /**
    * Access method for the refMotifRejetPrelevement property.
    * 
    * @return   the current value of the refMotifRejetPrelevement property
    */
   public MotifRejetPrelevement getRefMotifRejetPrelevement() 
   {
      return refMotifRejetPrelevement;
   }
   
   /**
    * Sets the value of the refMotifRejetPrelevement property.
    * 
    * @param aRefMotifRejetPrelevement the new value of the refMotifRejetPrelevement property
    */
   public void setRefMotifRejetPrelevement(MotifRejetPrelevement aRefMotifRejetPrelevement) 
   {
      refMotifRejetPrelevement = aRefMotifRejetPrelevement;
   }
   
   /**
    * Access method for the refTypeFractionnementPrime property.
    * 
    * @return   the current value of the refTypeFractionnementPrime property
    */
   public TypeFractionnementPrime getRefTypeFractionnementPrime() 
   {
      return refTypeFractionnementPrime;
   }
   
   /**
    * Sets the value of the refTypeFractionnementPrime property.
    * 
    * @param aRefTypeFractionnementPrime the new value of the refTypeFractionnementPrime property
    */
   public void setRefTypeFractionnementPrime(TypeFractionnementPrime aRefTypeFractionnementPrime) 
   {
      refTypeFractionnementPrime = aRefTypeFractionnementPrime;
   }
   
   /**
    * Access method for the refTypePeriodiciteCotisation property.
    * 
    * @return   the current value of the refTypePeriodiciteCotisation property
    */
   public TypePeriodiciteCotisation getRefTypePeriodiciteCotisation() 
   {
      return refTypePeriodiciteCotisation;
   }
   
   /**
    * Sets the value of the refTypePeriodiciteCotisation property.
    * 
    * @param aRefTypePeriodiciteCotisation the new value of the refTypePeriodiciteCotisation property
    */
   public void setRefTypePeriodiciteCotisation(TypePeriodiciteCotisation aRefTypePeriodiciteCotisation) 
   {
      refTypePeriodiciteCotisation = aRefTypePeriodiciteCotisation;
   }
   
   public String getCommissions() {
   	double commissions = 0;
   	
   	 if(montantCommissionApport != null) {
   	 	commissions = commissions + montantCommissionApport.doubleValue();
   	 }
   	 
   	 if(montantCommissionGestion != null) {
   	 	commissions = commissions + montantCommissionGestion.doubleValue();
   	 }
   	 
   	 if(montantCommissionProductivite != null) {
   	 	commissions = commissions + montantCommissionProductivite.doubleValue();
   	 }
//	 if(montantGestionSurPrime != null) {
//   		 commissions = commissions + montantGestionSurPrime.doubleValue();
//   	 }
   	 
   	return DoubleUtile.convertDoubleToString(commissions);
   }
   
   public boolean equals(Object o) {   	
	   	if((o != null) && (o instanceof EcheancierPrelevementHistoryItem)){
	   		EcheancierPrelevementHistoryItem e = (EcheancierPrelevementHistoryItem) o;
		   	if(this.getId() == e.getId()) {
		   		return true;
		   	}
	   	}
	   	
	   	return false;   	
   }

public Double getMontantEpargne() {
	return montantEpargne;
}

public void setMontantEpargne(Double montantEpargne) {
	this.montantEpargne = montantEpargne;
}

public EvenementPromotion getRefEvenementPromotion() {
	return refEvenementPromotion;
}

public void setRefEvenementPromotion(EvenementPromotion refEvenementPromotion) {
	this.refEvenementPromotion = refEvenementPromotion;
}

public Double getMontantReduction() {
	return montantReduction;
}

public void setMontantReduction(Double montantReduction) {
	this.montantReduction = montantReduction;
}

public String getTypePromotion() {
	return typePromotion;
}

public void setTypePromotion(String typePromotion) {
	this.typePromotion = typePromotion;
}

public String getReferencePromotion() {
	return referencePromotion;
}

public void setReferencePromotion(String referencePromotion) {
	this.referencePromotion = referencePromotion;
}

public Double getMontantGestionSurPrime() {
	return montantGestionSurPrime;
}

public void setMontantGestionSurPrime(Double montantGestionSurPrime) {
	this.montantGestionSurPrime = montantGestionSurPrime;
}

public Client getRefClient() {
	return refClient;
}

public void setRefClient(Client refClient) {
	this.refClient = refClient;
}
     
/**
 * @return the tauxTaxeParafiscale
 */
public Double getTauxTaxeParafiscale() {
	return tauxTaxeParafiscale;
}

/**
 * @param tauxTaxeParafiscale the tauxTaxeParafiscale to set
 */
public void setTauxTaxeParafiscale(Double tauxTaxeParafiscale) {
	this.tauxTaxeParafiscale = tauxTaxeParafiscale;
}

/**
 * @return the montantCommissionCatnat
 */
public Double getMontantCommissionCatnat() {
	return montantCommissionCatnat;
}

/**
 * @param montantCommissionCatnat the montantCommissionCatnat to set
 */
public void setMontantCommissionCatnat(Double montantCommissionCatnat) {
	this.montantCommissionCatnat = montantCommissionCatnat;
}

public Double getMontantTaxeParafiscale() {
	return montantTaxeParafiscale;
}

public void setMontantTaxeParafiscale(Double montantTaxeParafiscale) {
	this.montantTaxeParafiscale = montantTaxeParafiscale;
}


     
}
