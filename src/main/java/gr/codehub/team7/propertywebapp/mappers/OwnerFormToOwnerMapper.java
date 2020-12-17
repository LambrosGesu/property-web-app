package gr.codehub.team7.propertywebapp.mappers;

import gr.codehub.team7.propertywebapp.domain.Owner;
import gr.codehub.team7.propertywebapp.enums.PropertyType;
import gr.codehub.team7.propertywebapp.forms.OwnerForm;
import org.springframework.stereotype.Component;

@Component
public class OwnerFormToOwnerMapper {

    public Owner map(OwnerForm ownerForm){
        Owner owner= new Owner();
        owner.setSsn(ownerForm.getSsn());
        owner.setPhone_number(ownerForm.getPhone_number());
        owner.setFirstname(ownerForm.getFirstname());
        owner.setLastname(ownerForm.getLastname());
        owner.setAddress(ownerForm.getAddress());
        owner.setEmail(ownerForm.getEmail());
        owner.setPassword(ownerForm.getPassword());
        owner.setPropertyType(PropertyType.valueOf(ownerForm.getPropertyType()));

        return owner;
    }
}
