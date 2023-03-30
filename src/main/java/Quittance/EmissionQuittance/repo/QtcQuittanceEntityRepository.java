package Quittance.EmissionQuittance.repo;

import Quittance.EmissionQuittance.models.classes.QtcQuittanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface QtcQuittanceEntityRepository extends JpaRepository<QtcQuittanceEntity, Long> {
}