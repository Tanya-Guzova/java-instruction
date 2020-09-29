import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Temperature Converter\n");

		Scanner sc = new Scanner(System.in);
		String choice = "y";
		double degreeFahrenheit;
		// double degreeCelsius;

		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter degrees in Fahrenheit: ");
			degreeFahrenheit = sc.nextDouble();

			// double degreeCelsius = (double)Math.round(((degreeFahrenheit - 32) * 5 /
			// 9)*100)/100, which is the same as the 2 lines below but united
			double degreeCelsius = (degreeFahrenheit - 32) * 5 / 9;
			degreeCelsius = (double) Math.round(degreeCelsius * 100) / 100;
		
			System.out.println("Degrees in Celsius: " + degreeCelsius + "\n");
			System.out.println("Continue? (y/n):");
			choice = sc.next();
		}
		sc.close();
		System.out.println("Bye!");
	}

}
