
public class PersonManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Person Manager!");
		String choice = "y";
		System.out.println();

		while (choice.equalsIgnoreCase("y")) {
			String personType = Console.getChoiceString("Create customer or employee?: ", "c", "e");
			String firstName = Console.getString("First Name \n");
			String lastName = Console.getString("Last Name: \n");
			Person person = null;
			
			if (personType.equalsIgnoreCase("c")) {
				String customerNumber = Console.getString("Customer number: \n");
				Customer customer = new Customer(firstName, lastName, customerNumber);
				System.out.println(customer);
				person = customer;
			} else {

				String ssn = Console.getString("SSN: \n");
				Employee employee = new Employee(firstName, lastName, ssn);
				System.out.println(employee);
				person = employee;
			}

			System.out.println();
			Class c = person.getClass();
			System.out.println("You entered a new" + " " + c.getName() + ";");
			System.out.println(person.toString());

			choice = Console.getChoiceString("Continue? y/n :", "y", "n");
		}
		System.out.println("Bye!");
	}

}
