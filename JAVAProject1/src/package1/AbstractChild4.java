package package1;

public class AbstractChild4 implements AbstractExample2{

	public void abc()
	{
		System.out.println("Body given by Child class");
	}
	public void xyz()
	{
		System.out.println("Body given by Child class");		
	}
	public static void main(String[] args) {
		
		AbstractChild4 obj = new AbstractChild4();
		obj.abc();
		obj.xyz();
	}
}
