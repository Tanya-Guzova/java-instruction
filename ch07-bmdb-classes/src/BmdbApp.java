

public class BmdbApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Bootcamp DB! ");
		System.out.println();
		System.out.println("Command Menu");
		System.out.println("**************");
		System.out.println("1 - Add Actor");
		System.out.println("2 - Add Movie");
		System.out.println("3 - Exit");
		System.out.println("**************");
		int enterCommand = 0;
		System.out.println();
		
		while (enterCommand!=3) {
			enterCommand = Console.getInt("Enter command: ");
			switch (enterCommand) {
			case 1:
				System.out.println("Add an Actor:");
				System.out.println();
				String firstName = Console.getString("First Name? \n");
				String lastName = Console.getString("Last Name? \n");
				String gender = Console.getString("Gender? \n");
				String birthDate = Console.getString("Birthdate?");
				System.out.println();
				Actor actor = new Actor(firstName, lastName, gender, birthDate);
				System.out.println(actor.displayActor());
				break;
				
			case 2:
				System.out.println("Add a Movie:");
				System.out.println();
				String title = Console.getLine("Title? ");
				String year =  Console.getString("Year? ");
				String rating = Console.getString("Rating? ");
				String genre = Console.getLine("Genre? ");
				System.out.println();
				Movie movie= new Movie(title, year, rating, genre);
				System.out.println(movie.displayMovie());
				break;
			}
			
		}

		System.out.println("Bye!");
	}

}
