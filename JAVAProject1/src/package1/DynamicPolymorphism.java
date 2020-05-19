package package1;

public class DynamicPolymorphism {
	
	public void method()
	{
		System.out.println("Calling Parent non-parameterized method ");		
	}
	public void method1(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Calling Parent method: Result of a+c is "+c);
	}
}
