package common;

import junit.framework.TestCase;
//blah
public class ArithmeticSolverTest extends TestCase{

	public void testAdd() {
		
		ArithmeticSolver solver = new ArithmeticSolver();
		assertEquals(4.0, solver.add(2.0, 2.0));
		
	}
	
	public void testAddNegativeNumbers() {
		
		ArithmeticSolver solver = new ArithmeticSolver();
		assertEquals(0.0, solver.add(2.0, -2.0));
		assertEquals(-55.0, solver.add(-58.0, 3.0));
		assertEquals(10.0, solver.add(25.0, -15.0));
		assertEquals(-58110005.0, solver.add(-58752887.0, 642882.0));
		
	}
	
	public void testAddLargeNumbers() {
		
		ArithmeticSolver solver = new ArithmeticSolver();
		assertEquals(-58110005.0, solver.add(-58752887.0, 642882.0));		
		
	}
	
	public void testAddDecimalNumbers() {
		
		ArithmeticSolver solver = new ArithmeticSolver();
		assertEquals(8.6, solver.add(5.3, 3.3));
		assertNotNull(solver.add(9.445,  3.333));
	}
	
	public void testSubtract() {
		
		ArithmeticSolver solver = new ArithmeticSolver();
		assertEquals(2.0, solver.subtract(4.0, 2.0));
		
	}
	
	public void testMultiply() {
		
		ArithmeticSolver solver = new ArithmeticSolver();
		assertEquals(8.0, solver.multiply(4.0, 2.0));
		
	}
	
	public void testDivide() {
		
		ArithmeticSolver solver = new ArithmeticSolver();
		assertEquals(3.0, solver.divide(9.0, 3.0));
		
	}
	
	public void testModulus() {
		
		ArithmeticSolver solver = new ArithmeticSolver();
		assertEquals(2.5, solver.divide(5.0, 2.0));
		
	}
	
}
