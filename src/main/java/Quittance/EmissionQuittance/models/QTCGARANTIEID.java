package Quittance.EmissionQuittance.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class QTCGARANTIEID implements Serializable {

    private Long produitId;
    private Long garantieId;
}
