package package1;

import java.util.Scanner;

public class AbstractChild extends AbstractExample
{
	public void arithmetic(int a, int b)
	{
		System.out.println("\nBody given by Child1 class");
		int c;
		c=a+b;
		System.out.println("Addition result is "+c);
	}	
	
	public static void main(String[] args) {
		int x, y;
		System.out.println("Enter First Number");
		Scanner s = new Scanner(System.in);
		x= s.nextInt();
		System.out.println("Enter Second Number");
		y= s.nextInt();
		AbstractChild C1 =  new AbstractChild();
		C1.arithmetic(x,y);
		AbstractChild2 C2 =  new AbstractChild2();
		C2.arithmetic(x,y);
		AbstractChild3 C3 =  new AbstractChild3();
		C3.arithmetic(x,y);
		s.close();
	}	
}
