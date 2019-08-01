package com.telran.rentcompamyservice.entities.calculation;

import java.time.LocalDate;

public class PeriodRent {
    LocalDate rentDate;
    Integer rentDays;

    public PeriodRent() {
    }

    public LocalDate getRentDate() {
        return rentDate;
    }

    public PeriodRent setRentDate(LocalDate rentDate) {
        this.rentDate = rentDate;
        return this;
    }

    public Integer getRentDays() {
        return rentDays;
    }

    public PeriodRent setRentDays(Integer rentDays) {
        this.rentDays = rentDays;
        return this;
    }
}
