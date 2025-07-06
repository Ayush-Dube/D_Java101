package basicConcepts;

public class Printing {

	public static void main(String[] args) {
		
		int amount = 5;
		float amount1 = 50221.12315f;
		String name = "Adam";
		
		
		
		
		
		System.out.println("First Line");
		System.out.print("Second line \n");
		System.out.printf("\n%s has %d points",name,amount);
		System.out.printf("%n%s` has %.3f` points",name,amount1);
		
		/*
		 *  format specifier 
		 * 
		 *  %d - digit or number (but not decimal)
		 *  %f - float/double , %.2f to control preicison 3.141593 --> 3.14 
		 *  %c - single character
		 *  %s - string
		 *  %b - boolena
		 *  %n - new line ,btr than \n ,platform idependent.
		 * 
		 * */
		
		
	}

}
