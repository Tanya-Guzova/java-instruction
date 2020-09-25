import java.text.NumberFormat;

public class NumberFormatApp {

	public static void main(String[] args) {
		// page 105
		double astonMartinPrice = 245789.23;
		double interestPct = .035557;
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat pct = NumberFormat.getPercentInstance();
		pct.setMinimumFractionDigits(2);
		
		System.out.println("Car interest info: ");
		System.out.println("Price:\t\t " + currency.format(astonMartinPrice));
		System.out.println("Interest:\t " + pct.format(interestPct));

		
	}

}
