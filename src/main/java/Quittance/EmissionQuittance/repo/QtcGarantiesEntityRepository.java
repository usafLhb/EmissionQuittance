package Quittance.EmissionQuittance.repo;

import Quittance.EmissionQuittance.models.classes.QtcGarantiesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface QtcGarantiesEntityRepository extends JpaRepository<QtcGarantiesEntity, Long> {
}