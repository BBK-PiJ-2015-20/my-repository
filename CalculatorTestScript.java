public class CalculatorTestScript
{
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		String str = "";
		int int1 = 0;
		int int2 = 0;
		System.out.println("Please enter the first number: ");
		str = System.console().readLine();
		int1 = Integer.parseInt(str);
		System.out.println("Please enter another number: ");
		str = System.console().readLine();
		int2 = Integer.parseInt(str);

		int result = cal.add(int1, int2);
		System.out.println("Addition result: " + result);
		result = cal.subtract(int1, int2);
		System.out.println("Subtraction result: " + result);
		result = cal.multiply(int1, int2);
		System.out.println("Multiplication result: " + result);
		double result1 = cal.divide(int1, int2);
		System.out.println("Division result: " + result1);
		result = cal.modulus(int1, int2);
		System.out.println("Modulus result: " + result);
	}
}