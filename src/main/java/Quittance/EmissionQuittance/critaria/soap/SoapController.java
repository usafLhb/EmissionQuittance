package Quittance.EmissionQuittance.critaria.soap;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.xml.transform.StringSource;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.namespace.NamespaceContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.math.BigDecimal;
import java.util.Iterator;

@RestController
@RequestMapping("/soap")
public class SoapController {

    @Autowired
    private   WebServiceTemplate webServiceTemplate;
    @Autowired
    private TransformerFactory transformerFactory;



    @GetMapping("/exemple")
    public String  exemple( )   {
        return String.valueOf("number");
    }

    /*    @GetMapping("/numberToDollars")
    public String numberToDollars(@RequestParam BigDecimal number) throws TransformerException, XmlMappingException, IOException {
        System.out.println("hello odsd");
        String soapRequest = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:web=\"http://www.dataaccess.com/webservicesserver/\">\n" +
                "   <soapenv:Header/>\n" +
                "   <soapenv:Body>\n" +
                "      <web:NumberToDollars>\n" +
                "         <web:dNum>" + number + "</web:dNum>\n" +
                "      </web:NumberToDollars>\n" +
                "   </soapenv:Body>\n" +
                "</soapenv:Envelope>";

         String soapAction = "http://www.dataaccess.com/webservicesserver/NumberToDollars";

        Source soapRequestSource = new StreamSource(new ByteArrayInputStream(soapRequest.getBytes()));
        ByteArrayOutputStream soapResponseOutput = new ByteArrayOutputStream();

        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.METHOD, "html");
        transformer.transform(soapRequestSource, new StreamResult(soapResponseOutput));

        String soapResponse = soapResponseOutput.toString();

        return soapResponse;
    }*/


 /*   @GetMapping("/numberToDollars")
    public String numberToDollars(@RequestParam BigDecimal number) {
        try {
            String soapRequest = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:web=\"http://www.dataaccess.com/webservicesserver/\">\n" +
                    "   <soapenv:Header/>\n" +
                    "   <soapenv:Body>\n" +
                    "      <web:NumberToDollars>\n" +
                    "         <web:dNum>" + number + "</web:dNum>\n" +
                    "      </web:NumberToDollars>\n" +
                    "   </soapenv:Body>\n" +
                    "</soapenv:Envelope>";

            String soapAction = "http://www.dataaccess.com/webservicesserver/NumberToDollars";

            Source soapRequestSource = new StreamSource(new ByteArrayInputStream(soapRequest.getBytes()));
            ByteArrayOutputStream soapResponseOutput = new ByteArrayOutputStream();

            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.transform(soapRequestSource, new StreamResult(soapResponseOutput));

            String soapResponse = soapResponseOutput.toString();

            // Parse the SOAP response XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new InputSource(new StringReader(soapResponse)));

            // Print the SOAP response for troubleshooting
            System.out.println(soapResponse);

            // Extract the response value if available
            NodeList valueNodes = document.getElementsByTagName("m:NumberToDollarsResult");
            if (valueNodes != null && valueNodes.getLength() > 0) {
                Node valueNode = valueNodes.item(0);
                String value = valueNode.getTextContent();
                return value;
            } else {
                return "No response value found";
            }


        } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
            // Handle the exceptions
            e.printStackTrace();
            return "Error occurred during SOAP request";
        }
    }
*/



// ...

