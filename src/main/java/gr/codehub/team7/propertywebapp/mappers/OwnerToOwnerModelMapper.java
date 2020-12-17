package gr.codehub.team7.propertywebapp.mappers;

import gr.codehub.team7.propertywebapp.domain.Owner;
import gr.codehub.team7.propertywebapp.model.OwnerModel;
import org.springframework.stereotype.Component;

@Component
public class OwnerToOwnerModelMapper {

    public OwnerModel map(Owner owner) {
        OwnerModel ownerModel = new OwnerModel();
        ownerModel.setId(owner.getId());
        ownerModel.setFirstname(owner.getFirstname());
        ownerModel.setLastname(owner.getLastname());
        ownerModel.setAddress(owner.getAddress());
        ownerModel.setPhone_number(owner.getPhone_number());
        ownerModel.setSsn(owner.getSsn());
        ownerModel.setEmail(owner.getEmail());
        ownerModel.setPassword(owner.getPassword());
        ownerModel.setPropertyType(owner.getPropertyType());
    return ownerModel;
    }

}
