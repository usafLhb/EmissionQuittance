package Quittance.EmissionQuittance.repository;

import Quittance.EmissionQuittance.models.Details_Quittance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DetailsQuittanceRepository extends JpaRepository<Details_Quittance, Long> {
}
