package org.erusu.jhtp.chapter10.exercises;

public abstract class Employee {
	private String firstName;
	private String lastName;
	private String SSN;

	public Employee(String first, String last, String ssn) {
		firstName = first;
		lastName = last;
		SSN = ssn;
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
		SSN = ssn;
	}

	public String getSocialSecurityNumber() {
		return SSN;
	}

	@Override
	public String toString() {
		return String.format("%s %s\nsocial security number: %s",
			getFirstName(), getLastName(), getSocialSecurityNumber());
	}

	public abstract double earnings();
}
