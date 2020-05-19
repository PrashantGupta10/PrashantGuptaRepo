package package1;

public class ParentClass {
	
	public ParentClass()
	{
		this(1,2,3,4);
		System.out.println("Parent Default constructor");
	}
	public ParentClass(int a)
	{
		this(1,2);
		System.out.println("Parent 1 paremeterized constructor");
	}
	public ParentClass(int a, int b)
	{
		this();
		System.out.println("Parent 2 paremeterized constructor");
	}
	public ParentClass(int a, int b, int c)
	{
		this(1);
		System.out.println("Parent 3 paremeterized constructor");
	}
	public ParentClass(int a, int b, int c, int d)
	{		
		System.out.println("Parent 4 paremeterized constructor");
	}
}
