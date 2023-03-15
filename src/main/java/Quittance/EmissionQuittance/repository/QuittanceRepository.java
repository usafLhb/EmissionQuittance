package Quittance.EmissionQuittance.repository;

import Quittance.EmissionQuittance.models.Quittance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface QuittanceRepository extends JpaRepository<Quittance,Long> {
  /*  public Quittance findByNumQuittance(String numQuittance);
    public List<Quittance> findAllByVersionCommerciale(String versionCommerciale);
    public Quittance findQuittanceByCodePolice(String codePolice);*/

}
