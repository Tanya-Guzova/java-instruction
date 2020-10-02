
public class ContactListApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Contact List App");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println();
			String fn = Console.getString("Enter first name: ");
			String ln = Console.getString("Enter last name: ");
			String e = Console.getString("Enter email: ");
			String p = Console.getString("Enter phone: ");
			
			System.out.println();
			//Contact.displayContact();   -> can't call until I create an instance
			Contact c = new Contact(fn,ln,e,p);
			
			System.out.println(c.displayContact());
			System.out.println();
			
			choice = Console.getString("Continue? ");
		}
		
		System.out.println("Bye");

	}

}