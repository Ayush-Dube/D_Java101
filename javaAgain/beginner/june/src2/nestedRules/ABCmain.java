package nestedRules;

public class ABCmain {

	public static void main(String[] args) {
//		System.out.println("d");
		
		A obj = new A();		
		obj.methodA();
		
		//kya aab same obj mei phir se constructor parammetrs ke sath value updates ki ja sakti hian ?? 
		//kyuki hamare pass filhaal getter setter methods nahi hai
		
		A obj1  = new A(5,"bablu"); 
		obj1.methodA();
		
		A.InsideA s1 = obj.new InsideA(7,"Doga");
		
		s1.innerMethodA();
		
		
//		B objB = new B();
		
		B.InsideB sb = new B.InsideB();// no need of the outer top B object or instance , since its static 
		sb.someB();
		
		

	}

}
