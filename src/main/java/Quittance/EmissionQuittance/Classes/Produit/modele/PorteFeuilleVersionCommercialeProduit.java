package Quittance.EmissionQuittance.Classes.Produit.modele;

import java.util.Collection;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.application.technique.habilitation.metier.valueobjects.HABPorteFeuilleVO;

public class PorteFeuilleVersionCommercialeProduit extends ParametrageBO implements IEntite {

	private static final long serialVersionUID = 1L;
	private long id;
	private Integer code;
	private String libelle;
	private Collection refVersionCommercialeProduits;

	public PorteFeuilleVersionCommercialeProduit(){
		
	}

	public String getDescription() {
		return code + " - " + libelle;
	}
	
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

	public String getLibellePorteFeuille() {
		return libelle;
	}

	public void setLibellePorteFeuille(String libelle) {
		this.libelle = libelle;
	}
	
	public Collection getRefVersionCommercialeProduits() {
		return refVersionCommercialeProduits;
	}

	public void setRefVersionCommercialeProduits(
			Collection refVersionCommercialeProduits) {
		this.refVersionCommercialeProduits = refVersionCommercialeProduits;
	}

	public HABPorteFeuilleVO convertToVo() {
		HABPorteFeuilleVO hABPorteFeuilleVO = new HABPorteFeuilleVO();
		hABPorteFeuilleVO.setIdPorteFeuille(String.valueOf(this.id));
		hABPorteFeuilleVO.setLibellePorteFeuille(String.valueOf(this.getLibelle()));
		return hABPorteFeuilleVO;
	}

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}	
}
