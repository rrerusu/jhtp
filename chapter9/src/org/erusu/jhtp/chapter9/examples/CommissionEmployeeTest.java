package org.erusu.jhtp.chapter9.examples;

public class CommissionEmployeeTest {
	public static void main(String[] args) {
		CommissionEmployee myEmployee = new CommissionEmployee("Sue", "Jones",
			"222-22-2222", 10000, 0.06);

		System.out.println("Methods obtained by get methods:\n");
		System.out.printf("%s %s\n", "First name is", myEmployee.getFirstName());
		System.out.printf("%s %s\n", "Last name is", myEmployee.getLastName());
		System.out.printf("%s %s\n", "SSN is", myEmployee.getSocialSecurityNumber());
		System.out.printf("%s %s\n", "Gross sales is", myEmployee.getGrossSales());
		System.out.printf("%s %s\n", "Commission rate is", myEmployee.getCommissionRate());

		myEmployee.setGrossSales(500);
		myEmployee.setCommissionRate(.1);

		System.out.printf("\n%s:\n\n%s\n", "Updated employee information obtained by toString", myEmployee);
	}
}
