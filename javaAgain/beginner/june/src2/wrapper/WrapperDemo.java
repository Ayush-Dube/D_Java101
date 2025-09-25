package wrapper;

public class WrapperDemo {
	
	//autobox
	//auto-unbox

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String a = Integer.toString(123);    //yanha pr 123 bs ek parameter hai doesnt matter int or Integer
//		String b = Double.toString(3.156) ;
//		String c = Character.toString('@');
//		String d = Boolean.toString(false);
//		
//		String x = a+b+c+d;
//		
//		System.out.println(a+","+b+","+c+","+d);
//		System.out.println(x);
//		
		System.out.println("********");
		
		//String to various prmitive datatype
		//ander ek sb double quate string hongy
		int a = Integer.parseInt("12345");
		System.out.println(a+a);
		//a abhi bhi primitive int hi hai, it does not have any additional functions.
		
		
		
		double b = Double.parseDouble("123.987");
		System.out.println(b*1);
		
		char c = "!@#$%".charAt(2);
		System.out.println(c);
		
		boolean  d = Boolean.parseBoolean("true");	
		System.out.println(d);
		
		
		//Now observe ki hum warraper class use hi kyu krty hai 
		/*   primitive object ko enhance kr deti hai wrapper class .
		 *   Additional function add ho jaty hain . 
		 * 
		 * 
		 * 
		 * */	
		
		
		
		
		
		
		
		
		System.out.println("-----UTILITY METHODS------");
	}

}
