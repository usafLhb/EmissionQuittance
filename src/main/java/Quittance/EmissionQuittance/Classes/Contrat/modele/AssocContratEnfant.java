package Quittance.EmissionQuittance.Classes.Contrat.modele;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class AssocContratEnfant implements IEntite{

private Client refClient;
private Contrat refContrat;


public Contrat getRefContrat() {
	return refContrat;
}
public void setRefContrat(Contrat refContrat) {
	this.refContrat = refContrat;
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
public Client getRefClient() {
	return refClient;
}
public void setRefClient(Client refClient) {
	this.refClient = refClient;
}


}

