package gr.codehub.team7.propertywebapp.model;

import gr.codehub.team7.propertywebapp.domain.Repair;
import gr.codehub.team7.propertywebapp.enums.PropertyType;

import java.util.List;

public class OwnerModel {
    private Long id;
    private String firstname;
    private String lastname;
    private String ssn;
    private String email;
    private String address;
    private String phone_number;
    private String password;
    private boolean isAdmin;
    private PropertyType propertyType;
    private List<Repair> repairs;

    public OwnerModel() {
    }

    public OwnerModel(Long id, String firstname, String lastname, String ssn, String email, String address, String phone_number, String password, boolean isAdmin, PropertyType propertyType) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.email = email;
        this.address = address;
        this.phone_number = phone_number;
        this.password = password;
        this.isAdmin = isAdmin;
        this.propertyType = propertyType;
    }

    public OwnerModel(String firstname, String lastname, String ssn, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
    }
}
