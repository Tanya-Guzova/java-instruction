import java.text.NumberFormat;

public class SalesReportApp {

	public static void main(String[] args) {
		double[][] sales = {
			      {1540.0, 2010.0, 2450.0, 1845.0}, // Region 1
			      {1130.0, 1168.0, 1847.0, 1491.0}, // Region 2
			      {1580.0, 2305.0, 2710.0, 1284.0}, // Region 3
			      {1105.0, 4102.0, 2391.0, 1576.0} // Region 4
			    };
			    System.out.println("The Sales Report application");
			    NumberFormat formatter = NumberFormat.getCurrencyInstance();

			    //first report
			    for(int x = 0; x < sales.length; x++){
			      if(x == 0){
			        System.out.println("Region" + "\t" + "Q1" + "\t\t\t\t\t\t\t\t" + "Q2" + "\t\t\t\t\t\t\t\t" + "Q3" + "\t\t\t\t\t\t\t\t" + "Q4");
			      }
			      for(int y = 0; y < sales.length; y++){
			        System.out.print((x+1) + "\t\t\t\t" + formatter.format(sales[x][y]));
			      }
			      System.out.println();
			      }
			    System.out.println();

			    //second report
			    System.out.println("Sales by region:");
			    for(int x = 0; x < sales.length; x++){
			      double sum = 0;
			           for(int y = 0; y < sales.length; y++){
			              sum += sales[x][y];
			      }
			      System.out.print("Region " + (x+1) +": " + formatter.format(sum));
			      System.out.println();
			    }
			    System.out.println();

			    // third report
			    System.out.println("Sales by quarter:");
			    for(int y = 0; y < sales.length; y++){
			      double sum = 0;
			      for(int x = 0; x < sales.length; x++){
			        sum += sales[x][y];
			      }
			      System.out.print("Q " + (y+1) +": " + formatter.format(sum));
			      System.out.println();
			    }
			    System.out.println();

			    //fourth report
			    double sum = 0;
			    for(int x = 0; x < sales.length; x++){
			      for(int y = 0; y < sales.length; y++){
			        sum += sales[x][y];
			      }
			    }
			    System.out.print("Total sales: " + formatter.format(sum));
			    }

}
