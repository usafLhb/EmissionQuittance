package Quittance.EmissionQuittance.Classes.Prestation.modele;

import java.util.Calendar;
import java.util.Collection;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.utile.habilitations.Utilisateur;

public class OperationDistribution implements IEntite{
	  
	private long id;
	private Calendar dateCreation;
	private Calendar dateTraitement;
	private Calendar dateExecutionOperation;
	private Integer nombreDistributions;
	private Integer exercice; 
	private Collection refDistributions;
	private Utilisateur gestionnaire;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Calendar getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Calendar dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Calendar getDateTraitement() {
		return dateTraitement;
	}
	public void setDateTraitement(Calendar dateTraitement) {
		this.dateTraitement = dateTraitement;
	}
	public Integer getNombreDistributions() {
		return nombreDistributions;
	}
	public void setNombreDistributions(Integer nombreDistributions) {
		this.nombreDistributions = nombreDistributions;
	}
	public Integer getExercice() {
		return exercice;
	}
	public void setExercice(Integer exercice) {
		this.exercice = exercice;
	}
	public Collection getRefDistributions() {
		return refDistributions;
	}
	public void setRefDistributions(Collection refDistributions) {
		this.refDistributions = refDistributions;
	}
	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}
	public Calendar getDateExecutionOperation() {
		return dateExecutionOperation;
	}
	public void setDateExecutionOperation(Calendar dateExecutionOperation) {
		this.dateExecutionOperation = dateExecutionOperation;
	}
	public Utilisateur getGestionnaire() {
		return gestionnaire;
	}
	public void setGestionnaire(Utilisateur gestionnaire) {
		this.gestionnaire = gestionnaire;
	}

}
