package com.example.domain;

import inheritanceandencapsulation.Member;

public class Manager extends Member {

	private String specialization;
	private String department;
	
	public Manager(String name, int age, String phone_number, String address, double salary, String specialization, String detpartment) {
		super(name, age, phone_number, address, salary);
		// TODO Auto-generated constructor stub
		this.specialization = specialization;
		this.department = detpartment;
	}
	
	public String getSpecialization() {
		return specialization;
	}
	
	public String getDepartment() {
		return department;
	}

	public static void main(String[] args) {
		 Manager manager = new Manager("Parma Lama", 22, "9848849886", "Sankhu", 25000,"Java Spring boot","IT");
		 manager.printSalary();
		 System.out.println("Specialization: "+manager.getSpecialization());
		 System.out.println("Department: "+manager.getDepartment());
	}
}
