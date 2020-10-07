import java.text.NumberFormat;

public class MonthSelectorApp {

	public static void main(String[] args) {
		System.out.println("Monthly Sales\n");

		// declare monthNames and monthSales arrays
		String[] monthNames = new String[12];
		monthNames[0] = "January";
		monthNames[1] = "February";
		monthNames[2] = "March";
		monthNames[3] = "April";
		monthNames[4] = "May";
		monthNames[5] = "June";
		monthNames[6] = "July";
		monthNames[7] = "August";
		monthNames[8] = "September";
		monthNames[9] = "October";
		monthNames[10] = "November";
		monthNames[11] = "December";

		double[] monthSales = new double[12];
		monthSales[0] = 1500.00;
		monthSales[1] = 20000;
		monthSales[2] = 1784.59;
		monthSales[3] = 3875.87;
		monthSales[4] = 2876.90;
		monthSales[5] = 1876.09;
		monthSales[6] = 3987.23;
		monthSales[7] = 1234.64;
		monthSales[8] = 3279.01;
		monthSales[9] = 5876.34;
		monthSales[10] = 1987.12;
		monthSales[11] = 2543.76;

		// get currency formatting
		NumberFormat currency = NumberFormat.getCurrencyInstance();

		// get one or more months
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// get the input from the user
			int monthNumber = Console.getInt("Enter month number: ");

			// validate input
			if (monthNumber < 1 || monthNumber > monthNames.length) {
				Console.displayLine("Invalid month number. Try again.");
				continue;
			}

			// get the index number for the month
			int index = monthNumber - 1;

			// and display the month name and sales
			String monthN = monthNames[index];
			double monthS = monthSales[index];
			System.out.println("Sales for " + monthN + ": " + monthS);

			// check if the user wants to continue
			choice = Console.getString("Continue? (y/n): ");//no validation for the input in 
			//the getString method of the Console class provided by the author, assume the user enters
			//"y" or "n"
			Console.displayLine();
		}

		// display the total sales for the year, enhanced for loop
		/*double sum = 0;
		for (double monthSls: monthSales) {
			sum += monthSls;
		}*/
		
		//regular for loop
		double sum = 0;
		for (int i=0; i<monthSales.length; i++) {
			sum+=monthSales[i];
		}
		System.out.println("Total sales: " + sum);
		Console.displayLine();
	}

}
