package Quittance.EmissionQuittance.models.classes;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "HAB_UTILISATEUR", schema = "CONVERGPARAM", catalog = "")
public class HabUtilisateurEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = true)
    private Long id;
    @Basic
    @Column(name = "BLOQUE", nullable = true)
    private Object bloque;
    @Basic
    @Column(name = "CHANGMOTDEPASSEALACONNEXION", nullable = true)
    private Object changmotdepassealaconnexion;
    @Basic
    @Column(name = "DATEDEBUTACCES", nullable = true)
    private Object datedebutacces;
    @Basic
    @Column(name = "DATEFINACCES", nullable = true)
    private Object datefinacces;
    @Basic
    @Column(name = "EMAIL", nullable = true)
    private Object email;
    @Basic
    @Column(name = "LOGIN", nullable = true)
    private Object login;
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
