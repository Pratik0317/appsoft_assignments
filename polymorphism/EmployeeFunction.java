package polymorphism;

import java.util.Scanner;

public class EmployeeFunction {

	public void printTotalSalary(Employee[] employeeList) {
		double total =0;
		for(Employee employee: employeeList) {
			total+= employee.getSalary();
		}
		System.out.println("Total salary of employee is : "+total);
	}
	
	public void printItDept(Employee[] empList) {
		System.out.println("Employee of IT department");
		for(Employee employee: empList) {
			if(employee.getDepartment().equals("IT")) {
				System.out.println("Name: "+employee.getName()+"\nempId: "+employee.getEmpId()+"\nCompany: "+employee.getCompany()+
						"Department: "+employee.getDepartment()+"\nSalary: "+employee.getSalary()+"\nPost: "+employee.getPost()+"\nCity"+employee.getCity());
			}
		}
	}
	
	public void countAdminDept(Employee[] emplist) {
		int count = 0;
		for(Employee employee: emplist) {
			if(employee.getDepartment().equals("Admin")) {
				count++;
			}
		}
		System.out.println("Number of employees in Admin department = "+count);
	}

	public void countAndPrintSameCity(Employee[] employeeList) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the city to see employee of that city");
		String city = scanner.nextLine();
		
		int count = 0;
		
		for(Employee employee: employeeList) {
			if(employee.getCity().equals(city)) {
				System.out.println("Name: "+employee.getName()+"\nempId: "+employee.getEmpId()+"\nCompany: "+employee.getCompany()+
						"Department: "+employee.getDepartment()+"\nSalary: "+employee.getSalary()+"\nPost: "+employee.getPost()+"\nCity"+employee.getCity());
				count++;
			}
		}
		System.out.println("Number of employee in "+city+" city is: "+count);
		scanner.close();
	}
	
	public void getTotalSalaryByDep(Employee[] empList) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter department of to get total salary of employee of that department: ");
		String department = scanner.nextLine();
		
		double total =0;
		for(Employee emp: empList) {
			if(emp.getDepartment().equals(department)) {
				total+= emp.getSalary();
			}
		}
		System.out.println("Total salary of "+department+" is "+total);
		scanner.close();
	}
	
	double highestSalary = 0;
	
	public void getHighestSalary(Employee[] emplist) {
		for(Employee emp:emplist) {
			if(emp.getSalary()>=highestSalary) {
				highestSalary=emp.getSalary();
			}
		}
		System.out.println("Highest salary of employee is: "+highestSalary);
	}
	
	public void getLowestSalary(Employee[] emplist) {
		
		double lowestSalary = highestSalary;
		for(Employee emp:emplist) {
			if(emp.getSalary()<=highestSalary) {
				lowestSalary = emp.getSalary();
			}
		}
		System.out.println("Lowest salary of employee is: "+lowestSalary);
	}
}

