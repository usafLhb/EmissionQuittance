package Quittance.EmissionQuittance.Classes.Prelevements.modele;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class AssocPortefeuilleAgregation implements IEntite {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PorteFeuilleClient refPorteFeuilleClient;
	private Agregation refAgregation;
	private Double pourcentage;

		
	public Double getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(Double pourcentage) {
		this.pourcentage = pourcentage;
	}

	public PorteFeuilleClient getRefPorteFeuilleClient() {
		return refPorteFeuilleClient;
	}

	public void setRefPorteFeuilleClient(
			PorteFeuilleClient refPorteFeuilleClient) {
		this.refPorteFeuilleClient = refPorteFeuilleClient;
	}

	public Agregation getRefAgregation() {
		return refAgregation;
	}

	public void setRefAgregation(Agregation refAgregation) {
		this.refAgregation = refAgregation;
	}

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setId(long id) {
		// TODO Auto-generated method stub
		
	}

}
