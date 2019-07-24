package com.telran.rentcompamyservice.entities.for_calculation;

public class RequestForGettingPrice {
    private String citizenship;
    private String vehicleType;
    private PeriodRent periodRent;
    private Protection protection;
    private Extras extras;
    private String discount;

    public RequestForGettingPrice() {
    }

    public String getCitizenship() {
        return citizenship;
    }

    public RequestForGettingPrice setCitizenship(String citizenship) {
        this.citizenship = citizenship;
        return this;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public RequestForGettingPrice setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
        return this;
    }

    public PeriodRent getPeriodRent() {
        return periodRent;
    }

    public RequestForGettingPrice setPeriodRent(PeriodRent periodRent) {
        this.periodRent = periodRent;
        return this;
    }

    public Protection getProtection() {
        return protection;
    }

    public RequestForGettingPrice setProtection(Protection protection) {
        this.protection = protection;
        return this;
    }

    public Extras getExtras() {
        return extras;
    }

    public RequestForGettingPrice setExtras(Extras extras) {
        this.extras = extras;
        return this;
    }

    public String getDiscount() {
        return discount;
    }

    public RequestForGettingPrice setDiscount(String discount) {
        this.discount = discount;
        return this;
    }

    @Override
    public String toString() {
        return "RequestForGettingPrice{" +
                "citizenship='" + citizenship + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", periodRent=" + periodRent +
                ", protection=" + protection +
                ", extras=" + extras +
                ", discount='" + discount + '\'' +
                '}';
    }
}
