package basicConcepts;

public class StringDatatype {

	public static void main(String[] args) {
		
		//String  "Double quotes"
		// a lot of charaters altogether
		//sequence of characters
		
		// String is a class 
		System.out.println("abcd".length());
		System.out.println("abcdefgh".charAt(3));
		System.out.println("abcdefgh".equals("abcdefgh"));
		System.out.println("abcdefgh".equals("ABCDEFGH"));
		System.out.println("abcdefgh".equalsIgnoreCase("ABCDEFGH"));
		System.out.println("AbCdEfGh".substring(4));
		System.out.println("AbCdEfGh".substring(1, 4));
		System.out.println("AbCdEfGh".toLowerCase());
		System.out.println("AbCdEfGh".toUpperCase());
		System.out.println("  xyz   ".trim());
		
		//all these methods return a new String ,and does change the original string.
		
		//toformat
		//subsequence
		
		

	}

}
