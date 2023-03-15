package Quittance.EmissionQuittance.models;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class PRDGARANTIEID implements Serializable {

    private Long produitId;
    private Long garantieId;
}
