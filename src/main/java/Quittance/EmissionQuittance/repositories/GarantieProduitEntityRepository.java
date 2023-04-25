package Quittance.EmissionQuittance.repositories;

import Quittance.EmissionQuittance.entities.GarantieProduitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface GarantieProduitEntityRepository extends JpaRepository<GarantieProduitEntity, Long> {
}