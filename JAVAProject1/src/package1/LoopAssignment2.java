package package1;
import java.util.Scanner;

public class LoopAssignment2 {	
	public void PrintFibonacciSeries(int a)
	{
		int x=0;int y=1,c;
		for(int i=x;i<=a;i++)
		{
			if(i==0) {	System.out.print(+x+" "+y);	}
			c = x+y;
			System.out.print(" "+c);
			x=y;
			y=c;			
		}
	}
	public void PrintTable(int num)
	{
		for(int i=1;i<=10;i++)
			System.out.println(+num*i);		
	}
	public static void main(String[] args) {
		
		LoopAssignment2 obj = new LoopAssignment2();
		System.out.println("Enter a number to print Fibonacci series");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("Printing Fibonacci series upto the number entered\n");
		obj.PrintFibonacciSeries(a);
		System.out.println("\n\nEnter a number to print table");		
		int b = s.nextInt();
		System.out.println("Printing table of "+b);
		obj.PrintTable(b);
		
		s.close();
	}
}
