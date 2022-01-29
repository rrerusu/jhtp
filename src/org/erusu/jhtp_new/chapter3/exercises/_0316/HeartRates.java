package org.erusu.jhtp_new.chapter3.exercises._0316;

import org.erusu.jhtp_new.chapter3.exercises._0314.Date;

public class HeartRates {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;

    // Constructor
    public HeartRates(String fname, String lname, int day, int month, int year) {
        firstName = fname;
        lastName = lname;
        dateOfBirth = new Date(day, month, year);
    }

    // Calculate age from date of birth
    public int calcAge() {
        return 2022 - dateOfBirth.getYear();
    }

    // Calculate maximum heart rate from age
    public int calcMaxHeartRate() {
        return 220 - calcAge();
    }

    // Calculate target heart rate from maximum heart rate
    public double[] calcTargetHeartRate() {
        return new double[]{calcMaxHeartRate() * 0.5, calcMaxHeartRate() * 0.8};
    }

    // Get methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDOB() {
        return dateOfBirth.displayDate();
    }

    // Set methods
    public void setFirstName(String fname) {
        firstName = fname;
    }

    public void setLastName(String lname) {
        lastName = lname;
    }

    public void setDOB(int d, int m, int y) {
        dateOfBirth = new Date(d, m, y);
    }
}