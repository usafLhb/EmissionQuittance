package Quittance.EmissionQuittance.repository;

import Quittance.EmissionQuittance.models.Police;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PoliceRepository extends JpaRepository<Police, Long> {
}
