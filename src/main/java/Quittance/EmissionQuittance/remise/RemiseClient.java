package Quittance.EmissionQuittance.remise;

import Quittance.EmissionQuittance.remise.folder2.IEntiteVO;
import Quittance.EmissionQuittance.remise.folder2.SearchRemisesVO;
import Quittance.EmissionQuittance.remise.remiseClasse.remiseClasse.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class RemiseClient  {
 /*   private WebServiceTemplate webServiceTemplate;
    private String serviceUrl;

    public RemiseClient(WebServiceTemplate webServiceTemplate, String serviceUrl) {
        this.webServiceTemplate = webServiceTemplate;
        this.serviceUrl = serviceUrl;
    }

    public List<Remise> searchRemises(EntiteVO entiteVO) {
        SearchRemises request = new SearchRemises();
        request.setEntiteVO(entiteVO);

        SearchRemisesResponse response = (SearchRemisesResponse) webServiceTemplate.marshalSendAndReceive(serviceUrl, request);

        return response.getRemises();
    }*/


    public RemisesBancairesVO searchRemiseBcc(String numRemise) throws Exception {

        IReferentielDevAssBDCWS referentielDevAssBDCWS = null;
       // = (IReferentielDevAssBDCWS)ServicesFactory.getService("referentielDevAssBDCWS");
        /*
         * URL url = new
         * URL("http://126.0.100.204/REFERENTIEL/services/referentielDevAssBDC?wsdl");
         * QName qname = new QName("http://ws.impl.services.referentiel.devass.eai/",
         * "ServiceReferentielDevAssBDCWSService"); Service service =
         * Service.create(url, qname); IReferentielDevAssBDCWS referentielDevAssBDCWS =
         * service.getPort(IReferentielDevAssBDCWS.class);
         */

        SearchRemisesVO searchRemisesVO = new SearchRemisesVO();

        String codeService = "W1041";
        // call service
        try {
            ResultVO result = new ResultVO();
            searchRemisesVO.setRemiseBancaire(numRemise);
            searchRemisesVO.setCodeService(codeService);
            result = referentielDevAssBDCWS.searchRemises(searchRemisesVO);
            System.out.println("test OK");
            if (result != null && null != numRemise && !"".equals(numRemise.trim())) {

                if (((Adapter) result.getResult()).getFEntries() != null
                    && ((Adapter) result.getResult()).getFEntries().size() > 0) {
                    RemisesBancairesVO vo = (RemisesBancairesVO) ((Adapter) result.getResult()).getFEntries().get(0)
                            .getFValue();
                    System.out.println("size response :" + ((Adapter) result.getResult()).getFEntries().size());

                    System.out.println(
                            "Remises - code : " + vo.getRemiseBancaire() + " , Stauts : " + vo.getStatutAffectations());
                    System.out.println("RefBordereauxVersement " + vo.getRefBordereauxVersement());
                    System.out.println("BanqueVersement " + vo.getBanqueVersement());
                    System.out.println("importPPR " + vo.getImportPPR());
                    System.out.println("Refbrd " + vo.getRefBordereaux());
                    System.out.println(
                            "natureEncaissement " + vo.getNatureEncaissement() + "\n Client :" + vo.getClient());

                    System.out.println(" *****************************************    ");
                }

            }

            if (result != null && null != numRemise && !"".equals(numRemise.trim())) {
                List<MyEntry> listRemises = (List<MyEntry>) ((Adapter) result.getResult()).getFEntries();

                if (!listRemises.isEmpty()) {
                    return (RemisesBancairesVO) listRemises.get(0).getFValue();

                } else {
                    return null;

                }
            } else {
                return null;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

}
