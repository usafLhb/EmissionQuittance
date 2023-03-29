/**
 * 
 */
package Quittance.EmissionQuittance.Classes.organisation;

import java.util.Collection;
import java.util.Iterator;

import ma.co.deltasoft.parametrage.bll.AjaxAction;
import ma.co.deltasoft.summerframework.dal.IBusinessObjectManager;
import ma.co.deltasoft.summerframework.dal.IQuery;

/**
 * @author b.slayki
 * 
 */
public class EntiteAjaxBA extends AjaxAction {

	public void doExecute(String ajaxFieldName, String ajaxFieldValue,
			String ajaxTargetFieldName, StringBuffer ajaxXmlOutput,
			IBusinessObjectManager bom) {
		try {
			
			String query = "SELECT e.* FROM org_typeentite e WHERE e.id=" + ajaxFieldValue;
			IQuery iquery = bom.createNativeQuery(query, TypeEntite.class);
			Collection typeEntities = iquery.getResultList();
			Iterator iter = typeEntities.iterator();
			TypeEntite typeEntite = null;
			while(iter.hasNext()){
				typeEntite = (TypeEntite) iter.next();
				break;
			}
			ajaxXmlOutput.append("<select name=\"" + ajaxTargetFieldName + "\" class=\"small\" >");
			ajaxXmlOutput.append("<option value=\"\">*********</option>");
			
			query = "SELECT e.* FROM org_entite e, org_typeentite te WHERE e.idtypeentite=te.id and te.code>"+typeEntite.getCode()+" and e.idsociete=" + typeEntite.getRefSociete().getId();
			iquery = bom.createNativeQuery(query, Entite.class);
			Collection entities = iquery.getResultList();
			Iterator iterator = entities.iterator();
			while(iterator.hasNext()){
				Entite entite = (Entite) iterator.next();
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
