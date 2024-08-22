package inheritanceandencapsulation;

public class Member {

	private String name;
	private int age;
	private String phone_number;
	private String address;
	private double salary;
	
	public Member(String name, int age, String phone_number,String address, double salary) {
		this.name = name;
		this.age = age;
		this.phone_number = phone_number;
		this.address = address;
		this.salary = salary;
	}
	
	public void printSalary() {
		System.out.println("Name: "+name+"\nAge: "+age+"\nphone "+phone_number+"\nAddress: "+address+"\nSalary: "+salary);
	}
}
