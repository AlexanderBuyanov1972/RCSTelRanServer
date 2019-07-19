package com.telran.rentcompamyservice.entities;

import javax.persistence.*;
@Entity
@Table(name="customer_addresses")
public class CustomerAddress {
    @Id
  Integer customer_sid;
  Integer address_sid;
}
