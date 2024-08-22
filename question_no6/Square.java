package question_no6;

public class Square extends Rectangle {

	public void showMessage() {
		System.out.println("Square is rectangle");
	}
	
	public static void main(String[] args) {
		Square square = new Square();
		square.showRectangle();
		square.showShape();
		square.showMessage();
	}
}
