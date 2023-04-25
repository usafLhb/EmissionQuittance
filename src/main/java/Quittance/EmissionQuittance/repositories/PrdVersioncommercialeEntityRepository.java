package Quittance.EmissionQuittance.repositories;

import Quittance.EmissionQuittance.entities.PrdVersioncommercialeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PrdVersioncommercialeEntityRepository extends JpaRepository<PrdVersioncommercialeEntity, Long> {
}