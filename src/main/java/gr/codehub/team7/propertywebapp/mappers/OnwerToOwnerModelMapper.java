package gr.codehub.team7.propertywebapp.mappers;

import gr.codehub.team7.propertywebapp.domain.Owner;
import gr.codehub.team7.propertywebapp.model.OwnerModel;
import org.springframework.stereotype.Component;

@Component
public class OnwerToOwnerModelMapper {

    public OwnerModel map(Owner onwer) {
        OwnerModel ownerModel = new OwnerModel();
        ownerModel.setFirstname(onwer.getFirstname());
        ownerModel.setLastname(onwer.getLastname());
        ownerModel.setAddress(onwer.getAddress());
        ownerModel.setPhone_number(onwer.getPhone_number());
        ownerModel.setSsn(onwer.getSsn());
        ownerModel.setEmail(onwer.getEmail());
        ownerModel.setPropertyType(onwer.getPropertyType());
    return ownerModel;
    }

}
