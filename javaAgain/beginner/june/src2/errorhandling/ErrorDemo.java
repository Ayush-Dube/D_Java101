package errorhandling;

import java.util.Scanner;

import foundation.Student;

public class ErrorDemo {

	static void zeroEr(Scanner scn) {

		
		System.out.printf("Please enter a number...:- ");
		// observe the cursor in printf case
		int number = scn.nextInt();
		scn.nextLine();

		int result = number / 0;
		System.out.println(result);
		
		

	}

	static void nullEr() {
		Student s = null;
		System.out.println(s.name);
	}

	static void outOfRange() {
		int[] arr = { 11, 22, 33 };
		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
	}

	static void misMatch(Scanner scn) {
		System.out.println("Enter a String followed by a integer.");
		
		String name = scn.nextLine();
		int x = scn.nextInt();//this line is causing problem.It sends the /n buffer to next line 
		//therfore put a nextLine
		scn.nextLine();
		System.out.printf("You entered %s %d %n", name, x);
		
		
	}

	public static void main(String[] args) {
			
		Scanner scn = new Scanner(System.in);
		int choice=0;			
				
				do {
					
					try {
					System.out.println("Choose a erroHandling method");
					System.out.printf("1- Zero division %n2- NullPointer%n3- OutofBound%n4- MisMatch%n");
					choice = scn.nextInt();
					scn.nextLine();//consume the /n buffer.
					
				
					switch(choice) {
						case 1:
							zeroEr(scn);
							break;
						case 2:
							nullEr();
						break;
					case 3:
						outOfRange();
						break;
					case 4:
						misMatch(scn);
						break;
					case 0:
						System.out.println("Exiting Program...0");
						break;
					default:
						System.out.println("Enter only amoung 1,2,3,4,0");
					}
				}
				 catch (Exception e) {
					System.err.println("An error "+e.toString()+" occurred.");
//					System.out.println(e.getMessage());
//					e.printStackTrace();
					scn.nextLine();
					

				}
				
				
				
			}while(choice!=0);
			
				
			scn.close();
			
			
			
			
			
			
			
//			zeroEr();
//			nullEr();  
//			outOfRange();
//			misMatch();
			// ek block ek hi erro catch kr sakta hai
			// already zeroEr catch ho gayi , tou abb nullEr ka number nahi aayga?
		

	}
}
/*
 * 		Menu-interface 
 * 		All important errors through method approach 
 * 		ArthematicException Use of scanner class
 * 
 * 		OBSERVATIONS
 * 			- printfvs printlv
 * 			- nextInt() ke baad nextLine(); issue
 * 			- getMessage vs e.printStackTrace vs toString()
 * 			- try ke ander do rakhne se ....continous menu nahi aati.
 * 			- it adviced ki itne sare scanner object mt bano , bs ek baou aur phor uska object hr method mei use karo.
 * 			- ek hi scanner class banou, aur uska object mehthods mei bhejo
 * 			- scn.close aur hr method mei scanner scn bhejne ke badd bhi endless loop issue
 * 			- kyuki buffer end vali problem hai .
 * 
 * 			- 4 th mei q q jb tu de raha hai tou input mismatch ho kr error aa jati hai ,but 
 * 			  vo q abhi bhi java ke pass hai aur jb menu usse option puchta hai tb vo phir se q use kr deta hai aur menu-interface
 * 			  mei bhi error milti hai.
 * 
 * 			  Choose a erroHandling method
 *				1- Zero division 
 *				2- NullPointer
 *				3- OutofBound
 *				4- MisMatch
 *				q
 *				An error java.util.InputMismatchException occurred.
 *
 *				So the solution is to have a nextLine() in the menu as well.
 *				
 *			So place nextLine() at three places 1.catch block mei  2.menu choice mei 3.method mei
 *
 *				Even better if you use nextLine(), everytime after nextInt() 
 * 
 * 
 * 		questions
 * 			 - hr method mei baar baar scanner decaler krna hia kya? 
 * 			 - hr method mei try block use krna hai ya main method mei ?
 * 			 - res = number/0 ya sysout(res) use krne pr error? 
 * 		     - try ke ander do , do ke ander try
 * 			 - buffer created a lot of problem /n 
 * 			 - input letters/string by the user is not discared and used again ,immediatley ,unless it is consumed by nextLine();
 * 
 */