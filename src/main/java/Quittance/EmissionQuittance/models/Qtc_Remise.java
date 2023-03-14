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
@Table(name = "QTC_REMISE")
public class Qtc_Remise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "ID")
   private Long id;
    @Column(name = "NUMEROREMISE")
    private  Long codeRemise;

    @Column(name = "MONTANTREMISE")
    private double  montant;

    @OneToMany(mappedBy = "remise")
    private List<Quittance> quittances;
}
