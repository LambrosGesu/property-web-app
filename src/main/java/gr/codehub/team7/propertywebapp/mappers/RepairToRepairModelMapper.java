package gr.codehub.team7.propertywebapp.mappers;
import gr.codehub.team7.propertywebapp.domain.Repair;
import gr.codehub.team7.propertywebapp.model.RepairModel;
import org.springframework.stereotype.Component;
@Component
public class RepairToRepairModelMapper {

    public RepairModel map(Repair repair){
        RepairModel repairModel = new RepairModel();
        //remove id from tables
        repairModel.setId(repair.getId());
        repairModel.setRepairDate(repair.getRepairDate()); // this need to be changed to string both
        //here and in model
        repairModel.setAddress(repair.getAddress());
        repairModel.setDescription(repair.getDescription());
        repairModel.setStatus(repair.getStatus());
        repairModel.setJobType(repair.getJobType());
        repairModel.setPrice(repair.getPrice());

        //this Can be one attribute for repair model instead of too
        repairModel.setOwnerFirstName(repair.getOwner().getFirstname());
        repairModel.setOwnerLastName(repair.getOwner().getLastname());


        return repairModel;


    }
}
