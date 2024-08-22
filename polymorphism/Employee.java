package polymorphism;

public class Employee {

	private int empId;
	private String name;
	private String company;
	private String department;
	private double salary;
	private String post;
	private String city;

	
	public Employee(int empId, String name, String company, String department, double salary, String post, String city) {
		this.empId = empId;
		this.name = name;
		this.company = company;
		this.department = department;
		this.salary = salary;
		this.post = post;
		this.city = city;
	}
	public Employee() {
		
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
