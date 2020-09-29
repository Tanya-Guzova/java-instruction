import java.util.Scanner;

public class CommonDivisorCalculator {

	public static void main(String[] args) {
		System.out.println("Greatest Common Divisor Finder");
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter first number: ");
			int firstNumber = sc.nextInt();
			System.out.println("Enter second number: ");
			int secondNumber = sc.nextInt();
			int gcd = 0;
			
			 if (firstNumber > secondNumber) {
				 while (firstNumber > secondNumber) {
					 firstNumber = firstNumber - secondNumber;
					 gcd = firstNumber;
					 
					 while (secondNumber > firstNumber) {
						 secondNumber = secondNumber - firstNumber;
						 gcd = secondNumber;
					 }
				 }
				
			 }
			 if (secondNumber > firstNumber) {
				 while (secondNumber > firstNumber) {
					 secondNumber = secondNumber - firstNumber;
					 gcd = secondNumber;
					 
//					 while (firstNumber > secondNumber) {
//						 firstNumber = firstNumber - secondNumber;
//						 gcd = firstNumber;
//					 }
				 }
				
			 }
			 			
			 System.out.println("Greatest Common Divisor: " + gcd );
			System.out.println("Continue? (y/n): ");
			choice = sc.next();
			
		}
		sc.close();
		System.out.println("Bye!");
	
	}

}
