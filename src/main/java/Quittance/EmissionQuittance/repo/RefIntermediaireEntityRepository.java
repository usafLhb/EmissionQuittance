package Quittance.EmissionQuittance.repo;

import Quittance.EmissionQuittance.models.classes.RefIntermediaireEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RefIntermediaireEntityRepository extends JpaRepository<RefIntermediaireEntity, Long> {
}