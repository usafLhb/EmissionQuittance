/**
 * 
 */
package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.List;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;
import ma.co.omnidata.framework.services.historique.HistoryItem;

/**
 * @author b.slayki
 * 
 */
public class BienEmploye extends BienAssure implements IEntite {

	private String typeEmploye;

	private String nom;

	private String prenom;

	private String numeroPieceIdentite;

	public BienEmploye() {
		super();
		ojbConcreteClass = BienEmploye.class.getName();
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

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNumeroPieceIdentite() {
		return numeroPieceIdentite;
	}

	public void setNumeroPieceIdentite(String numeropieceidentite) {
		this.numeroPieceIdentite = numeropieceidentite;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTypeEmploye() {
		return typeEmploye;
	}

	public void setTypeEmploye(String typeemploye) {
		this.typeEmploye = typeemploye;
	}

}
