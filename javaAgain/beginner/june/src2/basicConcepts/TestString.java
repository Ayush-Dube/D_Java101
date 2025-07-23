package basicConcepts;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x =3;
		//primitive datatype such as int mei x variable mei hi 1 as binary store hoga
		// x ke pass 3 hota hia 
		
		String xyz = new String("Java");
		//es case mei xyz ke pass reference hai aur uss reference ko use krke ,
		//we can access many paramemters of the xyz(object).
		//xyz ke pass address hota hai ->reference.
		//Heap
		
		String name = "Ava";
		
		//Difference b/w line 12 and line 18  STRING CONSTANT POOL
		
		
		String a = "xyz";
		String b = "xyz";
		System.out.println(a==b); //true  , STRING POOL.
		//do not confuse that equality is being checked.
		// a and b are pointing towards the common pool string address.
		
		String a1 = new String("abc");
		String b1 = new String("abc");
		System.out.println(a1==b1); // false ,bcoz memory address which are different are being compared.
		
		// because of NEW keyword , every time a new meomry address is created in heap memory .
		
		
//		int len = name.length();
//		System.out.println(len);
//		System.out.println(name.charAt(0));
//		System.out.println(name.charAt(1));
//		System.out.println(name.charAt(2));
//		
//		
//		String name2 = "Vijyta Java";
//		System.out.println(name2.substring(7));
//		
		
	}

}
