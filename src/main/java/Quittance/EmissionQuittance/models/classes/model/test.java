package Quittance.EmissionQuittance.models.classes.model;


import jakarta.persistence.*;


@Entity

public class test implements AbstractEntity<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = true)
    private Long id;

    @Override
    public Long getId() {
        return id;
    }

    private String nom;


}
