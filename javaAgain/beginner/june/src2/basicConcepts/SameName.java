package basicConcepts;


class A{
	static String sameName = "valueA";
	String sameName; 
	
	A(String sameName){
		this.sameName=sameName;
	}
	void show() {
		System.out.println(A.sameName);
	}
	
	void show2() {
		System.out.println(this.sameName);
	}

}

public class SameName {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj = new A("valueB");
		
		obj.show();
		obj.show2();

	}

}

/*
 *   ChatGPT said:
💯 Bahut valid sawaal!
Mujhe bhi yeh clarify karna hi chahiye tha — tumhara point sahi hai.

📌 Sach kya hai?
Conceptually static aur instance ka naam same ho sakta hai — concept mein koi problem nahi, kyunki JVM alag treat karti hai.

BUT — Java language level pe, compiler same scope mein same naam ki do fields allow hi nahi karta.

Meri pehli explanation concept pe thi (kaise this. aur ClassName. se differentiate hota hai) — woh logic sahi hai, par Java language ki syntax rule allow nahi karti.


✅ Ek line mein:
Concept valid hai, Java syntax allow nahi karti.
 * 
 * 
 * */
 