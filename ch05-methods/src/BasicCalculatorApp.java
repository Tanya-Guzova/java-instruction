import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicCalculatorApp {

	public static void main(String[] args) {
		// p.152
		printWelcomeMessage();

		Scanner sc = new Scanner(System.in);
		int nbr = getInt("How many times to print? ", sc);
		printHello(nbr);
		
		int a = getInt("Enter a whole number: ", sc);
		int b = getInt("Enter another whole number: ", sc);
		System.out.println("Sum of " + a + " "+ "+" + " "+ b + " = " + sum(a, b));
		
		double c = getDouble("Enter a decimal number: ", sc);
		double d = getDouble("Enter another decimal number: ", sc);
		System.out.println("Sum of " + c + " "+ "+" + " "+ d + " = " + sum(c, d));
		
		//use get int within range to validate a month entry (1-12)
		int month = getIntWithinRange("Enter a month number: ", sc, 1, 12);
		System.out.println("Month entered: " + month);
		sc.close();
	}
	// get an int from console, use Exception handling to check input
	private static int getInt(String prompt, Scanner sc) {
		int nbr = 0;
		while (true) {
			try {
				System.out.println(prompt);
				nbr = sc.nextInt();
				break;
			} catch (InputMismatchException ime) {
				System.out.println("Error! Invalid integer. Try again. \n ");
				// clearing out the buffer
				sc.nextLine();
				continue;
			}
		}
		return nbr;
	}
	private static int getIntWithinRange (String prompt, Scanner sc, int min, int max) {
		int nbr = 0;
		boolean isValid = false;
		while (!isValid) {
			nbr = getInt(prompt, sc);
			
			if (nbr < min) {
				System.out.println("Error! Number must be  >= " + min + ".");
			}
			else if (nbr > max) {
				System.out.println("Error! Number must be  <= " + max + ".");
			}
			else {
				isValid = true;
			}
		}
		
		return nbr;
	}
	// get a double from console, use data validation to check input
	private static double getDouble(String prompt, Scanner sc) {
		double nbr = 0;
		while (true) {
			System.out.println(prompt);
			if(sc.hasNextDouble()) {
				nbr = sc.nextDouble();
				break;
			}
			else {
				System.out.println("Error! Invalid double. Try again. \n ");
				sc.nextLine();
				continue;
			}
		}
		return nbr;
	}
	
	// method, no inputs and no return type
	private static void printWelcomeMessage() {
		System.out.println("Welcome to the basic calculator app");
	}

	// method, an input and no return type
	private static void printHello(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println("Hello" + i);
		}
	}

	// 2 inputs and return type
	// accept 2 ints, return the sum
	private static int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}
	// 2 inputs and return type
		// accept 2 dubles, return the sum
		private static double sum(double a, double b) {
			return a+b;
		}
}
