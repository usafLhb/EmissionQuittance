package Quittance.EmissionQuittance.dto.request;

import jakarta.persistence.*;
import lombok.Data;


@Data
public class RefVilleDTO {

    @Basic
    private Object code;
    @Basic
    private Object libelle;
    @Basic
    private Object idpays;
    @Basic
    private Object zoneSismique;
    @Basic
    private Object zoneInnondation;


}
