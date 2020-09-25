import java.util.Scanner;

public class PrimitivesApp {

	public static void main(String[] args) {
		System.out.println("Unicode Character Converter");
		Scanner sc = new Scanner(System.in);
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter character number #: ");
			int charNum = sc.nextInt();
			char charVal = (char) charNum;

			System.out.println("Character equivalent: " + charVal);
			System.out.println();

			System.out.println("Again?: ");
			choice = sc.next();
		}
		sc.close();
		System.out.println("Bye!");
	}

}
