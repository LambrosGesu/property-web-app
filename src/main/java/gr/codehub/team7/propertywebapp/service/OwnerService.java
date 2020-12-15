package gr.codehub.team7.propertywebapp.service;

import gr.codehub.team7.propertywebapp.domain.Owner;

import java.util.List;
import java.util.Optional;

public interface OwnerService {


    List<Owner> getAllOwners();
    Optional<Owner> findOwnerByEmail(String email);
    Optional<Owner> findOwnerBySsn(String ssn);

    Owner insertOwner(Owner owner);
    Owner updateOwner(Owner owner, Long id);

    void deleteOwnerById(Long id);

    Optional<Owner> findOwnerById(Long id);

//    List<OwnerModel> findOwnerBySsn(String ssn);

//    List<Owner> findOwnerByEmail(String email);
}
