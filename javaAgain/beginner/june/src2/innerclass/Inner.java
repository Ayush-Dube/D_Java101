package innerclass;
/*
 *  A class defined inside another class.
 * 
 *  Types
 *  	- Static inner class
 *  	- Non-static inner class
 *  	- method inner class
 *  	- Anonymous Inner class
 *  
 *  
 *   Key points
 *      - Outer class is called "Enclosing Class".
 *   	- static things can not use non-static thing directly , it has too have a objectReferenec.
 *   	- whereas a non static class or member can reach out and use static things directly.[no need to make an object] 
 *      
 *         ---------------- ------------------- --------------------- ------------ 
 *        |    HEADING1    |                   |                     |            |
 *         ---------------- ------------------- --------------------- ------------
 *      - both static and nonStatic inner classes can access enclosing classes private variables
 *        as per static/nonstaic type.
 *      
 *      
 *    Why
 *    	- Logiacl grouping,Encapsulation,Readability,Event Handling /callbacks
 *    
 *        
 *    Static Inner class
 *    	- static kwyword
 *    	- Doesnot require the enclosing class object.
 *    	- can only access static members of the outer class.
 *    
 *        
 *        
 *    Non Static-Inner class
 *    	- Related to instance of outer class.
 *  	- can access all members(even private) of outer class/enclosing class.
 *  	- non static Inner class object is always tied to the Outer class object.
 *  	- obj.new Inner();
 *  
 *    Method-local Inner class
 *    	- coded inside a method Outer class.
 *      - Scope is just within the method.
 *      - 
 *      
 *    Anonymous class
 *      - Trickest
 *      - See the class is already mentioned in the code, its just that we can make adhoc changes to the 
 *        methods that can be overridden, with out going to actually go the class file and make those changes there.?
 *      - A x = new A/subA(){ override methods whichare present in classA/interfaceA}
 *      - You can also add extra methods but they have to be mentioned in the parent class.?
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
 * 
 */

public class Inner {

	public static void main(String[] args) {
		

	}

}
