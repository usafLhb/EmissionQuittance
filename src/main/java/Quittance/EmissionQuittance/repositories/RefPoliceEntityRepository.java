package Quittance.EmissionQuittance.repositories;

import Quittance.EmissionQuittance.entities.RefPoliceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RefPoliceEntityRepository extends JpaRepository<RefPoliceEntity, Long> {
}