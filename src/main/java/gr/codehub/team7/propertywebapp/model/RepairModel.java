package gr.codehub.team7.propertywebapp.model;

import gr.codehub.team7.propertywebapp.domain.Owner;
import gr.codehub.team7.propertywebapp.enums.JobType;
import gr.codehub.team7.propertywebapp.enums.Status;

import java.time.LocalDate;

public class RepairModel {
    private Long id;
    private LocalDate repairDate;
    private Status status;
    private JobType jobType;
    private double price;
    private String address;
    private String description;
    private Owner owner;
    private Long ownerId;
    private String ownerFirstName;
    private String ownerLastName;

    public RepairModel(){

    }

    public RepairModel(Long id, LocalDate repairDate, Status status, JobType jobType, double price,String address, String description){
        this.id=id;
        this.repairDate=repairDate;
        this.status=status;
        this.jobType=jobType;
        this.price=price;
        this.address=address;
        this.description=description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getRepairDate() {
        return repairDate;
    }

    public void setRepairDate(LocalDate repairDate) {
        this.repairDate = repairDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
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

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public void setOwnerFirstName(String ownerFirstName) {
        this.ownerFirstName = ownerFirstName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }
}
