
public class OuterTest {

	public static void main(String[] args) {

            Outer outer=new Outer();
            outer.displayOuter();
            
            Outer.Inner inner=outer.new Inner();
            inner.displayInner();
            
           
	}

	
	
}
