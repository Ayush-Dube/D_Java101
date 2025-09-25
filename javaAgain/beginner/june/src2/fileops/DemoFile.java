package fileops;

import java.io.File;
import java.io.IOException;

public class DemoFile {

	public static void main(String[] args) {

		try {
			File f = new File("src2/fileops/firstFile.txt"); //Becarefull with leading '/' slash.
			//use no leading slash to target src folder, or further slashes for inner targeted packages.

			if (f.createNewFile()) {
				System.out.println("File created: " + f.getName());
				
				
				
				
			} else {
				System.out.println("File already exists.");
			}
			
			
			System.out.println("----------");
			
			//little wrapper demo
			int x = 5;
			System.out.println(x);
			
			Integer z = 7;
			//observe that there are several functions provided when u do (z.), but u cant do that with primitive x 
			System.out.println(z.toString()+7);
			System.out.println(z.intValue()+7);

		} catch (IOException i) {
			System.out.println(i.toString());
		}

	}

}
