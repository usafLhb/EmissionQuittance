package Quittance.EmissionQuittance.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.util.Calendar;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Police")
public class Police {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Long numClient ;
    private String RaisonSociale ;
    private String adresse ;
    private Calendar dateEffet;
    private Calendar dateTime;
    private Double primeNette;
    private Double taxe ;
    private Double acce ;
    private Double tauxComm ;
    private Calendar dateTerme ;
    private  Calendar dateEtat;
    private Double nbrtete ;
    private Double revenueAnnuel ;
    private Double dureS ;
    private Double ff ;
    private Double mnt_taxe_eve ;
    private Double mnt_taxe_parafiscale ;
}
