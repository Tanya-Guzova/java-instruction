
public class ProductManagerApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		//p263- demonstrate
		Product p1 = new Product("Java", "Murach's Java Programming", 57.50);
		System.out.println(p1.toString());
		System.out.println(p1);//uses object's toString class implicitly
		
		Book b1 = new Book("mySql", "Murach's MySql", 54.50, "Joel Murach");
		System.out.println(b1);
		
		Software s1 = new Software("Eclipse","STS Eclipse", 0.0, "4.6.1.release");
		System.out.println(s1);

		System.out.println("Bye!");

	}

}
