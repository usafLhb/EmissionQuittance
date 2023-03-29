package Quittance.EmissionQuittance.Classes.Prelevements.modele;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;


public class EnregistrementRejetCotisation implements IEntite 
	{
	   private long id;
	   private String enregistrement;
	   private Integer numeroEnregistrement;
	   private String motifRejet;
	   private OperationIntegrationCotisation refOperationIntegrationCotisation;
	
	   
	   public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEnregistrement() {
		return enregistrement;
	}
	public void setEnregistrement(String enregistrement) {
		this.enregistrement = enregistrement;
	}
	public Integer getNumeroEnregistrement() {
		return numeroEnregistrement;
	}
	public void setNumeroEnregistrement(Integer numeroEnregistrement) {
		this.numeroEnregistrement = numeroEnregistrement;
	}
	public String getMotifRejet() {
		return motifRejet;
	}
	public void setMotifRejet(String motifRejet) {
		this.motifRejet = motifRejet;
	}
	public OperationIntegrationCotisation getRefOperationIntegrationCotisation() {
		return refOperationIntegrationCotisation;
	}
	public void setRefOperationIntegrationCotisation(
			OperationIntegrationCotisation refOperationIntegrationCotisation) {
		this.refOperationIntegrationCotisation = refOperationIntegrationCotisation;
	}
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}
	   
	}
