package Quittance.EmissionQuittance.repositories;

import Quittance.EmissionQuittance.entities.PoliceEntity;
import Quittance.EmissionQuittance.entities.QtcQuittanceEntity;
import Quittance.EmissionQuittance.entities.RefQuittanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RepositoryRestResource
public interface QtcQuittanceEntityRepository extends JpaRepository<QtcQuittanceEntity, Long> {

    List<QtcQuittanceEntity> findByRefQuittance(RefQuittanceEntity refQuittanceEntity);
    List<QtcQuittanceEntity> findAllByDatefinBetween(Date dateDebut, Date dateFin);
    List<QtcQuittanceEntity> findByCodepolice(String codePolice);
    QtcQuittanceEntity findByPolice (PoliceEntity police);
    List<QtcQuittanceEntity>  findAllByPolice (PoliceEntity police);

}