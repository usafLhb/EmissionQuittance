package Quittance.EmissionQuittance.Classes.referentiel;

import java.util.Collection;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class FamilleGarantie extends ParametrageBO implements IEntite {

	private static final long serialVersionUID = 1L;
	private long id;
	private String code;
	private String libelle;
	private Collection refAssocFamilleGarantieGaranties;

	public long getId() {
		return id;
	}

	public void setId(long aId) {
		id = aId;
	}

	public String getDescription() {
		return code + " - " + libelle;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection getRefAssocFamilleGarantieGaranties() {
		return refAssocFamilleGarantieGaranties;
	}

	public void setRefAssocFamilleGarantieGaranties(
			Collection refAssocFamilleGarantieGaranties) {
		this.refAssocFamilleGarantieGaranties = refAssocFamilleGarantieGaranties;
	}

}
