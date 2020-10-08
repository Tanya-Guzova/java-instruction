package ui;
import java.util.Arrays;

import business.Actor;
import business.Movie;
import ui.console.Console;

public class BmdbApp {
	private static Actor[] actors = new Actor[100];
	private static Movie[] movies = new Movie [100];
	

	public static void main(String[] args) {
		System.out.println("Welcome to Bootcamp DB! ");
		System.out.println();
		System.out.println("Command Menu");
		System.out.println("**************");
		System.out.println("1 - Add Actor");
		System.out.println("2 - List of Actors");
		System.out.println("3 - Find an Actor");
		System.out.println("4 - Add Movie");
		System.out.println("5 - List of Movies");
		System.out.println("6 - Find a Movie");
		System.out.println("7 - Exit");
		System.out.println("**************");
		int enterCommand = 0;
		System.out.println();
		
		
		
		int count = 0;
		while (enterCommand!=7) {
			enterCommand = Console.getInt("Enter command: ");
			if (enterCommand==1) {
				System.out.println("Add an Actor");
				System.out.println();
				int actorId = Console.getInt("Actor ID? \n");
				String firstName = Console.getString("First Name? \n");
				String lastName = Console.getString("Last Name? \n");
				String gender = Console.getString("Gender? \n");
				String birthDate = Console.getString("Birthdate?");
				System.out.println();
				Actor actor = new Actor(actorId, firstName, lastName, gender, birthDate);
				System.out.println(actor.displayActor());
				actors[count] = actor;/*the element of actors array 
				now has the values of an object created*/
				System.out.println(actor.getFirstName()
						+ actor.getLastName());
				count++;
			}
			if (enterCommand==2) {
				System.out.println("List of Actors");
				for (Actor a: actors) {
					if(a!=null){
					String arrayFirstName = a.getFirstName();
					String arrayLastName = a.getLastName();
					System.out.println(arrayFirstName + " " + arrayLastName);}
					break;
				}
			}
			if (enterCommand==3) {
				int enteredID = Console.getInt("Actor ID? \n");
				Actor s = getActor(enteredID);
				System.out.println(s.getFirstName() + " " + s.getLastName());
			}
			if (enterCommand==4) {
				System.out.println("Add a Movie:");
				System.out.println();
				int movieId = Console.getInt("Movie ID? \n");
				String title = Console.getLine("Title? ");
				String year =  Console.getString("Year? ");
				String rating = Console.getString("Rating? ");
				String genre = Console.getLine("Genre? ");
				System.out.println();
				Movie movie= new Movie(movieId, title, year, rating, genre);
				System.out.println(movie.displayMovie());

			}
	
		}
		System.out.println("Bye!");
		
	}
	private static Actor getActor(int actorId) {
		Actor a = null;
		// loop through my array of actors and find the one
		// who's code matches the code entered by the user
		for (Actor ac: actors) {
			//if (ac.getActorID().equals(actorId)) {
			if(ac.getActorID() == actorId) {
				a = ac;
				break;
			}
		}
		
		return a;
	}

}
