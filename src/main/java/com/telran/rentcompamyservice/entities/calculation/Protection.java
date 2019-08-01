package com.telran.rentcompamyservice.entities.calculation;

public class Protection {
    private Boolean cdw;
    private Boolean plc3;
    private Boolean superCDW;
    private Boolean superTP;
    private Boolean superCDWMonth;
    private Boolean superTPMonth;

    public Protection() {
    }

    public Boolean getCdw() {
        return cdw;
    }

    public Protection setCdw(Boolean cdw) {
        this.cdw = cdw;
        return  this;
    }

    public Boolean getPlc3() {
        return plc3;
    }

    public Protection setPlc3(Boolean plc3) {
        this.plc3 = plc3;
        return this;
    }

    public Boolean getSuperCDW() {
        return superCDW;
    }

    public Protection setSuperCDW(Boolean superCDW) {
        this.superCDW = superCDW;
        return this;
    }

    public Boolean getSuperTP() {
        return superTP;
    }

    public Protection setSuperTP(Boolean superTP) {
        this.superTP = superTP;
        return this;
    }

    public Boolean getSuperCDWMonth() {
        return superCDWMonth;
    }

    public Protection setSuperCDWMonth(Boolean superCDWMonth) {
        this.superCDWMonth = superCDWMonth;
        return this;
    }

    public Boolean getSuperTPMonth() {
        return superTPMonth;
    }

    public Protection setSuperTPMonth(Boolean superTPMonth) {
        this.superTPMonth = superTPMonth;
        return this;
    }

    @Override
    public String toString() {
        return "Protection{" +
                "cdw=" + cdw +
                ", plc3=" + plc3 +
                ", superCDW=" + superCDW +
                ", superTP=" + superTP +
                ", superCDWMonth=" + superCDWMonth +
                ", superTPMonth=" + superTPMonth +
                '}';
    }
}
