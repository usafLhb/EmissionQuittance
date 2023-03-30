package Quittance.EmissionQuittance.repo;

import Quittance.EmissionQuittance.models.classes.TermeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TermeEntityRepository extends JpaRepository<TermeEntity, Long> {
}