package Quittance.EmissionQuittance.repository;

import Quittance.EmissionQuittance.models.Police;
import Quittance.EmissionQuittance.models.Quittance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Calendar;
import java.util.List;

@RepositoryRestResource
public interface QuittanceRepository extends JpaRepository<Quittance,Long> {
   Quittance findByNumeroQuittance(String numQuittance);
   List<Quittance> findAllByVersionCommerciale(String versionCommerciale);
   Quittance findQuittanceByCodePolice(String codePolice);
   List<Quittance> findAllByRefQuittance(Long refQuittance);
   List<Quittance> findAllByDateEmissionBetween(Calendar DebutD, Calendar FinD);
   List<Quittance> findAllByPolice(Police Police);


}
