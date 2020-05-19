package package1;

public class ClassA {

	int abc;
	public void print_method()
	{
		System.out.println("Hello Prashant");		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Inside main method");	
		ClassA A = new ClassA();
		A.abc=123;
		System.out.println(A.abc);
		A.print_method();
	}
}
