package Quittance.EmissionQuittance.Classes.Quittancement.modele;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.application.prl.metier.modele.EcheancierPrelevement;

//public class EcheancierPrlOperation
public class QuittanceEcheancierPrl  implements IEntite
{
	private long idQuittance;
	
	private EcheancierPrelevement refEcheancierPrelevement;

	public QuittanceEcheancierPrl(){
	}
	
    public long getIdOperation() {
		return idQuittance;
	}

	public void setIdOperation(long idOperation) {
		this.idQuittance = idOperation;
	}
	public EcheancierPrelevement getRefEcheancierPrelevement() {
		return refEcheancierPrelevement;
	}
	
	public void setRefEcheancierPrelevement(
			EcheancierPrelevement refEcheancierPrelevement) {
		this.refEcheancierPrelevement = refEcheancierPrelevement;
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
