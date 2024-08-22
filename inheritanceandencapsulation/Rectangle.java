package inheritanceandencapsulation;

import java.util.Scanner;

public class Rectangle {

	private float length;
	private float breadth;
	
	public Rectangle(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	public void setLength(float length) {
		this.length = length;
	}
	
	public float printArea() {
		return length*breadth;
	}
	
	public float printParameters() {
		return 2*(length+breadth);
	}
	
	public void printResult( ) {
		System.out.println("Area is: "+printArea());
		System.out.println("Parameter is: "+printParameters());
	}
	
	public Rectangle[] readSides() {
		Rectangle[] side = new Rectangle[10];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			
			System.out.println("Enter length: ");
			float length = scanner.nextFloat();
			System.out.println("Enter breadth: ");
			float breadth = scanner.nextFloat();
			
			side[i] = new Rectangle(length, breadth);
		}
		scanner.close();
		return side;
	}
}
