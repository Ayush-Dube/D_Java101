package loops;

public class Loop {
	
	static void loop1() {
		for(int i = 1;i<=5;i++) {
			System.out.println("$");
		}
	}
	
	
	 void loop2() {
		
		for(int i =1;i<=5;i++) {
			System.out.println("*".repeat(i));
		}
	}
	 
	 
	 //innner loop /nested loop
	 
	 void loop3() {
		 for(int i =1;i<=5;i++) {
			 for(int j =1;j<=i;j++) {				 
				 System.out.print(j);				 
			 }
			 System.out.println();
		 }
	 }
	 
	 /*
	  *		 1. number of lines  = i value for outer loop
	  *		 2. number of column = j value for innner loop
	  *      3. use of new line  using println or printf \n
	  * 
	  * 
	  * 
	  * 
	  * 
	  * */
	 
	 void loop4() {
		 for(int i =5;i>=1;i--) {
			 for(int j =1;j<=i;j++) {
				 System.out.print(i);
			 }
			 System.out.println();
		 }		 
	 }
	 
	 void loop5() {
		 for(int r =1;r<=5;r++) {
			 for(int c =1;c<=5;c++) {
				 if(c<=r) {
					 
					 System.out.print(c);
				 }
				 else {
					 System.out.print('\u2665');
				 }
			 }
			 System.out.println();
			 
		 }
	 }
	 
	 void loop6() {
		 
		 
	 }

}





































