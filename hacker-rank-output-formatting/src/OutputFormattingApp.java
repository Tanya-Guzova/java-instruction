import java.util.Scanner;

public class OutputFormattingApp {
/*
 * In each line of output there should be two columns:
The first column contains the String and is left justified 
using exactly 15 characters.The second column contains the integer, 
expressed in exactly 3 digits; 
if the original input has less than three digits, you must pad your output's 
leading digits with zeroes. Assume the user inputs the String of 10 characters max, 
and the integer from 0 to 999.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		StringBuilder sb1 = null;
		StringBuilder sb2 = null;

		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();
			// Complete this line
			String s2 = String.valueOf(x);
			sb1 = new StringBuilder(s1);
			sb2 = new StringBuilder(s2);
			while (sb1.length() < 15) {
				sb1.append(" ");

			}
			while (sb2.length() < 3) {
				sb2.insert(0, "0");
			}
			System.out.printf("%s%s\n", sb1, sb2);
		}
		
		System.out.println("================================");
		sc.close();
	}
}
