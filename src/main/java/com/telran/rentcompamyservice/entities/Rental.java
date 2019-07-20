package com.telran.rentcompamyservice.entities;

import java.time.LocalDate;
import javax.persistence.*;

//@Entity
//@Table(name="rentals")
public class Rental {
    @Id
    Integer rental_sid;
    LocalDate pickUp_date;
    LocalDate dropOff_date;
    Integer vehicle_vehicle_sid;
    Integer customer_customer_sid;
    Integer branch_branch_sid;



}
