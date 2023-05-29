package Quittance.EmissionQuittance.critaria.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "stringWrapper")
@XmlAccessorType(XmlAccessType.FIELD)
public class StringWrapper  {


    @XmlElement(name = "value")
    private String value;

    public StringWrapper() {
    }

    public StringWrapper(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
