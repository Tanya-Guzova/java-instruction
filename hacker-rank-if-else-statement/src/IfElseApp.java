import java.util.Scanner;

import ui.console.Console;

public class IfElseApp {
	/*Given an integer, , perform the following conditional actions:

		If  is odd, print Weird
		If  is even and in the inclusive range of 2 to 5, print Not Weird
		If  is even and in the inclusive range of 6 to 20, print Weird
		If  is even and greater than 20, print Not Weird*/

	public static void main(String[] args) {
		System.out.println("Welcome to the Weird App\n");
		String choice = "y";
		int n = 0;
		while (choice.equalsIgnoreCase("y")) {
			n = Console.getInt("Enter an integer: ", 1, 100);
			if (n%2 != 0 ) {
				System.out.println("Weird");
			}
			else if(n%2 == 0 && n>=2 && n <=5) {
				System.out.println("Not Weird");
			}
			else if (n%2 == 0 && n>=6 && n <=20) {
				System.out.println("Weird");
			}
			else {
				System.out.println("Not Weird");
			}
			choice = Console.getChoiceString("Continue? (y/n: )\n", "y", "n");
		}
		System.out.println("Bye!");
	}

}
