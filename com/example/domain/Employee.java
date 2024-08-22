package com.example.domain;

import inheritanceandencapsulation.Member;

public class Employee extends Member {

	private String specialization;
	private String department;
	
	public Employee(String name, int age, String phone_number, String address, double salary) {
		super(name, age, phone_number, address, salary);
		// TODO Auto-generated constructor stub
	}
	
	public String getSpecialization() {
		return specialization;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public static void main(String[] args) {
		
		Employee employee = new Employee("Nani Lama", 20, "08060375525", "Fukuoka", 100000);
		employee.specialization = "Packing";
		employee.department = "Marketing";
		
		employee.printSalary();
		System.out.println("Specialization: "+employee.getSpecialization());
		System.out.println("Department: "+employee.getDepartment());
	}


}
