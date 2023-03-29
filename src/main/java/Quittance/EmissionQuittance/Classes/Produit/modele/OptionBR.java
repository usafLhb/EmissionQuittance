
package Quittance.EmissionQuittance.Classes.Produit.modele;

import ma.co.deltasoft.summerframework.bll.BusinessRule;
import ma.co.deltasoft.summerframework.bll.exception.BusinessRuleNotSatisfiedException;
import ma.co.deltasoft.summerframework.dal.IBusinessObjectManager;
import ma.co.deltasoft.summerframework.dal.dao.BusinessObject;

public class OptionBR extends BusinessRule {

	public void validate(BusinessObject bo, IBusinessObjectManager bom,
			String operation, Object request) throws BusinessRuleNotSatisfiedException {

		Option option = (Option) bo;
		/*
		if((option.getRefBareme().getClasseTypeEntree1() != null)&&(!option.getRefBareme().getClasseTypeEntree1().equalsIgnoreCase(""))){
			if((option.getValeurEntreeMin1() == null)||(option.getValeurEntreeMin1().equalsIgnoreCase(""))
					||(option.getValeurEntreeMax1() == null)||(option.getValeurEntreeMax1().equalsIgnoreCase("")))
					throw new BusinessRuleNotSatisfiedException("Les valeurs saisie sont incoh�rentes avec le bareme !");
		}
		if((option.getRefBareme().getClasseTypeEntree2() != null)&&(!option.getRefBareme().getClasseTypeEntree2().equalsIgnoreCase(""))){
			if((option.getValeurEntreeMin2() == null)||(option.getValeurEntreeMin2().equalsIgnoreCase(""))
					||(option.getValeurEntreeMax2() == null)||(option.getValeurEntreeMax2().equalsIgnoreCase("")))
					throw new BusinessRuleNotSatisfiedException("Les valeurs saisie sont incoh�rentes avec le bareme !");
		}
		if((option.getRefBareme().getClasseTypeEntree3() != null)&&(!option.getRefBareme().getClasseTypeEntree3().equalsIgnoreCase(""))){
			if((option.getValeurEntreeMin3() == null)||(option.getValeurEntreeMin3().equalsIgnoreCase(""))
					||(option.getValeurEntreeMax3() == null)||(option.getValeurEntreeMax3().equalsIgnoreCase("")))
					throw new BusinessRuleNotSatisfiedException("Les valeurs saisie sont incoh�rentes avec le bareme !");
		}
		if((option.getRefBareme().getClasseTypeEntree4() != null)&&(!option.getRefBareme().getClasseTypeEntree4().equalsIgnoreCase(""))){
			if((option.getValeurEntreeMin4() == null)||(option.getValeurEntreeMin4().equalsIgnoreCase(""))
					||(option.getValeurEntreeMax4() == null)||(option.getValeurEntreeMax4().equalsIgnoreCase("")))
					throw new BusinessRuleNotSatisfiedException("Les valeurs saisie sont incoh�rentes avec le bareme !");
		}
		if((option.getRefBareme().getClasseTypeEntree5() != null)&&(!option.getRefBareme().getClasseTypeEntree5().equalsIgnoreCase(""))){
			if((option.getValeurEntreeMin5() == null)||(option.getValeurEntreeMin5().equalsIgnoreCase(""))
					||(option.getValeurEntreeMax5() == null)||(option.getValeurEntreeMax5().equalsIgnoreCase("")))
					throw new BusinessRuleNotSatisfiedException("Les valeurs saisie sont incoh�rentes avec le bareme !");
		}
		if((option.getRefBareme().getClasseTypeEntree6() != null)&&(!option.getRefBareme().getClasseTypeEntree6().equalsIgnoreCase(""))){
			if((option.getValeurEntreeMin6() == null)||(option.getValeurEntreeMin6().equalsIgnoreCase(""))
					||(option.getValeurEntreeMax6() == null)||(option.getValeurEntreeMax6().equalsIgnoreCase("")))
					throw new BusinessRuleNotSatisfiedException("Les valeurs saisie sont incoh�rentes avec le bareme !");
		}
		if((option.getRefBareme().getClasseTypeEntree7() != null)&&(!option.getRefBareme().getClasseTypeEntree7().equalsIgnoreCase(""))){
			if((option.getValeurEntreeMin7() == null)||(option.getValeurEntreeMin7().equalsIgnoreCase(""))
					||(option.getValeurEntreeMax7() == null)||(option.getValeurEntreeMax7().equalsIgnoreCase("")))
					throw new BusinessRuleNotSatisfiedException("Les valeurs saisie sont incoh�rentes avec le bareme !");
		}
		*/
		if((option.getDateDebut() != null)&& option.getDateFin()!=null){
			if(option.getDateDebut().after(option.getDateFin())){
				throw new BusinessRuleNotSatisfiedException("La date fin doit �tre sup�rieure � la date d�but !");
			}
		}
		
	}

}
