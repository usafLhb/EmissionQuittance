package Quittance.EmissionQuittance.models.classes;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Calendar;

@Entity
@Data
//@Table(name = "HAB_UTILISATEUR")
//, schema = "CONVERGPARAM", catalog = ""
public class HabUtilisateurEntity {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = true)
    private Long id;
    @Basic
    @Column(name = "BLOQUE", nullable = true)
    private boolean bloque;
    @Basic
    @Column(name = "CHANGMOTDEPASSEALACONNEXION", nullable = true)
    private String changmotdepassealaconnexion;
    @Basic
    @Column(name = "DATEDEBUTACCES", nullable = true)
    private Calendar datedebutacces;
    @Basic
    @Column(name = "DATEFINACCES", nullable = true)
    private Calendar datefinacces;
    @Basic
    @Column(name = "EMAIL", nullable = true)
    private String email;
    @Basic
    @Column(name = "LOGIN", nullable = true)
    private  login;
    @Basic
    @Column(name = "NOM", nullable = true)
    private Object nom;
    @Basic
    @Column(name = "PRENOM", nullable = true)
    private Object prenom;
    @Basic
    @Column(name = "SUPERUTILISATEUR", nullable = true)
    private Object superutilisateur;
    @Basic
    @Column(name = "TELEPHONE", nullable = true)
    private Object telephone;
    @Basic
    @Column(name = "TYPEUTILISATEUR", nullable = true)
    private Object typeutilisateur;
    @Basic
    @Column(name = "MATRICULE", nullable = true)
    private Object matricule;
    @Basic
    @Column(name = "MULTISOCIETE", nullable = true)
    private Object multisociete;
    @Basic
    @Column(name = "MODEPACK", nullable = true)
    private Object modepack;
    @Basic
    @Column(name = "IDENTITE", nullable = true)
    private Object identite;
    @Basic
    @Column(name = "IDPROFIL", nullable = true)
    private Object idprofil;
    @Basic
    @Column(name = "IDRESPONSABLE", nullable = true)
    private Object idresponsable;
    @Basic
    @Column(name = "AUTORISETOUTPRODUIT", nullable = true)
    private Object autorisetoutproduit;
    @Basic
    @Column(name = "AUTORISETOUTEAGENCE", nullable = true)
    private Object autorisetouteagence;


}
