
public class Outer {
	
	private int a=0;
	private int b=0;
	
	class Inner
	{
		private int c=0;
		void displayInner()
		{
		   System.out.println(a);
		}
	}
	
 void displayOuter()
 {
	 Inner inner=new Inner();
	 System.out.println(inner.c);
 }

}
