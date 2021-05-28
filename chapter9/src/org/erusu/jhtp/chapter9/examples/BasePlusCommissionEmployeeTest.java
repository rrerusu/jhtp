package org.erusu.jhtp.chapter9.examples;

public class BasePlusCommissionEmployeeTest {
	public static void main(String[] args) {
		BasePlusCommissionEmployee myEmployee = new BasePlusCommissionEmployee(
			"Bob", "Lewis", "333-33-3333", 5000, 0.04, 300
		);

		System.out.println("Employee information obtained by get methods: \n");
		System.out.printf("%s %s\n", "First name is", myEmployee.getFirstName());
		System.out.printf("%s %s\n", "Last name is", myEmployee.getLastName());
		System.out.printf("%s %s\n", "Social Security Number is", myEmployee.getSocialSecurityNumber());
		System.out.printf("%s %s\n", "Gross sales is", myEmployee.getGrossSales());
		System.out.printf("%s %s\n", "Commission rate is", myEmployee.getCommissionRate());
		System.out.printf("%s %s\n", "Base salary is", myEmployee.getBaseSalary());

		myEmployee.setBaseSalary(1000);

		System.out.printf("\n%s:\n\n%s\n", "Updated employee information obtained by toString",
			myEmployee.toString());
	}
}
