import java.util.Scanner;

public class ControlApp {

	public static void main(String[] args) {
		// chapter 2 p.65 - 69
		
		//if and while statements
		
		Scanner sc = new Scanner(System.in);
		
		//initialize choice to run so loop will run
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {		
		System.out.println("Enter traffic light color:");
		String color = sc.nextLine();
		
		
		if(color.equalsIgnoreCase("red")) {
		System.out.println("Red light - stop!");
		}
		
		else if(color.equalsIgnoreCase("yellow")) {
			System.out.println("Yellow light - slow down!");
			}
		
		else {
			System.out.println("Green light - go!");
			}
		
		System.out.println("Continue? (y/n): ");
		choice = sc.nextLine();
		
		}
		System.out.println("Bye!");
	}

}
