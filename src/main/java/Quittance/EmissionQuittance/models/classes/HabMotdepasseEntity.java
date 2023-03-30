package Quittance.EmissionQuittance.models.classes;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "HAB_MOTDEPASSE", schema = "CONVERGPARAM", catalog = "")
public class HabMotdepasseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = true)
    private Long id;
    @Basic
    @Column(name = "COURANT", nullable = true)
    private Object courant;
    @Basic
    @Column(name = "DATECREATION", nullable = true)
    private Object datecreation;
    @Basic
    @Column(name = "REALMOTDEPASSE", nullable = true)
    private Object realmotdepasse;
    @Basic
    @Column(name = "MOTDEPASSE", nullable = true)
    private Object motdepasse;
    @Basic
    @Column(name = "IDUTILISATEUR", nullable = true)
    private Object idutilisateur;


}
