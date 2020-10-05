
public class ProductManagerApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Hello");
		Product p = new Product("java", "Murac's java", 57.50);
		Employee e = new Employee("Harry", "Styles", "111-222-3333", 2);
		
		//p.293
		p.print();
		printMultiple(p,5);
		printMultiple(e,3);
		
		//p.317 - clone some products - no way to do this now
		Product p1 = new Product("java", "Murac's java", 57.50);
		//after adding clone method to the Product class
		Product p2 = (Product)p1.clone();
		p1.print();
		p2.print();
		
		
		
		System.out.println("Bye!");
		

	}
//
	private static void printMultiple(Printable p, int count) {
		for (int i= 0; i < count; i++) {
			p.print();
			
		}
	}
}
