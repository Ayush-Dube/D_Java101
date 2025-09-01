
public class TopClass {
	
	public class MiddleClass1{
		static String place = "Bangalore";
		static int num = 12345;
		// String place = "Bangalore";
		// int num = 12345;
		
		void showInfo_M1() {  //try with arguements as well later
			System.out.println("non_Static class having nonStatic methods"+place+" "+num);			
		}
		
		static void showInfo2_M1() {
			System.out.println("non_Static class having Static methods"+place+" "+num);			
		}
	}
		
	public static class MiddleClass2{
//		String place = "Mumbai";
//		int num = 67890; //can not have non static thing inside a static 
		static String place = "Mumbai";
		static int num = 67890;
		
		void showInfo_M2() {
			
			System.out.println("Static class having non_Static methods"+place+" "+num);			
			
		}
		
		static void showInfo2_M2() {
			
			System.out.println("Static class having Static methods"+place+" "+num);			
		}
		
		
	}
		

	public static void main(String[] args) {
		
		TopClass top = new TopClass();  // first instance 
		
		//if nonStatic class/method --> make instance
		
		MiddleClass1 obj1 = top.new MiddleClass1();
		
		obj1.showInfo_M1(); // this worked
	
		//maybe i can call the static class with the static method directly
		
		
//		MiddleClass2.showInfo2_M2();
		// even though both are static but because the variables are nonStatic ,it will not run ,static unit is trying to access a non static thing.
		// which is not allowed
		
		//in order to make this work i have to use ststic keywork againt the variables.
		
//		now try
		MiddleClass2.showInfo2_M2(); // it worked
		
		//in eclipse even if there is a error ina method which is not called ,that code will run 
		// but in vscode it will not

		MiddleClass1.showInfo2_M1(); //this worked bcoz both class and method are static.

		MiddleClass2 objM2 = new MiddleClass2();  //why top was not required.

		objM2.showInfo_M2();

		
		
		
		
		
		
		
		
		
		
	}

}
