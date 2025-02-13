package com.dealership.model;
import java.util.ArrayList;

/* Hadles CRUD operations for employees (Like add, delete,
 * Update)
 * use an ArrayList<Employees> as temporary storage structure
 */
public class EmployeeRoster {

    private ArrayList<Employee> roster = new ArrayList<Employee>();

    public void populateEmployees() {
        if (roster.size() == 0) {
            roster.add(new Salesperson("Miller", "James", 001, "jsmith", "password", "salesperson"));
            roster.add(new Manager("Brown", "Sarah", 002, "sbrown", "password", "manager"));
            roster.add(new Mechanic("Davis", "Michael", 003, "mdavis", "password", "mechanic"));
            roster.add(new Detailer("Johnson", "Emily", 004, "ejohnson", "password", "detailer"));
        }
    }
}
