package Quittance.EmissionQuittance.Classes.Quittancement.modele;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.application.prl.metier.modele.EcheancierPrelevement;

public class AssocEcheancierQuittance implements IEntite
{
  
	private static final long serialVersionUID = 1L;
   
   private EcheancierPrelevement refEcheancierPrelevement;
   private Quittance refquittance;
  
   public AssocEcheancierQuittance() {
	super();
	// TODO Auto-generated constructor stub
}


   
public EcheancierPrelevement getRefEcheancierPrelevement() {
	return refEcheancierPrelevement;
}



public void setRefEcheancierPrelevement(
		EcheancierPrelevement refEcheancierPrelevement) {
	this.refEcheancierPrelevement = refEcheancierPrelevement;
}



public Quittance getRefquittance() {
	return refquittance;
}



public void setRefquittance(Quittance refquittance) {
	this.refquittance = refquittance;
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