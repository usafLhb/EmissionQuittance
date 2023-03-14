package Quittance.EmissionQuittance.repository;

import Quittance.EmissionQuittance.models.Garantie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface GarantieRepository extends JpaRepository<Garantie, Long> {
    public Garantie findByCode(String code);
    public Garantie findByLibelle(String libelle);
}
