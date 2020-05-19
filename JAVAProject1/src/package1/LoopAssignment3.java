package package1;
import java.util.Scanner;

public class LoopAssignment3 {	
	public void FindFactorialOfNumber(int a)
	{
		int num=a, result=1;
		for(int i=num;i>=1;i--)
		{
			result=result * i;			
		}	
		System.out.println("Result is "+result);
	}
	public void PrimeNumberCheck(int num)
	{
		boolean flag=true;
		for(int i=2;i<=num/2;i++)
		{			
			if(num%i==0){flag=false;break;}
		}	
		if(flag)
			System.out.println("Entered number "+num+" is prime");
		else
			System.out.println("Entered number "+num+" is not prime");
	}	
	public static void main(String[] args) {
		LoopAssignment3 obj = new LoopAssignment3();
		System.out.println("Enter a number for which you want to find factorial");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		obj.FindFactorialOfNumber(a);
		System.out.println("Enter a number for Prime check");
		int b=s.nextInt();
		obj.PrimeNumberCheck(b);
		s.close();
	}
}
