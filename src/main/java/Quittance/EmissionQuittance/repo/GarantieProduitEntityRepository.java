package Quittance.EmissionQuittance.repo;

import Quittance.EmissionQuittance.models.classes.GarantieProduitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface GarantieProduitEntityRepository extends JpaRepository<GarantieProduitEntity, Long> {
    @Override
    List<GarantieProduitEntity> findAllById(Iterable<Long> longs);
}