package Quittance.EmissionQuittance.repository;

import Quittance.EmissionQuittance.models.RefQuittance;
import Quittance.EmissionQuittance.models.Ref_Commerciale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface Ref_CommercialeRepository extends JpaRepository<Ref_Commerciale, Long> {

}
