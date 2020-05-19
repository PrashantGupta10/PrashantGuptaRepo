package package1;

public class Calculation {
	
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
		
		Calculation C1 = new Calculation();
		int result =C1.Div(C1.Mul(C1.Sum(C1.Sub(C1.Sum(10, 2),2),2),2),2);
		System.out.println("The result of the expression ((((10+2)-2)+2)*2)/2 is = "+result);
		
		int result2 =C1.Mul(C1.Sum(C1.Sum(C1.Sub(C1.Div(10, 2),2),2),2),2);
		System.out.println("The result of the expression ((((10/2)-2)+2)+2)*2 is = "+result2);		
	}
}
