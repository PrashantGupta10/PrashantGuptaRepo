package package1;

public class StaticExample {
	
	static int a;
	
	public void method()
	{
		a=a+1;
		System.out.println("Inside non static method");
	}
	public static void abc() //static method
	{		
		System.out.println("I am a static method");
	}
	
	public static void main(String[] args) //static method 
	{
		StaticExample obj1=new StaticExample();
		System.out.println("Value of a by calling first object ");
		 obj1.method();
		 System.out.println(+obj1.a);
		StaticExample obj2=new StaticExample();
		System.out.println("Value of a by calling second object ");
		 obj2.method();
		 System.out.println(+obj2.a);
		 
		 StaticExample.abc();
		 StaticExample obj3 = new StaticExample();
		 obj3.abc();
		 abc();
		 int value = obj1.a;
		 System.out.println("final value of a is "+value);
		 
	}
}
