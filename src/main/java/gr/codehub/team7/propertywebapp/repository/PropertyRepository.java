package gr.codehub.team7.propertywebapp.repository;

import gr.codehub.team7.propertywebapp.domain.Property;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PropertyRepository extends JpaRepository<Property, Long> {

    Optional<Property> findPropertyById(Long id);
    Optional<Property> findPropertyByOwner_tid(Long tid);

}
