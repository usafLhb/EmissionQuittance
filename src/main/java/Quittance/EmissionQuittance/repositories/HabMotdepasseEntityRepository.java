package Quittance.EmissionQuittance.repositories;

import Quittance.EmissionQuittance.entities.HabMotdepasseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface HabMotdepasseEntityRepository extends JpaRepository<HabMotdepasseEntity, Long>
{
}