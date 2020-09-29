import java.util.Scanner;

public class CommonDivisorCalculator {

	public static void main(String[] args) {
		System.out.println("Greatest Common Divisor Finder");
		String choice = "y";
		Scanner sc = new Scanner(System.in);

		// *while loop starts
		while (choice.equalsIgnoreCase("y")) {
			System.out.println();
			// get input from user -x, y as ints
			System.out.println("Enter first number: ");
			int x = sc.nextInt();
			System.out.println("Enter second number: ");
			int y = sc.nextInt();
			System.out.println();
			while (x > 0) {
				while (y>= x) {
					y -= x;
				}
				// swap x and y
				int tempY = y;
				y = x;
				x = tempY;
			}

			// display output - gcd as int
			// y is gcd
			System.out.println("Greatest Common Divisor: " + y);
			System.out.println();
			System.out.println("Continue? (y/n): ");
			choice = sc.next();
			// *while loop ends
		}
		sc.close();
		System.out.println("Bye!");

	}

}
