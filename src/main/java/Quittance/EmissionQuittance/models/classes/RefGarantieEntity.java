package Quittance.EmissionQuittance.models.classes;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "REF_GARANTIE", schema = "CONVERGPARAM", catalog = "")
public class RefGarantieEntity {
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
    @Column(name = "LIBELLE_ABREGE", nullable = true)
    private Object libelleAbrege;
    @Basic
    @Column(name = "PLAFOND", nullable = true)
    private Object plafond;
    @Basic
    @Column(name = "TAUXPRIMECATNAT", nullable = true)
    private Object tauxprimecatnat;
    @Basic
    @Column(name = "TAUXPRIMERCCATNAT", nullable = true)
    private Object tauxprimerccatnat;
    @Basic
    @Column(name = "LIBELLE_AR", nullable = true)
    private Object libelleAr;
    @Basic
    @Column(name = "IDTYPEGARANTIE", nullable = true)
    private Object idtypegarantie;
    @Basic
    @Column(name = "CODECOMPTABLE", nullable = true)
    private Object codecomptable;


}
