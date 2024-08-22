package inheritanceandencapsulation;

public class ChildParentMain {

	public static void main(String[] args) {
		
		Parent parent = new Parent();
		parent.showParent();
		
		ChildClass childClass = new ChildClass();
		childClass.showChild();
		
		childClass.showParent();
	}
}
