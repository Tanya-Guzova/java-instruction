
public class ProductManager {

	public static void main(String[] args) {
		System.out.println("Hello");
		Product p1 = new Product();
		printProductData(p1);	
		p1.setCode("Java");
		p1.setDescription("Murach's Java programming");
		p1.setPrice(59.5);
		printProductData(p1);
		
		Product p2 = new Product("mySql", "Murach' MySql", 54.50);
		printProductData(p2);
		System.out.println("Print products using to string");
		System.out.println(p1.toString());//we explicitly call toString method
		System.out.println(p2);//java implicitly/automatically calls toString method
		System.out.println("Change the price of p2..");
		changePrice(p2, 50);
		System.out.println(p2);
		
		//p.243
		 double price =700;
		 price = changePrice(price, 650);
		System.out.println("price = " + price);
		
		System.out.println("Goodbye!");
	}
	
	private static void changePrice(Product prod, double newPrice) {
		prod.setPrice(newPrice);
		
	}
	private static double changePrice(double price , double newPrice) {
		price = newPrice;
		return price;
	}
private static void printProductData(Product prod) {
	System.out.println("Product data: ");
	System.out.println(prod.getCode());
	System.out.println(prod.getDescription());
	System.out.println(prod.getPriceFormatted());
	
}


}
