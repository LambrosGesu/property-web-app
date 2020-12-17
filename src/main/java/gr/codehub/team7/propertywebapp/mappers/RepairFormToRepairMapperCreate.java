package gr.codehub.team7.propertywebapp.mappers;

import gr.codehub.team7.propertywebapp.domain.Owner;
import gr.codehub.team7.propertywebapp.domain.Repair;
import gr.codehub.team7.propertywebapp.enums.JobType;
import gr.codehub.team7.propertywebapp.enums.Status;
import gr.codehub.team7.propertywebapp.forms.RepairForm;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class RepairFormToRepairMapperCreate {

    public Repair map(RepairForm repairForm){
        Repair repair=new Repair();
        repair.setRepairDate(parseLocalDateFromString(repairForm.getRepairDate()));
        repair.setStatus(Status.valueOf(repairForm.getStatus()));
        repair.setJobType(JobType.valueOf(repairForm.getJobType()));
        repair.setPrice(Double.parseDouble(repairForm.getPrice()));
        repair.setAddress(repairForm.getAddress());
        repair.setDescription(repairForm.getDescription());
        repair.setOwner(repairForm.getOwner());
        return repair;
    }

    private LocalDate parseLocalDateFromString(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); //ex: '1939-01-01'
        return LocalDate.parse(date, formatter);
    }
}
