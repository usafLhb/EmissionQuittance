package Quittance.EmissionQuittance.Classes.Contrat.modele;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.utile.referentiel.TypeSalarie;

public class CapitalCategorieAdherent implements IEntite{

	/**
	 * Serial version ID
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private	TypeSalarie categorie;
	private Integer nbPersonne;
	private	Double capitalForfaitaire;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
		
	}
	public EntiteFactory getFactory() {
		return null;
	}

	public TypeSalarie getCategorie() {
		return categorie;
	}
	public void setCategorie(TypeSalarie categorie) {
		this.categorie = categorie;
	}
	public Integer getNbPersonne() {
		return nbPersonne;
	}
	public void setNbPersonne(Integer nbPersonne) {
		this.nbPersonne = nbPersonne;
	}
	public Double getCapitalForfaitaire() {
		return capitalForfaitaire;
	}
	public void setCapitalForfaitaire(Double capitalForfaitaire) {
		this.capitalForfaitaire = capitalForfaitaire;
	}
}
