package org.erusu.jhtp.chapter17.examples;

public class Employee {
    private String department,
        firstName,
        lastName;
    
    private double salary;

    public Employee(String firstName, String lastName, double salary, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getname() {
        return String.format("%s %s", getFirstName(), getLastName());
    }

    @Override
    public String toString() {
        return String.format("%-8s %-8s %8.2f   %s",
            getFirstName(), getLastName(), getSalary(), getDepartment());
    }
}