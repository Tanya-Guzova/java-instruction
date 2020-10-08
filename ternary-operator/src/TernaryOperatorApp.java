
public class TernaryOperatorApp {

	public static void main(String[] args) {
		System.out.println("Hi");
		
		//Actor example - M or F
		//if gender = "M", then genderDisplay = "Male"
		//if gender = "F", then genderDisplay = "Female"
		//Output: The actor's gender is Female
		String gender = "F";
		String genderDisplay = "";
		
		//non-ternary way
		if(gender.equalsIgnoreCase("m")) {
			genderDisplay = "Male";
		}
		else {
			genderDisplay = "Female";
		}
		System.out.println("The actor's gender is " +genderDisplay);
		
		System.out.println("--------------ternary operator");
		genderDisplay = "";
		//the ? mark is a ternary operator, read as: if true(left side of the colon) then Male: is false (right side of the colon), then Female)
		genderDisplay = gender.equalsIgnoreCase("m") ? "Male" : "Female";
		System.out.println("The actor's gender is " + genderDisplay);
		System.out.println("Bye");
	}

}
