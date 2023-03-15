package Quittance.EmissionQuittance.repository;

import Quittance.EmissionQuittance.models.Periodicite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PeriodeciteRepository  extends JpaRepository<Periodicite, Long> {
}
