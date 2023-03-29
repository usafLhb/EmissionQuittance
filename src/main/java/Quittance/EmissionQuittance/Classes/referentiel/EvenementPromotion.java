//Source file: E:\\_Abdel\\Rmawatanya\\CONVERGENCE\\MOD\\ClassesJava\\com\\rmawatanya\\convergence\\utile\\referentiel\\EvenementPromotion.java

package Quittance.EmissionQuittance.Classes.referentiel;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

/**
 * Souscription Renouvellement Versement exceptionnel Cotisations continues
 * pendant une p�riode M (en mois)
 */
public class EvenementPromotion extends ParametrageBO implements IEntite {
	
	private long id;
	private Integer code;
	private String libelle;

	public EvenementPromotion() {

	}
	public long getId() {
		return id;
	}

	public void setId(long aId) {
		id = aId;
	}

	public String getDescription() {
		return code + " - " + libelle;
	}

	/**
	 * Access method for the code property.
	 * 
	 * @return the current value of the code property
	 */
	public Integer getCode() {
		return code;
	}

	/**
	 * Sets the value of the code property.
	 * 
	 * @param aCode
	 *            the new value of the code property
	 */
	public void setCode(Integer aCode) {
		code = aCode;
	}

	/**
	 * Access method for the libelle property.
	 * 
	 * @return the current value of the libelle property
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Sets the value of the libelle property.
	 * 
	 * @param aLibelle
	 *            the new value of the libelle property
	 */
	public void setLibelle(String aLibelle) {
		libelle = aLibelle;
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
}
