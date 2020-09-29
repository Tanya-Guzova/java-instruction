
public class MathClassApp {

	public static void main(String[] args) {
		// p.103 in a book
		long result1 = Math.round(1.667);
		System.out.println(result1); //result = 2

		int result2 = Math.round(1.49F);
		System.out.println(result2); //result = 1
		
		// need cast (int)Math as round(1.667) is returning long data type and we want result3 to be int
		int result3 = (int)Math.round(1.667);
		System.out.println(result3); //result = 2
		
		// rounding to a 100th decimal value
		double x = 10.315;
				System.out.println(x);
				
				x = (double)Math.round(x * 100) / 100;
				System.out.println(x);
				
				x = (double)Math.round(x * 10) / 10;
				System.out.println(x);
				
				System.out.println("Generate some random numders #s...");
				
				double r = Math.random();
				System.out.println(r);
				
				//generate a random number >=0.0 and <=10
				r = Math.random()*10;
				System.out.println(r);
				
				//generate a roll of a die, between 1-6
				int die = (int)(Math.random()*6) + 1;
				System.out.println("Die roll is: " + die);
				
				
	}

}
