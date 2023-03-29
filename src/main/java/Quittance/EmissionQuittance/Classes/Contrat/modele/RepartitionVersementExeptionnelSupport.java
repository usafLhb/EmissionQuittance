package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.List;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;
import ma.co.omnidata.framework.services.historique.HistoryItem;
import ma.co.omnidata.framework.utile.DoubleUtile;

import com.rmawatanya.convergence.application.oct.metier.valueobjects.OctRepartitionSupportVO;
import com.rmawatanya.convergence.utile.referentiel.Support;

public class RepartitionVersementExeptionnelSupport implements IEntite {
	private long id;
	private Support refSupport;
	private Double pourcentage;
	private VersementExceptionnel refVersementExceptionnel;

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

	public List getHistory() {
		// TODO Auto-generated method stub
		return null;
	}

	public HistoryItem getLastHistoryItem() {
		// TODO Auto-generated method stub
		return null;
	}

	public List getParents() {
		// TODO Auto-generated method stub
		return null;
	}

	public void historiser() {
		// TODO Auto-generated method stub

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

		if (this.refVersementExceptionnel != null) {
			octRepartitionSupportVO.setIdVersementExeptionnel(String
					.valueOf(this.refVersementExceptionnel.getId()));
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

	public VersementExceptionnel getRefVersementExceptionnel() {
		return refVersementExceptionnel;
	}

	public void setRefVersementExceptionnel(
			VersementExceptionnel refVersementExceptionnel) {
		this.refVersementExceptionnel = refVersementExceptionnel;
	}
}