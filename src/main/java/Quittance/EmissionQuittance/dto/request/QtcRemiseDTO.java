package Quittance.EmissionQuittance.dto.request;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
public class QtcRemiseDTO {


    @Basic
    private Object numeroremise;
    @Basic
    private Object montantremise;
    @Basic
    private Object sens;
    @Basic
    private Object etat;
    @Basic
    private Object dateetat;
    @Basic
    private Object montantconsomme;
    @Basic
    private Object datecomptabilisation;
    @Basic
    private Object idoperationprelevement;
    @Basic
    private Object montantdiff;
    @Basic
    private Object lettreproduit;
    @Basic
    private Object soldeinitial;



}
