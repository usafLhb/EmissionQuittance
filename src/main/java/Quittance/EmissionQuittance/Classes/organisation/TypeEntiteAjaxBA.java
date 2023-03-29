/**
 * 
 */
package Quittance.EmissionQuittance.Classes.organisation;

import java.util.Collection;
import java.util.Iterator;

import ma.co.deltasoft.parametrage.bll.AjaxAction;
import ma.co.deltasoft.summerframework.dal.IBusinessObjectManager;
import ma.co.deltasoft.summerframework.dal.IQuery;

public class TypeEntiteAjaxBA extends AjaxAction {

	public void doExecute(String ajaxFieldName, String ajaxFieldValue,
			String ajaxTargetFieldName, StringBuffer ajaxXmlOutput,
			IBusinessObjectManager bom) {
		try {
			ajaxXmlOutput.append("<select name=\"" + ajaxTargetFieldName + "\" class=\"small\" onchange=\"ajaxCall('entiteAjaxBA', 'refTypeEntite', 'refEntiteSuperieur');\">");
			ajaxXmlOutput.append("<option value=\"\">*********</option>");

			String query = "SELECT e.* FROM org_typeentite e WHERE e.idsociete=" + ajaxFieldValue;
			IQuery iquery = bom.createNativeQuery(query, TypeEntite.class);
			Collection entities = iquery.getResultList();
			Iterator iter = entities.iterator();
			while(iter.hasNext()){
				TypeEntite entite = (TypeEntite) iter.next();
				ajaxXmlOutput.append("<option value=\"" + entite.getId() + "\">" + entite.getDescription() + "</option>");
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
