package Quittance.EmissionQuittance.models;

import Quittance.EmissionQuittance.models.classes.PoliceEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "RefPolice")
public class RefPolice {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "refpolice_seq")
    private Long id;
    private String libelle;

    @OneToMany(mappedBy = "refPolice")
    private List<PoliceEntity> policeEntities;
}
