import java.util.ArrayList;

import ui.console.Console;

public class PigLatinTranslatorApp {

	public static void main(String[] args) {
		System.out.println("Pig Latin Translator");
		String choice = "y";
		String enteredStr = "";
		StringBuilder str = new StringBuilder();
		char ch = 'i';

		while (choice.equalsIgnoreCase("y")) {
			enteredStr = Console.getRequiredString("Enter a line: ");
			String enteredStr1 = enteredStr.toLowerCase();
			String[] parts = enteredStr1.split(" ");
			String[] partsNew = new String[parts.length];

			for (int i = 0; i < parts.length; i++) {
				if ((parts[i].charAt(0) == 'a' || parts[i].charAt(0) == 'e' || parts[i].charAt(0) == 'i'
						|| parts[i].charAt(0) == 'o' || parts[i].charAt(0) == 'u')) {
					String y = parts[i].concat("way");
					partsNew[i] = y;
				} else {
					partsNew[i] = parts[i];
				}
			}
			
			for (String x : partsNew) {
				System.out.print(x + " ");
			}

			choice = Console.getRequiredString("Another line? (y/n): ");

		}
		System.out.println("Bye!");
	}
}
