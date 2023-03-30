package Quittance.EmissionQuittance.repo;

import Quittance.EmissionQuittance.models.classes.PrdVersioncommercialeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PrdVersioncommercialeEntityRepository extends JpaRepository<PrdVersioncommercialeEntity, Long> {
}