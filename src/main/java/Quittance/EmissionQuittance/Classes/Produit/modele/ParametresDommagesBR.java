
package Quittance.EmissionQuittance.Classes.Produit.modele;

import java.util.Calendar;

import ma.co.deltasoft.summerframework.bll.BusinessRule;
import ma.co.deltasoft.summerframework.bll.exception.BusinessRuleNotSatisfiedException;
import ma.co.deltasoft.summerframework.dal.IBusinessObjectManager;
import ma.co.deltasoft.summerframework.dal.dao.BusinessObject;

public class ParametresDommagesBR extends BusinessRule {

	public void validate(BusinessObject bo, IBusinessObjectManager bom,
			String operation, Object request) throws BusinessRuleNotSatisfiedException {

		ParametresDommages dommages = (ParametresDommages) bo;
		Calendar dateSysteme= Calendar.getInstance();

		if (operation.equalsIgnoreCase(BusinessRule.INSERT_OPERATION)) {
			if((dommages.getDateDebut() != null)&& dommages.getDateDebut().before(dateSysteme)){
				throw new BusinessRuleNotSatisfiedException("La date d�but doit �tre sup�rieure � la date syst�me !");
			}
			if((dommages.getDateFin() != null)&& dommages.getDateFin().before(dateSysteme)){
				throw new BusinessRuleNotSatisfiedException("La date fin doit �tre sup�rieure � la date syst�me !");
			}
		}
		if((dommages.getDateDebut() != null)&& dommages.getDateFin()!=null){
			if(dommages.getDateDebut().after(dommages.getDateFin())){
				throw new BusinessRuleNotSatisfiedException("La date fin doit �tre sup�rieure � la date d�but !");
			}
		}
	}
		
		
}