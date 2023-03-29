package Quittance.EmissionQuittance.Classes.Prestation.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.utile.referentiel.AttestationSinistre;

public class PieceLiquidation implements IEntite {

	private static final long serialVersionUID = 1407263124949836840L;
	private long id;
	private Liquidation refLiquidation;
	private AttestationSinistre refAttestationSinistre;
	private String reference;
	private Integer nombrePages;
	private Calendar dateEtablissement;
	private Calendar dateEnvoi;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Liquidation getRefLiquidation() {
		return refLiquidation;
	}
	public void setRefLiquidation(Liquidation refLiquidation) {
		this.refLiquidation = refLiquidation;
	}
	public AttestationSinistre getRefAttestationSinistre() {
		return refAttestationSinistre;
	}
	public void setRefAttestationSinistre(AttestationSinistre refAttestationSinistre) {
		this.refAttestationSinistre = refAttestationSinistre;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public Integer getNombrePages() {
		return nombrePages;
	}
	public void setNombrePages(Integer nombrePages) {
		this.nombrePages = nombrePages;
	}
	public Calendar getDateEtablissement() {
		return dateEtablissement;
	}
	public void setDateEtablissement(Calendar dateEtablissement) {
		this.dateEtablissement = dateEtablissement;
	}
	public Calendar getDateEnvoi() {
		return dateEnvoi;
	}
	public void setDateEnvoi(Calendar dateEnvoi) {
		this.dateEnvoi = dateEnvoi;
	}
	public EntiteFactory getFactory() {
		return null;
	}

}
