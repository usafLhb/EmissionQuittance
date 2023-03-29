/**
 *
 */
package Quittance.EmissionQuittance.Classes.sequence;

import java.util.HashMap;
import java.util.List;

import ma.co.omnidata.framework.services.core.FrameworkConfig;
import ma.co.omnidata.framework.services.core.IServices;
import ma.co.omnidata.framework.services.core.ServicesFactory;
import ma.co.omnidata.framework.services.dao.IPersistenceService;
import ma.co.omnidata.framework.services.dao.ITransaction;
import ma.co.omnidata.framework.services.dao.PersistenceException;
import ma.co.omnidata.framework.services.generateur.IGenerateur;
import ma.co.omnidata.framework.services.validation.impl.ValidationUnitaireInit;

import org.apache.commons.lang.StringUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rmawatanya.convergence.application.utile.AppliConstantes;

/**
 * @author Mamraoui
 *
 */
public class SequenceGenerator implements IGenerateur {

	private static final int DEFAULT_CARDINAL = 5;

	@Override
	public Object generer(HashMap map) {

		IPersistenceService dao = (IPersistenceService) ServicesFactory.getService(IPersistenceService.class);
		ITransaction tl = (ITransaction) ServicesFactory.getService(ITransaction.class);

		String octSequence = null;

		// recuperer les diferenes attributs � partir de la hashmap
		String distributorCode = map.get(AppliConstantes.DISTRIBUTOR_CODE).toString();
		String sequenceKey = map.get(AppliConstantes.SEQUENCE_KEY).toString();

		try {

			Object session = dao.getSession();
			long trxId = dao.beginTransaction(session);
			tl.setSession(session);
			tl.setTrxId(trxId);

			octSequence = orderSequence(distributorCode, sequenceKey, dao, tl);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return octSequence;

	}
	public Object genererWithoutSynchronized(HashMap map) {

		IPersistenceService dao = (IPersistenceService) ServicesFactory.getService(IPersistenceService.class);
		ITransaction tl = (ITransaction) ServicesFactory.getService(ITransaction.class);

		String octSequence = null;

		// recuperer les diferenes attributs � partir de la hashmap
		String distributorCode = map.get(AppliConstantes.DISTRIBUTOR_CODE).toString();
		String sequenceKey = map.get(AppliConstantes.SEQUENCE_KEY).toString();

		try {

			Object session = dao.getSession();
			long trxId = dao.beginTransaction(session);
			tl.setSession(session);
			tl.setTrxId(trxId);

			octSequence = orderSequenceWithoutSynchronized(distributorCode, sequenceKey, dao, tl);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return octSequence;

	}

	private synchronized static String orderSequence(String distributorCode, String sequenceKey, IPersistenceService dao, ITransaction trx) {
		int i = 0;
		try {
			SequenceValue sv = newSequenceValue(distributorCode, sequenceKey, dao, 0, true);
			i = getSequenceNextValue(sv);
			dao.modifyObject(sv);
			//dao.commitTransaction(trx.getTrxId(), trx.getSession());
			//dao.releaseSession(trx.getSession());
		} catch (Exception e) {
			e.printStackTrace();
			try {
				dao.rollbackTransaction(trx.getTrxId(), trx.getSession());
				dao.releaseSession(trx.getSession());
			} catch (PersistenceException e1) {
				e1.printStackTrace();
			}

		}
		String octSequence = sequenceKey + StringUtils.leftPad(String.valueOf(i), 6, '0');

		return octSequence;

	}
	public Object genererRefExterneClient(HashMap map) {

		IPersistenceService dao = (IPersistenceService) ServicesFactory.getService(IPersistenceService.class);
		ITransaction tl = (ITransaction) ServicesFactory.getService(ITransaction.class);

		String octSequence = null;

		// recuperer les diferenes attributs � partir de la hashmap
		String distributorCode = map.get(AppliConstantes.DISTRIBUTOR_CODE).toString();
		String sequenceKey = map.get(AppliConstantes.SEQUENCE_KEY).toString();
		Integer sequenceCardinal=(Integer) map.get(AppliConstantes.SEQUENCE_NUMBER_ELEMENTS_AFTER_KEY);
		if(sequenceCardinal==null){
			sequenceCardinal=DEFAULT_CARDINAL;
		}

		try {

			Object session = dao.getSession();
			long trxId = dao.beginTransaction(session);
			tl.setSession(session);
			tl.setTrxId(trxId);

			octSequence = orderSequenceRefExterneClient(distributorCode, sequenceKey,sequenceCardinal, dao, tl);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return octSequence;

	}
	private synchronized static String orderSequenceRefExterneClient(String distributorCode, String sequenceKey,Integer sequenceCardinal, IPersistenceService dao, ITransaction trx) {
		int i = 0;
		try {
			SequenceValue sv = newSequenceValue(distributorCode, sequenceKey, dao, 0, true);
			i = getSequenceNextValue(sv);
			dao.modifyObject(sv);
			//dao.commitTransaction(trx.getTrxId(), trx.getSession());
			//dao.releaseSession(trx.getSession());
		} catch (Exception e) {
			e.printStackTrace();
			try {
				dao.rollbackTransaction(trx.getTrxId(), trx.getSession());
				dao.releaseSession(trx.getSession());
			} catch (PersistenceException e1) {
				e1.printStackTrace();
			}

		}
		String octSequence = sequenceKey + StringUtils.leftPad(String.valueOf(i), sequenceCardinal, '0');

		return octSequence;

	}
	private static String orderSequenceWithoutSynchronized(String distributorCode, String sequenceKey, IPersistenceService dao,
			ITransaction trx) {
		int i = 0;
		try {
			SequenceValue sv = newSequenceValue(distributorCode, sequenceKey, dao, 0, true);
			i = getSequenceNextValue(sv);
			dao.updateObject(sv);
			// dao.commitTransaction(trx.getTrxId(), trx.getSession());
			// dao.releaseSession(trx.getSession());

		} catch (Exception e) {
			e.printStackTrace();
			try {
				dao.rollbackTransaction(trx.getTrxId(), trx.getSession());
				dao.releaseSession(trx.getSession());
			} catch (PersistenceException e1) {
				e1.printStackTrace();
			}

		}
		String octSequence = sequenceKey + StringUtils.leftPad(String.valueOf(i), 6, '0');

		return octSequence;

	}

	public static int getSequenceNextValue(SequenceValue sv) {
		sv.setValue(sv.getValue() + sv.getDistributor().getIncrementBy());
		return sv.getValue();
	}

	private static SequenceValue newSequenceValue(String distributorCode, String sequenceKey, IPersistenceService dao, long trxId,
			boolean firstTime) throws Exception {

		StringBuffer sb = new StringBuffer();

		sb.append("select * from SEQUENCE_DISTRIBUTOR where code ='").append(distributorCode).append("'");

		SequenceDistributor sd = new SequenceDistributor();
		List result=null;
		result =  (List) dao.executeSqlQuery(SequenceDistributor.class, sb.toString());
		sd = (SequenceDistributor)result.get(0);
		SequenceValue sv = new SequenceValue();
		sv.setKey(sequenceKey);

		sb = new StringBuffer();
		sb.append("select * from SEQUENCE_VALUE where key ='").append(sv.getKey()).append("'").append(" and DISTRIBUTOR_CODE='").append(distributorCode);
		sb.append("' for update");

		result= (List) dao.executeSqlQuery(SequenceValue.class, sb.toString());
		Object svClone =null;
		if( !result.isEmpty() && result != null ){
			 svClone = result.get(0);
		}


		if (svClone != null) {
			return (SequenceValue) svClone;
		} else {
			try {

				sv.setDistributor(sd);
				sv.setOIDDistributor(sd.getCode());
				sv.setValue(sd.getStartWith() - sd.getIncrementBy());
				sv = (SequenceValue) dao.registerObject(sv);
				//dao.createObject(sv);
				result= (List) dao.executeSqlQuery(SequenceValue.class, sb.toString());
				if( !result.isEmpty() && result != null ){
					sv = (SequenceValue) result.get(0);
				}

			} catch (PersistenceException e) {
				if (firstTime)
					newSequenceValue(distributorCode, sequenceKey, dao, trxId, false);
				else
					throw e;
			}
			return sv;
		}
	}

	public static void main(String[] args) {

		System.out.println("Starting up the application -> Begin");

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("services.xml");

		IServices services = (IServices) applicationContext.getBean("services");

		ServicesFactory.services = services;

		// Framework config
		FrameworkConfig config = new FrameworkConfig();
		config.init();

		// Chargement des validations unitaires
		ValidationUnitaireInit initValid = new ValidationUnitaireInit();
		initValid.initialiser();

	}

}
