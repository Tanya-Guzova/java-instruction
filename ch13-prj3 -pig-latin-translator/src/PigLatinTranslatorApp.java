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
			String[] words = enteredStr1.split(" ");
			String[] translation = new String[words.length];

			for (int i = 0; i < words.length; i++) {
				if ((words[i].charAt(0) == 'a' || words[i].charAt(0) == 'e' || words[i].charAt(0) == 'i'
						|| words[i].charAt(0) == 'o' || words[i].charAt(0) == 'u')) {
					String y = words[i].concat("way");
					translation[i] = y;
				} else {
					translation[i] = words[i];
				}
			}
			
			for (String x : translation) {
				System.out.print(x + " ");
			}

			choice = Console.getChoiceString("Another Line? (y/n): ", "y", "n");
		}
		System.out.println("Bye!");
	}
}
