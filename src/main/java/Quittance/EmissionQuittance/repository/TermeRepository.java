package Quittance.EmissionQuittance.repository;

import Quittance.EmissionQuittance.models.RefPolice;
import Quittance.EmissionQuittance.models.Terme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface TermeRepository extends JpaRepository<Terme, Long> {
}
