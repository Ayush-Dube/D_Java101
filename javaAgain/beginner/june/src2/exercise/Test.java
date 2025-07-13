package exercise;

public class Test {
	
	
	String name = "some name";
	static String name1 = "staticVala name";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(name); // ❌ nahi chalyga kyu non-static hai 
		System.out.println(name1); // ✔️
		System.out.println(Test.name1); // ✔️✔️ best practice
		
		Test obj = new Test();
		
		System.out.println(obj.name);//✔️✔️
		System.out.println(obj.name1);//✔️ works but gives warning , why are u doing this
		
		

	}

}
