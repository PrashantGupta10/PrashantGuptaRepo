package package1;

public class ConstructorExample {

	public ConstructorExample()
	{
		this(1,2,3,4);
		System.out.println("default constructor");
		
	}
	
	public ConstructorExample(int a)
	{
		this();
		System.out.println("1 parameterized constructor");
		
	}
	public ConstructorExample(int a, int b)
	{
		this(1,2,3);
		System.out.println("2 parameterized constructor");
		
	}
	public ConstructorExample(int a, int b, int c)
	{
		this(1);
		System.out.println("3 parameterized constructor");
		
	}
	public ConstructorExample(int a, int b, int c, int d)
	{		
		System.out.println("4 parameterized constructor");		
	}
	
	public static void main(String[] args) {
		ConstructorExample con = new ConstructorExample(1,2);
	}
}
