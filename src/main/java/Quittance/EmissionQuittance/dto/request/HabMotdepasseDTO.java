package Quittance.EmissionQuittance.dto.request;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;



public record  HabMotdepasseDTO (LocalDate datecreation, String motdepasse,String  realmotdepasse, Long idutilisateur){




}
