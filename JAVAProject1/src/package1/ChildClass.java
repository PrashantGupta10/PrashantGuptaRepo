package package1;

public class ChildClass extends ParentClass{
	
	public ChildClass()
	{
		this(1,2,3);
		System.out.println("Child Default constructor");
	}
	public ChildClass(int a)
	{
		this(1,2,3,4);
		System.out.println("Child 1 paremeterized constructor");
	}
	public ChildClass(int a, int b)
	{
		this(1);
		System.out.println("Child 2 paremeterized constructor");
	}
	public ChildClass(int a, int b, int c)
	{
		super(1,2,3);
		System.out.println("Child 3 paremeterized constructor");		
	}
	public ChildClass(int a, int b, int c, int d)
	{
		this();
		System.out.println("Child 4 paremeterized constructor");
	}
	
	public static void main(String[] args)
	{
		ChildClass c1= new ChildClass(1,2);		
	}
}
