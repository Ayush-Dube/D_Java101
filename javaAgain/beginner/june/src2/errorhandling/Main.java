package errorhandling;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.printf("Enter your age:- ");
		int age = scn.nextInt();
		scn.nextLine();
		
		try {
//			checkAge(age);
		}
		catch(Exception e) {
			System.out.println("A problem occured:-"+e);
		}
		
//		checkAge(age);
		
		//case1
//		chk2(age);
		
		//case2
		
		try {
			chk2(age);
		}
		catch (Exception e){
			System.out.println(e.toString());
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
	
	static void chk2(int age) {
		if(age<18) {
			//in this case u dont have to use throws keyword  along with the method
			throw new ArithmeticException("Access denied");}
		else {
			System.out.println("u r ok");
		}	
		
		}
	

	}

//	throws is required only for CHECKED exceptions 
// 	ArithemeticException is unchecked , so throws is optional .
// 
// 
// 
// 
// 
// 
// 
// 
	
	

	
	
