/**
 * 
 */
package Quittance.EmissionQuittance.Classes.habilitations;

import java.util.Collection;
import java.util.Iterator;

import ma.co.deltasoft.parametrage.bll.AjaxAction;
import ma.co.deltasoft.summerframework.dal.IBusinessObjectManager;
import ma.co.deltasoft.summerframework.dal.IQuery;

public class UtilisateurResponsableAjaxBA extends AjaxAction {

	public void doExecute(String ajaxFieldName, String ajaxFieldValue,
			String ajaxTargetFieldName, StringBuffer ajaxXmlOutput,
			IBusinessObjectManager bom) {
		try {
			ajaxXmlOutput.append("<select name=\"" + ajaxTargetFieldName + "\" class=\"small\" onload=\"ajaxCall('utilisateurResponsableAjaxBA', 'refResponsable');\">");
			ajaxXmlOutput.append("<option value=\"\">*********</option>");

			String query = "SELECT * from hab_utilisateur where typeutilisateur in ('1','2')";
			IQuery iquery = bom.createNativeQuery(query, Utilisateur.class);
			Collection entities = iquery.getResultList();
			Iterator iter = entities.iterator();
			while(iter.hasNext()){
				Utilisateur utilisateur = (Utilisateur) iter.next();
				ajaxXmlOutput.append("<option value=\"" + utilisateur.getId() + "\">" + utilisateur.getDescription() + "</option>");
			}
			
			ajaxXmlOutput.append("</select>");
		} catch (Exception e) {

		}
	}

	public void doExecute(String arg0, String arg1, String arg2,
			StringBuffer arg3, IBusinessObjectManager arg4, Object arg5) {
		// TODO Auto-generated method stub
		
	}
}