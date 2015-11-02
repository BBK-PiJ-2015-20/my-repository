public class Calculator {
	
	public int add(int int1, int int2) {
		int result = int1 + int2;
		return result;
	}
	
	public int subtract(int int1, int int2) {
		int result = int1 - int2;
		return result;
	}
	
	public int multiply(int int1, int int2) {
		int result = int1 * int2;
		return result;
	}
	
	public double divide(int int1, int int2) {
		double result = (double) int1 / (double) int2;
		return result;
	}
	
	public int modulus(int int1, int int2) {
		int result = int1 % int2;
		return result;
	}
}