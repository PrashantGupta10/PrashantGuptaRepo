package package1;
import java.util.Scanner;

public class LoopAssignments1 {	
	public void SwapNumberWithThirdVariable(int a, int b)
	{
		int x, y, z;x=a;y=b;	
		System.out.println("\nSwapping Numbers With help of Third Variable");
		System.out.println("Value of First number before swap "+x);
		System.out.println("Value of Second number before swap "+y);
		z=x;x=y;y=z;
		System.out.println("Value of First numbe after swap "+x);
		System.out.println("Value of Second number after swap "+y);		
	}
	public void SwapNumberWithoutThirdVariable(int a, int b)
	{
		int x, y;x=a;y=b;		
		System.out.println("\nSwapping Numbers Without help of Third Variable");
		System.out.println("Value of First numbe before swap "+x);
		System.out.println("Value of Second number before swap "+y);
		x=x+y;y=x-y;x=x-y;
		System.out.println("Value of First numbe after swap "+x);
		System.out.println("Value of Second number after swap "+y);		
	}
	
	public static void main(String[] args) {
		LoopAssignments1 obj = new LoopAssignments1();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First number");
		int a = s.nextInt();
		System.out.println("Enter Second number");
		int b = s.nextInt();			
		obj.SwapNumberWithThirdVariable(a, b);		
		obj.SwapNumberWithoutThirdVariable(a,b);
		s.close();
	}
}
