package gr.codehub.team7.propertywebapp.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import gr.codehub.team7.propertywebapp.enums.PropertyType;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "OWNER", uniqueConstraints = {@UniqueConstraint(columnNames = {"ssn", "email"})})
public class Owner {

    private static final int MAX_LENGTH = 60;
    private static final int MAX_SSN_LENGTH = 9;
    private static final int MAX_PHONE_LENGTH = 10; //+30?

    @Id
    @Column(name = "owner_id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ssn",nullable = false, length = MAX_SSN_LENGTH)
    private String ssn;

    @Column(name = "firstname", length = MAX_LENGTH)
    private String firstname;

    @Column(name = "lastname", length = MAX_LENGTH)
    private String lastname;

    @Column(name = "address", length = MAX_LENGTH)
    private String address;

    @Column(name = "phone_number", length = MAX_PHONE_LENGTH)
    private String phone_number;

    @Column(name = "email",nullable = false, length = MAX_LENGTH)
    private String email;

    @Column(name = "password", length = MAX_LENGTH)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "property_type")
    private PropertyType propertyType;

    @Column(name = "isAdmin")
    private boolean isAdmin;

    @JsonIgnore
    //@JsonBackReference
    @OneToMany(mappedBy = "owner", targetEntity = Repair.class)
    private List<Repair> repairs;

    public Owner(String ssn, String firstname, String lastname, String address, String phone_number, String email, String password, PropertyType propertyType, boolean isAdmin, List<Repair> repairs) {
        this.ssn = ssn;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.phone_number = phone_number;
        this.email = email;
        this.password = password;
        this.propertyType = propertyType;
        this.isAdmin=isAdmin;
        this.repairs = repairs;
    }

    public Owner(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String afm) {
        this.ssn = afm;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public List<Repair> getRepairs() {
        return repairs;
    }

    public void setRepairs(List<Repair> repairs) {
        this.repairs = repairs;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", afm='" + ssn + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", propertyType=" + propertyType +
                ", isAdmin=" + isAdmin +
                '}';
    }
}
