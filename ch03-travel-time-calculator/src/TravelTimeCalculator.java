import java.util.Scanner;

public class TravelTimeCalculator {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the Travel Time Calculator");
		double miles;
		double milesPerHour;
		int hours;
		int minutes;
		String choice = "y";
		Scanner sc = new Scanner(System.in);

		while (choice.equalsIgnoreCase("y")) {
			// prompting user to enter an input
			System.out.println("Enter miles: ");
			miles = sc.nextDouble();
			System.out.println("Enter miles per hour: ");
			milesPerHour = sc.nextDouble();

			// business logic
			hours = (int) (miles / milesPerHour);
			double hoursDecimal = (double) Math.round(((miles % milesPerHour) / milesPerHour) * 100) / 100;
			minutes = (int) (hoursDecimal * 60);
			// output
			System.out.println("Estimated travel time: ");
			System.out.println("-------------------------");
			System.out.println("Hours: " + hours);
			System.out.println("Minutes: " + minutes);
			System.out.println();
			System.out.println("Continue? (y/n): ");
			choice = sc.next();
		}
		// goodbye message
		System.out.println("Bye!");
		// closing Scanner to avoid leak
		sc.close();

	}

}
