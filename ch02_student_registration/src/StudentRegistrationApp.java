import java.util.Scanner;

public class StudentRegistrationApp {

	public static void main(String[] args) {
		System.out.println("Student Registration Form");
		System.out.println();

		
		Scanner sc = new Scanner(System.in);;
		String firstName;
		String lastName;
		int yearOfBirth;
		
		System.out.println("Enter first name: ");
		firstName = sc.nextLine();
		System.out.println();

		System.out.println("Enter last name: ");
		lastName = sc.nextLine();
		System.out.println();

		System.out.println("Enter year of birth: ");
		yearOfBirth = sc.nextInt();
		System.out.println();

		System.out.println("Welcome " + firstName +" " + lastName + "!");
		System.out.println("Your Registration is complete");
		System.out.println("Your temporary password is : " + firstName +"*" + yearOfBirth);
		
	}

}
