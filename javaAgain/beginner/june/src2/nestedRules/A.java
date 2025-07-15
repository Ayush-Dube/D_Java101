package nestedRules;



class A {
	
	int numA;
	String nameA;
	
	//constructor
	A(){
		System.out.println("A() constructor calledd...");		
	}
	
	A(int numA,String nameA){
		this.numA = numA;
		this.nameA = nameA;		
		System.out.println("A() construtor with parameters also called...");//u can write numA and nameA inside here, 
		// immediately
	}
	
	void methodA() {
		System.out.println("top class A method :- "+nameA+" "+numA);
	}
	
	//inner of Class A (non-static)
	class InsideA {
		
		int insideX;
		String insideName;
		
		//constructor
		InsideA() {
			System.out.println("InsideA constrct called...");
		}
		
		InsideA(int insideX,String insideName){
			this.insideX = insideX;
			this.insideName = insideName;
			System.out.println("inner A constrct called... "+insideX+" "+insideName);
		}
		
		void innerMethodA() {
			System.out.println("innerMethodA having "+insideX+" "+insideName);
		}		
	}
	
	

}
class B{
	
	B(){
		System.out.println("top B construcotr called...");
	}
	
	static class InsideB {
		
		InsideB(){
			System.out.println("inner B constroctro called , this one is STATIC");
		}
		
		void someB() {
			System.out.println("someB method called..");
		}
	}
	
}

class C {
	
	
}