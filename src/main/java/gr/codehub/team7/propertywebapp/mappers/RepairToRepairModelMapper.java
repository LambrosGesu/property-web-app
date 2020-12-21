package gr.codehub.team7.propertywebapp.mappers;

import gr.codehub.team7.propertywebapp.domain.Owner;
import gr.codehub.team7.propertywebapp.domain.Repair;
import gr.codehub.team7.propertywebapp.enums.JobType;
import gr.codehub.team7.propertywebapp.enums.Status;
import gr.codehub.team7.propertywebapp.model.RepairModel;
import org.springframework.stereotype.Component;

@Component
public class RepairToRepairModelMapper {

        public RepairModel map(Repair repair){
                RepairModel repairModel=new RepairModel();

                repairModel.setId(repair.getId());
                repairModel.setRepairDate(repair.getRepairDate());
                repairModel.setStatus(repair.getStatus() !=null ? repair.getStatus() : Status.ONGOING);
                repairModel.setJobType(repair.getJobType() !=null ? repair.getJobType() : JobType.ELECTRICAL);
                repairModel.setPrice(repair.getPrice());
                repairModel.setAddress(repair.getAddress());
                repairModel.setDescription(repair.getDescription());
                repairModel.setOwner(repair.getOwner());
                repairModel.setOwnerFirstName(repair.getOwner().getFirstname());
                repairModel.setOwnerLastName(repair.getOwner().getLastname());

                return repairModel;
        }
}
