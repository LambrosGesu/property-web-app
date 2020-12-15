package gr.codehub.team7.propertywebapp.forms;

import gr.codehub.team7.propertywebapp.enums.JobType;
import gr.codehub.team7.propertywebapp.enums.Status;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class EditRepairForm {

    private String id;

    private String repairDate;

    private String status;

    private String jobType;

    private String price;

    private String address;

    private String description;

    private String owner;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRepairDate() {
        return repairDate;
    }

    public void setRepairDate(String repairDate) {
        this.repairDate = repairDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwner(){
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
