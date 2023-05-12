package Quittance.EmissionQuittance.remise.remiseClasse.remiseClasse;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultVO", propOrder = {
        "error",
        "hasErrorMessages",
        "info",
        "result",
        "warning"
})
public class ResultVO {
    protected String error;
    protected boolean hasErrorMessages;
    protected String info;
    protected Object result;
    protected String warning;
}
