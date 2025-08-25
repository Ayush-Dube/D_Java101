package methods;

public class Recursion {
	
	static long recur_it(int x) {
		
		if(x==1) {
			return 1;		
		}
		else {
			return x * (recur_it(x-1));
		}
	} 

	public static void main(String[] args) {
		
		
		System.out.println(recur_it(12));

	}

}

//package methods;
//
//import java.math.BigInteger;
//
//public class Recursion {
//
//    static BigInteger recur_it(int x) {
//        if (x == 1) {
//            return BigInteger.ONE;
//        } else {
//            return BigInteger.valueOf(x).multiply(recur_it(x - 1));
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(recur_it(100));  // prints 100!
//    }
//}

