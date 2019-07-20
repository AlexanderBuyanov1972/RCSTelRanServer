package com.telran.rentcompamyservice.entities;

import javax.persistence.*;

@Entity
@Table(name="modelsrcs")
public class ModelRCS {
    String car_group;           // "Car Group": "B",
    String sipp_code;           // "SIPP Code": "MBMR",
    Integer group_sig;          // "Group sig": 10,
    Integer seats;              // "Seats": 4,
    @Id
    String vehicle_type;        // "Vehicle Type": "Suzuki Alto Man.",
    Integer daily_1_2_low;      // "Daily(1-2)Low": 10,
    Integer daily_1_2_high;     // "Daily(1-2)High": 22,
    Integer daily_3_6_low;      // "Daily(3-6)Low": 10,
    Integer daily_3_6_high;     // "Daily(3-6)High": 22,
    Integer weekly_low;         // "Weekly-Low": 63,
    Integer weekly_high;        // "Weekly-High": 147,
    Integer ex_day_8_plus_low;  // "Ex. Day (8+)Low": 9,
    Integer ex_day_8_plus_high; // "Ex. Day (8+)High": 21,
    Integer month_30_plus_low;  // "Month (30+)Low": 610,
    Integer month_30_plus_high; // "Month (30+)High": 790,
    Integer cdw;                // "CDW": 10,
    Integer tp;                 // "TP": 5,
    Integer _3_plc;             // "3PLC": 12,
    Float extra_km;           // "Extra KM": 0.45,
    Integer super_cdw;          // "Super CDW": 10,
    Integer super_cdw_monthly;   // "Super CDW Mothly": 100,
    Integer super_tp;           // "Super TP": 5,
    Integer super_tp_monthly;   // "Super TP monthly": 60,
    Integer excess;             // "Excess": 475,   "": ""


    public ModelRCS() { }

    public ModelRCS(String car_group, String sipp_code, Integer group_sig, Integer seats, String vehicle_type,
                    Integer daily_1_2_low, Integer daily_1_2_high, Integer daily_3_6_low, Integer daily_3_6_high,
                    Integer weekly_low, Integer weekly_high, Integer ex_day_8_plus_low, Integer ex_day_8_plus_high,
                    Integer month_30_plus_low, Integer month_30_plus_high, Integer cdw, Integer tp, Integer _3_plc,
                    Float extra_km, Integer super_cdw, Integer super_cdw_monthly, Integer super_tp,
                    Integer super_tp_monthly, Integer excess) {
        this.car_group = car_group;
        this.sipp_code = sipp_code;
        this.group_sig = group_sig;
        this.seats = seats;
        this.vehicle_type = vehicle_type;
        this.daily_1_2_low = daily_1_2_low;
        this.daily_1_2_high = daily_1_2_high;
        this.daily_3_6_low = daily_3_6_low;
        this.daily_3_6_high = daily_3_6_high;
        this.weekly_low = weekly_low;
        this.weekly_high = weekly_high;
        this.ex_day_8_plus_low = ex_day_8_plus_low;
        this.ex_day_8_plus_high = ex_day_8_plus_high;
        this.month_30_plus_low = month_30_plus_low;
        this.month_30_plus_high = month_30_plus_high;
        this.cdw = cdw;
        this.tp = tp;
        this._3_plc = _3_plc;
        this.extra_km = extra_km;
        this.super_cdw = super_cdw;
        this.super_cdw_monthly = super_cdw_monthly;
        this.super_tp = super_tp;
        this.super_tp_monthly = super_tp_monthly;
        this.excess = excess;
    }

    public String getCar_group() {
        return car_group;
    }

    public void setCar_group(String car_group) {
        this.car_group = car_group;
    }

    public String getSipp_code() {
        return sipp_code;
    }

    public void setSipp_code(String sipp_code) {
        this.sipp_code = sipp_code;
    }

    public Integer getGroup_sig() {
        return group_sig;
    }

