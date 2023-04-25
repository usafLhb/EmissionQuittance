package Quittance.EmissionQuittance.repositories;

import Quittance.EmissionQuittance.entities.TermeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TermeEntityRepository extends JpaRepository<TermeEntity, Long> {
}