package Quittance.EmissionQuittance.dto.request;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class RefVilleDTO {

    @Basic
    @Column(name = "CODE", nullable = true)
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