    @GetMapping("/numberToDollars2")
    public String numberToDollars2(@RequestParam BigDecimal number) {
        try {
            String soapRequest = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:web=\"http://www.dataaccess.com/webservicesserver/\">\n" +
                    "   <soapenv:Header/>\n" +
                    "   <soapenv:Body>\n" +
                    "      <web:NumberToDollars>\n" +
                    "         <web:dNum>" + number + "</web:dNum>\n" +
                    "      </web:NumberToDollars>\n" +
                    "   </soapenv:Body>\n" +
                    "</soapenv:Envelope>";

            String soapAction = "http://www.dataaccess.com/webservicesserver/NumberToDollars";

            Source soapRequestSource = new StreamSource(new ByteArrayInputStream(soapRequest.getBytes()));
            ByteArrayOutputStream soapResponseOutput = new ByteArrayOutputStream();

            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.transform(soapRequestSource, new StreamResult(soapResponseOutput));

            String soapResponse = soapResponseOutput.toString();

            // Print the SOAP response for troubleshooting
            System.out.println(soapResponse);

            // Create an XPath object
            XPathFactory xPathFactory = XPathFactory.newInstance();
            XPath xPath = xPathFactory.newXPath();


            // Define the namespace context
            NamespaceContext namespaceContext = new NamespaceContext() {
                @Override
                public String getNamespaceURI(String prefix) {
                    if ("m".equals(prefix)) {
                        return "http://www.dataaccess.com/webservicesserver/";
                    }
                    return null;
                }


                @Override
                public String getPrefix(String namespaceURI) {
                    throw new UnsupportedOperationException();
                }

                @Override
                public Iterator<String> getPrefixes(String namespaceURI) {
                    throw new UnsupportedOperationException();
                }
            };

            // Set the namespace context for the XPath
            // Set the namespace context for the XPath
            xPath.setNamespaceContext(namespaceContext);

            // Extract the response value using XPath
            String expression = "//m:NumberToDollarsResponse/m:NumberToDollarsResult";

            String value = xPath.evaluate(expression, new InputSource(new StringReader(soapResponse)));
            System.out.println(value);
            if (value != null && !value.isEmpty()) {
                return value;
            } else {
                return "No response value found";
            }
        } catch (TransformerException | XPathExpressionException e) {
            // Handle the exceptions
            e.printStackTrace();
            return "Error occurred during SOAP request";
        }
    }





    @GetMapping("/numberToDollars")
    public String numberToDollars(@RequestParam BigDecimal number) {
        try {
            String soapRequest = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:web=\"http://www.dataaccess.com/webservicesserver/\">\n" +
                    "   <soapenv:Header/>\n" +
                    "   <soapenv:Body>\n" +
                    "      <web:NumberToDollars>\n" +
                    "         <web:dNum>" + number + "</web:dNum>\n" +
                    "      </web:NumberToDollars>\n" +
                    "   </soapenv:Body>\n" +
                    "</soapenv:Envelope>";

            // Set the SOAP action header (optional)
            // messageFactory.setSoapAction("http://www.dataaccess.com/webservicesserver/NumberToDollars");

            // Create a StringSource with the SOAP request
            StringSource requestSource = new StringSource(soapRequest);

            // Create a StreamResult to hold the SOAP response
            ByteArrayOutputStream responseStream = new ByteArrayOutputStream();
            StreamResult responseResult = new StreamResult(responseStream);

            // Set the endpoint URL or URI
            webServiceTemplate.setDefaultUri("http://www.dataaccess.com/webservicesserver/numberconversion.wso");

            // Send the SOAP request and receive the response
            webServiceTemplate.sendSourceAndReceiveToResult(requestSource, responseResult);

            // Get the SOAP response as a string
            String soapResponse = responseStream.toString();

            // Print the SOAP response for troubleshooting
            System.out.println(soapResponse);

            // Parse the SOAP response XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new ByteArrayInputStream(soapResponse.getBytes()));

            // Extract the response value
            NodeList valueNodes = document.getElementsByTagName("m:NumberToDollarsResult");
            if (valueNodes.getLength() > 0) {
                String value = valueNodes.item(0).getTextContent();
                return value;
            } else {
                return "No response value found";
            }
        } catch (ParserConfigurationException | IOException | org.xml.sax.SAXException e) {
            // Handle the exceptions
            e.printStackTrace();
            return "Error occurred during SOAP request";
        }
    }
}






