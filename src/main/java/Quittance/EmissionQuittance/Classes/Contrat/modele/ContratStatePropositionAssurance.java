package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import ma.co.omnidata.framework.services.businessInterface.ValidationException;
import ma.co.omnidata.framework.services.core.ServicesFactory;
import ma.co.omnidata.framework.utile.DoubleUtile;

import org.apache.commons.lang.StringUtils;

import com.rmawatanya.convergence.application.oct.metier.manager.ContratManager;
import com.rmawatanya.convergence.application.oct.metier.valueobjects.GarantieDommageVO;
import com.rmawatanya.convergence.application.oct.metier.valueobjects.OctAssureInfoPartiePrevoyanceVO;
import com.rmawatanya.convergence.application.oct.metier.valueobjects.OctContratVO;
import com.rmawatanya.convergence.application.oct.metier.valueobjects.OctPersonneAssureVO;
import com.rmawatanya.convergence.application.utile.AppliConstantes;
import com.rmawatanya.convergence.application.utile.Fonctions;
import com.rmawatanya.convergence.utile.common.Constantes;
import com.rmawatanya.convergence.utile.referentiel.MotifProposition;
import com.rmawatanya.convergence.utile.referentiel.MotifSurprime;
import com.rmawatanya.convergence.utile.sequence.SequenceGenerator;

/**
 * @author MOUHANE
 *  
 */
public class ContratStatePropositionAssurance extends ContratState {

