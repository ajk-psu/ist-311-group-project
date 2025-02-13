package com.dealership.model;

/* This will be an abstract base class for all
 * employees.
 * Attributes include: firstName, lastName, employeeID.
 * Methods: Getters, setters, etc
 */
public abstract class Employee {
	
	protected String lastName = "null";
	protected String firstName = "null";
	protected int employeeID = -1;
	protected String accountName = "null";
	protected String accountPassword = "null";
	protected String jobRole = "null";

	public Employee(String lastName, String firstName, int employeeID, String accountName, String accountPassword, String jobRole) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.employeeID = employeeID;
		this.accountName = accountName;
		this.accountPassword = accountPassword;
		this.jobRole = jobRole;
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
	
	public int getEmployeeID() {
		return employeeID;
	}
	
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	
	public String getAccountName() {
		return accountName;
	}
	
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	public String getAccountPassword() {
		return accountPassword;
	}
	
	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
	
	public String getJobRole() {
		return jobRole;
	}
	
	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}
}
