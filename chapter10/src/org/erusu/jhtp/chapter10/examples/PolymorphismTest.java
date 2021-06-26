package org.erusu.jhtp.chapter10.examples;

public class PolymorphismTest {
	public static void main(String[] args) {
		CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones",
				"222-22-2222", 10000, 0.06);
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(
				"Bob", "Lewis", "333-33-3333", 5000, 0.04, 300);

		System.out.printf("%s %s:\n\n%s\n\n", "Call CommissionEmployee's toString with superclass reference",
			"to superclass object", commissionEmployee.toString());
		System.out.printf("%s %s:\n\n%s\n\n",
			"Call BasePlusCommissionEmployee's toString with subClass", "reference to subclass object",
			basePlusCommissionEmployee.toString());

		CommissionEmployee commissionEmployee2 = basePlusCommissionEmployee;

		System.out.printf("%s %s:\n\n%s\n\n",
			"Call BasePlusCommissionEmployee's toString with superclass",
			"reference to subclass object", commissionEmployee2.toString());
	}
}
