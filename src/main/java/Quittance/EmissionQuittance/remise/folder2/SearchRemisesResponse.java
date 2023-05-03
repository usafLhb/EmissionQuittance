package Quittance.EmissionQuittance.remise.folder2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchRemisesResponse", propOrder = {
        "remises"
})
public class SearchRemisesResponse  implements Serializable {
    @XmlElement(required = true)
    protected List<Remise> remises;

    public List<Remise> getRemises() {
        if (remises == null) {
            remises = new ArrayList<>();
        }
        return this.remises;
    }
}
