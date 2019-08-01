package com.telran.rentcompamyservice.entities.locations;

public class Branch {
    String name;
    String address;
    OpenHours openhours;
    String phone;

    public Branch() {
    }


    public String getAddress() {
        return address;
    }

    public Branch setAddress(String address) {
        this.address = address;
        return this;
    }

    public OpenHours getOpenhours() {
        return openhours;
    }

    public Branch setOpenhours(OpenHours openhours) {
        this.openhours = openhours;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Branch setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getName() {
        return name;
    }

    public Branch setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "City{" +
                "address='" + address + '\'' +
                ", openhours=" + openhours +
                ", phone='" + phone + '\'' +
                '}';
    }
}
