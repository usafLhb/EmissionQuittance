package Quittance.EmissionQuittance.models.classes;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "RefIntermediaire" , schema = "CONVERGPARAM", catalog = "")
public class RefIntermediaireEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String libelle ;

    /*@OneToMany(mappedBy = "ref_Commerciale")
    private List<IntermediaireEntity> intermediaire;*/
}