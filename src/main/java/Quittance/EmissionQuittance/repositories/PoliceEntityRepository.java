package Quittance.EmissionQuittance.repositories;

import Quittance.EmissionQuittance.dto.request.PoliceDTO;
import Quittance.EmissionQuittance.dto.request.PrdVersioncommercialeDTO;
import Quittance.EmissionQuittance.entities.PoliceEntity;
import Quittance.EmissionQuittance.entities.PrdProduitEntity;
import Quittance.EmissionQuittance.entities.PrdVersioncommercialeEntity;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

import java.util.List;

@RepositoryRestResource
@Component
public interface PoliceEntityRepository extends JpaRepository<PoliceEntity, Long>, JpaSpecificationExecutor<PoliceEntity> {
   /*  List<PoliceEntity> findAllByNumClient(Long numClient);
     List<PoliceEntity> findAllByPrd_versionCommerciale(PrdVersioncommercialeDTO versionCommerciale);
     List<PoliceEntity> findAllByCodePolice(String codePolice);
     List<PoliceEntity> findAllByNumClientAndPrd_versionCommerciale(Long numClient, PrdVersioncommercialeDTO v_comm);
     List<PoliceEntity> findAllByNumClientAndCodePolice(Long numClient, String codePolice);
     List<PoliceEntity> findAllByPrd_versionCommercialeAndCodePolice
     List<PoliceEntity> findAllByNumClientAndPrd_versionCommercialeAndCodePolice(Long numClient, PrdVersioncommercialeDTO v_comm, String codePolice);*/

}
