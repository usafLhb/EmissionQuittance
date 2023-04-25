package Quittance.EmissionQuittance.repositories;

import Quittance.EmissionQuittance.entities.HabUtilisateurEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface HabUtilisateurEntityRepository extends JpaRepository<HabUtilisateurEntity, Long> {
}