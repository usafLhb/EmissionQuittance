package Quittance.EmissionQuittance.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
}
