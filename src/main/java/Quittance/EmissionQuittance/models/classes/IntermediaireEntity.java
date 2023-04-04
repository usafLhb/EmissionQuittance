package Quittance.EmissionQuittance.models.classes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Table(name = "Intermediaire")
//, schema = "CONVERGPARAM", catalog = ""
public class IntermediaireEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
     @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ref_intermediaire")
    private RefIntermediaireEntity refIntermediaire;
    @Column(name = "NOMIntermediaire")
    private String nomCommercial ;

    FK_[CODTYPIN]
            ,[CODEINTE]
            ,[CODEVILL]
            ,[RAISOCIN]
            ,[NOM_RESP]
            ,[NOM_INTE]
            ,[ADREINTE]
            ,[NUMTELIN]
            ,[NUMFAXIN]
            ,[E_MAILIN]
            ,[SITUINTE]
            ,[DATSITIN]
            ,[CODVIEIN]
            ,[CONIARIN]
            ,[CONVIEIN]
            ,[NUM_IFIN]
            ,[NUMPATIN]
            ,[NUM_RCTI]

  /*  @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Quittance_id")
    private QtcQuittanceEntity quittance;

    @OneToMany(mappedBy = "prd_versionCommerciale")
    private List<PoliceEntity> polices;

     @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ref_Commerciale_id")
    private Ref_Commerciale refCommerciale;*/
}
