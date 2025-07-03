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
		
		System.out.println();
		
		//float range
		System.out.println("Float Min Max : "+ Float.MIN_VALUE+" & "+Float.MAX_VALUE);
		//double range
		System.out.println("Double Min Max : "+ Double.MIN_VALUE+" & "+Double.MAX_VALUE);
		
		
		//char
			// only use single Quaotes
			// all charaters on keyboeard are mapped with  particular value
		char onlySingle = 'a';
		char onlySingle1 = 'A';
//		char onlySingle2 = 'Aa';
		System.out.println(onlySingle);
		System.out.println((int)onlySingle); //Type Casting
		System.out.println((int)onlySingle1);
		
		System.out.println(Character.MIN_VALUE);
		System.out.println((int)Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		System.out.println((int)Character.MAX_VALUE);

		System.out.println((char)10084);
		System.out.println((char)12345);
		System.out.println((char)89231);
		
		// Devnagri
		char dev = 2309;
		System.out.println(dev);
		System.out.println((char)10084 +""+(char)2329+""+ (char)2309);
		System.out.println();
		System.out.println((char) '\u27A4');
//		System.out.println((char) "\u27A4"); error
		
/* 		
 		for(int i = 0;i<=128;i++) {
			System.out.println((char)i);
		}
 */
		
		
	// Wideing , Narrowing , Auto  Conversation
		int a1 = 10; // 4 bytes
		long b1 = a1;// 8 bytes , also in double
		float c1 = a1;// 4 bytes
		System.out.println();
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		
		
		System.out.println();
		
		float num1 = 101.12589f;
		System.out.println((int)num1);
		
		//example
		
		
		int intValue = 10;
		long longValue = intValue;
		float floatValue = longValue;;
		double doubleValue = floatValue;
		
		System.out.println("int: "+intValue);
		System.out.println("long: "+longValue);
		System.out.println("float: "+floatValue);
		System.out.println("double: "+doubleValue);
		
		System.out.println();
	
		char charValue = 'W';
		float intValue1 = charValue; //Widening conversion char to float
		
		System.out.println(intValue1);
		
		
		
		//Narrowing
		double doubleValue2 = 123.456;
		float floatValue2 = (float) doubleValue2;
		long longValue2 =(long) floatValue2;
		int intValue2 = (int) longValue2;
		
		System.out.println();
		System.out.println("double: "+doubleValue2);
		System.out.println("float: "+floatValue2);
		System.out.println("long: "+longValue2);
		System.out.println("int: "+intValue2);
		
		//
		
		System.out.println();
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.toBinaryString(Long.MAX_VALUE));
		
		
		
		
		
		
		
		
		
		

	}

}
