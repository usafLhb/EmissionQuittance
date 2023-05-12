package Quittance.EmissionQuittance.dto.response;

import Quittance.EmissionQuittance.entities.QtcQuittanceEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Data
public class RefQuittanceResponse {

    private Long id;
   private String etatQuittance;


}
