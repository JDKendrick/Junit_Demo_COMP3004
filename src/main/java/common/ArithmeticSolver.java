//Blah

package common;

public class ArithmeticSolver {

	public double add(double leftOperand, double rightOperand) {
		return leftOperand + rightOperand;
	}
	
	public double subtract(double leftOperand, double rightOperand) {
		return leftOperand - rightOperand;
	}
	
	public double multiply(double leftOperand, double rightOperand) {
		return leftOperand * rightOperand;
	}
	
	public double divide(double leftOperand, double rightOperand) {
		return leftOperand / rightOperand;
	}
	
	public double modulus(double leftOperand, double rightOperand) {
		return leftOperand % rightOperand;
	}

	public double solve(String operand, Double leftOperand, Double rightOperand) {
		
		double answer = 0.0;
		
		switch(operand) {
		
		case "+" :
			answer = add(leftOperand, rightOperand);
			break;
			
		case "-" :
			answer = subtract(leftOperand, rightOperand);
			break;
			
		case "*" :
			answer = multiply(leftOperand, rightOperand);
			break;
			
		case "/" :
			answer = divide(leftOperand, rightOperand);
			break;
			
		case "%" :
			answer = modulus(leftOperand, rightOperand);
			break;
			
		default:
			break;		
		}
		
		return answer;
		
	}
	
}
