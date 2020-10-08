import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DateTimeApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		//p.443
		
		//these instances are immutable
		LocalDate now1 = LocalDate.now();//in yyyy-mm-dd
		LocalTime now2 =LocalTime.now();//in hh:mm:ss:sss
		LocalDateTime now3 = LocalDateTime.now();//in yyyy-mm-ddThh:mm:ss:sss
		System.out.println(now1);
		System.out.println(now2);
		System.out.println(now3);
		
		LocalDate halloween2020 = LocalDate.of(2020, 10, 31);
		LocalDate newYears2020 =LocalDate.of(2020, 1, 1);
		LocalDate newYears2021 =LocalDate.of(2021, 1, 1);
		System.out.println(halloween2020);
		System.out.println(newYears2020);
		System.out.println(newYears2021);
		
		
		
		
		LocalDate thanksgiving2020 = LocalDate.parse("2020-11-26");
		System.out.println(thanksgiving2020);
		System.out.println("Halloween is on " + halloween2020.getDayOfWeek());
		
		//pp.446-447
		
		System.out.println("Is Halloween before today? " + halloween2020.isBefore(now1));
		System.out.println("Compare today vs new years: " + now1.compareTo(newYears2021));
		
		//p.449
		LocalDate sameDayNextMonth = now1.withMonth(11);
		System.out.println(sameDayNextMonth);
		
		//quietly changes the day throws exception
		LocalDate ly = LocalDate.of(2020, 2, 29);
		System.out.println(ly);
		LocalDate lyny = ly.withYear(2021);
		System.out.println(lyny);
		
		//throws exception
		//LocalDate feb28 = LocalDate.of(2017, 2, 28);
		//LocalDate newDate = feb28.withDayOfMonth(29);	
		
		//p.451
		// add 2 months to the current date
		System.out.println("=======p.451=========");
				LocalDate twoMonthsAway = now1.plus(2, ChronoUnit.MONTHS);
				System.out.println(twoMonthsAway);
				
				System.out.println(twoMonthsAway.plusDays(17));
				
				System.out.println(ChronoUnit.DAYS.between(newYears2020, halloween2020));
				
		System.out.println("Hello");

	}

}
