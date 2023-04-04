package Quittance.EmissionQuittance.models.classes;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "REF_VILLE" )
public class RefVilleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Basic
    @Column(name = "CODE", nullable = true)
    private Long code;
    @Basic
    @Column(name = "LIBELLE", nullable = true)
    private String libelle;
    @Basic
    @Column(name = "IDPAYS", nullable = true)
    private Long idpays;
    @Basic
    @Column(name = "ZONE_SISMIQUE", nullable = true)
    private Long zoneSismique;
    @Basic
    @Column(name = "ZONE_INNONDATION", nullable = true)
    private Long zoneInnondation;


}
