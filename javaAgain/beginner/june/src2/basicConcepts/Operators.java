package basicConcepts;

public class Operators {

	public static void main(String[] args) {
		
		//Java operators
		
			// modulus
		System.out.println(5%2);
		//this here is very interesting 
		int a = 5;
		float b = 10.5f;
		double c = a+b;
		//while interchanging float and double u will an error, here u can observe the Narrowing and Widening.
		// for double , do not require d, whereas for float 'f' is required at the end of decimal number 123.456f 
		System.out.println(c);
		
		//multiplication
		int p = 132456;
		int q = 789465;
//		int r = p*q;
//		long r = p*q;
		long r = (long)p*(long)q;
		
		System.out.println(r);
		
		

	}

}
