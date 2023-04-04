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
@Table(name = "Intermediaire")
//, schema = "CONVERGPARAM", catalog = ""
public class IntermediaireEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column(name = "NOMIntermediaire")
    private String nomCommercial ;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ref_intermediaire")
    private RefIntermediaireEntity refIntermediaire;
    @OneToMany(mappedBy = "intermediaire")
    private List<QtcQuittanceEntity> quittances;
    @OneToMany(mappedBy = "intermediaire")
    private List<PoliceEntity> polices;

     @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ref_Commerciale_id")
    private PrdVersioncommercialeEntity prd_versionCommerciale;

     @OneToMany(mappedBy = "intermediaire")
    private List<PrdVersioncommercialeEntity> prd_versionCommerciales;

}
