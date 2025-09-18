package errorhandling;

import foundation.Student;

/* zero 
 * Datatype mismatch 
 * use input 
 * do while menu 
 * Scanner class
 * random class
 * custom erro msgs
 * we can only handle runtime errors not complie time errors
 * 
 * exception type hierarchy 
 * multiple catch blocks
 * ek catch ke ander multiple exceptions
 * toString
 * 
 * try ke ander try 
 * 
 *  types
 *   - nullpoint
 *   - out of bound 
 *   - zero division
 *   - type mismatch from user end  
 *   - checked/unchecked exceptions
 *   - FileNot found
 *   - throws
 *   - finallyr
 *   
 * 
 * 
 * */
public class ErrorH {

	static void divide (int a,int b) {
		
		try {
			double res = (a/b);
			System.out.println(res+" from try block...");
			
	}
		catch(Exception e) {
//			System.out.println(e);	
			e.printStackTrace();
		}
		finally {
			System.out.println("code ran...");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		divide(1,1);
	
		divide(0,1);
		divide(1,0);
//		divide("a",0);// ye error compile time ki hai run time ki nahi 
		
		Student std = null;
//		System.out.println(Student.schoolName);
		//for the above line to work I had to change the code in the StudentClass of foundation package.
		//default to public;
		try {
			System.out.println(std.name);
			
		}
		catch(Throwable e) {
			System.out.println(e);
		}
		
		int[] points = {11,22,33};
		
		for(int i =0;i<6;i++) {
			
			try {
				System.out.println(points[i]);
			}
			catch(Throwable e){
				System.out.println(e );
				
			}
				
			
		}

	}

}
