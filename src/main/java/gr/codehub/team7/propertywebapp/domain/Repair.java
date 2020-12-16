package gr.codehub.team7.propertywebapp.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import gr.codehub.team7.propertywebapp.enums.JobType;
import gr.codehub.team7.propertywebapp.enums.Status;
import org.apache.tomcat.jni.Local;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "REPAIR")
public class Repair {

    private static final int MAX_NAME_LENGTH = 60;
    private static final int MAX_DESCR_LENGTH = 300;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "repair_id")
    private Long id;

    @Column(name = "repair_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate repairDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

    @Enumerated(EnumType.STRING)
    @Column(name = "job_type")
    private JobType jobType;

    @Column(name = "price")
    private double price;

    @Column(name = "address", length = MAX_NAME_LENGTH)
    private String address;

    @Column(name = "description", length = MAX_DESCR_LENGTH)
    private String description;

    @JsonIgnore // CAUTION NEEDS CHANGE
    @JsonManagedReference
    @ManyToOne(optional = false, cascade = {CascadeType.MERGE, CascadeType.REFRESH}) ///, CascadeType.REMOVE
    @JoinColumn(name = "owner_id")
    private Owner owner;

    public Repair(LocalDate repairDate, Status status, JobType jobType, double price, String address, String description, Owner owner) {
        this.repairDate = repairDate;
        this.status = status;
        this.jobType = jobType;
        this.price = price;
        this.address = address;
        this.description = description;
        this.owner=owner;
    }

    public Repair(){}

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

    @Override
    public String toString() {
        return "Repair{" +
                "id=" + id +
                ", repairDate=" + repairDate +
                ", status=" + status +
                ", jobType=" + jobType +
                ", price=" + price +
                ", address='" + address + '\'' +
                ", description='" + description + '\'' +
                ", owner=" + owner +
                '}';
    }
}
