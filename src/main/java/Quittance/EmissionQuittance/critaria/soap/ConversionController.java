package Quittance.EmissionQuittance.critaria.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import java.math.BigDecimal;
import java.math.BigInteger;

@RestController
public class ConversionController {

//    private final NumberConversionSoapService soapService;
//
//    @Autowired
//    public ConversionController(NumberConversionSoapService soapService, WebServiceTemplate webServiceTemplate) {
//        this.soapService = soapService;
//    }
//
//    @GetMapping("/numberToWords")
//    public String numberToWords(@RequestParam BigInteger number) {
//        return soapService.numberToWords(number);
//    }
//
//    @GetMapping("/numberToDollars")
//    public String numberToDollars2(@RequestParam BigDecimal number) {
//        return soapService.numberToDollars(number);
//    }
//






}
