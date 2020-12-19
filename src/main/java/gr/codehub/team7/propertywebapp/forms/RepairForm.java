package gr.codehub.team7.propertywebapp.forms;

import gr.codehub.team7.propertywebapp.domain.Owner;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class RepairForm {
    private String id;
    //den doulevoun ta validations
    @NotEmpty(message = "Please provide a date")
    private String repairDate;

    private String status;

    private String jobType;

    @NotEmpty(message = "Please provide a price")
    private String price;

    @NotEmpty(message = "Please provide an address")
    private String address;


    private String description;

    private Owner owner;

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

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
