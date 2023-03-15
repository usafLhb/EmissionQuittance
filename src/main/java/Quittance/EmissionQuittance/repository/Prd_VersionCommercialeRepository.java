package Quittance.EmissionQuittance.repository;

import Quittance.EmissionQuittance.models.Prd_VersionCommerciale;
import Quittance.EmissionQuittance.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface Prd_VersionCommercialeRepository extends JpaRepository<Prd_VersionCommerciale, Long> {
}
