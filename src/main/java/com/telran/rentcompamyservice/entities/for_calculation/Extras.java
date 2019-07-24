package com.telran.rentcompamyservice.entities.for_calculation;

public class Extras {
    private Integer childBooster;
    private Integer childSeat;
    private Integer babyChildSeat;
    private Boolean roadsafeAssistanceg;
    private Integer smartphone;
    private Boolean additionalDriver;
    private Boolean underageDriver;
    private Boolean airportFee;
    private Boolean vipService;

    public Extras() {
    }

    public Extras setChildBooster(Integer childBooster) {
        this.childBooster = childBooster;
        return this;
    }

    public Extras setChildSeat(Integer childSeat) {
        this.childSeat = childSeat;
        return this;
    }

    public Extras setBabyChildSeat(Integer babyChildSeat) {
        this.babyChildSeat = babyChildSeat;
        return this;
    }

    public Extras setRoadsafeAssistanceg(Boolean roadsafeAssistanceg) {
        this.roadsafeAssistanceg = roadsafeAssistanceg;
        return this;
    }

    public Extras setSmartphone(Integer smartphone) {
        this.smartphone = smartphone;
        return this;
    }

    public Extras setAdditionalDriver(Boolean additionalDriver) {
        this.additionalDriver = additionalDriver;
        return this;
    }

    public Extras setUnderageDriver(Boolean underageDriver) {
        this.underageDriver = underageDriver;
        return this;
    }

    public Extras setAirportFee(Boolean airportFee) {
        this.airportFee = airportFee;
        return this;
    }

    public Extras setVipService(Boolean vipService) {
        this.vipService = vipService;
        return this;
    }

    public Integer getChildBooster() {
        return childBooster;
    }

    public Integer getChildSeat() {
        return childSeat;
    }

    public Integer getBabyChildSeat() {
        return babyChildSeat;
    }

    public Boolean getRoadsafeAssistanceg() {
        return roadsafeAssistanceg;
    }

    public Integer getSmartphone() {
        return smartphone;
    }

    public Boolean getAdditionalDriver() {
        return additionalDriver;
    }

    public Boolean getUnderageDriver() {
        return underageDriver;
    }

    public Boolean getAirportFee() {
        return airportFee;
    }

    public Boolean getVipService() {
        return vipService;
    }

    @Override
    public String toString() {
        return "Extras{" +
                "childBooster=" + childBooster +
                ", childSeat=" + childSeat +
                ", babyChildSeat=" + babyChildSeat +
                ", roadsafeAssistanceg=" + roadsafeAssistanceg +
                ", smartphone=" + smartphone +
                ", additionalDriver=" + additionalDriver +
                ", underageDriver=" + underageDriver +
                ", airportFee=" + airportFee +
                ", vipService=" + vipService +
                '}';
    }
}
