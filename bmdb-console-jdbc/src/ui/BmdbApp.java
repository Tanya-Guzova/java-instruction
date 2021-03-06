package ui;

import db.ActorDB;

import java.nio.file.DirectoryStream.Filter;
import java.time.LocalDate;
import java.util.List;
import business.Actor;
import business.Movie;
import db.ActorTextFile;
import db.DAO;
import db.MovieDB;
import ui.console.Console;

public class BmdbApp {

	private static DAO<Actor> actorDAO = new ActorDB();
	private static DAO<Movie> movieDAO = new MovieDB();

	public static void main(String[] args) {
		System.out.println("Welcome to the bmdb app!");

		int command = 0;

		while (command != 11) {
			System.out.println("Command Menu:");
			System.out.println("1 - Add Actor");
			System.out.println("2 - List Actors");
			System.out.println("3 - Find Actor by ID");
			System.out.println("4 - Find Actor by Last Name");
			System.out.println("5 - Delete an Actor");
			System.out.println("6 - Update an Actor");
			System.out.println("7- Add Movie");
			System.out.println("8 - List Movies");
			System.out.println("9 - Delete a Movie");
			System.out.println("10 - Update a Movie");
			System.out.println("11 - Exit");
			System.out.println();

			command = Console.getInt("Command:  ");
			System.out.println();

			switch (command) {
			case 1:
				// add Actor
				System.out.println("Add an Actor:  ");
				String fn = Console.getRequiredString("First Name? ");
				String ln = Console.getRequiredString("Last Name? ");
				String g = Console.getString("Gender? (m/f): ");
				String bd = Console.getString("Birth Date? (yyyy-mm-dd): ");
				LocalDate birthdate = LocalDate.parse(bd);
				Actor actor = new Actor(fn, ln, g, birthdate);
				if (actorDAO.add(actor)) {
					System.out.println("Actor added successfully!");
					System.out.println(actor.displaySummary());
				} else {
					System.out.println("Issue adding actor.");
				}
				System.out.println();
				break;
			case 2:
				// List Actors
				System.out.println("List of all Actors:");
				List<Actor> actors = actorDAO.getAll();
//				for (Actor a : actors) {
//					if (a != null) {
//						System.out.println(a.displaySummary());
//					}
//				}
//				//displaying actors' summary using lambda
				actors.forEach(a -> System.out.println(a.displaySummary()));
				
				System.out.println();
				break;
			case 3:
				// Find Actor
				System.out.println("Find an Actor by id: ");
				int idd = Console.getInt("ID? ");
				Actor act = actorDAO.get(idd);
				if (act != null) {
					System.out.println(act.displaySummary());
				} else {
					System.out.println("No actor found for id " + idd);
				}
				System.out.println();
				break;
			case 4:
				// Find Actor by Last Name
				System.out.println("Search Actors by Last name: ");
				String string = Console.getRequiredString("Last Name?: ");
				List<Actor> ac = actorDAO.findByLastName(string);
				for (Actor a : ac) {
					if (a != null) {
						System.out.println(a.displaySummary());
					}
				}
				System.out.println();
				break;
			// Delete Actor
			case 5:
				System.out.println("Delete an actor by ID:");
				int idA = Console.getInt("ID? ");
				act = actorDAO.get(idA);
				if (act != null) {
					if (actorDAO.delete(act)) {
						System.out.println("Delete successful!");
					}
					else {
						System.out.println("Error deleting actor.");
					}
				}
				else {
					System.out.println("No actor found for id: "+idA);
				}
				System.out.println();
				break;

			case 7:
				// Add Movie
				System.out.println("Add a Movie:  ");
				int idM = Console.getInt("Enter ID: ");
				String t = Console.getLine("Title? ");
				String y = Console.getString("Year? ");
				String r = Console.getString("Rating? ");
				String dir = Console.getRequiredString("Director? ");
				Movie movie = new Movie(idM, t, y, r, dir);
				if (movieDAO.add(movie)) {
					System.out.println("Movie added successfully!");
					System.out.println(movie.displaySummary());
				} else {
					System.out.println("Issue adding actor.");
				}
				System.out.println();
				break;
			case 8:
				// List Movies
				System.out.println("List of all Movies:");
				List<Movie> movies = movieDAO.getAll();
				for (Movie m : movies) {
					if (m != null) {
						System.out.println(m.displaySummary());
					}
				}
				System.out.println();
				break;
			// Delete Movie
			case 9:
				int idMovie = Console.getInt("Enter ID: ");
				Movie m = movieDAO.get(idMovie);
				if (movieDAO.delete(m)) {
					System.out.println("Movie deleted successfully!");
				} else {
					System.out.println("Issue deleting movie.");
				}
				System.out.println();
				break;

			case 11:
				// exit.. do nothing
				break;
			default:
				System.out.println("Invalid Command.  Try Again.");
				break;

			}

		}

		System.out.println("bye");
	}

}