package innerclass;

interface A {
	void method1();
}


class B implements A{
	public void method1() {System.out.println("method1 from Br̥");}
}

public class AnonymousClass {

	public static void main(String[] args) {
		
		//observe carefully no class is made till now .
		//even then we will create a instance of a never-been used or written class.-->called anonymous class
		
		
		
		/*
		 
		 Anony x = new Anony(){
			public void method1() {
				System.out.println("I am method1...");
			}
		   };
		   
		   //ye code isley nahi chala kyu complie time pr Anony jo ki left hand side pr hai , vo compiler ko 
		   //milyga hi nahi 
		   // 
		 
		 
		
		*/
		A x = new B() {
			public void method1() {
				System.out.println("I am modified method1...");
			}
		};
		
		x.method1();
			
		
	
}
	
}
