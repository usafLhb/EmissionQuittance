package Quittance.EmissionQuittance.critaria.soap;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "stringValue")
public class StringValue {
    private String value;

    public StringValue() {
    }

    public StringValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
