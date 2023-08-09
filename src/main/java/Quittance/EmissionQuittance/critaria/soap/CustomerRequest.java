package Quittance.EmissionQuittance.critaria.soap;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "customerRequest")
public class CustomerRequest {

    private StringValue name;

    public CustomerRequest() {
    }

    public CustomerRequest(StringValue name) {
        this.name = name;
    }

    public StringValue getName() {
        return name;
    }

    public void setName(StringValue name) {
        this.name = name;
    }
}
