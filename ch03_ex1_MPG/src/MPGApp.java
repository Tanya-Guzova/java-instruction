
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class MPGApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Miles Per Gallon calculator");
		System.out.println(); // print a blank line

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter miles driven: ");
			double miles = sc.nextDouble();

			System.out.print("Enter gallons of gas used: ");
			double gallons = sc.nextDouble();

			// double mpg = (double)Math.round((miles/gallons) * 100)/100; - Math class,
			// round method
			// use BigDecimal class to both perform rounding and division
			BigDecimal milesBigDecimal = new BigDecimal(miles);
			BigDecimal gallonsBigDecimal = new BigDecimal(gallons);
			BigDecimal mpgBigDecimal = milesBigDecimal.divide(gallonsBigDecimal, 2, RoundingMode.HALF_UP);
			System.out.println("Miles per gallon is " + mpgBigDecimal + ".");
			System.out.println();

			System.out.print("Calculate another MPG? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
	}

}
