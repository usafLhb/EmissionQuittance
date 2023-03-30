package Quittance.EmissionQuittance.models.classes;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "REF_VILLE", schema = "CONVERGPARAM", catalog = "")
public class RefVilleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Basic
    @Column(name = "CODE", nullable = true)
    private Object code;
    @Basic
    @Column(name = "LIBELLE", nullable = true)
    private Object libelle;
    @Basic
    @Column(name = "IDPAYS", nullable = true)
    private Object idpays;
    @Basic
    @Column(name = "ZONE_SISMIQUE", nullable = true)
    private Object zoneSismique;
    @Basic
    @Column(name = "ZONE_INNONDATION", nullable = true)
    private Object zoneInnondation;


}
