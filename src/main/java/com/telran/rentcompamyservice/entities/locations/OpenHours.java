package com.telran.rentcompamyservice.entities.locations;

public class OpenHours {
    String sunday;
    String monday;
    String tuesday;
    String wednesday;
    String thursday;
    String friday;
    String saturday;

    public OpenHours() {
    }

    public String getSunday() {
        return sunday;
    }

    public OpenHours setSunday(String sunday) {
        this.sunday = sunday;
        return this;
    }

    public String getMonday() {
        return monday;
    }

    public OpenHours setMonday(String monday) {
        this.monday = monday;
        return this;
    }

    public String getTuesday() {
        return tuesday;
    }

    public OpenHours setTuesday(String tuesday) {
        this.tuesday = tuesday;
        return this;
    }

    public String getWednesday() {
        return wednesday;
    }

    public OpenHours setWednesday(String wednesday) {
        this.wednesday = wednesday;
        return this;
    }

    public String getThursday() {
        return thursday;
    }

    public OpenHours setThursday(String thursday) {
        this.thursday = thursday;
        return this;
    }

    public String getFriday() {
        return friday;
    }

    public OpenHours setFriday(String friday) {
        this.friday = friday;
        return this;
    }

    public String getSaturday() {
        return saturday;
    }

    public OpenHours setSaturday(String saturday) {
        this.saturday = saturday;
        return this;
    }

    @Override
    public String toString() {
        return "OpenHours{" +
                "sunday='" + sunday + '\'' +
                ", monday='" + monday + '\'' +
                ", tuesday='" + tuesday + '\'' +
                ", wednesday='" + wednesday + '\'' +
                ", thursday='" + thursday + '\'' +
                ", friday='" + friday + '\'' +
                ", saturday='" + saturday + '\'' +
                '}';
    }
}
