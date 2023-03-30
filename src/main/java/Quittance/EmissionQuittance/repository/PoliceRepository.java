package Quittance.EmissionQuittance.repository;

import Quittance.EmissionQuittance.models.classes.PoliceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Set;

@RepositoryRestResource
public interface PoliceRepository extends JpaRepository<PoliceEntity, Long> {
    Set<PoliceEntity> findAllByCodePolice(String codePolice);
    Set<PoliceEntity> findAllByProduit(String produit);
    Set<PoliceEntity> findAllByNumClient(String numClient);
    List<PoliceEntity> findAll();
    Set<PoliceEntity> findAllByNumClientAndProduit(String numClient, String produit);
    Set<PoliceEntity> findAllByNumClientAndProduitAndCodePolice(String numClient, String produit, String codePolice);
    Set<PoliceEntity> findAllByNumClientAndCodePolice(String numClient, String codePolice);
    Set<PoliceEntity> findAllByProduitAndCodePolice(String produit, String codePolice);

}
