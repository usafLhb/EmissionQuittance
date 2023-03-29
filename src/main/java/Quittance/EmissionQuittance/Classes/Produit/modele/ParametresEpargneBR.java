
package Quittance.EmissionQuittance.Classes.Produit.modele;

import java.util.Calendar;

import ma.co.deltasoft.summerframework.bll.BusinessRule;
import ma.co.deltasoft.summerframework.bll.exception.BusinessRuleNotSatisfiedException;
import ma.co.deltasoft.summerframework.dal.IBusinessObjectManager;
import ma.co.deltasoft.summerframework.dal.dao.BusinessObject;

public class ParametresEpargneBR extends BusinessRule {

	public void validate(BusinessObject bo, IBusinessObjectManager bom,
			String operation, Object request) throws BusinessRuleNotSatisfiedException {

		ParametresEpargne epargne = (ParametresEpargne) bo;
		Calendar dateSysteme= Calendar.getInstance();

		if (operation.equalsIgnoreCase(BusinessRule.INSERT_OPERATION)) {
			if((epargne.getDateDebut() != null)&& epargne.getDateDebut().before(dateSysteme)){
				throw new BusinessRuleNotSatisfiedException("La date d�but doit �tre sup�rieure � la date syst�me !");
			}
			if((epargne.getDateFin() != null)&& epargne.getDateFin().before(dateSysteme)){
				throw new BusinessRuleNotSatisfiedException("La date fin doit �tre sup�rieure � la date syst�me !");
			}
		}
		if((epargne.getDateDebut() != null)&& epargne.getDateFin()!=null){
			if(epargne.getDateDebut().after(epargne.getDateFin())){
				throw new BusinessRuleNotSatisfiedException("La date fin doit �tre sup�rieure � la date d�but !");
			}
		}
	}
		
		
}