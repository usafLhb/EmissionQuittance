/**
 * 
 */
package Quittance.EmissionQuittance.Classes.referentiel;
 
import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;


public class SegmentPF extends ParametrageBO implements IEntite {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long id;

	private String code;

	private String libelle;

	private Double rabais;
	private Double majoration;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public Double getRabais() {
		return rabais;
	}
	public void setRabais(Double rabais) {
		this.rabais = rabais;
	}
	public Double getMajoration() {
		return majoration;
	}
	public void setMajoration(Double majoration) {
		this.majoration = majoration;
	}
	@Override
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
}
