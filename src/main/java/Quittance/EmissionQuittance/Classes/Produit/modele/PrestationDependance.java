package Quittance.EmissionQuittance.Classes.Produit.modele;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.utile.referentiel.Activite;
import com.rmawatanya.convergence.utile.referentiel.Garantie;
import com.rmawatanya.convergence.utile.referentiel.SecteurActivite;
import com.rmawatanya.convergence.utile.referentiel.TypePrestationDommage;

/**
 * class de d�pendance entre prestation dommage et les dependances Par produit 
 * @author Ayouch
 *
 */
public class PrestationDependance implements IEntite {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private TypePrestationDommage idPrestation;
	private Activite idActivite;
	private Garantie idGarantie;
	private TypePrestationDommage idPrestationDep;
	private SecteurActivite idSecteurActivite;
	private Produit idProduit;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public TypePrestationDommage getIdPrestation() {
		return idPrestation;
	}

	public void setIdPrestation(TypePrestationDommage idPrestation) {
		this.idPrestation = idPrestation;
	}

	public Activite getIdActivite() {
		return idActivite;
	}

	public void setIdActivite(Activite idActivite) {
		this.idActivite = idActivite;
	}

	public Garantie getIdGarantie() {
		return idGarantie;
	}

	public void setIdGarantie(Garantie idGarantie) {
		this.idGarantie = idGarantie;
	}

	public TypePrestationDommage getIdPrestationDep() {
		return idPrestationDep;
	}

	public void setIdPrestationDep(TypePrestationDommage idPrestationDep) {
		this.idPrestationDep = idPrestationDep;
	}

	public SecteurActivite getIdSecteurActivite() {
		return idSecteurActivite;
	}

	public void setIdSecteurActivite(SecteurActivite idSecteurActivite) {
		this.idSecteurActivite = idSecteurActivite;
	}

	public Produit getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Produit idProduit) {
		this.idProduit = idProduit;
	}

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public PrestationDependance(long id, TypePrestationDommage idPrestation,
			Activite idActivite, Garantie idGarantie,
			TypePrestationDommage idPrestationDep,
			SecteurActivite idSecteurActivite, Produit idProduit) {
		super();
		this.id = id;
		this.idPrestation = idPrestation;
		this.idActivite = idActivite;
		this.idGarantie = idGarantie;
		this.idPrestationDep = idPrestationDep;
		this.idSecteurActivite = idSecteurActivite;
		this.idProduit = idProduit;
	}

}
