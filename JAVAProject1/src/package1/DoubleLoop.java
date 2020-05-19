package package1;

public class DoubleLoop {	
	public void doubleLoopExample1()
	{
		for(int i=1;i<=5;i++)		
		{
			for(int j=1;j<=i;j++) 
				System.out.print("*");				
		System.out.println();
		}
	}
	public void doubleLoopExample2()	
	{
		System.out.println("");
		for(int i=1;i<=5;i++)		
		{
			for(int j=5;j>=i;j--) 
				System.out.print("*");				
		System.out.println();
		}
	}
	public void doubleLoopExample3()
	{
		System.out.println("");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++) 
				System.out.print(+j+" ");				
		System.out.println();
		}
	}	
	public void doubleLoopExample4()
	{
		int k =1;
		System.out.println("");
		for(int i=1;i<5;i++)
		{		for(int j=1;j<=i;j++) {	
					System.out.print(+k+" ");
					k++;}
		System.out.println();
		}
	}
	public void doubleLoopExample5()
	{
		for(int i=1;i<=5;i++) {
			for(int k=i;k<=5;k++)
				System.out.print(" ");
			
			for(int j=1;j<=i;j++)			
				System.out.print("*");			
		System.out.println();
		}
	}
	public void doubleLoopExample6()
	{	
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {			
				for(int k=1;k<=(10-i)/2;k++)					
					System.out.print(" ");	
					
			for(int j=1;j<=i;j++)			
				System.out.print("*");			
		System.out.println();
			}
		}
	}	
		public static void main(String[] args) {
		DoubleLoop d = new DoubleLoop();
		d.doubleLoopExample1();
		d.doubleLoopExample2();
		d.doubleLoopExample3();
		d.doubleLoopExample4();
		d.doubleLoopExample5();		
		d.doubleLoopExample6();	
	}		
}
