import java.util.Scanner;

public class BootcampMovieDB {

	public static void main(String[] args) {
		System.out.println("Welcome to Bootcamp DB! ");
		Scanner sc = new Scanner(System.in);
		String command = "";
		while (!command.equals("3")) {
			System.out.println("Command Menu");
			System.out.println("============");
			System.out.println("1 - Add Actor");
			System.out.println("2 - Add Movie");
			System.out.println("3 - Exit");
			System.out.println();
			System.out.println("Enter command: ");
			command = sc.next();
			
			String firstName = "";
			String lastName = "";
			String gender = "";
			String birthDate = "";
			String title = "";
			String year = "";
			String rating = "";
			String genre = "";
			switch (command) {
			case "1":
				System.out.println("Add an Actor:");
				System.out.println("First Name? ");
				firstName = sc.next();
				System.out.println("Last Name? ");
				lastName = sc.next();
				System.out.println("Gender? ");
				gender = sc.next();
				System.out.println("Birthdate? ");
				birthDate = sc.next();
				System.out.println();
				System.out.println("Actor Summary:");
				System.out.println(firstName + " " +lastName + "," + " " + gender + "," + " " + "born" +  " " +birthDate + "\n");
				break;
				
			case "2":
				System.out.println("Add a Movie:");
				System.out.println("Title? ");
				sc.nextLine();
				title = sc.nextLine();
				System.out.println("Year? ");
				year = sc.next();
				System.out.println("Rating? ");
				rating = sc.next();
				System.out.println("Genre? ");
				sc.nextLine();
				genre = sc.nextLine();
				System.out.println();
				System.out.println("Movie Summary:");
				System.out.println(title + " " + "(" + rating +")" +  " " + "was released in" + " " + year + "." + " " + "Genre(s): " + " " + genre + "\n");
				break;
			
			}

		}
		sc.close();
		System.out.println("Bye!");
	}
}
