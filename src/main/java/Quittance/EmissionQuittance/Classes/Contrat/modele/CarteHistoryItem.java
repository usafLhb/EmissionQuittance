package Quittance.EmissionQuittance.Classes.Contrat.modele;

import ma.co.omnidata.framework.services.historique.HistoryItem;
import ma.co.omnidata.framework.utile.DoubleUtile;

import com.rmawatanya.convergence.application.oct.metier.valueobjects.OctCarteVO;
import com.rmawatanya.convergence.application.prd.metier.modele.Option;

public class CarteHistoryItem extends HistoryItem {
	private String numero;
	private Option refOption;
	private Double prime;
	private Double surPrime;
	private PartieDommagesHistoryItem refPartieDommagesHistoryItem;
	private Double prixCarte;
	private Double montantUtilisationsFrauduleuse;
	private Double montantTaxeParafiscale;

	public Double getPrixCarte() {
		return prixCarte;
	}

	public void setPrixCarte(Double prixCarte) {
		this.prixCarte = prixCarte;
	}

	public Double getMontantUtilisationsFrauduleuse() {
		return montantUtilisationsFrauduleuse;
	}

	public void setMontantUtilisationsFrauduleuse(Double montantUtilisationsFrauduleuse) {
		this.montantUtilisationsFrauduleuse = montantUtilisationsFrauduleuse;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Option getRefOption() {
		return refOption;
	}

	public void setRefOption(Option refOption) {
		this.refOption = refOption;
	}

	public Double getPrime() {
		return prime;
	}

	public void setPrime(Double prime) {
		this.prime = prime;
	}

	public Double getSurPrime() {
		return surPrime;
	}

	public void setSurPrime(Double surPrime) {
		this.surPrime = surPrime;
	}

	public PartieDommagesHistoryItem getRefPartieDommagesHistoryItem() {
		return refPartieDommagesHistoryItem;
	}

	public void setRefPartieDommagesHistoryItem(PartieDommagesHistoryItem refPartieDommagesHistoryItem) {
		this.refPartieDommagesHistoryItem = refPartieDommagesHistoryItem;
	}

	public Double getMontantTaxeParafiscale() {
		return montantTaxeParafiscale;
	}

	public void setMontantTaxeParafiscale(Double montantTaxeParafiscale) {
		this.montantTaxeParafiscale = montantTaxeParafiscale;
	}

	public OctCarteVO convertToVo() {
		OctCarteVO octCarteVO = new OctCarteVO();
		octCarteVO.setIdCarte(String.valueOf(getId()));
		octCarteVO.setNumeroCarte(this.numero);
		if (this.refOption != null) {
			octCarteVO.setOptionCarte(String.valueOf(this.refOption.getId()));
			octCarteVO.setLibelleOptionCarte(this.refOption.getLibelle());
		}
		if (this.prime != null) {
			octCarteVO.setPrimeCarte(DoubleUtile.convertDoubleToString(this.prime.doubleValue()));
		}
		if (this.surPrime != null) {
			octCarteVO.setSurPrimeCarte(DoubleUtile.convertDoubleToString(this.surPrime.doubleValue()));
		}
		if (this.prixCarte != null) {
			octCarteVO.setPrixCarte(DoubleUtile.convertDoubleToString(this.prixCarte.doubleValue()));
		}
		if (this.montantUtilisationsFrauduleuse != null) {
			octCarteVO.setMontantUtilisationsFrauduleuse(DoubleUtile.convertDoubleToString(this.montantUtilisationsFrauduleuse
					.doubleValue()));
		}
		return octCarteVO;
	}

	public boolean isToBeRemoved() {
		if (this.getCompositeId() == null && this.numero == null && this.refOption == null && this.prime == null && this.surPrime == null
				&& this.prixCarte == null && this.montantUtilisationsFrauduleuse == null) {
			return true;
		}
		return false;
	}

}