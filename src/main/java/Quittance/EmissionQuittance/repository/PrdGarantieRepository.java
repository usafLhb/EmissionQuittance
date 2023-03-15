package Quittance.EmissionQuittance.repository;

import Quittance.EmissionQuittance.models.PRD_GARANTIE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PrdGarantieRepository extends JpaRepository<PRD_GARANTIE, Long> {
}
