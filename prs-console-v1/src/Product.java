
public class Product {
	private int id;
	private int vendorId;
	private String partNumber;
	private String name;
	private double price;
	private String unit;
	private String photoPath;

	public Product() {
		super();
	}

	public Product(int id, int vendorId, String partNumber, String name, double price, String unit, String photoPath) {
		super();
		this.id = id;
		this.vendorId = vendorId;
		this.partNumber = partNumber;
		this.name = name;
		this.price = price;
		this.unit = unit;
		this.photoPath = photoPath;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotopath(String photoPath) {
		this.photoPath = photoPath;
	}

	public String toString() {
		String str = "***************************************\n";
		str += "ID:\t\t" + id + "\n";
		str += "Vendor Id:\t\t" + vendorId + "\n";
		str += "Part Number:\t\t" + partNumber + "\n";
		str += "Name:\t\t\t" + name + "\n";
		str += "Price:\t\t\t" + price + "\n";
		str += "Unit:\t\t\t" + unit + "\n";
		str += "Photo Path:\t\t\t" + photoPath + "\n";
		str += "***************************************\n";

		return str;
	}

}
