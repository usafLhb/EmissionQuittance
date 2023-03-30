package Quittance.EmissionQuittance.models.classes;

import Quittance.EmissionQuittance.models.Police;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "RefPolice" , schema = "CONVERGPARAM", catalog = "")
public class RefPoliceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "refpolice_seq")
    private Long id;

    @Column(name = "Libelle", nullable = true)
    private String libelle;

    @OneToMany(mappedBy = "refPolice")
    private List<Police> polices;
}
