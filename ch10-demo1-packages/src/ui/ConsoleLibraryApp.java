package ui;

import ui.console.Console;

public class ConsoleLibraryApp {

	public static void main(String[] args) {
		System.out.println("Hello!");
		
		String str = Console.getLine("Enter a sentence: ");
		int n = Console.getInt("Enter a # between 1 and 100: ", 1, 100);
		System.out.println(str);
		System.out.println(n);
				
		System.out.println("Bye!");
	}

}
