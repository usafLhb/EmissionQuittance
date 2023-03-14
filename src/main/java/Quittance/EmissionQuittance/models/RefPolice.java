package Quittance.EmissionQuittance.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class RefPolice {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "refpolice_seq")
    private Long ID;
    private String Libelle;
}
