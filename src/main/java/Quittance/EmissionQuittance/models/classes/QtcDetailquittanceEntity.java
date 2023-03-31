package Quittance.EmissionQuittance.models.classes;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "QTC_DETAILQUITTANCE", schema = "CONVERGPARAM", catalog = "")
public class QtcDetailquittanceEntity {
    @Basic
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = true)
    private Object id;
    @Basic
    @Column(name = "IDQUITTANCE", nullable = true)
    private Object idquittance;
    @Basic
    @Column(name = "IDGARANTIE", nullable = true)
    private Object idgarantie;
    @Basic
    @Column(name = "POURCENTAGEGARANTIE", nullable = true)
    private Object pourcentagegarantie;
    @Basic
    @Column(name = "PRIMENETTE", nullable = true)
    private Object primenette;
    @Basic
    @Column(name = "MONTANTTAXE", nullable = true)
    private Object montanttaxe;
    @Basic
    @Column(name = "TAUXCOMMISSION", nullable = true)
    private Object tauxcommission;
    @Basic
    @Column(name = "MONTANTCOMMISSION", nullable = true)
    private Object montantcommission;
    @Basic
    @Column(name = "TAUXTAXESURCOMMISSION", nullable = true)
    private Object tauxtaxesurcommission;
    @Basic
    @Column(name = "MONTANTTAXESURCOMMISSION", nullable = true)
    private Object montanttaxesurcommission;
    @Basic
    @Column(name = "MONTANTENCAISE", nullable = true)
    private Object montantencaise;
    @Basic
    @Column(name = "MONTANTENCAISSE", nullable = true)
    private Object montantencaisse;
    @Basic
    @Column(name = "MONTANTTAXEPARAFISCALE", nullable = true)
    private Object montanttaxeparafiscale;






}
