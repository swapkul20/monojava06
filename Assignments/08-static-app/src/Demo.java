
public class Demo {
	

	static
	{
	  System.out.println("Inside Demo1 static block");	
	}
	private static int a=0;
	private int b=0;
	
	void increment()
	{
		a++;
		b++;
		
		
	}
	
	static void decrement()
	{
		a--;
		
	//	b--;  non static field 
	}
	void display()
	{
		System.out.println("a="+a+" b="+b);
	}
	static
	{
	  System.out.println("Inside Demo2 static block");	
	}
	
}
