package ui;

import business.Product;
import ui.console.Console;

public class ProductFinderApp {

private static	Product[] products = new Product[3];


	public static void main(String[] args) {
	System.out.println("Hello!");
	products[0]=new Product("java","Murach's Java",57.50);
	products[1]=new Product("mySQL","Murach's MySQ",54.50);
	products[2]=new Product("android","Murach's Android",59.00);
	
	//initialize an array of products
	
	String code = "";
	while (!code.equalsIgnoreCase("x")) {
		System.out.println("Search for a product!");
		code = Console.getString("Enter code:  ");
		Product p = getProduct(code);
		if (p!=null) {
			System.out.println("Product Found: "+p);
		}
		else {
			System.out.println("No product found for code: "+code);
		}
	}		
	
	System.out.println("Bye!");
	
	}
	//loop through my array of products and find the one
	//with the code
	private static Product getProduct(String code) {
		Product p = null;
		
		// loop through my array of products and find the one
		// who's code matches the code entered by the user
		for (Product product: products) {
			if (product.getCode().equalsIgnoreCase(code)) {
				p = product;
				break;
			}
		}
		
		return p;
	}
}
