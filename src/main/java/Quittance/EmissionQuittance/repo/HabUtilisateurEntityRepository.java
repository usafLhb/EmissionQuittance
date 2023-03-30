package Quittance.EmissionQuittance.repo;

import Quittance.EmissionQuittance.models.classes.HabUtilisateurEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface HabUtilisateurEntityRepository extends JpaRepository<HabUtilisateurEntity, Long> {
}