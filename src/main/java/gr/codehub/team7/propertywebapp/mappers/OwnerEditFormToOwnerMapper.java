package gr.codehub.team7.propertywebapp.mappers;

import gr.codehub.team7.propertywebapp.domain.Owner;
import gr.codehub.team7.propertywebapp.enums.PropertyType;
import gr.codehub.team7.propertywebapp.forms.OwnerEditForm;
import gr.codehub.team7.propertywebapp.forms.OwnerForm;
import org.springframework.stereotype.Component;


@Component
public class OwnerEditFormToOwnerMapper {

    public Owner map(OwnerEditForm ownerForm){
        Owner owner= new Owner();
        owner.setSsn(ownerForm.getSsn());
        owner.setPhone_number(ownerForm.getPhone_number());
        owner.setFirstname(ownerForm.getFirstname());
        owner.setLastname(ownerForm.getLastname());
        owner.setAddress(ownerForm.getAddress());
        owner.setEmail(ownerForm.getEmail());
        owner.setPropertyType(PropertyType.valueOf(ownerForm.getPropertyType()));

        return owner;
    }
}
