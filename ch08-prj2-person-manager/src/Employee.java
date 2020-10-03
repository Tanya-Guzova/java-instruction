
public class Employee extends Person {

	private String ssn;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String firstName, String lastName, String ssn) {
		super(firstName, lastName);
		this.ssn = ssn;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public String toString () {
		return super.toString() +"\n" + "SSN: XXX-XX-" + ssn.substring(7) +"\n";
	}
	
}
