package package1;

import java.util.Scanner;

public class LoopAssignment4 {

	public void ArmstrongNumberCheck(int num)
	{
		int rem, cube, sum=0, temp = num;

	    while (num != 0)
	    {
	        rem = num % 10;
	        cube = rem*rem*rem;
	        sum = sum + cube;
	        num = num / 10;
	    }
	    if (sum == temp)
	        System.out.println("The given number is armstrong no");
	    else
	    	System.out.println("The given number is not a armstrong no");
	}
	public static void main(String[] args) {
		LoopAssignment4 obj = new LoopAssignment4();
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		obj.ArmstrongNumberCheck(a);
		s.close();
	}	
}