	public void accepter(Contrat contrat,OctContratVO vo) throws Exception {
		PartiePrevoyance partiePrevoyance=new PartiePrevoyance();
		PartieDommages partieDommage =new PartieDommages();
		DecimalFormat df = new DecimalFormat("#.##"); 
		double surprimeTotale =0.0;
		double surprime=0.0;
		double primeTotale=0.0;

		
		if (contrat.getRefVersionCommercialeProduit().getRefProduit() != null && contrat.getRefVersionCommercialeProduit().getRefProduit().getAvecPrimesSeparees() != null && contrat.getRefVersionCommercialeProduit().getRefProduit().getAvecPrimesSeparees().booleanValue()) {
			if(contrat.getRefPartiePrevoyance()!=null ){
					partiePrevoyance= contrat.getRefPartiePrevoyance();
					if (partiePrevoyance != null && partiePrevoyance.getPrimeTotale() == null) {
						throw new Exception("OCT.CONTRAT.TRAITPROPOSITION.PREVOYANCE.PRIMETOTALE.REQUIRED");
					}
			}

			if (contrat.getRefPartieDommages() != null && contrat.getRefPartieDommages().getPrimeTotale() == null) {
				throw new Exception("OCT.CONTRAT.TRAITPROPOSITION.DOMMAGES.PRIMETOTALE.REQUIRED");
			}

		} else if (contrat.getPrimeTotale() == null) {
			throw new Exception("OCT.CONTRAT.TRAITPROPOSITION.PRIMETOTALE.REQUIRED");
		}
		if(contrat.getRefPartieDommages()!=null ){
			partieDommage= contrat.getRefPartieDommages();
			if (partieDommage != null && partieDommage.getPrimeTotale() == null) {
				throw new Exception("OCT.CONTRAT.TRAITPROPOSITION.DOMMAGES.PRIMETOTALE.REQUIRED");
			}
	}
		contrat.setEtat(Constantes.ETAT_CONTRAT_PROPOSITION_ASSURANCE_ACCEPTEE);
		
		if(partiePrevoyance != null && contrat.getRefVersionCommercialeProduit().getRefProduit().getCode() != null && (Constantes.CODE_PRODUIT_SANTE_MONDE).equalsIgnoreCase(contrat.getRefVersionCommercialeProduit().getRefProduit().getCode())){
			if(vo.getSurprimePrevoyance()!=null && !"".equals(vo.getSurprimePrevoyance().trim())){
				surprime=Double.valueOf(vo.getSurprimePrevoyance());
			}else if(vo.getTauxSurprimePrevoyance()!= null && !"".equals(vo.getTauxSurprimePrevoyance().trim())){
				surprime = (partiePrevoyance.getPrimeTotale() * Double.valueOf(vo.getTauxSurprimePrevoyance()))/100;
				contrat.getRefPartiePrevoyance().setTauxSurprime(Double.valueOf(vo.getTauxSurprimePrevoyance()));
			}
			if(partiePrevoyance.getSurprime()!= null){
			surprimeTotale=partiePrevoyance.getSurprime() + surprime ;
			}else{
				surprimeTotale=surprime ;	
			}
			primeTotale=surprimeTotale + partiePrevoyance.getPrime();
			contrat.getRefPartiePrevoyance().setSurprime(Double.valueOf(df.format(surprimeTotale)));
			contrat.getRefPartiePrevoyance().setPrimeTotale(Double.valueOf(df.format(primeTotale)));

			if(vo.getNumeroAuthorisation()!=null && "".equals(vo.getNumeroAuthorisation().trim())){ 
          		// Preparation reference numero authorisation
      			HashMap map = new HashMap();
      			map.put(AppliConstantes.DISTRIBUTOR_CODE, "NAT");

      			map.put(AppliConstantes.SEQUENCE_KEY, "01");
      			SequenceGenerator seq = new SequenceGenerator();
      			String seqnum = (String) seq.generer(map);
      			contrat.setNumeroAuthorisation(seqnum);
              }
			if(vo.getCommentaire() != null && !"".equals(vo.getCommentaire().trim())){
				contrat.setCommentaire(vo.getCommentaire());	
			}
			
		} else if(contrat.getRefProduit().getCode() != null 
				&& Constantes.CODE_PRODUIT_DIT_GP.equals(contrat.getRefProduit().getCode()) ){
			PartiePrevoyanceClient ppcAdherent = null;
			for(PartiePrevoyanceClient ppc : partiePrevoyance.getListPartiesPrevoyanceClient()){
					if(contrat.getRefAdherent().getId() == ppc.getRefClient().getId()){
						ppcAdherent = ppc;
						break;
					}
			}
			if(vo.getTauxSurprimePrevoyance()!= null && !"".equals(vo.getTauxSurprimePrevoyance().trim())){
				surprime = (ppcAdherent.getPrime() * Double.valueOf(vo.getTauxSurprimePrevoyance()))/100;
				contrat.getRefPartiePrevoyance().setTauxSurprime(Double.valueOf(vo.getTauxSurprimePrevoyance()));
				ppcAdherent.setTauxSurprime(contrat.getRefPartiePrevoyance().getTauxSurprime());
			} else if(vo.getSurprimePrevoyance()!=null && !"".equals(vo.getSurprimePrevoyance().trim())){
				surprime=Double.valueOf(vo.getSurprimePrevoyance());

			}
			surprimeTotale=surprime ;	
			primeTotale = surprimeTotale + ppcAdherent.getPrime();
			contrat.getRefPartiePrevoyance().setSurprime(Double.valueOf(df.format(surprimeTotale)));
			contrat.getRefPartiePrevoyance().setPrimeTotale(Double.valueOf(df.format(primeTotale)));
			ppcAdherent.setSurprime(Double.valueOf(df.format(surprimeTotale)));

			if (StringUtils.isBlank(vo.getNumeroAuthorisation())) {
          		// Preparation reference numero authorisation
      			HashMap map = new HashMap();
      			map.put(AppliConstantes.DISTRIBUTOR_CODE, "NAT");

      			map.put(AppliConstantes.SEQUENCE_KEY, "01");
      			SequenceGenerator seq = new SequenceGenerator();
      			String seqnum = (String) seq.generer(map);
      			contrat.setNumeroAuthorisation(seqnum);
              } else {
            	  contrat.setNumeroAuthorisation(vo.getNumeroAuthorisation());
              }
			if(vo.getCommentaire() != null && !"".equals(vo.getCommentaire().trim())){
				contrat.setCommentaire(vo.getCommentaire());	
			}
			
		} else if(partieDommage != null && contrat.getRefVersionCommercialeProduit().getRefProduit().getCode() != null && (Constantes.CODE_PRODUIT_SECURIPRO).equalsIgnoreCase(contrat.getRefVersionCommercialeProduit().getRefProduit().getCode())){
			
			if(vo.getSurprimeDommages()!=null && !"".equals(vo.getSurprimeDommages().trim())){
				surprime=Double.valueOf(vo.getSurprimeDommages());
			}
			if(Fonctions.isNotEmpty(vo.getRefGarantiesChoisies())){
				for (GarantieDommageVO garantieVO : vo.getRefGarantiesChoisies()) {					
					if(Fonctions.isNotEmpty(garantieVO.getSurprime())){
						surprime += Double.parseDouble(garantieVO.getSurprime());
						for (GarantieDommage garantieDommage : partieDommage.getRefGarantiesChoisies()) {
							if(garantieDommage.getId() == Long.parseLong(garantieVO.getId())){								
								garantieDommage.setSurprime(Double.parseDouble(garantieVO.getSurprime()));								
							}
						}
					}
				}
			}
			
			
			if(partieDommage.getSurprime()!= null){
			surprimeTotale=partieDommage.getSurprime() + surprime ;
			}else{
				surprimeTotale=surprime ;	
			}
			primeTotale=surprimeTotale + partieDommage.getPrime();
			contrat.getRefPartieDommages().setSurprime(Double.valueOf(df.format(surprimeTotale)));
			contrat.getRefPartieDommages().setPrimeTotale(Double.valueOf(df.format(primeTotale)));

			if(vo.getNumeroAuthorisation()!=null && !"".equals(vo.getNumeroAuthorisation().trim())){ 
				contrat.setNumeroAuthorisation(vo.getNumeroAuthorisation());
			}
			
			if(vo.getCommentaire() != null && !"".equals(vo.getCommentaire().trim())){
				contrat.setCommentaire(vo.getCommentaire());	
			}
		}
		else if(partiePrevoyance != null && 
				(
					contrat.getRefVersionCommercialeProduit().getRefProduit().getId()==Long.parseLong(Constantes.PRODUIT_CDM_PREVOYANCE)
					||
					Constantes.FAMILLE_PREVOYANCE.contains(contrat.getRefVersionCommercialeProduit().getRefProduit().getCode())
				)){
			if(vo.getSurprimePrevoyance()!=null && !"".equals(vo.getSurprimePrevoyance().trim())){
				surprime=Double.valueOf(vo.getSurprimePrevoyance());
			}else if(vo.getTauxSurprimePrevoyance()!= null && !"".equals(vo.getTauxSurprimePrevoyance().trim())){
				surprime = (partiePrevoyance.getPrimeTotale() * Double.valueOf(vo.getTauxSurprimePrevoyance()))/100;
			}
			if(partiePrevoyance.getSurprime()!= null){
			surprimeTotale=partiePrevoyance.getSurprime() + surprime ;
			}else{
				surprimeTotale=surprime ;	
			}
			
			if(vo.getTauxSurprimePrevoyance()!= null && !"".equals(vo.getTauxSurprimePrevoyance().trim())){
				contrat.getRefPartiePrevoyance().setTauxSurprime(Double.valueOf(vo.getTauxSurprimePrevoyance()));
			}
			primeTotale=surprimeTotale + partiePrevoyance.getPrime();
			contrat.getRefPartiePrevoyance().setSurprime(Double.valueOf(df.format(surprimeTotale)));
			if(contrat.getRefPartiePrevoyance().getComplementPrime() == null) {
				contrat.getRefPartiePrevoyance().setComplementPrime(surprimeTotale);
			} else {
				contrat.getRefPartiePrevoyance().setComplementPrime(contrat.getRefPartiePrevoyance().getComplementPrime() + surprimeTotale);
			}
			contrat.getRefPartiePrevoyance().setPrimeTotale(Double.valueOf(df.format(primeTotale)));
			MotifProposition  mp = new MotifProposition();
			MotifSurprime  ms = new MotifSurprime();
			try {
			mp.setId(Long.parseLong(vo.getMotifProposition()));
			} catch(NumberFormatException e) {
				throw new ValidationException("OCT.CONTRAT.PREVOYANCE.MOTIFPROPOSITION.OBLIGATOIRE");
			}
			try {
			ms.setId(Long.parseLong(vo.getMotifSurprime()));
			} catch(NumberFormatException e) {
				throw new ValidationException("OCT.CONTRAT.PREVOYANCE.MOTIFSURPRIME.OBLIGATOIRE");
			}
			contrat.setRefMotifProposition(mp);
			contrat.setRefMotifSurprime(ms);
			

			ContratManager contratManager = (ContratManager) ServicesFactory.getService(ContratManager.class);
			
			contratManager.reponseVisiteMedicalCDM(vo, contrat);

			if(vo.getNumeroAuthorisation()!=null && !"".equals(vo.getNumeroAuthorisation().trim())){ 
				contrat.setNumeroAuthorisation(vo.getNumeroAuthorisation());
				contrat.setDateAutorisation(Calendar.getInstance());
			}

		}else if(partiePrevoyance != null && contrat.getRefVersionCommercialeProduit().getRefProduit().getCode() != null && ( (Constantes.CODE_PRODUIT_SANTE_MONDE_GP).equalsIgnoreCase(contrat.getRefVersionCommercialeProduit().getRefProduit().getCode())
				|| (Constantes.AMCIND_OR_AMCCONV).contains(contrat.getRefVersionCommercialeProduit().getRefProduit().getCode())) ){

			List<OctAssureInfoPartiePrevoyanceVO> paList = (List<OctAssureInfoPartiePrevoyanceVO>) vo.getTypesPartiePrevoyanceClientPossibles();
			
			for (OctAssureInfoPartiePrevoyanceVO pa : paList) {
				if (null != pa) {
					long idPpc = pa.getId();
					Collection<PartiePrevoyanceClient> ppcList = contrat.getRefPartiePrevoyance().getListPartiesPrevoyanceClient();
					for(PartiePrevoyanceClient ppcAux :ppcList){
						if(ppcAux.getId() == idPpc){
							surprime = 0d;
							if (StringUtils.isNotBlank(pa.getTauxSurprime()) && !pa.getTauxSurprime().equals("0")) {
								surprime = (ppcAux.getPrime() * Double.valueOf(pa
										.getTauxSurprime())) / 100;
								ppcAux.setTauxSurprime(
										Double.valueOf(pa.getTauxSurprime()));
							} else if (StringUtils.isNotBlank(pa.getSurprime()) && !pa.getSurprime().equals("0")) {
								surprime = Double.valueOf(pa.getSurprime());
							} 
							ppcAux.setSurprime(Double.valueOf(df.format(surprime)));
							
							//Setter de la nouvelle prime pour l'affichage ds la JSP
							pa.setSurprime(DoubleUtile.formatterDouble(surprime));
						}
					}
					
				}

			}
			if (StringUtils.isNotBlank(vo.getNumeroAuthorisation())) {
				// Preparation reference numero authorisation
				HashMap map = new HashMap();
				map.put(AppliConstantes.DISTRIBUTOR_CODE, "NAT");

				map.put(AppliConstantes.SEQUENCE_KEY, "01");
				SequenceGenerator seq = new SequenceGenerator();
				String seqnum = (String) seq.generer(map);
				contrat.setNumeroAuthorisation(seqnum);
			}
			if (vo.getCommentaire() != null && !"".equals(vo.getCommentaire().trim())) {
				contrat.setCommentaire(vo.getCommentaire());
			}
			// Calcul de la nouvelle valeur de la prime pour la partiePrevoyance = somme prime des partiePrevoyanceClient
			primeTotale = 0;
			for(PartiePrevoyanceClient ppcAux :contrat.getRefPartiePrevoyance().getListPartiesPrevoyanceClient()){
				if(!ppcAux.getEtat().equals(Constantes.OCT_ETAT_PREVOYANCE_CLIENT_BLOQUE)){
					Double surprimeAux = (ppcAux.getSurprime() != null) ? ppcAux.getSurprime() : 0d;				
					Double primeAux = (ppcAux.getPrime() != null) ? ppcAux.getPrime() : 0d;				
					primeTotale += surprimeAux + primeAux;
					surprimeTotale += surprimeAux;
				}				
			}
			contrat.getRefPartiePrevoyance().setPrimeTotale(Double.valueOf(df.format(primeTotale)));
			contrat.getRefPartiePrevoyance().setSurprime(Double.valueOf(df.format(surprimeTotale)));
		} else {
			if (vo.getNumeroAuthorisation() != null && !"".equals(vo.getNumeroAuthorisation().trim())) {
				contrat.setNumeroAuthorisation(vo.getNumeroAuthorisation());
			}
		}
		
	}
	
	public void ajourner(Contrat contrat) throws ValidationException {
		contrat.setEtat(Constantes.ETAT_CONTRAT_PROPOSITION_ASSURANCE_AJOURNEE);
	}
	
	public void rejeter(Contrat contrat) throws ValidationException {
		contrat.setEtat(Constantes.ETAT_CONTRAT_PROPOSITION_ASSURANCE_REJETEE);
	}
	
	public void annuler(Contrat contrat) throws ValidationException {
		contrat.setEtat(Constantes.ETAT_CONTRAT_PROPOSITION_ASSURANCE_ANNULEE);
		contrat.setEnInstance(false);
	}
	
	public void enregistrerResiliation(Contrat contrat) throws ValidationException {
		throw new ValidationException("OCT.CONTRAT.RESILIATION.STATUSCONTRAT.INVALID");
	}
	
}