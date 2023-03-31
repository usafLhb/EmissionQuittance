package Quittance.EmissionQuittance.dto.request;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
public class QtcDetailquittanceDTO {
    @Basic
    private Object id;
    @Basic
    private Object idquittance;
    @Basic
    private Object idgarantie;
    @Basic
    private Object pourcentagegarantie;
    @Basic
    private Object primenette;
    @Basic
    private Object montanttaxe;
    @Basic
    private Object tauxcommission;
    @Basic
    private Object montantcommission;
    @Basic
    private Object tauxtaxesurcommission;
    @Basic
    private Object montanttaxesurcommission;
    @Basic
    private Object montantencaise;
    @Basic
    private Object montantencaisse;
    @Basic
    private Object montanttaxeparafiscale;


}
