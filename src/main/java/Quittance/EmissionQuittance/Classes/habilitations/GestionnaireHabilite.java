package Quittance.EmissionQuittance.Classes.habilitations;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class GestionnaireHabilite implements IEntite {

	private long id;
	private Utilisateur refUtilisateur;
	private Utilisateur refGestionnaire;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Utilisateur getRefUtilisateur() {
		return refUtilisateur;
	}

	public void setRefUtilisateur(Utilisateur refUtilisateur) {
		this.refUtilisateur = refUtilisateur;
	}

	public Utilisateur getRefGestionnaire() {
		return refGestionnaire;
	}

	public void setRefGestionnaire(Utilisateur refGestionnaire) {
		this.refGestionnaire = refGestionnaire;
	}

	public EntiteFactory getFactory() {
		return null;
	}

}
