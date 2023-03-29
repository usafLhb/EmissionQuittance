package Quittance.EmissionQuittance.Classes.Contrat.modele;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;
import ma.co.omnidata.framework.utile.DoubleUtile;

import com.rmawatanya.convergence.application.oct.metier.valueobjects.OctRepartitionSupportVO;
import com.rmawatanya.convergence.utile.referentiel.Support;

public class RepartitionContratSupport implements IEntite {
	private long id;
	private Support refSupport;
	private Double pourcentage;
	private PartieEpargne refPartieEpargne;

	public Support getRefSupport() {
		return refSupport;
	}

	public void setRefSupport(Support refSupport) {
		this.refSupport = refSupport;
	}

	public Double getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(Double pourcentage) {
		this.pourcentage = pourcentage;
	}

	public PartieEpargne getRefPartieEpargne() {
		return refPartieEpargne;
	}

	public void setRefPartieEpargne(PartieEpargne refPartieEpargne) {
		this.refPartieEpargne = refPartieEpargne;
	}

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isToBeRemoved() {
		if (this.pourcentage == null && this.refSupport == null) {
			return true;
		}
		return false;
	}

	public OctRepartitionSupportVO convertToVo() {
		OctRepartitionSupportVO octRepartitionSupportVO = new OctRepartitionSupportVO();
		octRepartitionSupportVO.setId(String.valueOf(this.id));

		if (this.refPartieEpargne != null) {
			octRepartitionSupportVO.setIdPartieEpargne(String
					.valueOf(this.refPartieEpargne.getId()));
		}
		if (this.refSupport != null) {
			octRepartitionSupportVO.setSupport(String.valueOf(this.refSupport
					.getId()));
			octRepartitionSupportVO.setLibelleSupport(this.refSupport
					.getLibelle());
		}
		if (this.pourcentage != null) {
			octRepartitionSupportVO.setPourcentage(DoubleUtile
					.convertDoubleToString(this.pourcentage.doubleValue()));
		}

		return octRepartitionSupportVO;
	}
}