    public void setGroup_sig(Integer group_sig) {
        this.group_sig = group_sig;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public String getVehicle_type() {
        return vehicle_type;
    }

    public void setVehicle_type(String vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

    public Integer getDaily_1_2_low() {
        return daily_1_2_low;
    }

    public void setDaily_1_2_low(Integer daily_1_2_low) {
        this.daily_1_2_low = daily_1_2_low;
    }

    public Integer getDaily_1_2_high() {
        return daily_1_2_high;
    }

    public void setDaily_1_2_high(Integer daily_1_2_high) {
        this.daily_1_2_high = daily_1_2_high;
    }

    public Integer getDaily_3_6_low() {
        return daily_3_6_low;
    }

    public void setDaily_3_6_low(Integer daily_3_6_low) {
        this.daily_3_6_low = daily_3_6_low;
    }

    public Integer getDaily_3_6_high() {
        return daily_3_6_high;
    }

    public void setDaily_3_6_high(Integer daily_3_6_high) {
        this.daily_3_6_high = daily_3_6_high;
    }

    public Integer getWeekly_low() {
        return weekly_low;
    }

    public void setWeekly_low(Integer weekly_low) {
        this.weekly_low = weekly_low;
    }

    public Integer getWeekly_high() {
        return weekly_high;
    }

    public void setWeekly_high(Integer weekly_high) {
        this.weekly_high = weekly_high;
    }

    public Integer getEx_day_8_plus_low() {
        return ex_day_8_plus_low;
    }

    public void setEx_day_8_plus_low(Integer ex_day_8_plus_low) {
        this.ex_day_8_plus_low = ex_day_8_plus_low;
    }

    public Integer getEx_day_8_plus_high() {
        return ex_day_8_plus_high;
    }

    public void setEx_day_8_plus_high(Integer ex_day_8_plus_high) {
        this.ex_day_8_plus_high = ex_day_8_plus_high;
    }

    public Integer getMonth_30_plus_low() {
        return month_30_plus_low;
    }

    public void setMonth_30_plus_low(Integer month_30_plus_low) {
        this.month_30_plus_low = month_30_plus_low;
    }

    public Integer getMonth_30_plus_high() {
        return month_30_plus_high;
    }

    public void setMonth_30_plus_high(Integer month_30_plus_high) {
        this.month_30_plus_high = month_30_plus_high;
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

    public Integer get_3_plc() {
        return _3_plc;
    }

    public void set_3_plc(Integer _3_plc) {
        this._3_plc = _3_plc;
    }

    public Float getExtra_km() {
        return extra_km;
    }

    public void setExtra_km(Float extra_km) {
        this.extra_km = extra_km;
    }

    public Integer getSuper_cdw() {
        return super_cdw;
    }

    public void setSuper_cdw(Integer super_cdw) {
        this.super_cdw = super_cdw;
    }

    public Integer getSuper_cdw_monthly() {
        return super_cdw_monthly;
    }

    public void setSuper_cdw_monthly(Integer super_cdw_monthly) {
        this.super_cdw_monthly = super_cdw_monthly;
    }

    public Integer getSuper_tp() {
        return super_tp;
    }

    public void setSuper_tp(Integer super_tp) {
        this.super_tp = super_tp;
    }

    public Integer getSuper_tp_monthly() {
        return super_tp_monthly;
    }

    public void setSuper_tp_monthly(Integer super_tp_monthly) {
        this.super_tp_monthly = super_tp_monthly;
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
                "car_group='" + car_group + '\'' +
                ", sipp_code='" + sipp_code + '\'' +
                ", group_sig=" + group_sig +
                ", seats=" + seats +
                ", vehicle_type='" + vehicle_type + '\'' +
                ", daily_1_2_low=" + daily_1_2_low +
                ", daily_1_2_high=" + daily_1_2_high +
                ", daily_3_6_low=" + daily_3_6_low +
                ", daily_3_6_high=" + daily_3_6_high +
                ", weekly_low=" + weekly_low +
                ", weekly_high=" + weekly_high +
                ", ex_day_8_plus_low=" + ex_day_8_plus_low +
                ", ex_day_8_plus_high=" + ex_day_8_plus_high +
                ", month_30_plus_low=" + month_30_plus_low +
                ", month_30_plus_high=" + month_30_plus_high +
                ", cdw=" + cdw +
                ", tp=" + tp +
                ", _3_plc=" + _3_plc +
                ", extra_km=" + extra_km +
                ", super_cdw=" + super_cdw +
                ", super_cdw_monthly=" + super_cdw_monthly +
                ", super_tp=" + super_tp +
                ", super_tp_monthly=" + super_tp_monthly +
                ", excess=" + excess +
                '}';
    }
}
