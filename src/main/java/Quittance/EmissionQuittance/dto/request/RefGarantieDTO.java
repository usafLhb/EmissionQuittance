package Quittance.EmissionQuittance.dto.request;

import jakarta.persistence.*;
import lombok.Data;


@Data
public class RefGarantieDTO {

    @Basic
    private Object code;
    @Basic
    private Object libelle;
    @Basic
    private Object libelleAbrege;
    @Basic
    private Object plafond;
    @Basic
    private Object tauxprimecatnat;
    @Basic
    private Object tauxprimerccatnat;
    @Basic
    private Object libelleAr;
    @Basic
    private Object idtypegarantie;
    @Basic
    private Object codecomptable;


}
