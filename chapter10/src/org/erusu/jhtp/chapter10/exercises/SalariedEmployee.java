package org.erusu.jhtp.chapter10.exercises;

public class SalariedEmployee extends Employee {
	private double weeklySalary;

	public SalariedEmployee(String first, String last, String ssn, double weekleySalary) {
		super(first, last, ssn);

		if(weekleySalary < 0.0)
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");

		this.weeklySalary = weeklySalary;
	}

	public void setWeekleySalary(double weeklySalary) {
		if(weeklySalary < 0.0)
			throw new IllegalArgumentException("Weekly salary must be >= 0");

		this.weeklySalary = weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	@Override
	public double earnings() {
		return getWeeklySalary();
	}

	@Override
	public String toString() {
		return String.format("salaried employee: %s\n%s: $%.2f", super.toString(), "weekly salary",
			getWeeklySalary());
	}
}
