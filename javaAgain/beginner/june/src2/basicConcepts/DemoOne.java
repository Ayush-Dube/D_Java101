 package basicConcepts;

public class DemoOne {

	public static void main(String[] args) {
		
		
		
		
		
		int age = 30;
//		byte age1 = 200;
		short age2 = 500;
		long age3 = 12345l;
		
		
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE );
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		
//		long a = 1234567895464513;
		long a = 1234567895464513l;
		System.out.println(a);
		
//		float yourSalary = 100.123456789;   // error
		float yourSalary = 100.12345678323239f;
		double mySalary = 100.123456789111111; // no need to mention "d"  better use double always. 15digit precision
		
		System.out.println(yourSalary +" , "+mySalary);
		

	}

}
