package package1;

public class ChildMethod extends ParentMethod{
	
	public void ChildMethodDefault()
	{
		this.ChildMethod3(1,2,3);
		System.out.println("Child Default method");
	}
	public void ChildMethod1(int a)
	{	
		this.ChildMethod4(1,2,3,4);
		System.out.println("Child 1 paremeterized method");
	}
	public void ChildMethod2(int a, int b)
	{
		this.ChildMethod1(1);
		System.out.println("Child 2 paremeterized method");
	}
	public void ChildMethod3(int a, int b, int c)
	{		
		super.ParentMethod3(1,2,3);
		System.out.println("Child 3 paremeterized method");		
	}
	public void ChildMethod4(int a, int b, int c, int d)
	{
		this.ChildMethodDefault();
		System.out.println("Child 4 paremeterized method");
	}

	public static void main(String[] args) {
		
		ChildMethod c1 = new ChildMethod();
		c1.ChildMethod2(1, 2);		
	}
}
