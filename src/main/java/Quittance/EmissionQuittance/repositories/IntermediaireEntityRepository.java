package Quittance.EmissionQuittance.repositories;

import Quittance.EmissionQuittance.entities.IntermediaireEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IntermediaireEntityRepository extends JpaRepository<IntermediaireEntity, Long> {
}