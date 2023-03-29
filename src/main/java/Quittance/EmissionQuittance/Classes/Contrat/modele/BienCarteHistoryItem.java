/**
 * 
 */
package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.List;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.historique.HistoryItem;

/**
 * @author b.slayki
 * 
 */
public class BienCarteHistoryItem extends BienAssureHistoryItem{

	private String numeroCarteMonetique;

	public BienCarteHistoryItem() {
		super();
		ojbConcreteClass = BienCarteHistoryItem.class.getName();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ma.co.omnidata.framework.services.historique.IHistorisable#getHistory()
	 */
	public List getHistory() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ma.co.omnidata.framework.services.historique.IHistorisable#getLastHistoryItem()
	 */
	public HistoryItem getLastHistoryItem() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ma.co.omnidata.framework.services.historique.IHistorisable#getParents()
	 */
	public List getParents() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ma.co.omnidata.framework.services.historique.IHistorisable#historiser()
	 */
	public void historiser() {
		// TODO Auto-generated method stub

	}

	public String getNumeroCarteMonetique() {
		return numeroCarteMonetique;
	}

	public void setNumeroCarteMonetique(String numeroCarteMonetique) {
		this.numeroCarteMonetique = numeroCarteMonetique;
	}
}
