package ui;

import business.BasicCalculations;
import ui.console.Console;

public class CalculationsApp {
private static BasicCalculations bc= new BasicCalculations();

	public static void main(String[] args) {
		System.out.println("Welcome to the Calculator App");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			int nbr = Console.getInt("Enter an integer: ");
			int square = bc.square(nbr);
			System.out.println("Square of " + nbr + " is " + square);
			String str = Console.getRequiredString("Enter a string: ");
			int count =bc.countA(str);
			System.out.println("The number of letters 'a' in a string entered is "+ count);
			choice = Console.getChoiceString("Continue? y/n: ", "y", "n");
		}
		System.out.println("Bye!");
	}

}
