package polymorphism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeIO {

	public Employee[] readEmployee() throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		Employee[] employeeList = new Employee[2];
		
		for(int i=0;i<employeeList.length;i++) {
			System.out.println("Enter employee id: ");
			int empId = Integer.parseInt(bufferedReader.readLine());
			System.out.println("Enter employee name: ");
			String name = bufferedReader.readLine();
			System.out.println("Enter company name: ");
			String company = bufferedReader.readLine();
			System.out.println("Enter employee salary: ");
			double salary = Double.parseDouble(bufferedReader.readLine());
			System.out.println("Enter employee department: ");
			String department = bufferedReader.readLine();
			System.out.println("Enter employees post");
			String post = bufferedReader.readLine();
			System.out.println("Enter employees city: ");
			String city = bufferedReader.readLine();
			
			employeeList[i] = new Employee(empId, name, company, department, salary, post, city);
		}
		return employeeList;
		
	}
	
	}
