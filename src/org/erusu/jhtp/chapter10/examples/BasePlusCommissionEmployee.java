package org.erusu.jhtp.chapter10.examples;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary;

	public BasePlusCommissionEmployee(String first, String last, String ssn, double grossSales,
									  double commissionRate, double baseSalary) {
		super(first, last, ssn, grossSales, commissionRate);

		if(baseSalary < 0.0)
			throw new IllegalArgumentException("Base salary must be >= 0.0");

		setBaseSalary(baseSalary);
	}

	public void setBaseSalary(double baseSalary) {
		if(baseSalary < 0.0)
			throw new IllegalArgumentException("Base salary must be >= 0.0");

		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	@Override
	public double getPaymentAmount() {
		return getBaseSalary() + super.getPaymentAmount();
	}

	@Override
	public String toString() {
		return String.format("%s %s; %s: $%.2f", "base-salaried", super.toString(),
			"base salary", getBaseSalary());
	}













	// old implementation - recoded entire class
	/* private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales;
	private double commissionRate;
	private double baseSalary;

	public BasePlusCommissionEmployee(String first, String last, String ssn,
									  double sales, double rate, double salary) {
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
		setGrossSales(sales);
		setCommissionRate(rate);
		setBaseSalary(salary);
	}

	public void setFirstName(String first) {
		firstName = first;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String last) {
		lastName = last;
	}

	public String getLastName() {
		return lastName;
	}

	public void setSocialSecurityNumber(String ssn) {
		socialSecurityNumber = ssn;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setGrossSales(double sales) {
		if(sales >= 0.0)
			grossSales = sales;
		else
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setCommissionRate(double rate) {
		if (rate > 0.0 && rate < 1.0)
			commissionRate = rate;
		else
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setBaseSalary(double salary) {
		if(salary >= 0.0)
			baseSalary = salary;
		else
			throw new IllegalArgumentException("Base salary must be >= 0.0");
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public double earnings() {
		return baseSalary + (commissionRate * grossSales);
	}

	@Override
	public String toString() {
		return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
			"base-salaried commission employee", firstName, lastName,
			"social security number", socialSecurityNumber,
			"gross sales", grossSales, "commission rate", commissionRate,
			"base salary", baseSalary);
	} */
}
