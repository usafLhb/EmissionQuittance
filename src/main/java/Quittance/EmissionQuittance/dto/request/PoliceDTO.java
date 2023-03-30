package Quittance.EmissionQuittance.dto.request;

import Quittance.EmissionQuittance.models.Prd_VersionCommerciale;
import Quittance.EmissionQuittance.models.Quittance;
import Quittance.EmissionQuittance.models.RefPolice;
import Quittance.EmissionQuittance.models.Ville;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.util.Calendar;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Police")
public class PoliceDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
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

    @OneToMany(mappedBy = "police")
    private List<Quittance> quittances;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "VersionCommerciale_id")
    private PrdVersioncommercialeDTO versioncommerciale;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Ville_id")
    private Ville ville;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RefPolice_ID")
    private RefPolice refPolice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Terme_id")
    private QtcRemiseDTO.Terme terme;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Periodicite_id")
    private PeriodiciteDTO periodicite;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Prd_VersionCommerciale_id")
    private Prd_VersionCommerciale prd_versionCommerciale;




}
