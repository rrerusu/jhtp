package org.erusu.jhtp.chapter10.exercises._1012;

import org.erusu.jhtp.chapter10.exercises._1012.BasePlusCommissionEmployee;
import org.erusu.jhtp.chapter10.exercises._1012.CommissionEmployee;
import org.erusu.jhtp.chapter10.exercises._1012.Employee;
import org.erusu.jhtp.chapter10.exercises._1012.HourlyEmployee;
import org.erusu.jhtp.chapter10.exercises._1012.SalariedEmployee;

public class PayrollSystemTest {
	public static void main(String[] args) {
		SalariedEmployee mySalariedEmployee = new SalariedEmployee(
			"John", "Smith", "111-11-1111", new Date(7, 24, 2003), 800.00);
		HourlyEmployee myHourlyEmployee = new HourlyEmployee(
			"Karen", "Price", "222-22-2222", new Date(8, 24, 2003), 16.75, 40);
		CommissionEmployee myCommissionEmployee = new CommissionEmployee(
			"Sue", "Jones", "333-33-3333", new Date(5, 24, 2003), 10000, 0.06);
		BasePlusCommissionEmployee myBasePlusCommissionEmployee = new BasePlusCommissionEmployee(
			"Bob", "Lewis", "444-44-4444", new Date(2, 24, 2003), 5000,  0.04, 300);

		System.out.println("Employees processed individually: ");

		System.out.printf("\n%s\n%s: $%,.2f\n\n", mySalariedEmployee, "earned",
			mySalariedEmployee.getPaymentAmount());
		System.out.printf("%s\n%s: $%,.2f\n\n", myHourlyEmployee, "earned", myHourlyEmployee.getPaymentAmount());
		System.out.printf("%s\n%s: $%,.2f\n\n", myCommissionEmployee, "earned",
			myCommissionEmployee.getPaymentAmount());
		System.out.printf("%s\n%s: $%,.2f\n\n", myBasePlusCommissionEmployee, "earned",
			myBasePlusCommissionEmployee.getPaymentAmount());

		Employee[] employees = new Employee[4];

		employees[0] = mySalariedEmployee;
		employees[1] = myHourlyEmployee;
		employees[2] = myCommissionEmployee;
		employees[3] = myBasePlusCommissionEmployee;

		for(int month = 1; month <= 12; month++) {
			for(Employee currentEmployee : employees) {
				if(currentEmployee.getBirthDate().getMonth() == month) {
					System.out.printf("Amt earned in birth month: $%,.2f\n",
						currentEmployee.getPaymentAmount() + 100);
				} else {
					System.out.printf("Amt earned this month: $%,.2f\n",
						currentEmployee.getPaymentAmount());
				}
			}
			System.out.println("\n");
		}

//		System.out.printf("Employees processed polymorphically:%n%n");
//
//		for(Employee currentEmployee : employees) {
//			System.out.println(currentEmployee);
//
//			if (currentEmployee instanceof BasePlusCommissionEmployee) {
//				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
//
//				employee.setBaseSalary(1.10 * employee.getBaseSalary());
//
//				System.out.printf("new base salary with 10%% increase is: $%.2f\n",
//					employee.getBaseSalary());
//			}
//
//			System.out.printf("earned $%,.2f\n\n", currentEmployee.getPaymentAmount());
//		}
//
//		for(int j = 0; j < employees.length; j++)
//			System.out.printf("Employees %d is a %s\n", j, employees[j].getClass().getName());
	}
}
