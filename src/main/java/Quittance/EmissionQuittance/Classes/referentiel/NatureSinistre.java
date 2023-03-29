package Quittance.EmissionQuittance.Classes.referentiel;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class NatureSinistre extends ParametrageBO implements IEntite {
	
	private long id;
	private Integer code;
	private String libelle;
	private Boolean avecPerteCarte;
	private Boolean avecPertePapiers;
	private Boolean avecTransport;
	private Double montantTotalLimiteGarantie;
	private Double montantUtilisationFrauduleuses;
	private Double montantFraisRemplacement;

	private Double montantCINCSE;
	private Double montantPasseport;
	private Double montantPermisConduire;
	private Double montantCarteGrise;

	public long getId() {
		return id;
	}

	public void setId(long aId) {
		id = aId;
	}

	public String getDescription() {
		return code + " - " + libelle;
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

	public EntiteFactory getFactory() {
		return null;
	}

	public Boolean getAvecPerteCarte() {
		return avecPerteCarte;
	}

	public void setAvecPerteCarte(Boolean avecPerteCarte) {
		this.avecPerteCarte = avecPerteCarte;
	}

	public Boolean getAvecPertePapiers() {
		return avecPertePapiers;
	}

	public void setAvecPertePapiers(Boolean avecPertePapiers) {
		this.avecPertePapiers = avecPertePapiers;
	}

	public Boolean getAvecTransport() {
		return avecTransport;
	}

	public void setAvecTransport(Boolean avecTransport) {
		this.avecTransport = avecTransport;
	}

	public Double getMontantTotalLimiteGarantie() {
		return montantTotalLimiteGarantie;
	}

	public void setMontantTotalLimiteGarantie(Double montantTotalLimiteGarantie) {
		this.montantTotalLimiteGarantie = montantTotalLimiteGarantie;
	}

	public Double getMontantUtilisationFrauduleuses() {
		return montantUtilisationFrauduleuses;
	}

	public void setMontantUtilisationFrauduleuses(
			Double montantUtilisationFrauduleuses) {
		this.montantUtilisationFrauduleuses = montantUtilisationFrauduleuses;
	}

	public Double getMontantFraisRemplacement() {
		return montantFraisRemplacement;
	}

	public void setMontantFraisRemplacement(Double montantFraisRemplacement) {
		this.montantFraisRemplacement = montantFraisRemplacement;
	}

	public Double getMontantCINCSE() {
		return montantCINCSE;
	}

	public void setMontantCINCSE(Double montantCINCSE) {
		this.montantCINCSE = montantCINCSE;
	}

	public Double getMontantPasseport() {
		return montantPasseport;
	}

	public void setMontantPasseport(Double montantPasseport) {
		this.montantPasseport = montantPasseport;
	}

	public Double getMontantPermisConduire() {
		return montantPermisConduire;
	}

	public void setMontantPermisConduire(Double montantPermisConduire) {
		this.montantPermisConduire = montantPermisConduire;
	}

	public Double getMontantCarteGrise() {
		return montantCarteGrise;
	}

	public void setMontantCarteGrise(Double montantCarteGrise) {
		this.montantCarteGrise = montantCarteGrise;
	}
}