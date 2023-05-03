package Quittance.EmissionQuittance.remise.folder2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.io.Serializable;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remise", propOrder = {
        "id",
        "date",
        "montant"
})
public class Remise  implements Serializable {
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected Date date;
    protected double montant;

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date value) {
        this.date = value;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double value) {
        this.montant = value;
    }

}
