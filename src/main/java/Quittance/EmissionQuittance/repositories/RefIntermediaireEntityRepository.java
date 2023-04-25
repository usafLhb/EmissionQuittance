package Quittance.EmissionQuittance.repositories;

import Quittance.EmissionQuittance.entities.RefIntermediaireEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RefIntermediaireEntityRepository extends JpaRepository<RefIntermediaireEntity, Long> {
}