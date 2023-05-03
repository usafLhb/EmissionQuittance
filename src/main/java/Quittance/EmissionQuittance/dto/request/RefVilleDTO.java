package Quittance.EmissionQuittance.dto.request;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class RefVilleDTO {
    private Long id;
    private Long code;
    private String libelle;

}
