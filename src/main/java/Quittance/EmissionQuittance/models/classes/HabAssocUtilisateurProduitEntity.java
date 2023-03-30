package Quittance.EmissionQuittance.models.classes;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "HAB_ASSOC_UTILISATEUR_PRODUIT", schema = "CONVERGPARAM", catalog = "")
public class HabAssocUtilisateurProduitEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDUTILISATEUR")
    private Long idutilisateur;
    @Basic
    @Column(name = "IDPRODUIT", nullable = true)
    private Object idproduit;

    public Object getIdutilisateur() {
        return idutilisateur;
    }


}
