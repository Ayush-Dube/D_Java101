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
		
		//division
		
		int p1 = 10;
		int q1 = 3 ;
		int r1 = p1/q1;
		System.out.println(r1);
		
		// 5/0 also 5%0 both will throw exception error
		
		//Compound assignment 
		
		//Pre and Post Increment operator
		
			//precedence of compound operator
		int x = 9;
		
		System.out.println(++x);
		System.out.println(++x);
		System.out.println(x++);
		
		//left toright resolution 
		
		/*
		 a = a + 5 ;
		 a+=5;
		 
		 
		 
		 */
		
		System.out.println("++");
//		int i = 1;
//		int z = i++;
//		int y = ++i;
//		i++;
//		System.out.println(i);
//		System.out.println(z);
//		System.out.println(y);
//		
//		System.out.println();
//		
//		int l = 10;
//		--l;
//		l--;
//		System.out.println(l);
		
		
//		int i = 5;
////		int ab= i++;  // a = ?  i = ?
//		int ab= ++i;  // a = ?  i = ?
//
//		System.out.println("a: " + ab);
//		System.out.println("i: " + i);
		
//		int i = 0;
//		while (i++ < 5) {
//		    System.out.println("i: " + i);
//		}
//		
		
		int i = 0;
		while (++i < 5) {
			System.out.println("i: " + i);
		}

        //observe that 5 will not be printed in ++i
		

	}

}
