package package1;

public class StaticPolymorphism {
	
	public void method()
	{
		System.out.println("I am void method");		
	}
	public void method(int a)
	{
		System.out.println("I am 1 parameterized method");		
	}
	public void method(int a, int b)
	{
		System.out.println("I am 2 parameterized method");		
	}
	public void method(float a, float b)
	{
		System.out.println("I am 2 parameterized method accepting float values");		
	}
	public int method(int a, int b, int c)
	{
		System.out.println("I am 3 parameterized method");
		return(a+b+c);
	}	
	public static void main(String[] args) {		
		System.out.println("Static or Compile time polymorphism");
		StaticPolymorphism obj=new StaticPolymorphism();
		obj.method();
		obj.method(10);
		obj.method(10, 20);
		obj.method(10, 20, 30);
		obj.method(10.56f, 20.54f);
	}
}
