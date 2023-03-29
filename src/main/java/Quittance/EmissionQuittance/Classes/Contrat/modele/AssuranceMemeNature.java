package Quittance.EmissionQuittance.Classes.Contrat.modele;

import com.rmawatanya.convergence.utile.referentiel.CompagnieAssurance;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

/**
 * Contient les informations sur la compagnie d'assurance ayant un contrat de
 * m�me nature que le contrat en cours
 * @author elfaramo
 *
 */
public class AssuranceMemeNature implements IEntite {

	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 1L;
	
	private long id;
	
	private double sommeAssuree;
	
	private CompagnieAssurance refCompagnie;
	
	private Contrat refContrat;

	@Override
	public long getId() {
		return this.id;
	}

	@Override
	public void setId(long id) {
		this.id = id;
		
	}

	@Override
	public EntiteFactory getFactory() {
		return null;
	}

	public double getSommeAssuree() {
		return sommeAssuree;
	}

	public void setSommeAssuree(double sommeAssuree) {
		this.sommeAssuree = sommeAssuree;
	}

	public CompagnieAssurance getRefCompagnie() {
		return refCompagnie;
	}

	public void setRefCompagnie(CompagnieAssurance refCompagnie) {
		this.refCompagnie = refCompagnie;
	}

	public Contrat getRefContrat() {
		return refContrat;
	}

	public void setRefContrat(Contrat refContrat) {
		this.refContrat = refContrat;
	}

}
