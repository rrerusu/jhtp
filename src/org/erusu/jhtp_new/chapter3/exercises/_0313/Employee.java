package org.erusu.jhtp_new.chapter3.exercises._0313;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String fname, String lname, double msalary) {
        firstName = fname;
        lastName = lname;
        monthlySalary = msalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setFirstName(String fname) {
        firstName = fname;
    }

    public void setLastName(String lname) {
        lastName = lname;
    }

    public void setMonthlySalary(double msalary) {
        monthlySalary = (msalary > 0) ? msalary : 0;
    }
}