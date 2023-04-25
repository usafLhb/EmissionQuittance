package Quittance.EmissionQuittance.repositories;

import Quittance.EmissionQuittance.entities.QtcQuittanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface QtcQuittanceEntityRepository extends JpaRepository<QtcQuittanceEntity, Long> {
}