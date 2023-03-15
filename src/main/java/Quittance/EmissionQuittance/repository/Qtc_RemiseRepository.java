package Quittance.EmissionQuittance.repository;

import Quittance.EmissionQuittance.models.Qtc_Remise;
import Quittance.EmissionQuittance.models.Quittance;
import Quittance.EmissionQuittance.models.Ref_Commerciale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Qtc_RemiseRepository extends JpaRepository<Qtc_Remise, Long> {
    Qtc_Remise findMontantByCodeRemise(Long codeRemise);
}
