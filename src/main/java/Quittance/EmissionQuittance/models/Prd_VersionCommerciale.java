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
@Table(name = "PRD_VERSIONCOMMERCIALE")
public class Prd_VersionCommerciale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_ref_Commerciale")
    private Ref_Commerciale ref_Commerciale;
    @Column(name = "NOMCOMMERCIAL")
    private String nomCommercial ;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Quittance_id")
    private Quittance quittance;

    @OneToMany(mappedBy = "prd_versionCommerciale")
    private List<Police> polices;

}
