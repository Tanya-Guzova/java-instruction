import java.util.Scanner;

public class TableOfPowersApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Square and Cube Table");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
	
		
		while(choice.equalsIgnoreCase("y")) {
			System.out.println("Enter an integer: ");
			int intNumber = sc.nextInt();
			System.out.println("==================");
			System.out.println("Number	Squared	Cubed");
			

			for (int i = 1; i <= intNumber; i ++) {
				int squared = i * i;
				int cubed = i * i * i;
				System.out.print(i	+"\t" +	squared + "\t "+	cubed	+ "\n");
			}
			System.out.println("Continue? (y/n): ");
			choice = sc.next();
		}
		sc.close();
		System.out.println("Bye!");
	}
}