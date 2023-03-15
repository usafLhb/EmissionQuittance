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
@Table(name = "Ref_COMMERCIALE")
public class Ref_Commerciale {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ref_commerciale_seq")
    private Long id;
    private String libelle ;

    @OneToMany(mappedBy = "ref_Commerciale")
    private List<Prd_VersionCommerciale> prd_versionCommerciales;
}
