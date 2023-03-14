package Quittance.EmissionQuittance.repository;

import Quittance.EmissionQuittance.models.Qtc_Remise;
import Quittance.EmissionQuittance.models.Ref_Commerciale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Qtc_RemiseRepository extends JpaRepository<Qtc_Remise, Long> {
}
