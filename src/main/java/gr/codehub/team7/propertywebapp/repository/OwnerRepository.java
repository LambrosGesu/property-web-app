package gr.codehub.team7.propertywebapp.repository;

import gr.codehub.team7.propertywebapp.domain.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OwnerRepository extends JpaRepository<Owner, Long> {

    Optional<Owner> findOwnerByEmail(String email);
    Optional<Owner> findOwnerBySsn(String ssn);

    void deleteOwnerById(Long id);
}
