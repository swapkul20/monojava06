import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class OperationsTest {
	
	Operations operation;
	

	
	@BeforeEach	
	void init()
	{
      	operation=new Operations();
	}
	
	@AfterAll
	static void display()
	{
		System.out.println("After Each");
	}

	@Test
	void testAddition() {
	   
		int expected=10;
		assertEquals(expected, operation.addition(5, 5),"Method is performing addition");
	}
	
	@Test
	void testDivision() {
	   
		double expected=5;
		assertEquals(expected, operation.division(10, 2),"Method is performing division");
	}
	
	@Test
	void testDivisionByZeroException() {
	 
		assertThrows(ArithmeticException.class, ()->operation.division(10, 0));
	}
	
	@Test
	void testSubstraction()
	{
	    
		int expected=20;
		assertEquals(expected, operation.substraction(50, 30),"Method is performing substraction");
	}
	
	@Test
	void testArea()
	{
		assertEquals(314,operation.calculateArea(10));
	}
	
	@Test
	void testIsEven()
	{
	   
		assertTrue(operation.isEven(4));
	
	}

}
