package Quittance.EmissionQuittance.repository;

import Quittance.EmissionQuittance.models.Police;
import Quittance.EmissionQuittance.models.Qtc_Remise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PoliceInterface extends JpaRepository<Police, Long> {
}
