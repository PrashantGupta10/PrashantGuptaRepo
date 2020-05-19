package package1;

public class StaticMethod {

	public static void main(String[] args) {
		
		StaticExample.abc();
		StaticExample obj= new StaticExample();
		obj.abc();
		obj.method();
		StaticExample obj1= new StaticExample();
		obj1.method();
		 int value = obj1.a;
		 System.out.println("final value of a is "+value);
	}
}
