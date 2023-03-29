package Quittance.EmissionQuittance.Classes.Prelevements.modele;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.application.oct.metier.modele.Contrat;
import com.rmawatanya.convergence.utile.referentiel.Support;

public class SituationContrat implements IEntite {

	private long id;
	private Double nombreDePart ;
	private Contrat refContrat;
	private Support refSupport;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Contrat getRefContrat() {
		return refContrat;
	}

	public void setRefContrat(Contrat refContrat) {
		this.refContrat = refContrat;
	}

	public Support getRefSupport() {
		return refSupport;
	}

	public void setRefSupport(Support refSupport) {
		this.refSupport = refSupport;
	}

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public Double getNombreDePart() {
		return nombreDePart;
	}

	public void setNombreDePart(Double nombreDePart) {
		this.nombreDePart = nombreDePart;
	}

}
