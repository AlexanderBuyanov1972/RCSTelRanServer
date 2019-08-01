package com.telran.rentcompamyservice.entities.models;

import javax.persistence.*;

@Entity
@Table(name="models_car")
public class ModelRCS {
    private String carGroup;           // "Car Group": "B",
    private String sippCode;           // "SIPP Code": "MBMR",
    private Integer groupSig;          // "Group sig": 10,
    private Integer seats;              // "Seats": 4,
    @Id
    private String vehicleType;        // "Vehicle Type": "Suzuki Alto Man.",
    private Integer daily12Low;      // "Daily(1-2)Low": 10,
    private Integer daily12High;     // "Daily(1-2)High": 22,
    private Integer daily36Low;      // "Daily(3-6)Low": 10,
    private Integer daily36High;     // "Daily(3-6)High": 22,
    private Integer weeklyLow;         // "Weekly-Low": 63,
    private Integer weeklyHigh;        // "Weekly-High": 147,
    private Integer exDay8PlusLow;  // "Ex. Day (8+)Low": 9,
    private Integer exDay8PlusHigh; // "Ex. Day (8+)High": 21,
    private Integer month30PlusLow;  // "Month (30+)Low": 610,
    private Integer month30PlusHigh; // "Month (30+)High": 790,
    private Integer cdw;                // "CDW": 10,
    private Integer tp;                 // "TP": 5,
    private Integer p3lc;             // "3PLC": 12,
    private Integer extraKm;           // "Extra KM": 0.45,
    private Integer superCdw;          // "Super CDW": 10,
    private Integer superCdwMonthly;   // "Super CDW Mothly": 100,
    private Integer superTp;           // "Super TP": 5,
    private Integer superTpMonthly;   // "Super TP monthly": 60,
    private Integer excess;             // "Excess": 475,   "": ""

    public ModelRCS() { }

    public String getCarGroup() {
        return carGroup;
    }

    public void setCarGroup(String carGroup) {
        this.carGroup = carGroup;
    }

    public String getSippCode() {
        return sippCode;
    }

    public void setSippCode(String sippCode) {
        this.sippCode = sippCode;
    }

    public Integer getGroupSig() {
        return groupSig;
    }

    public void setGroupSig(Integer groupSig) {
        this.groupSig = groupSig;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Integer getDaily12Low() {
        return daily12Low;
    }

    public void setDaily12Low(Integer daily12Low) {
        this.daily12Low = daily12Low;
    }

    public Integer getDaily12High() {
        return daily12High;
    }

    public void setDaily12High(Integer daily12High) {
        this.daily12High = daily12High;
    }

    public Integer getDaily36Low() {
        return daily36Low;
    }

    public void setDaily36Low(Integer daily36Low) {
        this.daily36Low = daily36Low;
    }

    public Integer getDaily36High() {
        return daily36High;
    }

    public void setDaily36High(Integer daily36High) {
        this.daily36High = daily36High;
    }

    public Integer getWeeklyLow() {
        return weeklyLow;
    }

    public void setWeeklyLow(Integer weeklyLow) {
        this.weeklyLow = weeklyLow;
    }

    public Integer getWeeklyHigh() {
        return weeklyHigh;
    }

    public void setWeeklyHigh(Integer weeklyHigh) {
        this.weeklyHigh = weeklyHigh;
    }

    public Integer getExDay8PlusLow() {
        return exDay8PlusLow;
    }

    public void setExDay8PlusLow(Integer exDay8PlusLow) {
        this.exDay8PlusLow = exDay8PlusLow;
    }

    public Integer getExDay8PlusHigh() {
        return exDay8PlusHigh;
    }

    public void setExDay8PlusHigh(Integer exDay8PlusHigh) {
        this.exDay8PlusHigh = exDay8PlusHigh;
    }

    public Integer getMonth30PlusLow() {
        return month30PlusLow;
    }

    public void setMonth30PlusLow(Integer month30PlusLow) {
        this.month30PlusLow = month30PlusLow;
    }

    public Integer getMonth30PlusHigh() {
        return month30PlusHigh;
    }

    public void setMonth30PlusHigh(Integer month30PlusHigh) {
        this.month30PlusHigh = month30PlusHigh;
    }

    public Integer getCdw() {
        return cdw;
    }

    public void setCdw(Integer cdw) {
        this.cdw = cdw;
    }

    public Integer getTp() {
        return tp;
    }

    public void setTp(Integer tp) {
        this.tp = tp;
    }

    public Integer getP3lc() {
        return p3lc;
    }

    public void setP3lc(Integer p3lc) {
        this.p3lc = p3lc;
    }

    public Integer getExtraKm() {
        return extraKm;
    }

    public void setExtraKm(Integer extraKm) {
        this.extraKm = extraKm;
    }

    public Integer getSuperCdw() {
        return superCdw;
    }

    public void setSuperCdw(Integer superCdw) {
        this.superCdw = superCdw;
    }

    public Integer getSuperCdwMonthly() {
        return superCdwMonthly;
    }

    public void setSuperCdwMonthly(Integer superCdwMonthly) {
        this.superCdwMonthly = superCdwMonthly;
    }

    public Integer getSuperTp() {
        return superTp;
    }

    public void setSuperTp(Integer superTp) {
        this.superTp = superTp;
    }

    public Integer getSuperTpMonthly() {
        return superTpMonthly;
    }

    public void setSuperTpMonthly(Integer superTpMonthly) {
        this.superTpMonthly = superTpMonthly;
    }

    public Integer getExcess() {
        return excess;
    }

    public void setExcess(Integer excess) {
        this.excess = excess;
    }

    @Override
    public String toString() {
        return "ModelRCS{" +
                "carGroup='" + carGroup + '\'' +
                ", sippCode='" + sippCode + '\'' +
                ", groupSig=" + groupSig +
                ", seats=" + seats +
                ", vehicleType='" + vehicleType + '\'' +
                ", daily12Low=" + daily12Low +
                ", daily12High=" + daily12High +
                ", daily36Low=" + daily36Low +
                ", daily36High=" + daily36High +
                ", weeklyLow=" + weeklyLow +
                ", weeklyHigh=" + weeklyHigh +
                ", exDay8PlusLow=" + exDay8PlusLow +
                ", exDay8PlusHigh=" + exDay8PlusHigh +
                ", month30PlusLow=" + month30PlusLow +
                ", month30PlusHigh=" + month30PlusHigh +
                ", cdw=" + cdw +
                ", tp=" + tp +
                ", 3plc=" + p3lc +
                ", extraKm=" + extraKm +
                ", superCdw=" + superCdw +
                ", superCdwMonthly=" + superCdwMonthly +
                ", superTp=" + superTp +
                ", superTpMonthly=" + superTpMonthly +
                ", excess=" + excess +
                '}';
    }
}
