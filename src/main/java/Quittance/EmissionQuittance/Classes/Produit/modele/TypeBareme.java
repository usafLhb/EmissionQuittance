
package Quittance.EmissionQuittance.Classes.Produit.modele;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class TypeBareme  implements IEntite {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private Integer code;
	private Integer afficher;
	private String libelle;
	private String libelleVersionCommerciale;
	private VersionCommercialeProduit refVersionCommercialeProduit;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getLibelleVersionCommerciale() {
		return libelleVersionCommerciale;
	}

	public void setLibelleVersionCommerciale(String libelleVersionCommerciale) {
		this.libelleVersionCommerciale = libelleVersionCommerciale;
	}

	public VersionCommercialeProduit getRefVersionCommercialeProduit() {
		return refVersionCommercialeProduit;
	}

	public void setRefVersionCommercialeProduit(
			VersionCommercialeProduit refVersionCommercialeProduit) {
		this.refVersionCommercialeProduit = refVersionCommercialeProduit;
	}

	public Integer getAfficher() {
		return afficher;
	}

	public void setAfficher(Integer afficher) {
		this.afficher = afficher;
	}

	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

}
