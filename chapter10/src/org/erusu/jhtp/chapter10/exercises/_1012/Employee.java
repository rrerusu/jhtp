package org.erusu.jhtp.chapter10.exercises._1012;

import org.erusu.jhtp.chapter10.exercises._1012.Payable;

public abstract class Employee implements Payable {
	private String firstName;
	private String lastName;
	private String SSN;
	private Date birthDate;

	public Employee(String first, String last, String ssn, Date bday) {
		firstName = first;
		lastName = last;
		SSN = ssn;
		birthDate = bday;
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

	public void setBirthDate(Date bday) {
		birthDate = bday;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	@Override
	public String toString() {
		return String.format("%s %s\nsocial security number: %s\nBirth date: %s",
			getFirstName(), getLastName(), getSocialSecurityNumber(), getBirthDate().toStringWord());
	}
}
