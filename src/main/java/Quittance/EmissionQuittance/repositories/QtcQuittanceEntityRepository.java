package Quittance.EmissionQuittance.repositories;

import Quittance.EmissionQuittance.entities.QtcQuittanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;
import java.util.List;

@RepositoryRestResource
public interface QtcQuittanceEntityRepository extends JpaRepository<QtcQuittanceEntity, Long> {

    List<QtcQuittanceEntity> findByRefQuittance(String refQuittanceEntity);
    List<QtcQuittanceEntity> findAllByDatefinBetween(Date dateDebut, Date dateFin);
    List<QtcQuittanceEntity> findByCodepolice(String codePolice);
}