package errorhandling;

import java.util.Arrays;

public class ErrorStack {

	public static void main(String[] args) {
		
//		level3();
		
		try {
			level1();
		}
		catch(Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}	
		

	}
	
	
	static void level1() {
		level2();
	}
	static void level2() {
		level3();
	}
	
	static void level3() {
		int[] array = new int[5];
		array[4] = 55;
//		System.out.println(array[4]+" "+array[0]+" "+array[2]);
//		System.out.println(Arrays.toString(array));
		System.out.println(array[5]);
	}

}

/*
 * 	- Pura array ek baar mei kasiey dekhaty hain??
 * 			- Arrays.toString(arr);
 *  - Catch propagation .
 * 
 * 
 * 
 * 
 */