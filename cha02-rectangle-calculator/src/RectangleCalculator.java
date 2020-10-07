import java.util.Scanner;

public class RectangleCalculator {

	public static void main(String[] args) {
		
		//display welcome message
		System.out.println("Welcome to Area and Perimeter Calculator");
		System.out.println();

		// Instantiate new scanner
		Scanner sc = new Scanner(System.in);

		// declare variables
		double length;
		double width;
		double area;
		double perimeter;
		String choice = "y";

		// while statement
		while (choice.equalsIgnoreCase("y")) {
			//get input from the user
			System.out.println("Enter length: ");
			length = sc.nextDouble();
			System.out.println();
			System.out.println("Enter width: ");
			width = sc.nextDouble();
			System.out.println();
			//display the result
			System.out.println("Area: " + (width * length));
			System.out.println("Perimeter: "+ (2 * width + 2 * length));
			System.out.println();
			
			System.out.println("Continue? y/n: ");
			choice = sc.next();
		}
		//goodbye-message
		System.out.println("Bye!");
	}

}
