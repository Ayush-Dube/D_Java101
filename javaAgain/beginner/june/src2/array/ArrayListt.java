package array;

import java.util.ArrayList;
import java.util.Scanner;

//ArrayList = A resizeable array that stores objects(autoboxing).
//			  arrays are fixed in size,but "ArrayList" are dynamic

public class ArrayListt {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Double> listd = new ArrayList<>();
		ArrayList<String> listS = new ArrayList<>();
		
		list.add(9);
		list.add(7);
		list.add(5);
//		System.out.println(list);
//		System.out.println(listS);
		
		/*
		 * 		- add mthod
		 * 		- remove method
		 * 		- set method
		 * 		- get method
		 * 		- size()
		 * 		- Collections.sort();
		 * 		- for(String f : fruits){sysout(f)} 
		 * 
		 * 
		 * */
		
		Scanner  scn =new Scanner(System.in);
		int choice1;
		
		do {
			ArrayList<String> foods = new ArrayList<>();
			System.out.print("Enter thr number of food u would like to add...");
			choice1 = scn.nextInt();
			scn.nextLine();
			
			for(int i = 0 ; i<choice1;i++) {
				System.out.print("Enter food number "+(i+1)+"...- ");
				String f = scn.nextLine();
				foods.add(f);
			}
			System.out.println(foods);
			System.out.println();
			
			
		}while(choice1!=0);
		
		scn.close();
		
		
	}

}
