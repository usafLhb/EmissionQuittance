package Quittance.EmissionQuittance.repo;

import Quittance.EmissionQuittance.models.classes.PrdProduitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PrdProduitEntityRepository extends JpaRepository<PrdProduitEntity, Long> {
}