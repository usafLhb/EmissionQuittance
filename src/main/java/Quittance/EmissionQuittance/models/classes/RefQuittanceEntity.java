package Quittance.EmissionQuittance.models.classes;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "Ref_Quittance" )
public class RefQuittanceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "etat_Quittance", nullable = false)
   private String etatQuittance;

    @OneToMany(mappedBy = "refQuittance")
    private List<QtcQuittanceEntity> qtcQuittance;

}
