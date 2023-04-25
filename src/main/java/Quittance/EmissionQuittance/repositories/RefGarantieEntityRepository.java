package Quittance.EmissionQuittance.repositories;

import Quittance.EmissionQuittance.entities.RefGarantieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RefGarantieEntityRepository extends JpaRepository<RefGarantieEntity, Long> {
}