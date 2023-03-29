package Quittance.EmissionQuittance.Classes.Prelevements.modele;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

//public class EcheancierPrlOperation
public class EcheancierPrlOperation  implements IEntite
{
	private OperationGenerationPrelevements refOperationGenerationPrelev;
	private EcheancierPrelevement refEcheancierPrelevement;

	public EcheancierPrlOperation(){
	}
	
	public EcheancierPrelevement getRefEcheancierPrelevement() {
		return refEcheancierPrelevement;
	}
	
	public void setRefEcheancierPrelevement(
			EcheancierPrelevement refEcheancierPrelevement) {
		this.refEcheancierPrelevement = refEcheancierPrelevement;
	}
	
	public OperationGenerationPrelevements getRefOperationGenerationPrelev() {
		return refOperationGenerationPrelev;
	}

	public void setRefOperationGenerationPrelev(
			OperationGenerationPrelevements refOperationGenerationPrelev) {
		this.refOperationGenerationPrelev = refOperationGenerationPrelev;
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
