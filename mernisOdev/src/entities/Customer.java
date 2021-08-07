package entities;

import abstractt.Entity;

public class Customer implements Entity {
	public int id;
	public String firstName;
	public String lastName;
	public int dateofBirth;
	public String identityNumber;
	
	public Customer(int id, String firstName, String lastName, int dateofBirth, String identityNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateofBirth = dateofBirth;
		this.identityNumber = identityNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(int dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
}
