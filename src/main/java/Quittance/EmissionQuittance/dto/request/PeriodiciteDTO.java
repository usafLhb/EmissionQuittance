package Quittance.EmissionQuittance.dto.request;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PERIODECITE")
public class PeriodiciteDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "periodicite_seq")
    private Long id;
    private String type_periodicite;

    @OneToMany(mappedBy = "periodicite")
    private List<PoliceDTO> polices;
}
