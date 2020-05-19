package package1;
public class ThisExample {
	
	public void method()
	{		
		System.out.println("Default method");
		this.method1(1);
	}
	
	public void method1(int a)
	{		
		System.out.println("1 paremeterized method");
		this.method4(1,2,3,4);
	}
	
	public void method2(int a, int b)
	{		
		this.method3(1, 2, 3);	
		System.out.println("2 paremeterized method");
	}
	
	public void method3(int a, int b, int c)
	{		
		System.out.println("3 paremeterized method");
		this.method();
	}
	
	public void method4(int a, int b, int c, int d)
	{		
		System.out.println("4 paremeterized method");
	}
	
	
	public static void main(String[] args) {
		
		ThisExample t1 = new ThisExample();
		t1.method2(1,2);
	}
}
