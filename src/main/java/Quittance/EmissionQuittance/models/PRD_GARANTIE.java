package Quittance.EmissionQuittance.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PRD_GARANTIE implements Serializable {

    @EmbeddedId
    private PRDGARANTIEID id;

    @ManyToOne
    @MapsId("garantie_id")
    private Garantie garantie;

    @ManyToOne
    @MapsId("produit_id")
    private Produit produit;

    private Date DateDebut;
    private Date DateFin;
}
