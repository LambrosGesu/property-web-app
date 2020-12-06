package gr.codehub.team7.propertywebapp.service;

import gr.codehub.team7.propertywebapp.domain.Property;

import java.util.List;
import java.util.Optional;

public interface PropertyService {

    List<Property> getAllOwners();

    Optional<Property> findPropertyById(Long id);
    Optional<Property> findPropertyByOwner_tid(Long tid);

}
