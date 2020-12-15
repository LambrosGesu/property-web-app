package gr.codehub.team7.propertywebapp.mappers;

import gr.codehub.team7.propertywebapp.domain.Owner;
import gr.codehub.team7.propertywebapp.domain.Repair;
import gr.codehub.team7.propertywebapp.enums.JobType;
import gr.codehub.team7.propertywebapp.enums.Status;
import gr.codehub.team7.propertywebapp.forms.EditRepairForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class RepairFormToRepairMapper {

    public Repair map(EditRepairForm form, Owner owner){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Repair repair= new Repair();
        repair.setPrice(Double.parseDouble(form.getPrice().replace(",",".")));
        repair.setAddress(form.getAddress());
        repair.setDescription(form.getDescription());
        repair.setStatus(Status.valueOf(form.getStatus()));
        repair.setJobType(JobType.valueOf(form.getJobType()));
        repair.setRepairDate(LocalDate.parse(form.getRepairDate(),formatter));
        repair.setOwner(owner);
        return repair;
    }

}
