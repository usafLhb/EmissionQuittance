package Quittance.EmissionQuittance.remise.remiseClasse.remiseClasse;

import Quittance.EmissionQuittance.remise.folder2.IEntiteVO;
import Quittance.EmissionQuittance.remise.folder2.SearchRemisesVO;
import Quittance.EmissionQuittance.remise.remiseClasse.remiseClasse.exceptionRemise.Exception_Exception;
import jakarta.xml.bind.annotation.XmlSeeAlso;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.naming.spi.ObjectFactory;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "http://ws.pub.services.referentiel.devass.eai/", name = "IReferentielDevAssBDCWS")
@XmlSeeAlso({ObjectFactory.class})
public interface IReferentielDevAssBDCWS {

    @WebMethod
    @RequestWrapper(localName = "searchInfosQtcFromBDC", targetNamespace = "http://ws.pub.services.referentiel.devass.eai/", className = "eai.devass.convergence.ws.generated.services.referentiel.SearchInfosQtcFromBDC")
    @ResponseWrapper(localName = "searchInfosQtcFromBDCResponse", targetNamespace = "http://ws.pub.services.referentiel.devass.eai/", className = "eai.devass.convergence.ws.generated.services.referentiel.SearchInfosQtcFromBDCResponse")
    @WebResult(name = "return", targetNamespace = "")
    public  ResultVO searchInfosQtcFromBDC(
            @WebParam(name = "dateDebut", targetNamespace = "")
            java.lang.String dateDebut,
            @WebParam(name = "dateFin", targetNamespace = "")
            java.lang.String dateFin,
            @WebParam(name = "objetVO", targetNamespace = "")
            IEntiteVO objetVO
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "searchRemisesByNature", targetNamespace = "http://ws.pub.services.referentiel.devass.eai/", className = "eai.devass.convergence.ws.generated.services.referentiel.SearchRemisesByNature")
    @ResponseWrapper(localName = "searchRemisesByNatureResponse", targetNamespace = "http://ws.pub.services.referentiel.devass.eai/", className = "eai.devass.convergence.ws.generated.services.referentiel.SearchRemisesByNatureResponse")
    @WebResult(name = "return", targetNamespace = "")
    public  ResultVO searchRemisesByNature(
            @WebParam(name = "objetVO", targetNamespace = "")
             IEntiteVO objetVO
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "createRemise", targetNamespace = "http://ws.pub.services.referentiel.devass.eai/", className = "eai.devass.convergence.ws.generated.services.referentiel.CreateRemise")
    @ResponseWrapper(localName = "createRemiseResponse", targetNamespace = "http://ws.pub.services.referentiel.devass.eai/", className = "eai.devass.convergence.ws.generated.services.referentiel.CreateRemiseResponse")
    @WebResult(name = "return", targetNamespace = "")
    public  ResultVO createRemise(
            @WebParam(name = "entiteVO", targetNamespace = "")
            IEntiteVO entiteVO
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "searchRemises", targetNamespace = "http://ws.pub.services.referentiel.devass.eai/", className = "eai.devass.convergence.ws.generated.services.referentiel.SearchRemises")
    @ResponseWrapper(localName = "searchRemisesResponse", targetNamespace = "http://ws.pub.services.referentiel.devass.eai/", className = "eai.devass.convergence.ws.generated.services.referentiel.SearchRemisesResponse")
    @WebResult(name = "return", targetNamespace = "")
    public  ResultVO searchRemises(
            @WebParam(name = "entiteVO", targetNamespace = "")
            SearchRemisesVO entiteVO
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "synchroniseDossierSinistreAT", targetNamespace = "http://ws.pub.services.referentiel.devass.eai/", className = "eai.devass.convergence.ws.generated.services.referentiel.SynchroniseDossierSinistreAT")
    @ResponseWrapper(localName = "synchroniseDossierSinistreATResponse", targetNamespace = "http://ws.pub.services.referentiel.devass.eai/", className = "eai.devass.convergence.ws.generated.services.referentiel.SynchroniseDossierSinistreATResponse")
    @WebResult(name = "return", targetNamespace = "")
    public  ResultVO synchroniseDossierSinistreAT(
            @WebParam(name = "mapQuery", targetNamespace = "")
             Adapter mapQuery
    ) throws Exception_Exception;
}
