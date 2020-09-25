import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalApp {

	public static void main(String[] args) {
		// p.111
		double pct = .0356789; // that value is actually approximation of the number the user enters
		System.out.println(pct);

		// create a big decimal with scale of 4 (4-decimal place) and half up rounding
		BigDecimal pctBD = new BigDecimal(pct); // takes a double and converts that to big decimal
		System.out.println(pctBD);

		pctBD = pctBD.setScale(4, RoundingMode.HALF_UP); // setScales return a new instance
		System.out.println(pctBD);

		// add and subtract
		BigDecimal bd1 = new BigDecimal(50);
		BigDecimal bd2 = new BigDecimal(25.5);
		BigDecimal bd3 = new BigDecimal("10.75");
		
		BigDecimal sum = bd1.add(bd2);
		System.out.println(sum);
		
		BigDecimal diff = bd3.subtract(bd2);
		System.out.println(diff);
		
		BigDecimal product = bd2.multiply(bd3);
		System.out.println(product);
		
		BigDecimal quotient = bd1.divide(bd3, 7, RoundingMode.HALF_UP);
		System.out.println(quotient);
		
		
	}

}
