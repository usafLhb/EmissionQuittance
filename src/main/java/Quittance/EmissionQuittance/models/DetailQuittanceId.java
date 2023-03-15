package Quittance.EmissionQuittance.models;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
@Embeddable
public class DetailQuittanceId implements Serializable {
    private Long quittance_id;
    private Long garantie_id;
}
