package Quittance.EmissionQuittance.repository;

import Quittance.EmissionQuittance.models.classes.QtcRemiseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface TermeRepository extends JpaRepository<QtcRemiseEntity.Terme, Long> {
}
