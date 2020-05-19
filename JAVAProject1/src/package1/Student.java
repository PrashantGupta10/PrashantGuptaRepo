package package1;

public class Student {
	
	int Age;
	int Roll_No;
	
	public void Display1()
	{
		System.out.println("Inside Display1 method");
		System.out.println("Welcome All");
	}
	
	public void Display2()
	{
		System.out.println("Inside Display2 method");
		System.out.println("Autoamtion is very easy");
	}

	public static void main(String[] args) {
		System.out.println("Inside Main method");
		Student deepak = new Student();
		System.out.println("Age variable before setting up value :"+deepak.Age);
		System.out.println("Roll_No variable before setting up value :"+deepak.Roll_No);
		deepak.Age=25;
		deepak.Roll_No=5;
		System.out.println("Age variable after setting up value :"+deepak.Age);
		System.out.println("Roll_No variable after setting up value :"+deepak.Roll_No);
		deepak.Display1();
		deepak.Display2();
		
		new Student().Age=30;
		System.out.println(new Student().Age);
	}
}
