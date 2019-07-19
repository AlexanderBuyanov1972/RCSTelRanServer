package com.telran.rentcompamyservice.entities;

import javax.persistence.*;

@Entity
@Table(name="branch_addresses")
public class BranchAddress {
    @Id
    Integer address_sid;
    Integer branch_sid;
}
