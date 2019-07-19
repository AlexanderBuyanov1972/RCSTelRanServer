package com.telran.rentcompamyservice.entities;


import javax.persistence.*;
@Entity
@Table(name="")
public class Customer {
    @Id
    Integer customer_sid;
    String last_name;
    String first_name;
    String middle_name;


}
