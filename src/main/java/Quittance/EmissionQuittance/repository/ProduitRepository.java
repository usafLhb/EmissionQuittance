package Quittance.EmissionQuittance.repository;

import Quittance.EmissionQuittance.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProduitRepository extends JpaRepository<Produit, Long> {
    public Produit findByCode(String code);
}
