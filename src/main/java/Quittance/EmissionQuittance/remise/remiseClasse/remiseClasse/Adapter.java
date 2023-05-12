package Quittance.EmissionQuittance.remise.remiseClasse.remiseClasse;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adapter", propOrder = {
        "fEntries"
})
public class Adapter {

    protected List<MyEntry> fEntries;

    /**
     * Gets the value of the fEntries property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fEntries property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFEntries().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MyEntry }
     *
     *
     */
    public List<MyEntry> getFEntries() {
        if (fEntries == null) {
            fEntries = new ArrayList<MyEntry>();
        }
        return this.fEntries;
    }
}
