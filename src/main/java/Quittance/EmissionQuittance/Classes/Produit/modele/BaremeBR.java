
package Quittance.EmissionQuittance.Classes.Produit.modele;

import java.util.Calendar;
import java.util.Iterator;

import ma.co.deltasoft.summerframework.bll.BusinessRule;
import ma.co.deltasoft.summerframework.bll.exception.BusinessRuleNotSatisfiedException;
import ma.co.deltasoft.summerframework.dal.IBusinessObjectManager;
import ma.co.deltasoft.summerframework.dal.dao.BusinessObject;

public class BaremeBR extends BusinessRule {

	public void validate(BusinessObject bo, IBusinessObjectManager bom,
			String operation, Object request) throws BusinessRuleNotSatisfiedException {

		Bareme bareme = (Bareme) bo;
		Calendar dateSysteme= Calendar.getInstance();

		if (operation.equalsIgnoreCase(BusinessRule.INSERT_OPERATION)) {
			if((bareme.getDateDebut() != null)&& bareme.getDateDebut().before(dateSysteme)){
				throw new BusinessRuleNotSatisfiedException("La date d�but doit �tre sup�rieure � la date syst�me !");
			}
			if((bareme.getDateFin() != null)&& bareme.getDateFin().before(dateSysteme)){
				throw new BusinessRuleNotSatisfiedException("La date fin doit �tre sup�rieure � la date syst�me !");
			}
		}
		if((bareme.getDateDebut() != null)&& bareme.getDateFin()!=null){
			if(bareme.getDateDebut().after(bareme.getDateFin())){
				throw new BusinessRuleNotSatisfiedException("La date fin doit �tre sup�rieure � la date d�but !");
			}
		}
		
		int nbrEntree = 0;
		if((bareme.getClasseTypeEntree1() != null)&&(!bareme.getClasseTypeEntree1().equalsIgnoreCase(""))){
			if((bareme.getAttributEntree1() == null)||(bareme.getAttributEntree1().equalsIgnoreCase("")))
					throw new BusinessRuleNotSatisfiedException("Veuillez saisir le champs AttributEntree1");
			nbrEntree ++;
		}
		if((bareme.getClasseTypeEntree2() != null)&&(!bareme.getClasseTypeEntree2().equalsIgnoreCase(""))){
			if((bareme.getAttributEntree2() == null)||(bareme.getAttributEntree2().equalsIgnoreCase("")))
					throw new BusinessRuleNotSatisfiedException("Veuillez saisir le champs AttributEntree2");
			nbrEntree ++;
		}
		if((bareme.getClasseTypeEntree3() != null)&&(!bareme.getClasseTypeEntree3().equalsIgnoreCase(""))){
			if((bareme.getAttributEntree3() == null)||(bareme.getAttributEntree3().equalsIgnoreCase("")))
					throw new BusinessRuleNotSatisfiedException("Veuillez saisir le champs AttributEntree3");
			nbrEntree ++;
		}
		if((bareme.getClasseTypeEntree4() != null)&&(!bareme.getClasseTypeEntree4().equalsIgnoreCase(""))){
			if((bareme.getAttributEntree4() == null)||(bareme.getAttributEntree4().equalsIgnoreCase("")))
					throw new BusinessRuleNotSatisfiedException("Veuillez saisir le champs AttributEntree4");
			nbrEntree ++;
		}
		if((bareme.getClasseTypeEntree5() != null)&&(!bareme.getClasseTypeEntree5().equalsIgnoreCase(""))){
			if((bareme.getAttributEntree5() == null)||(bareme.getAttributEntree5().equalsIgnoreCase("")))
					throw new BusinessRuleNotSatisfiedException("Veuillez saisir le champs AttributEntree5");
			nbrEntree ++;
		}
		if((bareme.getClasseTypeEntree6() != null)&&(!bareme.getClasseTypeEntree6().equalsIgnoreCase(""))){
			if((bareme.getAttributEntree6() == null)||(bareme.getAttributEntree6().equalsIgnoreCase("")))
					throw new BusinessRuleNotSatisfiedException("Veuillez saisir le champs AttributEntree6");
			nbrEntree ++;
		}
		if((bareme.getClasseTypeEntree7() != null)&&(!bareme.getClasseTypeEntree7().equalsIgnoreCase(""))){
			if((bareme.getAttributEntree7() == null)||(bareme.getAttributEntree7().equalsIgnoreCase("")))
					throw new BusinessRuleNotSatisfiedException("Veuillez saisir le champs AttributEntree7");
			nbrEntree ++;
		}
		
		if(nbrEntree != bareme.getNombreEntrees().intValue())
			throw new BusinessRuleNotSatisfiedException("La valeur du champs 'nombreEntree' doit �tre �gale au nombre d'attributs saisi !");		
		
		if (bareme.getNombreEntrees().intValue() == 1) {
			if (((bareme.getClasseTypeEntree1() == null) || (bareme.getClasseTypeEntree1().equalsIgnoreCase("")))
					|| ((bareme.getAttributEntree1() == null) || (bareme.getAttributEntree1().equalsIgnoreCase("")))) {
				throw new BusinessRuleNotSatisfiedException(
						"Veuillez saisir les champs classes et attributs 1");
			}
		}else if (bareme.getNombreEntrees().intValue() == 2) {
			if (((bareme.getClasseTypeEntree1() == null) || (bareme.getClasseTypeEntree1().equalsIgnoreCase("")))
					|| ((bareme.getAttributEntree1() == null) || (bareme.getAttributEntree1().equalsIgnoreCase("")))
					|| ((bareme.getClasseTypeEntree2() == null) || (bareme.getClasseTypeEntree2().equalsIgnoreCase("")))
					|| ((bareme.getAttributEntree2() == null) || (bareme.getAttributEntree2().equalsIgnoreCase("")))
					) {
				throw new BusinessRuleNotSatisfiedException(
						"Veuillez saisir les champs classes et attributs 1 et 2");
			}
		}else if (bareme.getNombreEntrees().intValue() == 3) {
			if (((bareme.getClasseTypeEntree1() == null) || (bareme.getClasseTypeEntree1().equalsIgnoreCase("")))
					|| ((bareme.getAttributEntree1() == null) || (bareme.getAttributEntree1().equalsIgnoreCase("")))
					|| ((bareme.getClasseTypeEntree2() == null) || (bareme.getClasseTypeEntree2().equalsIgnoreCase("")))
					|| ((bareme.getAttributEntree2() == null) || (bareme.getAttributEntree2().equalsIgnoreCase("")))
					|| ((bareme.getClasseTypeEntree3() == null) || (bareme.getClasseTypeEntree3().equalsIgnoreCase("")))
					|| ((bareme.getAttributEntree3() == null) || (bareme.getAttributEntree3().equalsIgnoreCase("")))
					) {
				throw new BusinessRuleNotSatisfiedException(
						"Veuillez saisir les champs classes et attributs 1 � 3");
			}
		}else if (bareme.getNombreEntrees().intValue() == 4) {
			if (((bareme.getClasseTypeEntree1() == null) || (bareme.getClasseTypeEntree1().equalsIgnoreCase("")))
					|| ((bareme.getAttributEntree1() == null) || (bareme.getAttributEntree1().equalsIgnoreCase("")))
					|| ((bareme.getClasseTypeEntree2() == null) || (bareme.getClasseTypeEntree2().equalsIgnoreCase("")))
					|| ((bareme.getAttributEntree2() == null) || (bareme.getAttributEntree2().equalsIgnoreCase("")))
					|| ((bareme.getClasseTypeEntree3() == null) || (bareme.getClasseTypeEntree3().equalsIgnoreCase("")))
					|| ((bareme.getAttributEntree3() == null) || (bareme.getAttributEntree3().equalsIgnoreCase("")))
					|| ((bareme.getClasseTypeEntree4() == null) || (bareme.getClasseTypeEntree4().equalsIgnoreCase("")))
					|| ((bareme.getAttributEntree4() == null) || (bareme.getAttributEntree4().equalsIgnoreCase("")))
					) {
				throw new BusinessRuleNotSatisfiedException(
						"Veuillez saisir les champs classes et attributs 1 � 4");
			}
		}else if (bareme.getNombreEntrees().intValue() == 5) {
			if (((bareme.getClasseTypeEntree1() == null) || (bareme.getClasseTypeEntree1().equalsIgnoreCase("")))
					|| ((bareme.getAttributEntree1() == null) || (bareme.getAttributEntree1().equalsIgnoreCase("")))
					|| ((bareme.getClasseTypeEntree2() == null) || (bareme.getClasseTypeEntree2().equalsIgnoreCase("")))
					|| ((bareme.getAttributEntree2() == null) || (bareme.getAttributEntree2().equalsIgnoreCase("")))
					|| ((bareme.getClasseTypeEntree3() == null) || (bareme.getClasseTypeEntree3().equalsIgnoreCase("")))
					|| ((bareme.getAttributEntree3() == null) || (bareme.getAttributEntree3().equalsIgnoreCase("")))
					|| ((bareme.getClasseTypeEntree4() == null) || (bareme.getClasseTypeEntree4().equalsIgnoreCase("")))
					|| ((bareme.getAttributEntree4() == null) || (bareme.getAttributEntree4().equalsIgnoreCase("")))
					|| ((bareme.getClasseTypeEntree5() == null) || (bareme.getClasseTypeEntree5().equalsIgnoreCase("")))
					|| ((bareme.getAttributEntree5() == null) || (bareme.getAttributEntree5().equalsIgnoreCase("")))
					) {
				throw new BusinessRuleNotSatisfiedException(
						"Veuillez saisir les champs classes et attributs 1 � 5");
			}
		}else if (bareme.getNombreEntrees().intValue() == 6) {
			if (((bareme.getClasseTypeEntree1() == null) || (bareme.getClasseTypeEntree1().equalsIgnoreCase("")))
					|| ((bareme.getAttributEntree1() == null) || (bareme.getAttributEntree1().equalsIgnoreCase("")))
					|| ((bareme.getClasseTypeEntree2() == null) || (bareme.getClasseTypeEntree2().equalsIgnoreCase("")))
					|| ((bareme.getAttributEntree2() == null) || (bareme.getAttributEntree2().equalsIgnoreCase("")))
					|| ((bareme.getClasseTypeEntree3() == null) || (bareme.getClasseTypeEntree3().equalsIgnoreCase("")))
					|| ((bareme.getAttributEntree3() == null) || (bareme.getAttributEntree3().equalsIgnoreCase("")))
					|| ((bareme.getClasseTypeEntree4() == null) || (bareme.getClasseTypeEntree4().equalsIgnoreCase("")))
					|| ((bareme.getAttributEntree4() == null) || (bareme.getAttributEntree4().equalsIgnoreCase("")))
					|| ((bareme.getClasseTypeEntree5() == null) || (bareme.getClasseTypeEntree5().equalsIgnoreCase("")))
					|| ((bareme.getAttributEntree5() == null) || (bareme.getAttributEntree5().equalsIgnoreCase("")))
					|| ((bareme.getClasseTypeEntree6() == null) || (bareme.getClasseTypeEntree6().equalsIgnoreCase("")))
					|| ((bareme.getAttributEntree6() == null) || (bareme.getAttributEntree6().equalsIgnoreCase("")))
					) {
				throw new BusinessRuleNotSatisfiedException(
						"Veuillez saisir les champs classes et attributs 1 � 6");
			}
		}else if (bareme.getNombreEntrees().intValue() == 7) {
			if (((bareme.getClasseTypeEntree1() == null) || (bareme.getClasseTypeEntree1().equalsIgnoreCase("")))
					|| ((bareme.getAttributEntree1() == null) || (bareme.getAttributEntree1().equalsIgnoreCase("")))
					|| ((bareme.getClasseTypeEntree2() == null) || (bareme.getClasseTypeEntree2().equalsIgnoreCase("")))
					|| ((bareme.getAttributEntree2() == null) || (bareme.getAttributEntree2().equalsIgnoreCase("")))
					|| ((bareme.getClasseTypeEntree3() == null) || (bareme.getClasseTypeEntree3().equalsIgnoreCase("")))
					|| ((bareme.getAttributEntree3() == null) || (bareme.getAttributEntree3().equalsIgnoreCase("")))
					|| ((bareme.getClasseTypeEntree4() == null) || (bareme.getClasseTypeEntree4().equalsIgnoreCase("")))
					|| ((bareme.getAttributEntree4() == null) || (bareme.getAttributEntree4().equalsIgnoreCase("")))
					|| ((bareme.getClasseTypeEntree5() == null) || (bareme.getClasseTypeEntree5().equalsIgnoreCase("")))
					|| ((bareme.getAttributEntree5() == null) || (bareme.getAttributEntree5().equalsIgnoreCase("")))
					|| ((bareme.getClasseTypeEntree6() == null) || (bareme.getClasseTypeEntree6().equalsIgnoreCase("")))
					|| ((bareme.getAttributEntree6() == null) || (bareme.getAttributEntree6().equalsIgnoreCase("")))
					|| ((bareme.getClasseTypeEntree7() == null) || (bareme.getClasseTypeEntree7().equalsIgnoreCase("")))
					|| ((bareme.getAttributEntree7() == null) || (bareme.getAttributEntree7().equalsIgnoreCase("")))
					) {
				throw new BusinessRuleNotSatisfiedException(
						"Veuillez saisir les champs classes et attributs 1 � 7");
			}
		}
		
		if(bareme.getRefVersionCommercialeProduit() == null)
			throw new BusinessRuleNotSatisfiedException(
					"La version commerciale doit �tre renseign�e !");
		
		if ((bareme.getRefParametresPrevoyance() == null)
				&& (bareme.getRefParametresDommages() == null)
				&& (bareme.getRefAssocProduitTypeBienAssureFamilleGarantie() == null)
				&& (bareme.getRefAssocProduitTypePersonneAssureeFamilleGarantie() == null))
			throw new BusinessRuleNotSatisfiedException(
					"Au moins une des garanties doit �tre renseing�e !");
		
		Iterator iter = bareme.getRefOptions().iterator();
		while(iter.hasNext()){
			Option option = (Option) iter.next();
			if((bareme.getClasseTypeEntree1() != null)&&(!bareme.getClasseTypeEntree1().equalsIgnoreCase(""))){
				if((option.getValeurEntreeMin1() == null)||(option.getValeurEntreeMin1().equalsIgnoreCase(""))
						||(option.getValeurEntreeMax1() == null)||(option.getValeurEntreeMax1().equalsIgnoreCase("")))
						throw new BusinessRuleNotSatisfiedException("Les valeurs saisies de l'option " + option.getLibelle() + " sont incoh�rentes avec le bareme !");
			}
			if((bareme.getClasseTypeEntree2() != null)&&(!bareme.getClasseTypeEntree2().equalsIgnoreCase(""))){
				if((option.getValeurEntreeMin2() == null)||(option.getValeurEntreeMin2().equalsIgnoreCase(""))
						||(option.getValeurEntreeMax2() == null)||(option.getValeurEntreeMax2().equalsIgnoreCase("")))
					throw new BusinessRuleNotSatisfiedException("Les valeurs saisies de l'option " + option.getLibelle() + " sont incoh�rentes avec le bareme !");
			}
			if((bareme.getClasseTypeEntree3() != null)&&(!bareme.getClasseTypeEntree3().equalsIgnoreCase(""))){
				if((option.getValeurEntreeMin3() == null)||(option.getValeurEntreeMin3().equalsIgnoreCase(""))
						||(option.getValeurEntreeMax3() == null)||(option.getValeurEntreeMax3().equalsIgnoreCase("")))
					throw new BusinessRuleNotSatisfiedException("Les valeurs saisies de l'option " + option.getLibelle() + " sont incoh�rentes avec le bareme !");
			}
			if((bareme.getClasseTypeEntree4() != null)&&(!bareme.getClasseTypeEntree4().equalsIgnoreCase(""))){
				if((option.getValeurEntreeMin4() == null)||(option.getValeurEntreeMin4().equalsIgnoreCase(""))
						||(option.getValeurEntreeMax4() == null)||(option.getValeurEntreeMax4().equalsIgnoreCase("")))
					throw new BusinessRuleNotSatisfiedException("Les valeurs saisies de l'option " + option.getLibelle() + " sont incoh�rentes avec le bareme !");
			}
			if((bareme.getClasseTypeEntree5() != null)&&(!bareme.getClasseTypeEntree5().equalsIgnoreCase(""))){
				if((option.getValeurEntreeMin5() == null)||(option.getValeurEntreeMin5().equalsIgnoreCase(""))
						||(option.getValeurEntreeMax5() == null)||(option.getValeurEntreeMax5().equalsIgnoreCase("")))
					throw new BusinessRuleNotSatisfiedException("Les valeurs saisies de l'option " + option.getLibelle() + " sont incoh�rentes avec le bareme !");
			}
			if((bareme.getClasseTypeEntree6() != null)&&(!bareme.getClasseTypeEntree6().equalsIgnoreCase(""))){
				if((option.getValeurEntreeMin6() == null)||(option.getValeurEntreeMin6().equalsIgnoreCase(""))
						||(option.getValeurEntreeMax6() == null)||(option.getValeurEntreeMax6().equalsIgnoreCase("")))
					throw new BusinessRuleNotSatisfiedException("Les valeurs saisies de l'option " + option.getLibelle() + " sont incoh�rentes avec le bareme !");
			}
			if((bareme.getClasseTypeEntree7() != null)&&(!bareme.getClasseTypeEntree7().equalsIgnoreCase(""))){
				if((option.getValeurEntreeMin7() == null)||(option.getValeurEntreeMin7().equalsIgnoreCase(""))
						||(option.getValeurEntreeMax7() == null)||(option.getValeurEntreeMax7().equalsIgnoreCase("")))
					throw new BusinessRuleNotSatisfiedException("Les valeurs saisies de l'option " + option.getLibelle() + " sont incoh�rentes avec le bareme !");
			}
		}

	}
}