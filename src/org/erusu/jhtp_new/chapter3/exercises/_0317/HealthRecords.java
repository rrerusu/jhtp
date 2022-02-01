package org.erusu.jhtp_new.chapter3.exercises._0317;

import org.erusu.jhtp_new.chapter3.exercises._0316.HeartRates;

public class HealthRecords {
    private HeartRates myRecord;
    private String gender;
    private double weight;
    private int height;

    public HealthRecords(String fname, String gender, String lname, double weight, int day, int height, int month, int year) {
        myRecord = new HeartRates(fname, lname, day, month, year);
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }

    public double calcBMI() {
        return 703 * weight / height;
    }

    public String getDOB() {
        return myRecord.getDOB();
    }

    public String getFirstName() {
        return myRecord.getFirstName();
    }

    public String getGender() {
        return gender;
    }

    public int getHeight() {
        return height;
    }

    public String getLastName() {
        return myRecord.getLastName();
    }

    public double getWeight() {
        return weight;
    }

    public void setDOB(int day, int month, int year) {
        myRecord.setDOB(day, month, year);
    }

    public void setFirstName(String fname) {
        myRecord.setFirstName(fname);
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLastName(String lname) {
        myRecord.setLastName(lname);
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}