public class UCjava1 {
    // Global Vaariables;
	int x = 101;
	static int y = 201;
	
	int m = 455;
	int n = 555;	
	
	public static void main(String[] args) {
		
		UCjava1 inst1 = new UCjava1(); 
		System.out.println("Non-static: " + inst1.x);
		System.out.println("Static: " + y);
		inst1.demo1();

		System.out.println("Adding variables outside main method " + y+y);
		System.out.println("Adding variables outside main method " + inst1.x+inst1.x);
		
		UCjava1 inst2 = new demo1();
	}
	
	
	public void demo1() {
		
		int m = 12;
		int n = 23;
		int add;
		add = m+n;
		System.out.println("using ThisKey_word added : " + add );
	}

}

/* 
In this code I want  to learn about 
	- Globla scope;
	- Local scope;
	- This keyword and its use;
	- parameterize the function.

*/