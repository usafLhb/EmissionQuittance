package Quittance.EmissionQuittance.repositories;

import Quittance.EmissionQuittance.entities.QtcRemiseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface QtcRemiseEntityRepository extends JpaRepository<QtcRemiseEntity, Long> {
}