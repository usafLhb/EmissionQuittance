package Quittance.EmissionQuittance.dto.request;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;


@Data
@RequiredArgsConstructor
public class   HabMotdepasseDTO {
    LocalDate datecreation; String motdepasse;String  realmotdepasse; Long idutilisateur;




}
