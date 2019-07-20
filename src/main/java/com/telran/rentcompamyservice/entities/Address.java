package com.telran.rentcompamyservice.entities;

import javax.persistence.*;

//@Entity
//@Table(name = "addresses")
public class Address {
    @Id
    Integer address_sid;
    String street_address_1;
    String street_address_2;
    String city;
    String state;
    String zip;
}
