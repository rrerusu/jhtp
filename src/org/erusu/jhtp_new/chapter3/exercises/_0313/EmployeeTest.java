package org.erusu.jhtp_new.chapter3.exercises._0313;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "Doe", 1000);
        Employee emp2 = new Employee("John", "MCain", 1000);

        System.out.printf("%s %s's yearly salary: %.2f\n", emp1.getFirstName(), emp1.getLastName(), emp1.getMonthlySalary() * 12);
        System.out.printf("%s %s's yearly salary: %.2f\n", emp2.getFirstName(), emp2.getLastName(), emp2.getMonthlySalary() * 12);

        // give employees a raise
        emp1.setMonthlySalary(emp1.getMonthlySalary() * 1.1);
        emp2.setMonthlySalary(emp2.getMonthlySalary() * 1.1);

        System.out.printf("\nPost-raise:\n");
        System.out.printf("%s %s's yearly salary: %.2f\n", emp1.getFirstName(), emp1.getLastName(), emp1.getMonthlySalary() * 12);
        System.out.printf("%s %s's yearly salary: %.2f\n", emp2.getFirstName(), emp2.getLastName(), emp2.getMonthlySalary() * 12);
    }
}