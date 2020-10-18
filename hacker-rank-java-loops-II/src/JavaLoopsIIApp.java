import ui.console.Console;

public class JavaLoopsIIApp {

	public static void main(String[] args) {
		 int  t= Console.getInt("Enter # of queries (from 0 to 500): ", 0, 500);
		 //int[] lines = new int[t];
	        for(int i= 0; i < t; i++){
	            int a = Console.getInt("Enter the 1st integer (from 0 to 50): ", -1, 51);
	            int b = Console.getInt("Enter the 2nd integer (from 0 to 50): ", -1, 51);
	            int n = Console.getInt("Enter the 3rd integer (from 1 to 15): ", 1, 15);
	            int result = 0;
	            for(int x = 0; x < n; x++) {
	            	int tempResult = ((int)Math.pow(2, x) * b);
	            	result = result + tempResult;
	            	System.out.print(a + result + " ");
	            }
	            System.out.println();
	            	          
	        }
	    }
	}