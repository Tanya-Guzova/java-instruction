import ui.console.Console;

public class LoopsApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Multiplication Calculator\n");
		String choice = "y";
		int number = 0;
		int result = 0;
		while (choice.equalsIgnoreCase("y")) {
			number = Console.getInt("Enter an integer from 2 to 20: " + "", 2, 20);
//			simple for loop
			for (int i = 1; i <= 10; i++) {
				result = number * i;
				System.out.println(result);
			}
			
			choice = Console.getChoiceString("Continue? (y/n): ", "y", "n");
		}
		System.out.println("Bye!");
	}

}
