import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
		// ch05-project 5.3
		String choice = "y";
		System.out.println("Welcome to the Guess the Number Game");
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		

		while (choice.equalsIgnoreCase("y")) {
			// generate a random number >=0.0 and <=10
			int randomNumber = (int) (Math.random() * 100) + 1;
			System.out.println(randomNumber);// keep that for testing purposes
			System.out.println("I'm thinking of a number from 1 to 100");
			System.out.println("Try to guess it.\n");
			Scanner sc = new Scanner(System.in);
			// call getIntWithinRange
			int userInput = 101;
			// call TryAgainEntryValidation
			for (int count = 1; count < 10000; count++) {
				userInput = getIntWithinRange("Enter number: ", sc, 1, 100);
				if (userInput > (randomNumber + 10)) {
					System.out.println("Way too high! Guess again.");
				} else if (userInput < (randomNumber - 10)) {
					System.out.println("Way too low! Guess again.");
				} else if (userInput > randomNumber && userInput < (randomNumber + 10)) {
					System.out.println("Too high! Guess again.");
				} else if (userInput < randomNumber && userInput > (randomNumber - 10)) {
					System.out.println("Too low! Guess again.");
				} else if (userInput == randomNumber) {

					System.out.println("You got it in " + count + " tries.");
					System.out.println(getMessage(count));
					break;
				}
			}
			choice = entryValidation("Try again? (y/n): ", sc);

		}
		System.out.println("Bye - Come back soon!");
	}

	// get a integer from console, use data validation to check input
	private static int getIntNumber(String prompt, Scanner sc) {
		int intNumber = 0;
		while (true) {
			System.out.println(prompt);
			if (sc.hasNextInt()) { // checks whether the input is an int before scanning
				intNumber = sc.nextInt(); // scans
				break;
			} else {
				System.out.println("Error! Invalid integer. Try again. \n ");
				sc.nextLine();
				continue;
			}
		}
		return intNumber;
	}

	private static int getIntWithinRange(String prompt, Scanner sc, int min, int max) {
		int userInput = 0;
		boolean isValid = false;
		while (!isValid) {
			userInput = getIntNumber(prompt, sc);

			if (userInput < min) {
				System.out.println("Error! Number must be  >= " + min + ".");
			} else if (userInput > max) {
				System.out.println("Error! Number must be  <= " + max + ".");
			} else {
				isValid = true;
			}
		}
		return userInput;
	}

	private static String entryValidation(String prompt, Scanner scan) {
		String userInput = "";
		boolean isValid = false;
		while (!isValid) {
			System.out.println(prompt);
			userInput = scan.next();
			if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("n")) {
				isValid = true;
			} else {
				System.out.println("Error! Either y or n must be entered.");
				isValid = false;
			}
		}
		return userInput;
	}

	
	private static String getMessage(int count) {
		String message = "";

		if (count <= 3) {
			message = "Great work! You are a mathematical wizard.\n";
		} else if (count > 3 && count <= 7) {
			message = "Not too bad! You've got some potential.\n";
		} else if (count > 7) {
			message = "What took you so long? Maybe you should take some lessons.\n";
		}
		return message;
	}

}
