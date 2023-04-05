package Quittance.EmissionQuittance.models.classes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Table(name = "PERIODECITE")
public class PeriodiciteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type_periodicite;

    @OneToMany(mappedBy = "periodicite")
    private List<PoliceEntity> polices;
}
