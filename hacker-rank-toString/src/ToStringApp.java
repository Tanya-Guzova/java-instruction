import java.util.Scanner;

public class ToStringApp {

	public static void main(String[] args) {

		   //Write your code here
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		String str = String.valueOf(i);
		System.out.println(str + 2);
		scan.close();
	}

}
