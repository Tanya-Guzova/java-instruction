// p. 274
public class Software extends Product {
	
	private String version;

	public Software() {
		super();
	}

	public Software(String code, String description, double price, String version) {
		super(code, description, price);
		this.version = version;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Software [version=" + version + ", toString()=" + super.toString() + "]";
	}

	// p. 281
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Software) {
			Software software2 = (Software)obj;
			if (this.getCode().equalsIgnoreCase(software2.getCode())) {
				return true;
			}
			
		}
		return false;
	}
	
	
	
	
}