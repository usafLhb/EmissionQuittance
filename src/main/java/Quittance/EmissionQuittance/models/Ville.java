package Quittance.EmissionQuittance.models;

import Quittance.EmissionQuittance.models.classes.PoliceEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Ville {
    @Id
    @GeneratedValue(strategy =GenerationType.SEQUENCE, generator = "ville_seq")
    @Column(name = "ID")
    private Long id;
     @Column(name = "LIBELLE")
    private String libelle;

     @OneToMany(mappedBy = "ville")
    private List<PoliceEntity> policeEntities;
}
