package ui;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import business.LineItem;
import business.Product;
import business.Request;
import business.User;
import business.Vendor;
import db.DAO;
import db.UserDB;
import ui.console.Console;

public class PRSConsoleApp {
	private static DAO<User> userDAO = new UserDB();

	public static void main(String[] args) {
		System.out.println("Welcome to the PRS Console App!\n");
		System.out.println();
		System.out.println("Menu");
		System.out.println("**************");
		System.out.println("1 - Add User");
		System.out.println("2 - Select all Users");
		System.out.println("3 - Find User by ID");
		System.out.println("4 - Delete User");
		System.out.println("5 - Add Vendor");
		System.out.println("6 - Add Product");
		System.out.println("7 - Add Request");
		System.out.println("8 - Add Line Item");
		System.out.println("9 - Exit");
		System.out.println("**************");
		int enterCommand = 0;
		System.out.println();
		
		while(enterCommand!=9) {
			enterCommand = Console.getInt("Command: ");
			switch (enterCommand) {
			//Add User
			case 1:
				System.out.println("----Add a User----");
				System.out.println();
				String userName = Console.getRequiredString("User Name?: \n");
				String password =  Console.getRequiredString("Password?: \n");
				String firstrName = Console.getRequiredString("First Name?: \n");
				String lastName = Console.getRequiredString("Last Name?: \n");
				String phoneNumber = Console.getRequiredString("Phone Number?: \n");
				String email = Console.getRequiredString("Email?: \n");
				boolean isReviewer = Console.getBoolean("Is Reviewer? (true/false):");
				boolean isAdmin = Console.getBoolean("Is Admin? (true/false):");
				System.out.println();
				User user = new User(password, userName, firstrName, lastName, phoneNumber, email, isReviewer, isAdmin);
				if (userDAO.add(user)) {
					System.out.println("User added successfully!");
					System.out.println(user.displaySummary());
				} else {
					System.out.println("Issue adding actor.");
				}
				System.out.println();
				break;
				//List All Users
			case 2:
				System.out.println("----List all Users----");
				System.out.println();
				List<User> users = userDAO.getAll();
				for (User u : users) {
					if (u != null) {
						System.out.println(u.displaySummary());
					}
				}
				System.out.println();
				break;
				//Find User by ID
			case 3:
				System.out.println("----Find User by ID----");
				int userID= Console.getInt("ID? ");
				User us = userDAO.get(userID);
				if (us != null) {
					System.out.println(us.displaySummary());
				} else {
					System.out.println("No user found for id " + userID);
				}
				System.out.println();
				break;
				//Delete User
			case 4:
				System.out.println("----Delete an actor by ID----");
				int id = Console.getInt("ID? ");
				user = userDAO.get(id);
				if (user != null) {
					if (userDAO.delete(user)) {
						System.out.println("Delete successful!");
					}
					else {
						System.out.println("Error deleting user.");
					}
				}
				else {
					System.out.println("No user found for id: "+id);
				}
				System.out.println();
				break;
//			case 5:
//				System.out.println("Add a Vendor: \n");
//				System.out.println();
//				int idVendor = Console.getInt("ID?: \n");
//				String code = Console.getRequiredString("Code?: \n");
//				String name = Console.getRequiredString("Name?: \n");
//				String address = Console.getLine("Address?: \n");
//				String city = Console.getRequiredString("City?: \n");
//				String state = Console.getRequiredString("State?: \n");
//				String zip = Console.getRequiredString("Zip?: \n");
//				String vendorPhoneNumber = Console.getRequiredString("Phone Number?: \n");
//				String vendorEmail = Console.getRequiredString("Email?: \n");
//				System.out.println();
//				Vendor vendor = new Vendor(idVendor, code, name, address, city, state, zip, vendorPhoneNumber, vendorEmail);
//				System.out.println(vendor.toString());
//				break;
//			case 6:
//				System.out.println("Add a Product: \n");
//				System.out.println();
//				int productId = Console.getInt("ID?: \n");
//				int vendorId = Console.getInt("Vendor ID?: \n");
//				String partNumber = Console.getRequiredString("Part Number?: \n");
//				String productName = Console.getRequiredString("Product Name?: \n");
//				double price = Console.getDouble("Price? : \n");
//				String unit = Console.getString("Unit?: \n");
//				String photopath = Console.getString("Photopath?: \n");
//				System.out.println();
//				Product product = new Product(productId, vendorId, partNumber, productName, price, unit, photopath);
//				System.out.println(product.toString());
//				break;		
//			case 7:
//				System.out.println("Add a Request: \n");
//				System.out.println();
//				int requestId = Console.getInt("ID?: \n");
//				int userId = Console.getInt("User ID?: ");
//				String derscription = Console.getLine("Description?:\n");
//				String justification = Console.getLine("Justification?: \n");
//				String dateNeeded = Console.getRequiredString("Date Needed?: \n");
//				String deliveryMode = Console.getLine("Delivery Mode? (pick up in store/"
//						+ "home delivery): \n");
//				String status = Console.getRequiredString("Status?: \n");
//				double total = Console.getDouble("Total? : \n");
//				String submittedDate = Console.getRequiredString("Submitted Date?: \n");
//				String reasonForRejection = Console.getLine("Reason for Rejection?: \n");
//				System.out.println();
//				Request request = new Request(requestId, userId, derscription, justification, dateNeeded, 
//						deliveryMode, status, total, submittedDate, reasonForRejection);
//				System.out.println(request.toString());	
//				break;
//			case 8:
//				System.out.println("Add a Line Item: \n");
//				System.out.println();
//				int lineItemId = Console.getInt("Line Item ID?: \n");
//				int requestIdLI = Console.getInt("Request ID?: \n");
//				int productIdLI = Console.getInt("Product ID?: \n");
//				int quantity = Console.getInt("Quantity?: \n");
//				System.out.println();
//				LineItem lineItem = new LineItem (lineItemId, requestIdLI, productIdLI,quantity);
//				System.out.println(lineItem.toString());
//				break;	
				}
		}
	System.out.println("Bye!");
	}

}
