package errorhandling;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.printf("Enter your age:- ");
		int age = scn.nextInt();
		scn.nextLine();
		
		try {
			checkAge(age);
		}
		catch(Exception e) {
			System.out.println("A problem occured:-"+e);
		}
		scn.close();
	}
	
	
	static void checkAge(int age) throws CustomExcep{
		if(age<18) {
			throw new CustomExcep("❌You are not of eligible age.");
		}
		else {
			System.out.println("✅You are of eligible age");
		}
	}

}
