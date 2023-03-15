package Quittance.EmissionQuittance.repository;

import Quittance.EmissionQuittance.models.RefQuittance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface RefQuittanceRepository  extends JpaRepository<RefQuittance, Long> {
}
