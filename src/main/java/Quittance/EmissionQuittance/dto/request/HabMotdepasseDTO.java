package Quittance.EmissionQuittance.dto.request;

import jakarta.persistence.*;
import lombok.Data;


@Data
public class HabMotdepasseDTO {

    @Basic
    @Column(name = "COURANT", nullable = true)
    private Object courant;
    @Basic

    private Object datecreation;
    @Basic

    private Object realmotdepasse;
    @Basic

    private Object motdepasse;
    @Basic

    private Object idutilisateur;


}
