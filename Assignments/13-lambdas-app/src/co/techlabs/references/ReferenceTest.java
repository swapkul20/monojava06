package co.techlabs.references;

public class ReferenceTest {

	public static void main(String[] args) {
		
		  References reference=new References();

            ITester tester=reference::display;
            
           tester.test();
            
            tester=References::show;
            
            tester.test();
            
            tester=References::new;
            
            tester.test();
       
	}
	
	

}
