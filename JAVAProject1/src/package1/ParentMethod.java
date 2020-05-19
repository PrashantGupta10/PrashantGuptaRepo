package package1;

public class ParentMethod {
	
	public void ParentMethodDefault()
	{
		System.out.println("Parent Default method");
	}
	public void ParentMethod1(int a)
	{	
		System.out.println("Parent 1 paremeterized method");
	}
	public void ParentMethod2(int a, int b)
	{		
		System.out.println("Parent 2 paremeterized method");
	}
	public void ParentMethod3(int a, int b, int c)
	{		
		this.ParentMethod4(1,2,3,4);
		this.ParentMethodDefault();
		this.ParentMethod2(1,2);
		this.ParentMethod1(1);
		System.out.println("Parent 3 paremeterized method");		
	}
	public void ParentMethod4(int a, int b, int c, int d)
	{
		System.out.println("Parent 4 paremeterized method");
	}


}
