package fileops;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileHandle {

	public static void main(String[] args) {
		
//		try(InputStreamReader isr = new InputStreamReader(System.in)){
//			System.out.printf("Enter some letters: ");
//			int letters =isr.read();
//			
//			while(isr.ready()) {
//				System.out.println((char)letters);
//				letters =isr.read();
//			}
//		}
//		catch(IOException e) {
//			System.out.println(e.toString());
//		}
//		
		
		//Scanner try-with resource
		
		try(Scanner scn = new Scanner(System.in)){
			
			System.out.printf("Enter some ltrs: ");
//			String input = scn.nextLine().trim();
			double input = scn.nextDouble();
			
			System.out.println("You entered :- "+input);			
		}
		catch(Exception e) {
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		
		System.out.println("reached end");
		
//		int inp = scn.nextInt(); // scn is not available here, because its closed.
		
		
		//Now lets read-write from files
		
		
		
		
	}

}

/*
 *  1.simple txt,binary,JSON,performance
 *  
 *  2. File class
 *  	-File f = new File("filePath..");
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */