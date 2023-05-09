package Quittance.EmissionQuittance.repositories;

import Quittance.EmissionQuittance.entities.RefPoliceEntity;
import Quittance.EmissionQuittance.entities.RefQuittanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RefQuittanceRepository extends JpaRepository<RefQuittanceEntity, Long> {
}
