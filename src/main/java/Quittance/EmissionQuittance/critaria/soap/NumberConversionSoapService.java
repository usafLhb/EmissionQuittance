package Quittance.EmissionQuittance.critaria.soap;

import com.quittance.emissionquittance.critaria.soap.NumberConversion;
import com.quittance.emissionquittance.critaria.soap.NumberConversionSoapType;
import jakarta.xml.ws.BindingProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;

@Service
@RequiredArgsConstructor
public class NumberConversionSoapService implements NumberConversionSoapType {

    private   NumberConversionSoapType soapPort;



    @Override
    public String numberToWords(BigInteger ubiNum) {
        return soapPort.numberToWords(ubiNum);
    }

    @Override
    public String numberToDollars(BigDecimal dNum) {
        return soapPort.numberToDollars(dNum);
    }
}
