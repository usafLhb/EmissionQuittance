package Quittance.EmissionQuittance.critaria.repo;

import Quittance.EmissionQuittance.critaria.entity.PersonSearchCriteria;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonSearchCriteria, Long> {
    Page<PersonSearchCriteria> findAll(Pageable pageable);

    Page<PersonSearchCriteria> findByFirstNameContainingOrLastNameContainingOrEmailContaining(
            String firstName, String lastName, String email, Pageable pageable);
}