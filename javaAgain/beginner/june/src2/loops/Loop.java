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
	  */
	 
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
	 
	 void loop6(int row) {		 
		 
		  for(int i=1;i<=row;i++) {
			  for(int col=1;col<=i;col++) {
				  System.out.print(col+" ");
			  }
			  System.out.println();			  
		  }
		  
		  for(int i =row-1;i>=1;i--) {
			  
			  for(int col=1;col<=i;col++) {
				  System.out.print(col+" ");
			  }			  
			  System.out.println();
		  }		  		 
	 }
	 
	 void loop7(int r) {
		 
		 for(int row = 1;row<=r;row++) {
			 
			 for(int j=1;j<=r-row;j++) {
				 System.out.print(" ");
			 }
			 for(int k=1;k<=row;k++) {
				 System.out.print(row+" ");
			 } 				 
			 
			 System.out.println();
		 }
		 
		 for(int row=r-1;row>=01;row--) {
			 
			 for(int k = 1;k<=r-row;k++) {
				 System.out.print(" ");
			 }
			 
			 for(int col =1;col<=row;col++) {
				 System.out.print(row+" ");
			 }
			 System.out.println();
		 }
	 }
	 
	 
	 
	 void loop8(int n) {
		 
		 //upper i iterates 1-->5, use i++,i should not get bigger than n.
		 for(int i=1;i<=n;i++) {
			 
			 for(int j=1;j<=n-i;j++) {
				 System.out.print("-");
			 }
			 for(int k=1;k<=i;k++) {
				 System.out.print(i+" ");
				 
			 }			 
			 System.out.println();
		 }
		 
		 //lower i iterates 4-->1,use i--, i should not get smaller than 1.
		 for(int i=n-1;i>=1;i--) {
			 
			 for(int j=1;j<=n-i;j++) {
				 System.out.print("-");
			 }
			 for(int k=1;k<=i;k++) {
				 System.out.print(i+" ");
			 } 
			 
			 System.out.println();
		 }
	 }
}





































