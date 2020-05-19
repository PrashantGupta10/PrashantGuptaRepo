package package1;

public class StaticAssignment {
	
	public void method()
	{
		System.out.println("Inside non-static method");
	}
	public static void method1()
	{
		System.out.println("Inside static method");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Calling static method from another static method within same class");
		StaticAssignment.method1();
		method1();
		StaticAssignment obj1=new StaticAssignment();
		obj1.method1();
		System.out.println("Calling non-static from another static method within same class");
		//StaticAssignment obj2= new StaticAssignment();
		obj1.method();
	}
	
}
