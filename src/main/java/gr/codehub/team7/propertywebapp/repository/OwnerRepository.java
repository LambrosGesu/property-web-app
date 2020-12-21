package gr.codehub.team7.propertywebapp.repository;

import gr.codehub.team7.propertywebapp.domain.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {

    Optional<Owner> findOwnerByEmail(String email);
    Optional<Owner> findOwnerBySsn(String ssn);
    List<Owner> findOwnerBySsnOrEmail(String ssn, String email);

    void deleteOwnerById(Long id);
}
