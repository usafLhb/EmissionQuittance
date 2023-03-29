/**
 * 
 */
package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.List;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;
import ma.co.omnidata.framework.services.historique.HistoryItem;

/**
 * @author Ayouch
 * 
 */
public class BienAT extends BienAssure implements IEntite {

	private String typeEmploye;

	public BienAT() {
		super();
		ojbConcreteClass = BienAT.class.getName();
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

	

	public String getTypeEmploye() {
		return typeEmploye;
	}

	public void setTypeEmploye(String typeemploye) {
		this.typeEmploye = typeemploye;
	}

}
