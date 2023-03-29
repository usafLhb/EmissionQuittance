package Quittance.EmissionQuittance.Classes.referentiel;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class TypeService extends ParametrageBO implements IEntite {
	private long id;
	private Integer code;
	private String libelle;

//	private Collection prestataireService;
	public TypeService() {

	}

	public long getId() {
		return id;
	}

	public void setId(long aId) {
		id = aId;
	}

	public Integer getCode() 
	   {
	      return code;
	   }
	public void setCode(Integer code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}
	public String getDescription() {
		return code + " - " + libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

//	public Collection getPrestataireService() {
//		return prestataireService;
//	}
//
//	public void setPrestataireService(Collection prestataireService) {
//		this.prestataireService = prestataireService;
//	}

}