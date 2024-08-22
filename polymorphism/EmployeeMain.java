package polymorphism;

import java.io.IOException;

public class EmployeeMain {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		EmployeeIO employeeIO = new EmployeeIO();
		Employee[] emplist = employeeIO.readEmployee();
		
		EmployeeFunction empFunction = new EmployeeFunction();
		
		empFunction.printTotalSalary(emplist);
		empFunction.printItDept(emplist);
		empFunction.countAdminDept(emplist);
		empFunction.countAndPrintSameCity(emplist);
		empFunction.getTotalSalaryByDep(emplist);
		empFunction.getHighestSalary(emplist);
		empFunction.getLowestSalary(emplist);
	}
}
