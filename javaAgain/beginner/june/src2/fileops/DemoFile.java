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

		} catch (IOException i) {
			System.out.println(i.toString());
		}

	}

}
