package com.telran.rentcompamyservice.entities.for_calculation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="location_branches")
public class LocationBranch {
    @Id
    private String city;
    private String address;
    private String openhours;
    private String phone;

    public LocationBranch() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public LocationBranch setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getOpenhours() {
        return openhours;
    }

    public LocationBranch setOpenhours(String openhours) {
        this.openhours = openhours;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public LocationBranch setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public String toString() {
        return "LocationBranch{" +
                "city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", openhours='" + openhours + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
