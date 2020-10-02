
public class Contact {
	// define instance variables
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	
	// define constructors
	public Contact() {
		super();
	}

	// define fully loaded constructor
	public Contact(String firstName, String lastName, String email, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}

	// define getters/setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String displayContact() {
		String str = "-----------------------------------------\n";
		str += "---  Current Contact --------------------\n";
		str += "-----------------------------------------\n";
		str += "Name:\t\t"+firstName+" "+lastName+"\n";
		str += "Email Address:\t"+email+"\n";
		str += "Phone Number:\t"+phone+"\n";
		str += "-----------------------------------------\n";
		
		return str;
	}
	
	
	
	
	
	
	
	
	
	
	

}
