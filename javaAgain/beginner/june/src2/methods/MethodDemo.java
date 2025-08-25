package methods;

public class MethodDemo {

	int[] arr1 = { 11, 22, 33, 44, 55 };
	double[] arr2 = { 1, 2, 3, 4, 5 };
	int[] arr3 = { 10, 20, 30, 40, 50 };
	double[] arr4 = { 1.1, 2.2, 3.3, 4.4, 5.5 };
	double[] arr5 = { 1.1, 10, 20.99, 33.33333333 };

	double sumArray(double[] arr) {
		double res = 0;
		// enhanced loop
		for (double i : arr) {
			res += i;
		}
		return res;
	}

	// overloading
	int sumArray(int[] arr) {
		int res = 0;
		for (double i : arr) {
			res += i;
		}
		return res;
	}

	// writeIt overloaded ,static so that i can use it directly
	static String writeIt(String a) {
		return a;
	}

	static int writeIt(int a) {
		return a;
	}

	static double writeIt(double a) {
		return a;
	}

	static String writeIt() {
		return "";

	}
	
	void uprFun(String str) {
		System.out.println(str.trim().toUpperCase());
	}
	
	void ppr(String... str ) {
		
		for(String i : str) {
			System.out.printf("%s",i);
		}
		
		System.out.println();
		
	}
	void ppr1(String... str1) {
	    for (int i = 0; i < str1.length; i++) {
	        System.out.print(str1[i]);
	        if (i < str1.length - 1) {
	            System.out.print(",");  // add comma except last element
	        }
	    }
	}

	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodDemo demo = new MethodDemo();
		System.out.println(demo.arr1);
		System.out.println(demo.arr1[2]);
		System.out.println(demo.sumArray(demo.arr3));
		System.out.println(demo.sumArray(demo.arr1));
		System.out.println(demo.sumArray(demo.arr2));
		System.out.println(demo.sumArray(demo.arr4));
		System.out.println(demo.sumArray(demo.arr5));

		// can not call non static inside static method.
//		System.out.println(sumArray(arr4));

		double[] localArray = demo.arr5;
		// but tum ek variable ko function nahi bna sakte,jasiey python aur javascript
		// mei kr sakty hain .

		System.out.println(localArray);

		// 🔶println ek overloade function hai
		// ye fuunction String , int, double sb handle ke lyta hai
		// similarly I will also make a writIt method

		System.out.println(writeIt(1));
		System.out.println(writeIt("a"));
		System.out.println(writeIt());
		
		demo.uprFun("       AbcdG1& ");
		
		demo.ppr("a1","b2");
		demo.ppr1("a1","b2");
		
//		System.out.println("pqrs".toCharArray());

		
	}

}
