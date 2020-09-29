import java.util.Scanner;

public class ChangeCalculator {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to Change Calculator");
		String choice = "y";
		Scanner sc = new Scanner(System.in);

		int numberOfCents;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;
		int remainder = 0;

		while (choice.equalsIgnoreCase("y")) {
			// prompting user to enter an input
			System.out.println("Enter number of cents (0-99): ");
			numberOfCents = sc.nextInt();

			// business logic
			quarters = (int) numberOfCents / 25;
			remainder = numberOfCents - (quarters * 25);
			dimes = (int) remainder / 10;
			remainder = remainder - (dimes * 10);
			nickels = (int) remainder / 5;
			remainder = remainder - (nickels * 5);
			pennies = remainder;

			// output

			System.out.println("Quarters: " + quarters);
			System.out.println("Dimes: " + dimes);
			System.out.println("Nickels: " + nickels);
			System.out.println("Pennies: " + pennies);
			System.out.println("Continue? (y/n): ");
			choice = sc.next();

		}
		// goodbye message
		System.out.println("Bye!");
		// closing Scanner to avoid leak
		sc.close();

	}

}
