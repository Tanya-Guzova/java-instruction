package business;
import java.text.NumberFormat;


//JavaBeans. It is a true POJO (Plain Old Object Object)
public class Product implements Comparable {
	//fields/instance variable
	private String code;
	private String description;
	private double price;
	
	
	//constructor - empty/default(does not accept any parameters) constructor
	public Product() {
		
	}
	//constructor - fully loaded
	public Product(String code, String description, double price) {
		super();
		this.code = code;
		this.description = description;
		this.price = price;
	}
	//getters
	public String/*code is a String*/getCode(){
	return code;	
	}
	
	//setters
	public void setCode(String inCode) {
		code = inCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPriceFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(price);
	}
	@Override
	public String toString() {
		return "Product [code=" + code + ", description=" + description + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Object o) {
		if (o instanceof Product) {
			Product p = (Product)o;
			return code.compareTo(p.getCode());
		}
			
		return 0;
	}
	
	

}
