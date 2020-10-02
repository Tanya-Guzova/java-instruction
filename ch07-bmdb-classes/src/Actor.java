
public class Actor {
	private String firstName;
	private String lastName;
	private String gender;
	private String birthDate;

	public Actor() {

	}

	public Actor(String firstName, String lastName, String gender, String birthDate) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthDate = birthDate;

	}

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String displayActor() {
		String str = "Actor Summary \n";
		str += "***************************************\n";
		str += "Name:\t\t" + firstName + " " + lastName + "\n";
		str += "Gender:\t\t\t" + gender + "\n";
		str += "BirthDate:\t" + birthDate + "\n";
		str += "***************************************\n";

		return str;
	}
}
