package basicConcepts;

public class BitWise {

	public static void main(String[] args) {
		int a  =5 ;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(263));
			
		
		// 00000000 00000000 00000000 00000101
		
		// operands 
			//byte short int 
		
			//float double pr nahi hota
		
		//and &
		//or |
		//xor ^
		//not ~
		//left shift <<
		//right >>
		//unsigned rifht shift >>>
		
		int b = 5 & 4 ;
		System.out.println(b);
		System.out.println(0 ^ 1);
		System.out.println();
		System.out.println(~1);
		System.out.println();
		System.out.println();

		int x = 5; //101
		System.out.println(x << 1);
		System.out.println(x >> 1);
		
		
		
	}

}
