package Quittance.EmissionQuittance.repository;

import Quittance.EmissionQuittance.models.RefPolice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface RefPoliceRepository extends JpaRepository<RefPolice, Long> {
}
