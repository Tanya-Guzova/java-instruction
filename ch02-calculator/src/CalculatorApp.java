
public class CalculatorApp {

	public static void main(String[] args) {
	System.out.println("Welcome to the Calculator App!!");
	
	//this simple app will add 2 numbers
	
	int n1 = 5;
	int n2 = 25;
	int sum = n1 + n2;
	System.out.println("The Sum is " + sum);
	
	//do more math
	double d1 = 25.5;
	double d2 = 5.0;
	
	System.out.println("The Difference is " + (d1 - d2));
	System.out.println("The Product is " + (d1 * d2));
	System.out.println("The Quotient is " + (d2 / d1));
	System.out.println("Bye!");
	
	//this doesn't work!
	//int sum = int1 +d1;
	
	//change sum2 to a double
	double sum2 = n1 + d1;
	System.out.println();
	
	//cast d1 as an int
	sum = n1 +(int)d1;
	
	//declare a counter
	int i = 0;
	
	//add 1
	i = i + 1;
	i = i + 1;
	System.out.println(i);
	}

}
