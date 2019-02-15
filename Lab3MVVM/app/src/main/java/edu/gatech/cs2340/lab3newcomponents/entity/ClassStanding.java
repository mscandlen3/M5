package edu.gatech.cs2340.lab3newcomponents.entity;

public enum ClassStanding {
    FRESHMAN("FR"),
    SOPHOMORE("SO"),
    JUNIOR("JR"),
    SENIOR("SR");

    private String classYear;

    ClassStanding(String classYear) {
        this.classYear = classYear;
    }

    public String getYear() {
        return classYear;
    }
}


