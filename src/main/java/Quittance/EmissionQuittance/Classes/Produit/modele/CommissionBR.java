/**
 * 
 */
package Quittance.EmissionQuittance.Classes.Produit.modele;

import java.util.Calendar;

import ma.co.deltasoft.summerframework.bll.BusinessRule;
import ma.co.deltasoft.summerframework.bll.exception.BusinessRuleNotSatisfiedException;
import ma.co.deltasoft.summerframework.dal.IBusinessObjectManager;
import ma.co.deltasoft.summerframework.dal.dao.BusinessObject;

/**
 * @author b.slayki
 * 
 */
public class CommissionBR extends BusinessRule {

	public void validate(BusinessObject bo, IBusinessObjectManager bom,
			String operation, Object request) throws BusinessRuleNotSatisfiedException {

		Commission comission = (Commission) bo;
		
		if ((comission.getRefParametresEpargne() == null)
				&& (comission.getRefParametresPrevoyance() == null)
				&& (comission.getRefParametresDommages() == null)){
			throw new BusinessRuleNotSatisfiedException("Au moins une des garanties active !");
			}
		
		Calendar dateSysteme= Calendar.getInstance();
		
		if(operation.equalsIgnoreCase(BusinessRule.INSERT_OPERATION)){
			
			if((comission.getDateDebut() != null)&& comission.getDateDebut().before(dateSysteme)){
				throw new BusinessRuleNotSatisfiedException("La date d�but doit �tre sup�rieure � la date syst�me !");
			}
			
			if((comission.getDateFin() != null)&& comission.getDateFin().before(dateSysteme)){
				throw new BusinessRuleNotSatisfiedException("La date fin doit �tre sup�rieure � la date syst�me !");
			}
		}
		
		if((comission.getDateDebut() != null)&& comission.getDateFin()!=null){
			if(comission.getDateDebut().after(comission.getDateFin())){
				throw new BusinessRuleNotSatisfiedException("La date fin doit �tre sup�rieure � la date d�but !");
			}
		}

	}

}
