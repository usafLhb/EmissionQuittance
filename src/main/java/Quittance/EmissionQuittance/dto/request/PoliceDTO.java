package Quittance.EmissionQuittance.dto.request;

import Quittance.EmissionQuittance.models.classes.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.util.Calendar;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PoliceDTO {


    private String codePolice;
    @NotNull
    private Long numClient ;
    @NotNull
    private String raisonSociale ;
    @NotNull
    private String adresse ;
    @NotNull
    private Calendar dateEffet;

    private Calendar dateEcheance;
    @NotNull
    private Double primeNette;
    private Double taxe ;
    private Double acce ;
    private Double tauxComm ;
    private Calendar dateTerme ;
    private  Calendar dateEtat;
    private Double nbrtete ;
    private Double revenueAnnuel ;
    private Double dureeS ;
    private Double ff ;
    private Double mnt_taxe_eve ;
    private Double mnt_taxe_parafiscale ;


    private List<QtcQuittanceEntity> quittances;


    private PrdVersioncommercialeEntity versioncommerciale;

    private RefVilleEntity ville;


    private RefPoliceEntity refPolice;


    private TermeEntity terme;


    private PeriodiciteEntity periodicite;


   /* private Prd_VersionCommerciale prd_versionCommerciale;*/




}
