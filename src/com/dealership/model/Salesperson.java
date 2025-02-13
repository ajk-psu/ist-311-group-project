package com.dealership.model;

/* Extends Employee
 * Additional methods include sellVehicle()
 * sendToDetailing()
 */
public class Salesperson extends Employee {

    public Salesperson(String lastName, String firstName, int employeeID, String accountName, String accountPassword, String jobRole) {
        super(lastName, firstName, employeeID, accountName, accountPassword, jobRole);
    }
}
