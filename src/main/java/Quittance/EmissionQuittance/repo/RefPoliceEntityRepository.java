package Quittance.EmissionQuittance.repo;

import Quittance.EmissionQuittance.models.classes.RefPoliceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RefPoliceEntityRepository extends JpaRepository<RefPoliceEntity, Long> {
}