package Quittance.EmissionQuittance.repo;

import Quittance.EmissionQuittance.models.classes.RefVilleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RefVilleEntityRepository extends JpaRepository<RefVilleEntity, Long> {
}