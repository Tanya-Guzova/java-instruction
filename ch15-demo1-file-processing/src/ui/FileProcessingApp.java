package ui;

import java.io.*;
import java.nio.file.*;

public class FileProcessingApp {

	public static void main(String[] args) throws IOException  {
		System.out.println("Processing files!");
		//p. 463
		// create a 'temp' directory on our hard drive
		String dirString = "c:/temp/sub1/sub2";
		Path dirPath = Paths.get(dirString);
		if (Files.notExists(dirPath)) {
			Files.createDirectories(dirPath);
			System.out.println("directory created: "+dirPath.getFileName());
		}
		
		// create a file
		String fileString = "products.txt";
		Path filePath = Paths.get(dirString, fileString);
		if (Files.notExists(filePath)) {
			Files.createFile(filePath);
		}
		
		// display file info
		System.out.println("File Name: "+filePath.getFileName());
		System.out.println("Absolute Path: "+filePath.toAbsolutePath());
		System.out.println("Is Writable?: "+Files.isWritable(filePath));
		
		if (Files.exists(dirPath) && Files.isDirectory(dirPath)) {
			System.out.println("Directory: "+dirPath.toAbsolutePath());
			System.out.println("Files:");
			DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath);
			for (Path p: dirStream) {
				if (Files.isRegularFile(p)) {
					System.out.println("     "+p.getFileName());
				}
				// Sean to figure this out
//				else if (Files.isDirectory(dirPath)) {
//					System.out.println(p.getParent().toString());
//				}
			}
		}
		
		// p. 467 write data to a file
		// relative path - will create file inside our project folder
		Path productsPath = Paths.get("products.txt");
		File productsFile = productsPath.toFile();
		
		PrintWriter out = new PrintWriter(
						  new BufferedWriter(
						  new FileWriter(productsFile)));
		// write data to the stream
		out.println("java\tMurach's Java Programming\t57.50");
		
		out.close();
		
		
		// read data from the file
		BufferedReader in = new BufferedReader(
							new FileReader(productsFile));
		String line = in.readLine();
		System.out.println(line);
		in.close();
		
		
		
		
		
		
		
		
		
		
		System.out.println("Bye");
	}

}