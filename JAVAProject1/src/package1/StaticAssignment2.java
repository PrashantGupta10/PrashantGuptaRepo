package package1;

public class StaticAssignment2 {

	public static void main(String[] args) {
		System.out.println("Calling static method from another static method within different class");
		StaticAssignment.method1();	
		StaticAssignment obj1=new StaticAssignment();
		obj1.method1();
		System.out.println("Calling non-static method from another static method within different class");
		StaticAssignment obj= new StaticAssignment();
		obj.method();
	}
}
