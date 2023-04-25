package Quittance.EmissionQuittance.repositories;

import Quittance.EmissionQuittance.entities.QtcGarantiesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface QtcGarantiesEntityRepository extends JpaRepository<QtcGarantiesEntity, Long> {
}