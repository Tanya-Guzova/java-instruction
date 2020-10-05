
public class PersonManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Person Manager!");
		String choice = "y";
		System.out.println();

		while (choice.equalsIgnoreCase("y")) {
			String personType = Console.getChoiceString("Create customer or employee?: ", "c", "e");
			String firstName = Console.getString("First Name: \n");
			String lastName = Console.getString("Last Name: \n");
			Person p = null;
			
			if (personType.equalsIgnoreCase("c")) {
				String customerNumber = Console.getString("Customer number: \n");
				Customer customer = new Customer(firstName, lastName, customerNumber);
				p = customer;
			} else {
				String ssn = Console.getString("SSN: \n");
				Employee employee = new Employee(firstName, lastName, ssn);
				p = employee;
			}

			System.out.println();
			Class c = p.getClass();
			//System.out.println(c); <---uncomment to test the name of the class
			System.out.println("You entered a new" + " " + c.getName() + ":"); //c.getName gets the name of Class c
			System.out.println(p.toString());

			choice = Console.getChoiceString("Continue? y/n :", "y", "n");
		}
		System.out.println("Bye!");
	}

}
