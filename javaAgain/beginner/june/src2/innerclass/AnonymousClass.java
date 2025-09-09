package innerclass;

interface A {
	void method1();
//	void cool();
	
}

class B implements A {
	public void method1() {
		System.out.println("method1 from B");
	}
	
//	public void cool() {};
}

public class AnonymousClass {

	public static void main(String[] args) {

		// observe carefully no class is made till now .
		// even then we will create a instance of a never-been used or written
		// class.-->called anonymous class

		/*
		 * Anony x = new Anony(){ public void method1() {
		 * System.out.println("I am method1..."); } };
		 * 
		 * //ye code isley nahi chala kyu complie time pr Anony jo ki left hand side pr
		 * hai , vo compiler ko //milyga hi nahi
		 * 
		 */

		A x = new B() {
			public void method1() {
				System.out.println("I am modified method1...");
			}
			
			//try public and then default
			default void cool() {
				System.out.println("a non-overridden method...freshly made.");
			}
		};

		x.method1();
		x.cool();

		A z = new B();
		z.method1();
		
		
		//Now observe I have not mentioned Any class before 
		//But still will make ananoymous class using Thread.
		
		Thread t = new Thread() {
			public void run() {
				System.out.println("Thread running via ananoymous Runnable");
			}
		};
		t.start();

	}

}

/*
 * 	   For Anonymous class to work 
 * 	   		- classA obj = new classA or SubClassOfA () {}
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
