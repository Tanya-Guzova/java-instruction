
public class LineItem {

	private int id;
	private int requestId;
	private int productId;
	private int quantity;
	
	public LineItem() {
		super();
	}

	public LineItem(int id, int requestId, int productId, int quantity) {
		super();
		this.id = id;
		this.requestId = requestId;
		this.productId = productId;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String toString() {
		String str = "**********Line Item Summary************\n";
		str += "ID:\t\t" + id + "\n";
		str += "Request ID:\t" + requestId + "\n";
		str += "Product ID:\t" + productId + "\n";
		str += "Quantity:\t" + quantity + "\n";
		str += "***************************************\n";

		return str;
	}
	
}
