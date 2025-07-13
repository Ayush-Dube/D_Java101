package nestedRules;



class A {
	
	int numA;
	String nameA;
	
	A(){
		System.out.println("A() constructor calledd...");		
	}
	A(int numA,String nameA){
		this.numA = numA;
		this.nameA = nameA;		
	}
	
	void methodA() {
		System.out.println("top class A method :- "+nameA+" "+numA);
	}
	
	
	

}
class B{
	
}

class C {
	
	
}