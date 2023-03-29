/**
 * 
 */
package Quittance.EmissionQuittance.Classes.referentiel;
 
import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

/**
 * @author b.slayki
 * 
 */
public class Garantie extends ParametrageBO implements IEntite {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long id;

	private String code;

	private String libelle;
	private String libelle_Ar;
	private String libelleAbrege;
	private String codeComptable;
	
	private Double tauxPrimeCatnat;
	private Double tauxPrimeRCCatnat;
	private Double plafond;
	private TypeGarantie refTypeGarantie;

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

	

	public String getLibelleAbrege() {
		return libelleAbrege;
	}

	public void setLibelleAbrege(String libelleAbrege) {
		this.libelleAbrege = libelleAbrege;
	}

	
	
	public TypeGarantie getRefTypeGarantie() {
		return refTypeGarantie;
	}

	public void setRefTypeGarantie(TypeGarantie refTypeGarantie) {
		this.refTypeGarantie = refTypeGarantie;
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
	/**
	 * @return the taux Prime Catnat a appliquer sur les autres garanties
	 */
	public Double getTauxPrimeCatnat() {
		return tauxPrimeCatnat;
	}

	/**
	 * @param tauxPrimeCatnat the tauxPrimeCatnat to set
	 */
	public void setTauxPrimeCatnat(Double tauxPrimeCatnat) {
		this.tauxPrimeCatnat = tauxPrimeCatnat;
	}

	/**
	 * @return the taux Prime RC Catnat a appliquer sur la garantie RC
	 */
	public Double getTauxPrimeRCCatnat() {
		return tauxPrimeRCCatnat;
	}

	/**
	 * @param tauxPrimeRCCatnat the tauxPrimeRCCatnat to set
	 */
	public void setTauxPrimeRCCatnat(Double tauxPrimeRCCatnat) {
		this.tauxPrimeRCCatnat = tauxPrimeRCCatnat;
	}

	public Double getPlafond() {
		return plafond;
	}

	public void setPlafond(Double plafond) {
		this.plafond = plafond;
	}

	public String getLibelle_Ar() {
		return libelle_Ar;
	}

	public void setLibelle_Ar(String libelle_Ar) {
		this.libelle_Ar = libelle_Ar;
	}
        public String getCodeComptable() {
		return codeComptable;
	}

	public void setCodeComptable(String codeComptable) {
		this.codeComptable = codeComptable;
	}
}
