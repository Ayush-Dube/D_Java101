package interfce.demo2;

public class Main {

	public static void main(String[] args) {
		Viva x = new Viva();
		x.show();
		x.innerShow();
		x.addedMehtod();

		/*
		 * Outer.Helper q = x.new Helper(); q.helpMethod(); //This above code will not
		 * work because ,the approach used is for non-Static classes //but Nested
		 * classes inside an Interface are static by default
		 */

		// using Nested class ,remember its static by default

		// no outer interface object
		Outer.Helper z = new Outer.Helper();
		z.helpMethod();

		// outer interface object made
//		Outer q = new Viva();
		Outer.Helper q = new Outer.Helper();
		q.helpMethod();
		//in the above example we were able to use the Helper Class directly bcoz it was implemented in Viva 
		//directly 
		
		//now remove Outer.Helper in Viva
		
		/*Viva o1 = new Viva();
		o1.Outer.Helper x1 = o1.new Helper();
		x1.helpMethod();   //myIncorrect approach,bcoz this approach is for non-static classes
		//but Helper is a static class
		*/
		
		Outer.Helper k = new Outer.Helper();
		k.helpMethod();
		
		//But here is the thing , I want to use the Outerclass Object to call the Helper class,lets try 
		
		
		

		Outer.Status s1 = Outer.Status.ON;
		Outer.Status s2 = Outer.Status.OFF;

	}

}

interface Outer {
	void show();// no impli

	// Nested interface
	interface Inner {
		void innerShow();// no impli
	}

	// Nested Class
	class Helper { // remember classes are static
		public void helpMethod() {
			System.out.println("---I help the Outer interface...---");
		}
	}

	// Nested enum
	enum Status {
		ON, OFF
	}

}

//class Viva implements Outer,Outer.Inner{
class Viva implements Outer {
	public void show() {
		System.out.println("show's implementation");
	}

	public void innerShow() {
		System.out.println("innerShows implimentation");
	}

	public void addedMehtod() {
		System.out.println("viva's method");
	}
}

//In this few points are simple, but the Helper class and the way to use is little tricky 
//The inner interface is simple to use if you inherit it initially along with Outer interface 
//Viva implements Outer,Outer.Inner

//But supppose if u had only inherited(implemented) Outer ,then things would have been different.
