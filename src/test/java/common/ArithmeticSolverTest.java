package common;

import junit.framework.TestCase;

public class ArithmeticSolverTest extends TestCase{

	public void testAdd() {
		
		ArithmeticSolver solver = new ArithmeticSolver();
		assertEquals(4.0, solver.add(2.0, 2.0));
		
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
