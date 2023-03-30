package Quittance.EmissionQuittance.dto.request;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "QTC_DETAILQUITTANCE", schema = "CONVERGPARAM", catalog = "")
public class QtcDetailquittanceDTO {
    @Basic
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

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getIdquittance() {
        return idquittance;
    }

    public void setIdquittance(Object idquittance) {
        this.idquittance = idquittance;
    }

    public Object getIdgarantie() {
        return idgarantie;
    }

    public void setIdgarantie(Object idgarantie) {
        this.idgarantie = idgarantie;
    }

    public Object getPourcentagegarantie() {
        return pourcentagegarantie;
    }

    public void setPourcentagegarantie(Object pourcentagegarantie) {
        this.pourcentagegarantie = pourcentagegarantie;
    }

    public Object getPrimenette() {
        return primenette;
    }

    public void setPrimenette(Object primenette) {
        this.primenette = primenette;
    }

    public Object getMontanttaxe() {
        return montanttaxe;
    }

    public void setMontanttaxe(Object montanttaxe) {
        this.montanttaxe = montanttaxe;
    }

    public Object getTauxcommission() {
        return tauxcommission;
    }

    public void setTauxcommission(Object tauxcommission) {
        this.tauxcommission = tauxcommission;
    }

    public Object getMontantcommission() {
        return montantcommission;
    }

    public void setMontantcommission(Object montantcommission) {
        this.montantcommission = montantcommission;
    }

    public Object getTauxtaxesurcommission() {
        return tauxtaxesurcommission;
    }

    public void setTauxtaxesurcommission(Object tauxtaxesurcommission) {
        this.tauxtaxesurcommission = tauxtaxesurcommission;
    }

    public Object getMontanttaxesurcommission() {
        return montanttaxesurcommission;
    }

    public void setMontanttaxesurcommission(Object montanttaxesurcommission) {
        this.montanttaxesurcommission = montanttaxesurcommission;
    }

    public Object getMontantencaise() {
        return montantencaise;
    }

    public void setMontantencaise(Object montantencaise) {
        this.montantencaise = montantencaise;
    }

    public Object getMontantencaisse() {
        return montantencaisse;
    }

    public void setMontantencaisse(Object montantencaisse) {
        this.montantencaisse = montantencaisse;
    }

    public Object getMontanttaxeparafiscale() {
        return montanttaxeparafiscale;
    }

    public void setMontanttaxeparafiscale(Object montanttaxeparafiscale) {
        this.montanttaxeparafiscale = montanttaxeparafiscale;
    }
}
