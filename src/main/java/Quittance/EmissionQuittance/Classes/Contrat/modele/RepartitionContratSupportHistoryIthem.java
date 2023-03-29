package Quittance.EmissionQuittance.Classes.Contrat.modele;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.historique.HistoryItem;
import ma.co.omnidata.framework.utile.DoubleUtile;

import com.rmawatanya.convergence.application.oct.metier.valueobjects.OctRepartitionSupportVO;
import com.rmawatanya.convergence.utile.referentiel.Support;

public class RepartitionContratSupportHistoryIthem extends HistoryItem {
	private Support refSupport;
	private Double pourcentage;
	private PartieEpargneHistoryItem refPartieEpargneHistoryItem;

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

	public PartieEpargneHistoryItem getRefPartieEpargneHistoryItem() {
		return refPartieEpargneHistoryItem;
	}

	public void setRefPartieEpargneHistoryItem(
			PartieEpargneHistoryItem refPartieEpargneHistoryItem) {
		this.refPartieEpargneHistoryItem = refPartieEpargneHistoryItem;
	}

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isToBeRemoved() {
		if (this.pourcentage == null && this.refSupport == null) {
			return true;
		}
		return false;
	}

	public OctRepartitionSupportVO convertToVo() {
		OctRepartitionSupportVO octRepartitionSupportVO = new OctRepartitionSupportVO();
		octRepartitionSupportVO.setId(String.valueOf(this.getId()));

		if (this.refPartieEpargneHistoryItem != null) {
			octRepartitionSupportVO.setIdPartieEpargne(String
					.valueOf(this.refPartieEpargneHistoryItem.getId()));
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