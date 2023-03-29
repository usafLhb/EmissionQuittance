package Quittance.EmissionQuittance.Classes.Prelevements.modele;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.application.oct.metier.modele.PartieDommages;
import com.rmawatanya.convergence.application.oct.metier.modele.PartieEpargne;
import com.rmawatanya.convergence.application.oct.metier.modele.PartiePrevoyance;
import com.rmawatanya.convergence.application.oct.metier.modele.RisqueDommages;
import com.rmawatanya.convergence.application.oct.metier.modele.RisquePrevoyance;
import com.rmawatanya.convergence.utile.referentiel.FamilleGarantie;

public class DetailEcheancierPrelevement implements IEntite
{
   private long id;

   private EcheancierPrelevement refEcheancierPrelevement;
   private FamilleGarantie refFamilleGarantie;
   private RisqueDommages refRisqueDommages;
   private RisquePrevoyance refRisquePrevoyance;
   private PartieEpargne refPartieEpargne;
   private PartiePrevoyance refPartiePrevoyance;
   private PartieDommages refPartieDommages;
   
   private Double prime;
   
   public long getId() 
   {
      return id;
   }
   
   public void setId(long aId) 
   {
      id = aId;
   }
   
	public EcheancierPrelevement getRefEcheancierPrelevement() {
	return refEcheancierPrelevement;
	}

	public void setRefEcheancierPrelevement(
			EcheancierPrelevement refEcheancierPrelevement) {
		this.refEcheancierPrelevement = refEcheancierPrelevement;
	}
	
	public FamilleGarantie getRefFamilleGarantie() {
		return refFamilleGarantie;
	}
	
	public void setRefFamilleGarantie(FamilleGarantie refFamilleGarantie) {
		this.refFamilleGarantie = refFamilleGarantie;
	}
	
	public RisqueDommages getRefRisqueDommages() {
		return refRisqueDommages;
	}
	
	public void setRefRisqueDommages(RisqueDommages refRisqueDommages) {
		this.refRisqueDommages = refRisqueDommages;
	}
	
	public RisquePrevoyance getRefRisquePrevoyance() {
		return refRisquePrevoyance;
	}
	
	public void setRefRisquePrevoyance(RisquePrevoyance refRisquePrevoyance) {
		this.refRisquePrevoyance = refRisquePrevoyance;
	}
	
	public PartieEpargne getRefPartieEpargne() {
		return refPartieEpargne;
	}
	
	public void setRefPartieEpargne(PartieEpargne refPartieEpargne) {
		this.refPartieEpargne = refPartieEpargne;
	}
	
	public PartiePrevoyance getRefPartiePrevoyance() {
		return refPartiePrevoyance;
	}
	
	public void setRefPartiePrevoyance(PartiePrevoyance refPartiePrevoyance) {
		this.refPartiePrevoyance = refPartiePrevoyance;
	}
	
	public PartieDommages getRefPartieDommages() {
		return refPartieDommages;
	}
	
	public void setRefPartieDommages(PartieDommages refPartieDommages) {
		this.refPartieDommages = refPartieDommages;
	}
	
	public Double getPrime() {
		return prime;
	}
	
	public void setPrime(Double prime) {
		this.prime = prime;
	}

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}
}
