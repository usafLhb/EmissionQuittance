package Quittance.EmissionQuittance.repo;

import Quittance.EmissionQuittance.models.classes.IntermediaireEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IntermediaireEntityRepository extends JpaRepository<IntermediaireEntity, Long> {
}