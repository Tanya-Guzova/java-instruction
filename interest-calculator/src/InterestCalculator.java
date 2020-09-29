import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome to the Interest Calculator");

		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			System.out.println("Enter loan amount: ");
			double loanAmount = sc.nextDouble();
			
			System.out.println("Enter interest rate: ");
			double interestRate = sc.nextDouble();
			
			BigDecimal loanAmountBD = new BigDecimal(loanAmount);
			BigDecimal interestRateBD = new BigDecimal(interestRate);
			BigDecimal interestBD = loanAmountBD.multiply(interestRateBD).setScale(2, RoundingMode.HALF_UP);
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			currency.setMinimumFractionDigits(2);
			NumberFormat pct = NumberFormat.getPercentInstance();
			pct.setMaximumFractionDigits(3);

			System.out.println("Loan Amount:\t\t " + currency.format(loanAmount));
			System.out.println("Interest rate:\t\t" + pct.format(interestRate));
			System.out.println("Interest:\t\t" + currency.format(interestBD));
			System.out.println();
			
			System.out.println("Continue? (y/n): ");
			choice = sc.next();
		}
		sc.close();
		System.out.println("Bye");
	}

}
