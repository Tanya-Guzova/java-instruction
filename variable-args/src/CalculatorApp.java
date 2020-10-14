
public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Calculator");
		System.out.println(sum(2,4));
		System.out.println(sum(2,4,6));
		System.out.println(sum(2,4,6,8));
		System.out.println(sum(2,4,6,7,8,9,10));

	}
	
	private static int sum (int a, int b) {
		return a + b;
	}
	
	private static int sum (int a, int b, int c) {
		return a + b +c;
	}
	private static int sum (int a, int b, int c, int d) {
		return a + b + c + d;
	}
	
	///multiple arguments
	private static int sum (int ...n) {
		int sum = 0;
		for (int a: n) {
			sum += a;
		}
		return sum;
	}

}
