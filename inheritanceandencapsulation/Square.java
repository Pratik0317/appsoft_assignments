package inheritanceandencapsulation;

public class Square extends Rectangle{

	public Square(float length, float breadth) {
		super(length,breadth);
	}
	
	public static void main(String[] args) {
		Square square = new Square(2, 2);
		square.printArea();
		square.printParameters();
		System.out.println("Area and parameter of square");
		square.printResult();
		
		Rectangle rectangle = new Rectangle(2, 5);
		rectangle.printArea();
		System.out.println("\nArea and parameter of rectangle");
		rectangle.printParameters();
		
		rectangle.printResult();
		
		System.out.println("\nEnter length and breadth of 10 rectangles");
		Rectangle[] sides = rectangle.readSides();
		for(Rectangle side: sides) {
			side.printArea();
			side.printParameters();
			System.out.println();
			side.printResult();
			
		}
		
		System.out.println("Enter length and breadth of 10 square");
		Square[] lengths = (Square[]) square.readSides();
		for(Square side: lengths) {
			side.printArea();
			side.printParameters();
			System.out.println();
			side.printResult();
			
		}
		
	}
}
