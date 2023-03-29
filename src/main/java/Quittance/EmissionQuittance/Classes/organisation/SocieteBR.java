/**
 * 
 */
package Quittance.EmissionQuittance.Classes.organisation;

import java.util.Calendar;

import ma.co.deltasoft.summerframework.bll.BusinessRule;
import ma.co.deltasoft.summerframework.bll.exception.BusinessRuleNotSatisfiedException;
import ma.co.deltasoft.summerframework.dal.IBusinessObjectManager;
import ma.co.deltasoft.summerframework.dal.dao.BusinessObject;

/**
 * @author b.slayki
 * 
 */
public class SocieteBR extends BusinessRule {

	public void validate(BusinessObject bo, IBusinessObjectManager bom,
			String operation, Object request) throws BusinessRuleNotSatisfiedException {
		try {
			Societe societe = (Societe) bo;
			Calendar dateSysteme= Calendar.getInstance();
			
			if(operation.equalsIgnoreCase(BusinessRule.INSERT_OPERATION)){
				societe.setDateCreation(dateSysteme);
				
				if((societe.getDateDebut() != null)&& societe.getDateDebut().before(dateSysteme)){
					throw new BusinessRuleNotSatisfiedException("La date d�but doit �tre sup�rieure � la date syst�me !");
				}
				
				if((societe.getDateFin() != null)&& societe.getDateFin().before(dateSysteme)){
					throw new BusinessRuleNotSatisfiedException("La date fin doit �tre sup�rieure � la date syst�me !");
				}
			}
			
			if((societe.getDateDebut() != null)&& societe.getDateFin()!=null){
				if(societe.getDateDebut().after(societe.getDateFin())){
					throw new BusinessRuleNotSatisfiedException("La date fin doit �tre sup�rieure � la date d�but !");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new BusinessRuleNotSatisfiedException(e.getMessage(), e);
		}
	}
}
