package Quittance.EmissionQuittance.models.classes;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "QTC_GARANTIES", schema = "CONVERGPARAM", catalog = "")
public class QtcGarantiesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = true)
    private Long id;
    @Basic
    @Column(name = "CODE", nullable = true)
    private Object code;
    @Basic
    @Column(name = "LIBELLE", nullable = true)
    private Object libelle;
    @Basic
    @Column(name = "TAUX", nullable = true)
    private Object taux;
    @Basic
    @Column(name = "IDPRODUIT", nullable = true)
    private Object idproduit;
    @Basic
    @Column(name = "IDPARAMETRESEPARGNE", nullable = true)
    private Object idparametresepargne;
    @Basic
    @Column(name = "IDPARAMETRESPREVOYANCE", nullable = true)
    private Object idparametresprevoyance;
    @Basic
    @Column(name = "IDPARAMETRESDOMMAGES", nullable = true)
    private Object idparametresdommages;
    @Basic
    @Column(name = "DATEDEBUT", nullable = true)
    private Object datedebut;
    @Basic
    @Column(name = "DATEFIN", nullable = true)
    private Object datefin;
    @Basic
    @Column(name = "FORMULE", nullable = true)
    private Object formule;
    @Basic
    @Column(name = "IDGARANTIE", nullable = true)
    private Object idgarantie;
    @Basic
    @Column(name = "USECATNAT", nullable = true)
    private Object usecatnat;
    @Basic
    @Column(name = "TAUXVENTILATION", nullable = true)
    private Object tauxventilation;
    @Basic
    @Column(name = "CATEGORIEACAPS", nullable = true)
    private Object categorieacaps;


}
