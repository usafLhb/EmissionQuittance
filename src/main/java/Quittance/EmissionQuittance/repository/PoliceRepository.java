package Quittance.EmissionQuittance.repository;

import Quittance.EmissionQuittance.models.Police;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Set;

@RepositoryRestResource
public interface PoliceRepository extends JpaRepository<Police, Long> {
    Set<Police> findAllByCodePolice(String codePolice);
    Set<Police> findAllByProduit(String produit);
    Set<Police> findAllByNumClient(String numClient);
    List<Police> findAll();
    Set<Police> findAllByNumClientAndProduit(String numClient, String produit);
    Set<Police> findAllByNumClientAndProduitAndCodePolice(String numClient, String produit, String codePolice);
    Set<Police> findAllByNumClientAndCodePolice(String numClient, String codePolice);
    Set<Police> findAllByProduitAndCodePolice(String produit, String codePolice);

}
