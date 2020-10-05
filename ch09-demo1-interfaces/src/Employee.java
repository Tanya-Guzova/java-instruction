
public class Employee extends Person implements Printable, DepartmentConstants {

	private String ssn;
	private int department;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String firstName, String lastName, String ssn, int dept) {
		super(firstName, lastName);
		this.ssn = ssn;
		this.department = dept;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String toString() {
		return super.toString() + "\n" + "SSN: XXX-XX-" + ssn.substring(7) + "\n";
	}

//return first name, last name,  department description
	@Override
	public void print() {
		String dept = "Unknown";
		if (department == ADMIN) {
			dept = "Administration";
		} else if (department == EDITORIAL) {
			dept = "Editorial";
		} else {
			dept = "Marketing";
		}
		System.out.println(firstName + " " + lastName + "(" + dept + ")"); // instead of declaring firstName and
																			// lastName as protected in Person Class, we
																			// could also write getFirstName() and
																			// getLastName()
	}

}
