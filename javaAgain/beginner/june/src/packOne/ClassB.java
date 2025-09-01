package packOne;

public class ClassB extends ClassA{
	
	public static void main(String[] args) {
		
		
		ClassA x = new ClassA();
		System.out.println(x.nameDefault);
//		System.out.println(x.nanmePrivate);
		System.out.println(x.nameProtected);
		System.out.println(x.namePublic);
	}

}
