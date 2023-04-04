package Quittance.EmissionQuittance.models.classes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;
import java.util.List;

@Entity
@Data
@Table(name = "QTC_REMISE" )
public class QtcRemiseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = true)
    private Long id;
    @Basic
    @Column(name = "NUMEROREMISE", nullable = true)
    private Long numeroremise;
    @Basic
    @Column(name = "MONTANTREMISE", nullable = true)
    private Double montantremise;
    @Basic
    @Column(name = "SENS", nullable = true)
    private String sens;
    @Basic
    @Column(name = "ETAT", nullable = true)
    private String etat;
    @Basic
    @Column(name = "DATEETAT", nullable = true)
    private Calendar dateetat;
    @Basic
    @Column(name = "MONTANTCONSOMME", nullable = true)
    private Double montantconsomme;
    @Basic
    @Column(name = "DATECOMPTABILISATION", nullable = true)
    private Calendar datecomptabilisation;
    @Basic
    @Column(name = "IDOPERATIONPRELEVEMENT", nullable = true)
    private Long idoperationprelevement;
    @Basic
    @Column(name = "MONTANTDIFF", nullable = true)
    private Double montantdiff;
    @Basic
    @Column(name = "LETTREPRODUIT", nullable = true)
    private String lettreproduit;
    @Basic
    @Column(name = "SOLDEINITIAL", nullable = true)
    private Double soldeinitial;

}
