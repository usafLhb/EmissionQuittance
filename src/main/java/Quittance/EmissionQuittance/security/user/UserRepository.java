package Quittance.EmissionQuittance.security.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User,Integer> {

    Optional<User> findByEmail(String email);

}
