package Quittance.EmissionQuittance.repo;

import Quittance.EmissionQuittance.models.classes.HabMotdepasseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface HabMotdepasseEntityRepository extends JpaRepository<HabMotdepasseEntity, Long> {
}