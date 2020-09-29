import java.util.Scanner;

public class GradeConverter {

	public static void main(String[] args) {
		
		//Welcome message
		System.out.println("Welcome to the Letter Grade Converter!");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		//*while loop starts
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter numerical grade:");
			int numericalGrade = sc.nextInt();
			String letterGrade = "";
			
			// if/else using ranges
			// convert numericalGrade to letter
			if (numericalGrade <= 60) {
				letterGrade = "F";
			}

			else if (numericalGrade >= 60 && numericalGrade <= 67) {
				letterGrade = "D";
			}

			else if (numericalGrade >= 68 && numericalGrade <= 79) {
				letterGrade = "C";
			}

			else if (numericalGrade >= 80 && numericalGrade <= 87) {
				letterGrade = "B";
			}

			else {
				letterGrade = "A";
			}
			//display output
			System.out.println("Letter grade: " +letterGrade);
			System.out.println("Continue? (y/n): ");
			choice = sc.next();
		
			//*while loop ends
		}
		//goodbye message
		System.out.println("Bye!");
		
		//closing the leak
		sc.close();
	}
}
