
public class PRSConsoleApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the PRS Console App!\n");
		System.out.println();
		System.out.println("Menu");
		System.out.println("**************");
		System.out.println("1 - Add User");
		System.out.println("2 - Add Vendor");
		System.out.println("3 - Add Product");
		System.out.println("4 - Add Request");
		System.out.println("5 - Add Line Item");
		System.out.println("6 - Exit");
		System.out.println("**************");
		int enterCommand = 0;
		System.out.println();
		
		while(enterCommand!=6) {
			enterCommand = Console.getInt("Command: ");
			switch (enterCommand) {
			case 1:
				System.out.println("Add a User: \n");
				System.out.println();
				int id = Console.getInt("ID?: \n");
				String userName = Console.getRequiredString("User Name?: \n");
				String password =  Console.getRequiredString("Password?: \n");
				String firstrName = Console.getRequiredString("First Name?: \n");
				String lastName = Console.getRequiredString("Last Name?: \n");
				String phoneNumber = Console.getRequiredString("Phone Number?: \n");
				String email = Console.getRequiredString("Email?: \n");
				boolean isReviewer = Console.getBoolean("Is Reviewer? :");
				boolean isAdmin = Console.getBoolean("Is Admin? :");
				User user = new User(id, password, userName, firstrName, lastName, phoneNumber, email, isReviewer, isAdmin);
				System.out.println(user.toString());
				break;	
			case 2:
				System.out.println("Add a Vendor: \n");
				System.out.println();
				int idVendor = Console.getInt("ID?: \n");
				String code = Console.getRequiredString("Code?: \n");
				String name = Console.getRequiredString("Name?: \n");
				String address = Console.getLine("Address?: \n");
				String city = Console.getRequiredString("City?: \n");
				String state = Console.getRequiredString("State?: \n");
				String zip = Console.getRequiredString("Zip?: \n");
				String vendorPhoneNumber = Console.getRequiredString("Phone Number?: \n");
				String vendorEmail = Console.getRequiredString("Email?: \n");
				Vendor vendor = new Vendor(idVendor, code, name, address, city, state, zip, vendorPhoneNumber, vendorEmail);
				System.out.println(vendor.toString());
				break;
			case 3:
				System.out.println("Add a Product: \n");
				System.out.println();
				int productId = Console.getInt("ID?: \n");
				int vendorId = Console.getInt("Vendor ID?: \n");
				String partNumber = Console.getRequiredString("Part Number?: \n");
				String productName = Console.getRequiredString("Product Name?: \n");
				double price = Console.getDouble("Price? : \n");
				String unit = Console.getString("Unit?: \n");
				String photopath = Console.getString("Photopath?: \n");
				Product product = new Product(productId, vendorId, partNumber, productName, price, unit, photopath);
				System.out.println(product.toString());
				break;		
			case 4:
				System.out.println("Add a Request: \n");
				System.out.println();
				int requestId = Console.getInt("ID?: \n");
				int userId = Console.getInt("User ID?: ");
				String derscription = Console.getLine("Description?:\n");
				String justification = Console.getLine("Justification?: \n");
				String dateNeeded = Console.getRequiredString("Date Needed?: \n");
				String deliveryMode = Console.getLine("Delivery Mode? (pick up in store/"
						+ "home delivery): \n");
				String status = Console.getRequiredString("Status?: \n");
				double total = Console.getDouble("Total? : \n");
				String submittedDate = Console.getRequiredString("Submitted Date?: \n");
				String reasonForRejection = Console.getLine("Reason for Rejection?: \n");
				Request request = new Request(requestId, userId, derscription, justification, dateNeeded, 
						deliveryMode, status, total, submittedDate, reasonForRejection);
				System.out.println(request.toString());	
				break;
			case 5:
				System.out.println("Add a Line Item: \n");
				System.out.println();
				int lineItemId = Console.getInt("Line Item ID?: \n");
				int requestIdLI = Console.getInt("Request ID?: \n");
				int productIdLI = Console.getInt("Product ID?: \n");
				int quantity = Console.getInt("Quantity?: \n");
				LineItem lineItem = new LineItem (lineItemId, requestIdLI, productIdLI,quantity);
				System.out.println(lineItem.toString());
				break;	
				}
		}
	System.out.println("Bye!");
	}

}
