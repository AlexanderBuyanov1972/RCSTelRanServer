package com.telran.rentcompamyservice.entities;
import javax.persistence.*;
//@Entity
//@Table(name="vehicles")
public class Vehicle {
    @Id
    Integer vehicle_sid;
    String vin;
    Character available_indicator;
    Integer odoMeter;
    String make;
    String model;
    Integer year;
    String condition_desc;

}
