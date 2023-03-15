package Quittance.EmissionQuittance.models;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class PRDGARANTIEID implements Serializable {

    private Long produit_id;
    private Long garantie_id;
}
