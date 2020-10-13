import java.io.*;

public class ExceptionTesterApp {
	//p.527, Murach's Java Programming
    public static void main(String[] args) {
        System.err.println("In main: calling method1.");
        method1();
        System.err.println("In main: returned from method1.");
    }

    public static void method1() {
    	System.err.println("\tIn method1: calling method2.");
       
    	try {
    		 method2();
        System.err.println("\tIn method1: returned from method2.");
    	}
    	catch (FileNotFoundException e) {
    		System.out.println("File not found");
    	}
    }

    public static void method2() throws FileNotFoundException {
        System.err.println("\t\tIn method2: calling method3.");
        method3();
        System.err.println("\t\tIn method2: returned from method3.");
    }

    public static void method3() throws FileNotFoundException {
    	System.err.println("\t\t\tIn method3: Entering.");
    	System.err.println("\t\t\tIn method3: Exiting.");
        //Add code to throw an exception here.
    	 BufferedReader in = new BufferedReader(new FileReader("products.ran"));
    		
    		
    	
        
        }
}

    
