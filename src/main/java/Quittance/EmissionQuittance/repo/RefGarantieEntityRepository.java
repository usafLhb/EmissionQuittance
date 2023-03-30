package Quittance.EmissionQuittance.repo;

import Quittance.EmissionQuittance.models.classes.RefGarantieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RefGarantieEntityRepository extends JpaRepository<RefGarantieEntity, Long> {
}