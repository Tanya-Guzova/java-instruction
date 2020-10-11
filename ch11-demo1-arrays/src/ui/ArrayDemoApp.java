package ui;

import java.util.Arrays;

import business.Product;

//p. 357
public class ArrayDemoApp {



	public static void main(String[] args) {
		System.out.println("Hello!");
		
		// array of 5 ints
		int [] numbers = new int[5];
		numbers[0] = 5;	
		numbers[1] = 10; 
		numbers[2] = 15;
		numbers[3] = 20;
		numbers[4] = 25;
		
		for (int i = 0; i < numbers.length; i++)
			System.out.println(numbers[i]);
		//this throws an exception
//		System.out.println(numbers[5]);
		
		
		//an array of random numbers
		int[] randNbrs = new int[100];
		for (int i = 0; i<randNbrs.length; i++) {
			int r = (int)(Math.random()*100)+1;
			randNbrs[i] =r;
			System.out.println(r);
		}
		
		//p.354, array of strings
		String[] names = {"Sean", "Jack", "Jonathan", 
				"Ommaimah", "Kali", "Tanya", "Hung"};
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		//array of Products
			Product p1 = new Product ("java", "Murach's Java", 57.50);
			Product p2 = new Product ("mySQL", "Murach's MySQ", 54.50);
			Product p3 = new Product ("android", "Murach's Android", 59.00);
			Product[] products = {p1,p2, p3};
			
			//p.360, enhanced for loops
			for(Product product:products) {//read like for the the array of products, loop through the array and 
				//refer to each item in the array, treat that as product (for further use)
				System.out.println(product);
			}
			//Arrays class, p.362
			//sort the names, makes sure it is all the same case (upper case is a priority)
			Arrays.sort(names);
			for(String name: names) {
				System.out.println(name);
			}
			//binary search
			int position = Arrays.binarySearch(names, "Kali");
			System.out.println(position);
			Arrays.sort(products);
			for (Product p: products) {
				System.out.println(p);
			}
		
		// p. 355 last bullet - creating arrays
			int[] nums = new int[5];
			for (int a: nums) {
				System.out.println(a);
			}
			
			Product[] prods = new Product[5];
			for (Product p: prods) {
				System.out.println(p);
			}
		System.out.println("Bye!");
	}

}
