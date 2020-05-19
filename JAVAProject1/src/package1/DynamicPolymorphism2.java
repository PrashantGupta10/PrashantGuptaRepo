package package1;

public class DynamicPolymorphism2 extends DynamicPolymorphism{
	
	public void method1(int a, int b)
	{
		int c;
		c=a-b;
		System.out.println("Calling Child method: Result of a-c is "+c);
	}
	public void method2(int a, int b)
	{
		int c;
		c=a*b;
		System.out.println("Calling Child method: Result of a*c is "+c);
	}	
	public static void main(String[] args) {
		System.out.println("Dynamic or Run time polymorphism");
		DynamicPolymorphism2 obj=new DynamicPolymorphism2();
		System.out.println("Case1");//method in parent class but not in child class
		obj.method();
		System.out.println("Case2");//method present in parent and child class
		obj.method1(20, 10);
		System.out.println("Case3");//method not present in parent class 
		obj.method2(10,20);
	}
}
