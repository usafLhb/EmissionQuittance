package Quittance.EmissionQuittance.remise.remiseClasse.remiseClasse;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "myEntry", propOrder = {
        "fKey",
        "fValue"
})
public class MyEntry {

    protected Object fKey;
    protected Object fValue;

    /**
     * Gets the value of the fKey property.
     *
     * @return
     *     possible object is
     *     {@link Object }
     *
     */
    public Object getFKey() {
        return fKey;
    }

    /**
     * Sets the value of the fKey property.
     *
     * @param value
     *     allowed object is
     *     {@link Object }
     *
     */
    public void setFKey(Object value) {
        this.fKey = value;
    }

    /**
     * Gets the value of the fValue property.
     *
     * @return
     *     possible object is
     *     {@link Object }
     *
     */
    public Object getFValue() {
        return fValue;
    }

    /**
     * Sets the value of the fValue property.
     *
     * @param value
     *     allowed object is
     *     {@link Object }
     *
     */
    public void setFValue(Object value) {
        this.fValue = value;
    }

}
