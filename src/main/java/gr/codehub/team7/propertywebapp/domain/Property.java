package gr.codehub.team7.propertywebapp.domain;


import gr.codehub.team7.propertywebapp.enums.PropertyType;

import javax.persistence.*;

@Entity
@Table(name = "PROPERTY")
public class Property {

    @Id //E9 A.T.A.K - PRIMARY KEY
    @Column(name = "property_id", nullable = false, length = 11)
    private Long id;

    @Column(name = "address", nullable = false, length = 60)
    private String address;

    @Column(name = "year", nullable = false, length = 5)
    private String year;

    @Enumerated(EnumType.STRING)
    @Column(name = "property_type", nullable = false)
    private PropertyType propertyType;

    @ManyToOne(optional = false, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "owner_tid")
    private Owner owner_tid;

    public Property(Long id, String address, String year, PropertyType propertyType, Owner owner_tid) {
        this.id = id;
        this.address = address;
        this.year = year;
        this.propertyType = propertyType;
        this.owner_tid = owner_tid;
    }

    public Property() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
    }

    public Owner getOwner_tid() {
        return owner_tid;
    }

    public void setOwner_tid(Owner owner_tid) {
        this.owner_tid = owner_tid;
    }

    @Override
    public String toString() {
        return "Property{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", year='" + year + '\'' +
                ", propertyType=" + propertyType +
                ", owner_tid=" + owner_tid +
                '}';
    }
}
