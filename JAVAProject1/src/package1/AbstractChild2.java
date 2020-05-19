package package1;

public class AbstractChild2 extends AbstractExample
{
	public void arithmetic(int a, int b)
	{
		System.out.println("\nBody given by Child2 class");
		int c;
		c=a-b;
		System.out.println("Substraction result is "+c);
	}	
}
