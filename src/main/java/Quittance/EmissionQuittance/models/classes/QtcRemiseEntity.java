package Quittance.EmissionQuittance.models.classes;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "QTC_REMISE", schema = "CONVERGPARAM", catalog = "")
public class QtcRemiseEntity {
    @Basic
    @Column(name = "ID", nullable = true)
    private Object id;
    @Basic
    @Column(name = "NUMEROREMISE", nullable = true)
    private Object numeroremise;
    @Basic
    @Column(name = "MONTANTREMISE", nullable = true)
    private Object montantremise;
    @Basic
    @Column(name = "SENS", nullable = true)
    private Object sens;
    @Basic
    @Column(name = "ETAT", nullable = true)
    private Object etat;
    @Basic
    @Column(name = "DATEETAT", nullable = true)
    private Object dateetat;
    @Basic
    @Column(name = "MONTANTCONSOMME", nullable = true)
    private Object montantconsomme;
    @Basic
    @Column(name = "DATECOMPTABILISATION", nullable = true)
    private Object datecomptabilisation;
    @Basic
    @Column(name = "IDOPERATIONPRELEVEMENT", nullable = true)
    private Object idoperationprelevement;
    @Basic
    @Column(name = "MONTANTDIFF", nullable = true)
    private Object montantdiff;
    @Basic
    @Column(name = "LETTREPRODUIT", nullable = true)
    private Object lettreproduit;
    @Basic
    @Column(name = "SOLDEINITIAL", nullable = true)
    private Object soldeinitial;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getNumeroremise() {
        return numeroremise;
    }

    public void setNumeroremise(Object numeroremise) {
        this.numeroremise = numeroremise;
    }

    public Object getMontantremise() {
        return montantremise;
    }

    public void setMontantremise(Object montantremise) {
        this.montantremise = montantremise;
    }

    public Object getSens() {
        return sens;
    }

    public void setSens(Object sens) {
        this.sens = sens;
    }

    public Object getEtat() {
        return etat;
    }

    public void setEtat(Object etat) {
        this.etat = etat;
    }

    public Object getDateetat() {
        return dateetat;
    }

    public void setDateetat(Object dateetat) {
        this.dateetat = dateetat;
    }

    public Object getMontantconsomme() {
        return montantconsomme;
    }

    public void setMontantconsomme(Object montantconsomme) {
        this.montantconsomme = montantconsomme;
    }

    public Object getDatecomptabilisation() {
        return datecomptabilisation;
    }

    public void setDatecomptabilisation(Object datecomptabilisation) {
        this.datecomptabilisation = datecomptabilisation;
    }

    public Object getIdoperationprelevement() {
        return idoperationprelevement;
    }

    public void setIdoperationprelevement(Object idoperationprelevement) {
        this.idoperationprelevement = idoperationprelevement;
    }

    public Object getMontantdiff() {
        return montantdiff;
    }

    public void setMontantdiff(Object montantdiff) {
        this.montantdiff = montantdiff;
    }

    public Object getLettreproduit() {
        return lettreproduit;
    }

    public void setLettreproduit(Object lettreproduit) {
        this.lettreproduit = lettreproduit;
    }

    public Object getSoldeinitial() {
        return soldeinitial;
    }

    public void setSoldeinitial(Object soldeinitial) {
        this.soldeinitial = soldeinitial;
    }
}
