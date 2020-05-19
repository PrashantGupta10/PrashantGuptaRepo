package package1;

import java.util.Scanner;

public class ScannerExample {
	
	public int Sum(int a, int b)
	{
		int c;
		c=a+b;
		return c;		
	}
	public int Sub(int a, int b)
	{
		int c;
		c=a-b;
		return c;		
	}
	public int Mul(int a, int b)
	{
		int c;
		c=a*b;
		return c;		
	}
	public int Div(int a, int b)
	{
		int c;
		c=a/b;
		return c;		
	}
		
	public static void main(String[] args) {
		
		int X1, X2, X3, X4, X5, X6;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please Enter value of X1 ");		
		X1=s.nextInt();
		
		System.out.println("Please Enter value of X2 ");
		X2=s.nextInt();
		
		System.out.println("Please Enter value of X3 ");
		X3=s.nextInt();
		
		System.out.println("Please Enter value of X4 ");		
		X4=s.nextInt();
		
		System.out.println("Please Enter value of X5 ");	
		X5=s.nextInt();
		
		System.out.println("Please Enter value of X6 ");
		X6=s.nextInt();
		
		ScannerExample S1 = new ScannerExample();
		int result =S1.Div(S1.Mul(S1.Sum(S1.Sub(S1.Sum(X1, X2),X3),X4),X5),X6);
		
		System.out.println("The result of the expression (((((X1+X2)-X3)+X4)*X5)/X6) is = "+result);
		s.close();
	}
}
