package Quittance.EmissionQuittance.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TERME")
public class Terme {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "terme_seq")
    private Long id;
    private String terme;

    @OneToMany(mappedBy = "terme")
    private List<Police> polices;

}
