package com.example.domain;

import inheritanceandencapsulation.Director;
import inheritanceandencapsulation.Employee;
import inheritanceandencapsulation.Manager;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employee = new Employee(101, "Jane Smith", "012-34-5678", 120_345.27);
		employee.printEmployee();
		
		Manager manager = new Manager(207, "Barbara Johnson", "054-12-2367", 109_501.36, "US Marketing");
		System.out.println("\n--------Manager Details---------");
		manager.printEmployee();
		System.out.println("Department: "+manager.getDeptName());
		
		Admin admin = new Admin(304, "Bill Munroe", "108-23-6509", 75_002.34);
		System.out.println("\n-----Admin Details-----");
		admin.printEmployee();
		
		Director director = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);
		System.out.println("\n-----Director Details-----");
		director.printEmployee();
		System.out.println("Department: "+director.getDeptName());
		System.out.println("Budget: "+director.getBudget());;
	}
}
