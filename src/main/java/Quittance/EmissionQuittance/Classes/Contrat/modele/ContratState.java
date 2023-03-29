package Quittance.EmissionQuittance.Classes.Contrat.modele;


import ma.co.omnidata.framework.services.businessInterface.ValidationException;

import com.rmawatanya.convergence.application.oct.metier.valueobjects.OctContratVO;

/**
 * @author MOUHANE
 *  
 */
public abstract class ContratState 
{
	public void accepter(Contrat contrat,OctContratVO vo) throws Exception {
		throw new ValidationException("OCT.CONTRAT.CHANGETAT.IMPOSSIBLE");
	}
	
	public void rejeter(Contrat contrat) throws ValidationException {
		throw new ValidationException("OCT.CONTRAT.CHANGETAT.IMPOSSIBLE");
	}
	
	public void ajourner(Contrat contrat) throws ValidationException {
		throw new ValidationException("OCT.CONTRAT.CHANGETAT.IMPOSSIBLE");
	}
	
	public void annuler(Contrat contrat) throws ValidationException {
		throw new ValidationException("OCT.CONTRAT.CHANGETAT.IMPOSSIBLE");
	}
	
	public void enregistrerResiliation(Contrat contrat) throws Exception {
		throw new ValidationException("OCT.CONTRAT.CHANGETAT.IMPOSSIBLE");
	}
	
}