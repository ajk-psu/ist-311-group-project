package com.dealership.model;

/* Extends Employee.Java
 * Additional methods include hireEmployee() 
 * and fireEmployee()
 */
public class Manager extends Employee {

    public Manager(String lastName, String firstName, int employeeID, String accountName, String accountPassword, String jobRole) {
        super(lastName, firstName, employeeID, accountName, accountPassword, jobRole);
    }
}
