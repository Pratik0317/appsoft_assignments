package inheritanceandencapsulation;

public class Employee {

	private int empId;
	private String name;
	private String ssn;
	private double salary;
	
	
	
	public Employee(int empId, String name, String ssn, double salary) {
		this.empId = empId;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public String getSsn() {
		return ssn;
	}

	public double getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void raiseSalary(double increase) {
		if(increase>0) {
			salary+=increase;
		}
	}
	
	public void printEmployee() {
		System.out.println("Employee Id: "+empId);
		System.out.println("Employee name: "+name);
		System.out.println("SSN: "+ssn);
		System.out.println("Salary: "+salary);
	}
	
	
}
