package Quittance.EmissionQuittance.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PRD_VERSIONCOMMERCIALE")
public class Prd_VersionCommerciale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id ;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Ref_Commerciale ref_Commerciale;
    @Column(name = "NOMCOMMERCIAL")
    private String nomCommercial ;
}
