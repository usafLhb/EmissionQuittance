package Quittance.EmissionQuittance.dto;

import org.jetbrains.annotations.NotNull;

import java.util.Calendar;

public class PoliceDTO {
    @NotNull
    private Long numClient ;
    @NotNull
    private String RaisonSociale ;
    @NotNull
    private String adresse ;
    @NotNull
    private Calendar dateEffet;

    private Calendar DateEcheance;
    @NotNull
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
