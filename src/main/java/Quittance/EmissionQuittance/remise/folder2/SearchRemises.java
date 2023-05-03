package Quittance.EmissionQuittance.remise.folder2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchRemises", propOrder = {
        "entiteVO"
})
public class SearchRemises {

    protected EntiteVO entiteVO;

    public EntiteVO getEntiteVO() {
        return entiteVO;
    }

    public void setEntiteVO(EntiteVO value) {
        this.entiteVO = value;
    }
}
