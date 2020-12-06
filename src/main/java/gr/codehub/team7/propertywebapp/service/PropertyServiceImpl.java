package gr.codehub.team7.propertywebapp.service;

import gr.codehub.team7.propertywebapp.domain.Property;
import gr.codehub.team7.propertywebapp.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PropertyServiceImpl implements PropertyService{

    @Autowired
    private PropertyRepository propertyRepository;


    @Override
    public List<Property> getAllOwners() {
        return propertyRepository.findAll();
    }

    @Override
    public Optional<Property> findPropertyById(Long id) {
        return propertyRepository.findPropertyById(id);
    }

    @Override
    public Optional<Property> findPropertyByOwner_tid(Long tid) {
        return propertyRepository.findPropertyByOwner_tid(tid);
    }
}
