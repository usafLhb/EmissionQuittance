
package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;

import ma.co.deltasoft.summerframework.bll.BusinessRule;
import ma.co.deltasoft.summerframework.bll.exception.BusinessRuleNotSatisfiedException;
import ma.co.deltasoft.summerframework.dal.IBusinessObjectManager;
import ma.co.deltasoft.summerframework.dal.dao.BusinessObject;

public class PeriodePromoBR extends BusinessRule {

	public void validate(BusinessObject bo, IBusinessObjectManager bom,
			String operation, Object request) throws BusinessRuleNotSatisfiedException {

		PeriodePromo periodePromo = (PeriodePromo) bo;
		Calendar dateSysteme= Calendar.getInstance();

		if (operation.equalsIgnoreCase(BusinessRule.UPDATE_OPERATION)) {
			if ((periodePromo.getDateDebutPromo() != null)
					&& periodePromo.getDateFinPromo() != null) {
				if (periodePromo.getDateDebutPromo().after(
						periodePromo.getDateFinPromo())) {
					throw new BusinessRuleNotSatisfiedException(
							"La date fin doit �tre sup�rieure � la date d�but !");
				}
			}
		}
	}
}