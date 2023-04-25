package Quittance.EmissionQuittance.repositories;

import Quittance.EmissionQuittance.entities.RefVilleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RefVilleEntityRepository extends JpaRepository<RefVilleEntity, Long> {
}