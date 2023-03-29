package Quittance.EmissionQuittance.Classes.Prestation.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.utile.referentiel.AttestationSinistre;

public class PieceDeclarationDeces implements IEntite {

	private static final long serialVersionUID = -6163287673523188519L;
	
	private long id;
	private DeclarationDeces refDeclaration;
	private AttestationSinistre refAttestationSinistre;
	private String reference;
	private Integer nombrePages;
	private Calendar dateEtablissement;
	private Calendar dateEnvoi;
	private Calendar dateReception;

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public DeclarationDeces getRefDeclaration() {
		return refDeclaration;
	}


	public void setRefDeclaration(DeclarationDeces refDeclaration) {
		this.refDeclaration = refDeclaration;
	}


	public AttestationSinistre getRefAttestationSinistre() {
		return refAttestationSinistre;
	}


	public void setRefAttestationSinistre(AttestationSinistre refAttestationSinistre) {
		this.refAttestationSinistre = refAttestationSinistre;
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


	public Calendar getDateReception() {
		return dateReception;
	}


	public void setDateReception(Calendar dateReception) {
		this.dateReception = dateReception;
	}
	
	
	public String getReference() {
		return reference;
	}


	public void setReference(String reference) {
		this.reference = reference;
	}


	public EntiteFactory getFactory() {
		return null;
	}

}
