package package1;
import java.util.Scanner;

public class LoopAssignment5 {
	public void PalindromeCheck(int a)
	{
		int num=a, num2=a,num3=a, i=0, rem, rev_num=0;
		while(num>0)
		{
			rem = num%10;
			//System.out.println("Round "+i);
			num = num/10;	
			i++;
			//System.out.println("value of num "+num);
		}
		System.out.println("You have entered "+i+" digit number");
		
		for(int j=0,k=i-1; j<i;j++,k--)
		{
			rem = num2%10;
			rev_num=(int) (rev_num + rem* Math.pow(10, k));
			num2=num2/10;
			//System.out.println("value of remainder "+rem);
			//System.out.println("value of Reverse num "+rev_num);
			//System.out.println("value of Number "+num2);
		}	
		if(num3==rev_num)
			System.out.println("Number is palindrome");
		else
			System.out.println("Number is not palindrome");
	}
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		LoopAssignment5 obj = new LoopAssignment5();
		obj.PalindromeCheck(a);		
	}
}
