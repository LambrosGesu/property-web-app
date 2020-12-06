package gr.codehub.team7.propertywebapp.service;

import gr.codehub.team7.propertywebapp.domain.Owner;
import gr.codehub.team7.propertywebapp.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OwnerServiceImpl implements OwnerService{

    @Autowired
    private OwnerRepository ownerRepository;

//    @Override
//    public Optional<Owner> findOwner(Long id) {
//        return ownerRepository.findById(id);
//    }

    @Override
    public List<Owner> getAllOwners() {
        return ownerRepository.findAll();
    }

    @Override
    public Optional<Owner> findOwnerByEmail(String email) {
        return ownerRepository.findOwnerByEmail(email);
    }

    @Override
    public Optional<Owner> findOwnerBySsn(String ssn) {
        return ownerRepository.findOwnerBySsn(ssn);
    }

    @Override
    public void deleteOwnerById(Long id) {
        ownerRepository.deleteById(id);
    }

}
