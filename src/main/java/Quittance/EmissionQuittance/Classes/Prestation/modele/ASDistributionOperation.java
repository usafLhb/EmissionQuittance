package Quittance.EmissionQuittance.Classes.Prestation.modele;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class ASDistributionOperation implements IEntite{
	
	private OperationDistribution refOperationDistribution;
	
	private Prestation refPrestation;
	
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

	public OperationDistribution getRefOperationDistribution() {
		return refOperationDistribution;
	}

	public void setRefOperationDistribution(
			OperationDistribution refOperationDistribution) {
		this.refOperationDistribution = refOperationDistribution;
	}

	public Prestation getRefPrestation() {
		return refPrestation;
	}

	public void setRefPrestation(Prestation refPrestation) {
		this.refPrestation = refPrestation;
	}
}
