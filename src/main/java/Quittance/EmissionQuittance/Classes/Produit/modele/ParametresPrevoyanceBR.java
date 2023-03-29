
package Quittance.EmissionQuittance.Classes.Produit.modele;

import java.util.Calendar;

import ma.co.deltasoft.summerframework.bll.BusinessRule;
import ma.co.deltasoft.summerframework.bll.exception.BusinessRuleNotSatisfiedException;
import ma.co.deltasoft.summerframework.dal.IBusinessObjectManager;
import ma.co.deltasoft.summerframework.dal.dao.BusinessObject;

public class ParametresPrevoyanceBR extends BusinessRule {

	public void validate(BusinessObject bo, IBusinessObjectManager bom,
			String operation, Object request) throws BusinessRuleNotSatisfiedException {

		ParametresPrevoyance prevoyance = (ParametresPrevoyance) bo;
		Calendar dateSysteme= Calendar.getInstance();

		if (operation.equalsIgnoreCase(BusinessRule.INSERT_OPERATION)) {
			if((prevoyance.getDateDebut() != null)&& prevoyance.getDateDebut().before(dateSysteme)){
				throw new BusinessRuleNotSatisfiedException("La date d�but doit �tre sup�rieure � la date syst�me !");
			}
			if((prevoyance.getDateFin() != null)&& prevoyance.getDateFin().before(dateSysteme)){
				throw new BusinessRuleNotSatisfiedException("La date fin doit �tre sup�rieure � la date syst�me !");
			}
		}
		if((prevoyance.getDateDebut() != null)&& prevoyance.getDateFin()!=null){
			if(prevoyance.getDateDebut().after(prevoyance.getDateFin())){
				throw new BusinessRuleNotSatisfiedException("La date fin doit �tre sup�rieure � la date d�but !");
			}
		}
	}
		
		
}