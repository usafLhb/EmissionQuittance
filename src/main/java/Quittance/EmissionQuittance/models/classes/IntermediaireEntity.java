package Quittance.EmissionQuittance.models.classes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Intermediaire", schema = "CONVERGPARAM", catalog = "")
public class IntermediaireEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
   /* @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ref_intermediaire")
    private Ref_Commerciale ref_Commerciale;*/
    @Column(name = "NOMIntermediaire")
    private String nomCommercial ;

  /*  @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Quittance_id")
    private QtcQuittanceEntity quittance;

    @OneToMany(mappedBy = "prd_versionCommerciale")
    private List<PoliceEntity> polices;

     @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ref_Commerciale_id")
    private Ref_Commerciale refCommerciale;*/
}
