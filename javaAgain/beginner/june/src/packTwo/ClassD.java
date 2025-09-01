package packTwo;

import packOne.*;

public class ClassD extends ClassA{
	
	public static void main(String[] args) {
		
		ClassA x = new ClassA();
		ClassD z = new ClassD();
//		System.out.println(x.nameDefault);
//		System.out.println(x.nanmePrivate);
//		System.out.println(x.nameProtected);
		System.out.println(x.namePublic);
		
		
		System.out.println(z.nameProtected);
		
	}

}
