package ui;

import business.Actor;
import business.Movie;
import ui.console.Console;

public class BmdbApp {

private static Actor[] actors = new Actor[100];
	
	public static void main(String[] args) {
		System.out.println("Welcome to the bmdb app!");
		
		actors[0] = new Actor(1, "Clark", "Gable", "M","1901-02-01");
		actors[1] = new Actor(2, "Chadwick", "Boseman", "M", "1976-11-29");
		actors[2] = new Actor(3, "Mark", "Hamill", "M", "1951-09-25");
		
		int command = 0;
		
		while (command!=9) {
			System.out.println("Command Menu:");
			System.out.println("1 - Add Actor");
			System.out.println("2 - List Actors");
			System.out.println("3 - Find Actor");
			System.out.println("4 - Add Movie");
			System.out.println("9 - Exit");
			System.out.println();
			
			command = Console.getInt("Command:  ");
			System.out.println();
			
			switch(command) {
			case 1:
				//add Actor
				System.out.println("Add an Actor:  ");
				int id = Console.getInt("ID? ");
				String fn = Console.getString("First Name? ");
				String ln = Console.getString("Last Name? ");
				String g = Console.getString("Gender? ");
				String bd = Console.getString("Birth Date? ");
				
				Actor actor = new Actor(id, fn,ln,g,bd);
				for (int i=0; i < actors.length; i++) {
					if (actors[i] == null) {
						actors[i] = actor;
						break;
					}
				}
				System.out.println("Actor Added!");
				System.out.println(actor.displaySummary());
				System.out.println();
				break;
			case 2:
				// List Actors
				System.out.println("List of all Actors:");
				for (Actor a: actors) {
					if (a!=null) { 
						System.out.println(a.displaySummary());
					}
				}
				System.out.println();
				break;
			case 3:
				// Find Actor
				System.out.println("Find an Actor by id: ");
				id = Console.getInt("ID? ");
				for (Actor a: actors) {
					if (a!=null && a.getId()==id) {
						System.out.println("Actor found:!");
						System.out.println(a.displaySummary());
					}
				}
				System.out.println();
				break;
			case 4:
				// add Movie
				System.out.println("Add a Movie:  ");
				String t = Console.getLine("Title? ");
				String y = Console.getString("Year? ");
				String r = Console.getString("Rating? ");
				String gr = Console.getString("Genre? ");
				
				Movie movie = new Movie(t,y,r,gr);
				System.out.println(movie.displaySummary());
				System.out.println();
				break;
			case 9:
				// exit..  do nothing
				break;
			default:
				System.out.println("Invalid Command.  Try Again.");
				break;
			
			}
			
		}

		System.out.println("bye");
	}

}
